package com.example.api_project.produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Date; // Import corrigido para java.sql.Date

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public Produto criarProduto(String codigoProduto, String referenciaProduto, String nome, String descricao,
			MultipartFile imagem, Double custo, Double preco) throws IOException {

		// Validações básicas39
		if (codigoProduto == null || codigoProduto.trim().isEmpty()) {
			throw new IllegalArgumentException("Código do produto é obrigatório.");
		}

		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome do produto é obrigatório.");
		}

		// Conversão da imagem para byte[]
		byte[] imagemBytes = imagem.getBytes();

		// Criação do objeto Produto
		Produto produto = new Produto();
		produto.setCodigoProduto(codigoProduto);
		produto.setReferenciaProduto(referenciaProduto);
		produto.setNome(nome);
		produto.setDescricao(descricao);
		produto.setImagem(imagemBytes);
		produto.setDataCriacao(new Date(System.currentTimeMillis())); // Conversão para java.sql.Date
		produto.setCusto(custo);
		produto.setPreco(preco);

		return produtoRepository.save(produto);
	}

	public Produto atualizarProduto(int id, String codigoProduto, String referenciaProduto, String nome,
			String descricao, MultipartFile imagem, Double custo, Double preco) throws IOException {
		Produto produto = produtoRepository.findById(id)
	            .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));

		if (codigoProduto != null)
			produto.setCodigoProduto(codigoProduto);
		if (referenciaProduto != null)
			produto.setReferenciaProduto(referenciaProduto);
		if (nome != null)
			produto.setNome(nome);
		if (descricao != null)
			produto.setDescricao(descricao);
		if (imagem != null)
			produto.setImagem(imagem.getBytes());
		if (custo != null)
			produto.setCusto(custo);
		if (preco != null)
			produto.setPreco(preco);

		produto.setDataAtualizacao(new Date(System.currentTimeMillis())); // Conversão para java.sql.Date

		return produtoRepository.save(produto);
	}
}
