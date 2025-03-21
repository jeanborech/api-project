package com.example.api_project.itens;

import com.example.api_project.produto.Produto;
import com.example.api_project.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItensService {

    @Autowired
    private ItensRepository itemRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public Itens criarItens(String descricaoItem, int idProduto, int quantidade, Double valorUnitario) {
        // Busca o produto pelo ID
        Produto produto = produtoRepository.findById(idProduto)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));

        // Calcula o valor total usando o operador *
        Double valorTotal = valorUnitario * quantidade;

        // Cria o item
        Itens item = new Itens();
        item.setDescricaoItem(descricaoItem);
        item.setProduto(produto);
        item.setQuantidade(quantidade);
        item.setValorUnitario(valorUnitario);
        item.setValorTotal(valorTotal);

        return itemRepository.save(item);
    }

    public Itens atualizarItens(int id, String descricaoItem, Integer quantidade, Double valorUnitario) {
        Itens item = itemRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Item não encontrado"));

        if (descricaoItem != null) {
            item.setDescricaoItem(descricaoItem);
        }

        if (quantidade != null) {
            item.setQuantidade(quantidade);
        }

        if (valorUnitario != null) {
            item.setValorUnitario(valorUnitario);
        }

        // Recalcula o valor total usando o operador *
        item.setValorTotal(item.getValorUnitario() * item.getQuantidade());

        return itemRepository.save(item);
    }
}