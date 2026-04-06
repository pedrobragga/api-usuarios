package com.seuprojeto.api_usuarios.repository;

import com.seuprojeto.api_usuarios.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}