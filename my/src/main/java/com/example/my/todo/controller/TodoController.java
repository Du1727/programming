package com.example.my.todo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.my.todo.entity.TodoEntity;
import com.example.my.todo.service.TodoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TodoController {

    private final TodoService todoService;

    // @GetMapping("/")
    // @ResponseBody
    // public TodoEntity hello(@RequestParam(name = "idx", defaultValue = "1")
    // Integer idx) {
    // return todoService.findByIdx(idx);

    // }

    // @GetMapping("/{idx}")
    // @ResponseBody
    // public TodoEntity hello(@PathVariable Integer idx) {
    // return todoService.findByIdx(idx);

    // }

    // @GetMapping("/")
    // @ResponseBody
    // public TodoEntity hello(Map<String, Object> map) {
    // System.out.println(map);
    // return null;
    // }

    // @GetMapping("/")
    // @ResponseBody
    // public TodoEntity hello(TodoDTO.ReqHello reqDto) {
    // System.out.println(reqDto);
    // return todoService.findByIdx(reqDto.getIdx());
    // }

    // @GetMapping("/{idx}")
    // @ResponseBody
    // public TodoEntity hello(@PathVariable Integer idx, @RequestParam String
    // search) {
    // System.out.println(idx);
    // System.out.println(search);
    // return null;
    // }

    // @GetMapping("/{idx}/{search}")
    // @ResponseBody
    // public TodoEntity hello(@PathVariable Integer idx, @PathVariable String
    // search) {
    // System.out.println(idx);
    // System.out.println(search);
    // return todoService.findByIdx(idx);
    // }

    // @GetMapping("/")
    // @ResponseBody
    // public TodoEntity hello(@RequestBody TodoDTO.ReqHello reqDto) {
    // System.out.println(reqDto);
    // return null;
    // }

    @GetMapping("/todoList")
    public String todoList(Model model) {

        List<TodoEntity> todoList = todoService.findByDeleteYn('N');
        long todoCount = todoList.stream().filter((todoEntity) -> todoEntity.getDoneYn().equals('N')).count();

        model.addAttribute("todoList", todoList);
        model.addAttribute("todoCount", todoCount);

        return "todoList";
    }
}
