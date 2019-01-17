package com.webapi.config;

import com.webapi.security.JwtAuthenticationEntryPoint;
import com.webapi.security.JwtAuthenticationProvider;
import com.webapi.security.JwtAuthenticationTokenFilter;
import com.webapi.security.JwtSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.firewall.HttpFirewall;
import org.springframework.security.web.firewall.StrictHttpFirewall;

import java.util.Collections;

@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableWebSecurity
@Configuration
public class JwtSecurityConfig extends WebSecurityConfigurerAdapter {


  @Autowired
  private JwtAuthenticationProvider authenticationProvider;
  @Autowired
  private JwtAuthenticationEntryPoint entryPoint;

  @Bean
  public AuthenticationManager authenticationManager() {
    return new ProviderManager(Collections.singletonList(authenticationProvider));
  }

  @Bean
  public JwtAuthenticationTokenFilter authenticationTokenFilter() {
    JwtAuthenticationTokenFilter filter = new JwtAuthenticationTokenFilter();
    filter.setAuthenticationManager(authenticationManager());
    filter.setAuthenticationSuccessHandler(new JwtSuccessHandler());
    return filter;
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {

    http.csrf().disable()
          .authorizeRequests().antMatchers("/measure").authenticated()
        .and()
          .exceptionHandling().authenticationEntryPoint(entryPoint)
        .and()
          .formLogin().permitAll()
        .and()
          .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

    http.addFilterBefore(authenticationTokenFilter(), UsernamePasswordAuthenticationFilter.class);
    http.headers().cacheControl();

  }

  @Bean
  public HttpFirewall allowUrlEncodedSlashHttpFirewall() {
    StrictHttpFirewall firewall = new StrictHttpFirewall();
    firewall.setAllowUrlEncodedSlash(true);
    firewall.setAllowSemicolon(true);
    return firewall;
  }

  @Override
  public void configure(WebSecurity web) throws Exception {
    super.configure(web);
    // @formatter:off
    web.httpFirewall(allowUrlEncodedSlashHttpFirewall());
  }
}
