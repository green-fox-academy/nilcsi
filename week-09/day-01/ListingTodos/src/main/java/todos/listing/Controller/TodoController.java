package todos.listing.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import todos.listing.repository.TodoRepository;

import javax.persistence.NamedStoredProcedureQuery;

@Controller
public class TodoController {

  @Autowired
  TodoRepository repository;

  public TodoController() {
    super();
  }

  @GetMapping("/todo")
  public String todo() {
    return "todo";
  }

  @RequestMapping(value= {"/", "/list"})
  public String list(Model model) {
    model.addAttribute("todos", repository.findAll());
    return "todolist";
  }
}
