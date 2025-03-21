package com.example.api_project.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Endpoint para listar todos os usuários
    @GetMapping
    public ResponseEntity<List<Usuario>> listarTodosUsuarios() {
        List<Usuario> usuarios = usuarioService.listarTodosUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    // Endpoint para criar um novo usuário
    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(
            @RequestParam("idCadastroEmpresa") int idCadastroEmpresa,
            @RequestParam("nome") String nome,
            @RequestParam("email") String email,
            @RequestParam("senha") String senha,
            @RequestParam("dataNascimento") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataNascimento,
            @RequestParam("dataCriacao") @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataCriacao,
            @RequestParam(value = "ultimoLogin", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date ultimoLogin,
            @RequestParam("status") int status) {

        try {
            Usuario novoUsuario = usuarioService.criarUsuario(idCadastroEmpresa, nome, email, senha, dataNascimento, dataCriacao, ultimoLogin, status);
            return ResponseEntity.status(201).body(novoUsuario);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    // Endpoint para atualizar um usuário existente
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizarUsuario(
            @PathVariable int id,
            @RequestParam(value = "idCadastroEmpresa", required = false) Integer idCadastroEmpresa,
            @RequestParam(value = "nome", required = false) String nome,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "senha", required = false) String senha,
            @RequestParam(value = "dataNascimento", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date dataNascimento,
            @RequestParam(value = "ultimoLogin", required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") Date ultimoLogin,
            @RequestParam(value = "status", required = false) Integer status) {

        try {
            Usuario usuarioAtualizado = usuarioService.atualizarUsuario(id, idCadastroEmpresa, nome, email, senha, dataNascimento, ultimoLogin, status);
            return ResponseEntity.ok(usuarioAtualizado);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }
}
