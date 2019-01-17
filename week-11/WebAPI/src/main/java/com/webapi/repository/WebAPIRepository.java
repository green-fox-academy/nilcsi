package com.webapi.repository;

import com.webapi.model.Weather;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebAPIRepository extends CrudRepository<Weather, Long> {
}
