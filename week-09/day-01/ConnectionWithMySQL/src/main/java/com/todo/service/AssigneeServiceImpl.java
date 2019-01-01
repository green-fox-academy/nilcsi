package com.todo.service;

import com.todo.model.Assignee;
import com.todo.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeServiceImpl implements AssigneeService {

  private AssigneeRepository assigneeRepository;

  @Autowired
  public AssigneeServiceImpl(AssigneeRepository assigneeRepository) {
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public List<Assignee> listAssignees() {
    List<Assignee> listAssignees = new ArrayList<>();
    this.assigneeRepository.findAll().forEach(listAssignees :: add);
    return listAssignees;
  }

  @Override
  public void addAssignee(Assignee assignee) {
    this.assigneeRepository.save(assignee);
  }

  @Override
  public void deleteAssignee(Long id) {
    this.assigneeRepository.deleteById(id);
  }

  @Override
  public Assignee getAssigneeById(Long id) {
    return this.assigneeRepository.findById(id).get();
  }
}
