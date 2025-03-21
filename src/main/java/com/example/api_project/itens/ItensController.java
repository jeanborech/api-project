package com.example.api_project.itens;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/itens")
public class ItensController {

    @Autowired
    private ItensService itensService;

    // Endpoint para criar um novo item
    @PostMapping
    public ResponseEntity<Itens> criarItem(
            @RequestParam("descricaoItem") String descricaoItem,
            @RequestParam("idProduto") int idProduto,
            @RequestParam("quantidade") int quantidade,
            @RequestParam("valorUnitario") Double valorUnitario) {

        try {
        	Itens novoItem = itensService.criarItens(descricaoItem, idProduto, quantidade, valorUnitario);
            return ResponseEntity.status(201).body(novoItem);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }

    // Endpoint para atualizar um item existente
    @PutMapping("/{id}")
    public ResponseEntity<Itens> atualizarItem(
            @PathVariable int id,
            @RequestParam(value = "descricaoItem", required = false) String descricaoItem,
            @RequestParam(value = "quantidade", required = false) Integer quantidade,
            @RequestParam(value = "valorUnitario", required = false) Double valorUnitario) {

        try {
        	Itens itensAtualizado = itensService.atualizarItens(id, descricaoItem, quantidade, valorUnitario);
            return ResponseEntity.ok(itensAtualizado);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        } catch (Exception e) {
            return ResponseEntity.status(500).body(null);
        }
    }
}
