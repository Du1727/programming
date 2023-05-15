package com.example.project.todo.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.swing.text.html.parser.Entity;

import com.example.project.todo.dto.TodoDTO;
import com.example.project.todo.repository.TodoRepository;

public class TodoService {
	
    public List<TodoDTO.ResBasic> findByDeleteYn(String deleteYn) {
        return TodoRepository.findByDeleteYn(deleteYn)
                .stream()  //﻿원래있던 데이터를 한꺼번에 처리하는 용도로 사용한다.
                
                .map(TodoDTO.ResBasic::fromEntity)  // 원래있던 데이터를 다른타입으로 변경할때 사용
                										// 콜론두개 : 매개변수가 하나일때? 사용가능한 애 ~ 
                										// 함수도 변수처럼 이용 가능함 ~ 그런식으로 사용한 애
             //   .map(Entity -> TodoDTO.ResBasic.fromEntity(entity));
        		
                .collect(Collectors.toList());
    }

}
