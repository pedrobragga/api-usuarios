package com.seuprojeto.api_usuarios.service;

import com.seuprojeto.api_usuarios.model.UserModel;
import com.seuprojeto.api_usuarios.repository.UserRepository;
import com.seuprojeto.api_usuarios.dto.UserDto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // 🔥 CRIAR
    public UserModel salvar(UserModel user) {
        return userRepository.save(user);
    }

    // 🔥 LISTAR
    public List<UserModel> listar() {
        return userRepository.findAll();
    }

    // 🔥 ATUALIZAR
    public UserModel updateUser(Long id, UserDto userDto) {
        UserModel user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        user.setNome(userDto.getName());
        user.setEmail(userDto.getEmail());

        return userRepository.save(user);
    }

    // 🔥 DELETAR
    public void deleteUser(Long id) {
    UserModel user = userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

    userRepository.delete(user);
}
}