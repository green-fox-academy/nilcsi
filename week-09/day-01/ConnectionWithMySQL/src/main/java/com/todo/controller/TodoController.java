package com.todo.controller;

import com.todo.model.Todo;
import com.todo.service.AssigneeService;
import com.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
public class TodoController {

  private TodoService todoService;
  private AssigneeService assigneeService;

  @Autowired
  public TodoController(TodoService todoService, AssigneeService assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

/*  @GetMapping("/")
  public String index() {
    return "index";
  } */

  @GetMapping({"/", "/list"})
  public String listTodos(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
    if(isActive) {
      model.addAttribute("todos", todoService.getActiveTodos());
    } else {
      model.addAttribute("todos", todoService.listTodos());
    }
    return "index";
  }

  @GetMapping("/add")
  public String addTodoForm(Model model) {
    model.addAttribute("todo", new Todo());
    return "add";
  }

  @PostMapping("/add")
  public String addNewTodo(@ModelAttribute Todo todo) {
    todoService.addTodo(todo);
    return "redirect:/";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable long id) {
    todoService.deleteTodo(id);
    return "redirect:/";
  }

  @GetMapping("/{id}/edit")
  public String editForm(@PathVariable long id, Model model) {
    model.addAttribute("todo", todoService.getTodoById(id));
    model.addAttribute("assignees", assigneeService.listAssignees());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String editSubmit(@ModelAttribute Todo todo) {
    todoService.addTodo(todo);
    return "redirect:/";
  }

  @GetMapping("/search")
  public String searchForName(Model model, @RequestParam("text") String text) {
    model.addAttribute("todos", todoService.searchForString(text));
    return "index";
  }

  @GetMapping("/searchDate")
  public String searchForDueDate(Model model, @RequestParam("dueDate") Date date) {
    model.addAttribute("dueDate", todoService.searchForDueDate(date));
    return "index";
  }
}
