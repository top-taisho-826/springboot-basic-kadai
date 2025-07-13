package com.example.springkadaitodo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.repository.ToDoRepository;

@Service
public class ToDoService {

    private final ToDoRepository todoRepository;

    @Autowired
    public ToDoService(ToDoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<ToDo> findAll() {  // ← 修正
        return todoRepository.findAll();
    }

    public ToDo save(ToDo todo) {  // ← 修正
        return todoRepository.save(todo);
    }

    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }
}