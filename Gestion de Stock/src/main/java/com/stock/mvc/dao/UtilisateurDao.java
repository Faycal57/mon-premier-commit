package com.stock.mvc.dao;

import com.stock.mvc.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurDao extends JpaRepository <Utilisateur, Integer> {
    Optional<Utilisateur> findByLogin(String login);
}
