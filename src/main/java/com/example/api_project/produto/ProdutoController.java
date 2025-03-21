package com.example.api_project.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoRepository repository;

	@Autowired
	private ProdutoService service;

	// Endpoint para listar todos os produtos
	@GetMapping
	public List<Produto> listarProdutos() {
		return repository.findAll();
	}

	// Endpoint para criar um novo produto
	@PostMapping
	public ResponseEntity<Produto> criarProduto(
			@RequestParam("codigoProduto") String codigoProduto,
			@RequestParam("referenciaProduto") String referenciaProduto, 
			@RequestParam("nome") String nome,
			@RequestParam("descricao") String descricao, 
			@RequestParam("imagem") MultipartFile imagem,
			@RequestParam("custo") Double custo, 
			@RequestParam("preco") Double preco) {

		try {
			// Chama o serviço para criar o produto
			Produto novoProduto = service.criarProduto(codigoProduto, referenciaProduto, nome, descricao, imagem, custo,
					preco);
			return ResponseEntity.status(201).body(novoProduto); // Retorna 201 (Created) com o produto criado
		} catch (IllegalArgumentException e) {
			return ResponseEntity.badRequest().body(null); // Retorna 400 (Bad Request) em caso de erro de validação
		} catch (Exception e) {
			return ResponseEntity.status(500).body(null); // Retorna 500 (Internal Server Error) em caso de erro
															// inesperado
		}
	}

	// Endpoint para atualizar um produto existente
	@PutMapping("/{id}")
	public ResponseEntity<Produto> atualizarProduto(@PathVariable int id,
			@RequestParam(value = "codigoProduto", required = false) String codigoProduto,
			@RequestParam(value = "referenciaProduto", required = false) String referenciaProduto,
			@RequestParam(value = "nome", required = false) String nome,
			@RequestParam(value = "descricao", required = false) String descricao,
			@RequestParam(value = "imagem", required = false) MultipartFile imagem,
			@RequestParam(value = "custo", required = false) Double custo,
			@RequestParam(value = "preco", required = false) Double preco) {

		try {
			// Chama o serviço para atualizar o produto
			Produto produtoAtualizado = service.atualizarProduto(id, codigoProduto, referenciaProduto, nome, descricao,
					imagem, custo, preco);
			return ResponseEntity.ok(produtoAtualizado); // Retorna 200 (OK) com o produto atualizado
		} catch (IllegalArgumentException e) {
			return ResponseEntity.badRequest().body(null); // Retorna 400 (Bad Request) em caso de erro de validação
		} catch (Exception e) {
			return ResponseEntity.status(500).body(null); // Retorna 500 (Internal Server Error) em caso de erro
															// inesperado
		}
	}
}
