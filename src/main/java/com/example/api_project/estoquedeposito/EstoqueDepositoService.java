package com.example.api_project.estoquedeposito;

import com.example.api_project.deposito.Deposito;
import com.example.api_project.deposito.DepositoRepository;
import com.example.api_project.produto.Produto;
import com.example.api_project.produto.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EstoqueDepositoService {

	//Responsável por buscar e manipular dados da entidade EstoqueDeposito.
    @Autowired
    private EstoqueDepositoRepository estoqueDepositoRepository;

    //Responsável por buscar e manipular dados da entidade Deposito
    @Autowired
    private DepositoRepository depositoRepository;

    //Responsável por buscar e manipular dados da entidade Produto.
    @Autowired
    private ProdutoRepository produtoRepository;

    // Método para listar todos os estoques
    public List<EstoqueDeposito> listarTodosEstoques() {
        return estoqueDepositoRepository.findAll();
    }

    // Método para criar um novo estoque
    //Essa parte do código cria um novo objeto EstoqueDeposito, associando o depósito e o produto encontrados, e define a quantidade em estoque e a data de última atualização.
    
    public EstoqueDeposito criarEstoqueDeposito(int idDeposito, int idProduto, int quantidadeEstoque, Date dataUltimaAtualizacao) {
        // Validações básicas
        if (quantidadeEstoque < 0) {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }

        //fazendo a conexão de deposito e produto para usar em estoqueDeposito
        
        Deposito deposito = depositoRepository.findById(idDeposito) 
                .orElseThrow(() -> new IllegalArgumentException("Depósito não encontrado."));
      //O método findById é fornecido pelo Spring Data JPA  e busca um registro na tabela Deposito com base no ID
        //fornecido (idDeposito). -- Ele retorna um Optional<Deposito>, que pode conter o objeto Deposito se ele for encontrado
        //Se o Optional estiver vazio ( nenhum depósito foi encontrado com o ID fornecido), o método orElseThrow lança uma exceção.
        //Se o Depósito for encontrado, ele é atribuído à variável deposito
        
        Produto produto = produtoRepository.findById(idProduto)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado."));

        EstoqueDeposito estoqueDeposito = new EstoqueDeposito(); //Cria uma nova instância da classe EstoqueDeposito
        estoqueDeposito.setDeposito(deposito); //Associa o objeto Deposito (encontrado anteriormente) ao EstoqueDeposito
        estoqueDeposito.setProduto(produto); //Associa o objeto Produto (encontrado anteriormente) ao EstoqueDeposito
        estoqueDeposito.setQuantidadeEstoque(quantidadeEstoque);//O valor de quantidadeEstoque é passado como parâmetro para o método criarEstoqueDeposito
        estoqueDeposito.setDataUltimaAtualizacao(dataUltimaAtualizacao);

        return estoqueDepositoRepository.save(estoqueDeposito);
    }

    // Método para atualizar um estoque existente
    public EstoqueDeposito atualizarEstoqueDeposito(int idDeposito, int idProduto, int quantidadeEstoque, Date dataUltimaAtualizacao) {
        // Busca o estoque no banco de dados
        EstoqueDeposito estoqueDeposito = estoqueDepositoRepository.findByDepositoIdDepositoAndProdutoId(idDeposito, idProduto)
                .orElseThrow(() -> new IllegalArgumentException("Estoque não encontrado para o depósito e produto especificados."));

        // Atualiza a quantidade em estoque (se fornecida)
        if (quantidadeEstoque >= 0) {
            estoqueDeposito.setQuantidadeEstoque(quantidadeEstoque);
        } else {
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");
        }

        // Atualiza a data de última atualização (se fornecida)
        if (dataUltimaAtualizacao != null) {
            estoqueDeposito.setDataUltimaAtualizacao(dataUltimaAtualizacao);
        }

        return estoqueDepositoRepository.save(estoqueDeposito);
    }
}