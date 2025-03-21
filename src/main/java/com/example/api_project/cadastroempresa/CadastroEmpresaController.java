package com.example.api_project.cadastroempresa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastro-empresa")
public class CadastroEmpresaController {

    @Autowired
    private CadastroEmpresaService cadastroEmpresaService;

    
 // Endpoint para listar todas as empresas
    @GetMapping
    public ResponseEntity<List<CadastroEmpresa>> listarTodasEmpresas() {
        List<CadastroEmpresa> empresas = cadastroEmpresaService.listarTodasEmpresas();
        return ResponseEntity.ok(empresas);
    }
    
    
    // Endpoint para criar um novo cadastro de empresa
    @PostMapping
    public ResponseEntity<CadastroEmpresa> criarCadastroEmpresa(
            @RequestParam("nomeEmpresa") String nomeEmpresa,
            @RequestParam("cnpj") String cnpj,
            @RequestParam(value = "rua", required = false) String rua,
            @RequestParam(value = "numeroEndereco", required = false) String numeroEndereco,
            @RequestParam(value = "complemento", required = false) String complemento,
            @RequestParam(value = "bairro", required = false) String bairro,
            @RequestParam(value = "cidade", required = false) String cidade,
            @RequestParam(value = "estado", required = false) String estado,
            @RequestParam(value = "cep", required = false) String cep,
            @RequestParam(value = "telefone", required = false) String telefone,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "regimeTributario", required = false) String regimeTributario) {

        try {
            CadastroEmpresa novoCadastroEmpresa = cadastroEmpresaService.criarCadastroEmpresa(
                    nomeEmpresa, cnpj, rua, numeroEndereco, complemento, bairro, cidade, estado, cep, telefone, email,
                    regimeTributario);
            return ResponseEntity.status(201).body(novoCadastroEmpresa);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    // Endpoint para atualizar um cadastro de empresa existente
    @PutMapping("/{id}")
    public ResponseEntity<CadastroEmpresa> atualizarCadastroEmpresa(
            @PathVariable int id,
            @RequestParam(value = "nomeEmpresa", required = false) String nomeEmpresa,
            @RequestParam(value = "cnpj", required = false) String cnpj,
            @RequestParam(value = "rua", required = false) String rua,
            @RequestParam(value = "numeroEndereco", required = false) String numeroEndereco,
            @RequestParam(value = "complemento", required = false) String complemento,
            @RequestParam(value = "bairro", required = false) String bairro,
            @RequestParam(value = "cidade", required = false) String cidade,
            @RequestParam(value = "estado", required = false) String estado,
            @RequestParam(value = "cep", required = false) String cep,
            @RequestParam(value = "telefone", required = false) String telefone,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "regimeTributario", required = false) String regimeTributario) {

        try {
            CadastroEmpresa cadastroEmpresaAtualizado = cadastroEmpresaService.atualizarCadastroEmpresa(
                    id, nomeEmpresa, cnpj, rua, numeroEndereco, complemento, bairro, cidade, estado, cep, telefone,
                    email, regimeTributario);
            return ResponseEntity.ok(cadastroEmpresaAtualizado);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }
}