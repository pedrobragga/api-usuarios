package com.seuprojeto.api_usuarios.controller;

import com.seuprojeto.api_usuarios.model.UserModel;
import com.seuprojeto.api_usuarios.service.UserService;
import com.seuprojeto.api_usuarios.dto.UserDto;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    // 🔥 CRIAR USUÁRIO
    @PostMapping
    public UserModel criar(@RequestBody UserModel user) {
        return service.salvar(user);
    }

    // 🔥 LISTAR USUÁRIOS
    @GetMapping
    public List<UserModel> listar() {
        return service.listar();
    }

    // 🔥 ATUALIZAR USUÁRIO
    @PutMapping("/{id}")
    public UserModel atualizar(@PathVariable Long id, @RequestBody UserDto userDto) {
        return service.updateUser(id, userDto);
    }

    // 🔥 DELETAR USUÁRIO
    @DeleteMapping("/{id}")
public void deletar(@PathVariable Long id) {
    service.deleteUser(id);
}
}