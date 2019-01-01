package com.todo.controller;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.todo.model.Assignee;
import com.todo.service.AssigneeService;
import com.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo/assignee")
public class AssigneeController {

  private AssigneeService assigneeService;
  private TodoService todoService;

  @Autowired
  public AssigneeController(AssigneeService assigneeService, TodoService todoService) {
    this.assigneeService = assigneeService;
    this.todoService = todoService;
  }

  @GetMapping("/")
  public String listAssignee(Model model) {
    model.addAttribute("assignees", assigneeService.listAssignees());
    return "assignee";
  }

  @GetMapping("/addassignee")
  public String addAssigneeForm(Model model) {
    model.addAttribute("assignee", new Assignee());
    return "addassignee";
  }

  @PostMapping("/addassignee")
  public String addAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.addAssignee(assignee);
    return "redirect:/todo/assignee/";
  }

  @GetMapping("/{id}/delete")
  public String deleteAssignee(@PathVariable Long id) {
    assigneeService.deleteAssignee(id);
    return "redirect:/todo/assignee/";
  }

  @GetMapping("/{id}/edit")
  public String editAssigneeForm(Model model, @PathVariable Long id) {
    model.addAttribute("assignee", assigneeService.getAssigneeById(id));
    return "editassignee";
  }

  @PostMapping("/{id}/edit")
  public String editAssignee(@ModelAttribute Assignee assignee) {
    assigneeService.addAssignee(assignee);
    return "redirect:/todo/assignee/";
  }
}
