package br.com.eduwill.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * Public
 * Private 
 * Protected
 */
@RestController
@RequestMapping("/users")
public class UserController {


    /**
     * String (texto)
     * Integer (int) numeros inteiros
     * Double (doubel) numeros 0.0000
     * Float (float) numeros 0.000
     * char (A C)
     * Date (data)
     * void
     */
    @PostMapping("/")
    public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.name);
        System.out.println(userModel.password);
        System.out.println(userModel.username);
    }
}
