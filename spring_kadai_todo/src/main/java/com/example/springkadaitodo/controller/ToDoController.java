package com.example.springkadaitodo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springkadaitodo.entity.ToDo; // ← 追加 or 確認
import com.example.springkadaitodo.service.ToDoService;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    private final ToDoService todoService;

    @Autowired
    public ToDoController(ToDoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public String getAllTodos(Model model) {
        List<ToDo> todo = todoService.findAll(); // ← 修正
        model.addAttribute("todo", todo);
        return "todoView";
    }

    @PostMapping
    public String addToDo(@ModelAttribute ToDo todo) { // ← 修正
        todoService.save(todo);
        return "redirect:/todo";
    }
}