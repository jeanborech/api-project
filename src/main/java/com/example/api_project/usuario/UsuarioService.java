package com.example.api_project.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    // Método para listar todos os usuários
    public List<Usuario> listarTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    // Método para criar um novo usuário
    public Usuario criarUsuario(int idCadastroEmpresa, String nome, String email, String senha, Date dataNascimento, Date dataCriacao, Date ultimoLogin, int status) {
        // Validações básicas
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome é obrigatório.");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email é obrigatório.");
        }
        if (senha == null || senha.trim().isEmpty()) {
            throw new IllegalArgumentException("Senha é obrigatória.");
        }

        // Criação do objeto Usuario
        Usuario usuario = new Usuario();
        usuario.setIdCadastroEmpresa(idCadastroEmpresa);
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setDataNascimento(dataNascimento);
        usuario.setDataCriacao(dataCriacao);
        usuario.setUltimoLogin(ultimoLogin);
        usuario.setStatus(status);

        return usuarioRepository.save(usuario);
    }

    // Método para atualizar um usuário existente
    public Usuario atualizarUsuario(int id, int idCadastroEmpresa, String nome, String email, String senha, Date dataNascimento, Date ultimoLogin, int status) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));

        if (nome != null) usuario.setNome(nome);
        if (email != null) usuario.setEmail(email);
        if (senha != null) usuario.setSenha(senha);
        if (dataNascimento != null) usuario.setDataNascimento(dataNascimento);
        if (ultimoLogin != null) usuario.setUltimoLogin(ultimoLogin);
        usuario.setStatus(status);

        return usuarioRepository.save(usuario);
    }
}
