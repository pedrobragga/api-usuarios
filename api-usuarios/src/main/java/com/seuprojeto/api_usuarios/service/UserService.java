package com.seuprojeto.api_usuarios.service;

import com.seuprojeto.api_usuarios.model.UserModel;
import com.seuprojeto.api_usuarios.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // 🔥 SALVAR USUÁRIO
    public UserModel salvar(UserModel user) {
        return repository.save(user);
    }

    // 🔥 LISTAR USUÁRIOS
    public List<UserModel> listar() {
        return repository.findAll();
    }
}