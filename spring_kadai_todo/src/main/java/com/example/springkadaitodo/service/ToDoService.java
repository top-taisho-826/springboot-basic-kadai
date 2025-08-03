package com.example.springkadaitodo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.repository.ToDoRepository;

@Service
public class ToDoService {
	private final ToDoRepository todoRepository;  //インスタンス化（＝ newをつけないのは下のコードでDIをするため。）

    // 依存性の注入（DI）を行う（コンストラクタインジェクション）
    public ToDoService(ToDoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }
    
   // ユーザーの一括取得メソッド
    public List<ToDo> getAllTodo() {
        return todoRepository.findAll();
    }
}
