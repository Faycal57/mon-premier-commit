package com.stock.mvc.controller;

import com.stock.mvc.dao.UtilisateurDao;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UtilisateurController {

    UtilisateurDao utilisateurDao;
}
