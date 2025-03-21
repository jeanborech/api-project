package com.example.api_project.cadastroempresa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroEmpresaService {

	@Autowired
	private CadastroEmpresaRepository cadastroEmpresaRepository;
	
	  // Método para listar todas as empresas
    public List<CadastroEmpresa> listarTodasEmpresas() {
        return cadastroEmpresaRepository.findAll();
    }

	

	public CadastroEmpresa criarCadastroEmpresa(String nomeEmpresa, String cnpj, String rua, String numeroEndereco,
			String complemento, String bairro, String cidade, String estado, String cep, String telefone, String email,
			String regimeTributario) {
		// Validações básicas
		if (nomeEmpresa == null || nomeEmpresa.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome da empresa é obrigatório.");
		}

		if (cnpj == null || cnpj.trim().isEmpty()) {
			throw new IllegalArgumentException("CNPJ é obrigatório.");
		}

		// Criação do objeto CadastroEmpresa
		CadastroEmpresa cadastroEmpresa = new CadastroEmpresa();
		cadastroEmpresa.setNomeEmpresa(nomeEmpresa);
		cadastroEmpresa.setCnpj(cnpj);
		cadastroEmpresa.setRua(rua);
		cadastroEmpresa.setNumeroEndereco(numeroEndereco);
		cadastroEmpresa.setComplemento(complemento);
		cadastroEmpresa.setBairro(bairro);
		cadastroEmpresa.setCidade(cidade);
		cadastroEmpresa.setEstado(estado);
		cadastroEmpresa.setCep(cep);
		cadastroEmpresa.setTelefone(telefone);
		cadastroEmpresa.setEmail(email);
		cadastroEmpresa.setRegimeTributario(regimeTributario);

		return cadastroEmpresaRepository.save(cadastroEmpresa);
	}

	public CadastroEmpresa atualizarCadastroEmpresa(int id, String nomeEmpresa, String cnpj, String rua,
			String numeroEndereco, String complemento, String bairro, String cidade, String estado, String cep,
			String telefone, String email, String regimeTributario) {
		CadastroEmpresa cadastroEmpresa = cadastroEmpresaRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Cadastro da empresa não encontrado"));
		
		
		if (nomeEmpresa != null)
			cadastroEmpresa.setNomeEmpresa(nomeEmpresa);
		if (cnpj != null)
			cadastroEmpresa.setCnpj(cnpj);
		if (rua != null)
			cadastroEmpresa.setRua(rua);
		if (numeroEndereco != null)
			cadastroEmpresa.setNumeroEndereco(numeroEndereco);
		if (complemento != null)
			cadastroEmpresa.setComplemento(complemento);
		if (bairro != null)
			cadastroEmpresa.setBairro(bairro);
		if (cidade != null)
			cadastroEmpresa.setCidade(cidade);
		if (estado != null)
			cadastroEmpresa.setEstado(estado);
		if (cep != null)
			cadastroEmpresa.setCep(cep);
		if (telefone != null)
			cadastroEmpresa.setTelefone(telefone);
		if (email != null)
			cadastroEmpresa.setEmail(email);
		if (regimeTributario != null)
			cadastroEmpresa.setRegimeTributario(regimeTributario);

		return cadastroEmpresaRepository.save(cadastroEmpresa);
	}
}