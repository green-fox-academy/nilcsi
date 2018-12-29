package connectionwithmysql.connection.controller;

import connectionwithmysql.connection.model.Todo;
import connectionwithmysql.connection.service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoServiceImpl service;

  @Autowired
  public TodoController(TodoServiceImpl service) {
    this.service = service;
  }

  @RequestMapping(value= {"/", "/list"})
  public String list(Model model, @RequestParam(value="isActive", required = false) boolean isActive) {
    if(isActive) {
      model.addAttribute("todos", service.getActiveTodos());
    } else {
      model.addAttribute("todos", service.getTodoList());
    }
    return "todolist";
  }

  @GetMapping("/todo/add")
  public String addTodo(Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @PostMapping("/todo/add")
  public String addNewTodo(@ModelAttribute("name") Todo todo) {
    service.addTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable long id) {
    service.deleteTodo(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String edit(@PathVariable long id, Model model) {
    model.addAttribute("todo", service.getTodo(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String editItem(@ModelAttribute("name") Todo todo) {
    service.save(todo);
    return "redirect:/list";
  }

  @PostMapping("/search")
  public String search(@RequestParam("searching") String input, Model model) {
    //Todo todo = service.
    model.addAttribute("todo", service.search(input));
    return "todolist";
  }

  //GetMapping("/search")

}
