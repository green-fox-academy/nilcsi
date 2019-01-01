package com.todo.service;

import com.todo.model.Assignee;

import java.util.List;

public interface AssigneeService {
  List<Assignee> listAssignees();
  void addAssignee(Assignee assignee);
  void deleteAssignee(Long id);
  Assignee getAssigneeById(Long id);
}
