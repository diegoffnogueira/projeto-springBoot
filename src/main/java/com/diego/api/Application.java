package com.diego.api;

import com.diego.api.entities.Empresa;
import com.diego.api.repositories.EmpresaRepository;
import com.diego.api.utils.SenhaUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Application {

	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;

	@Autowired
	private EmpresaRepository empresaRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Meu primeiro projeto...");
	}

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> {
			String senhaEncoded =null;
			senhaEncoded = SenhaUtils.gerarBcrypt("123456");
			System.out.println("### Senha encoded: " + senhaEncoded);
			senhaEncoded = SenhaUtils.gerarBcrypt("123456");
			System.out.println("### Senha encoded novamente: " + senhaEncoded);
			System.out.println("### Senha válida: " + SenhaUtils.senhaValida("123456", senhaEncoded));

//			Empresa empresa = new Empresa();
//			empresa.setRazaoSocial("Diego Company");
//			empresa.setCnpj("43423142356776");
//
//			this.empresaRepository.save(empresa);
//
//			List<Empresa> empresas = empresaRepository.findAll();
//			empresas.forEach(System.out::println);
//
//			Empresa empresaDB = empresaRepository.findOne(1L);
//			System.out.println("Empresa por ID: " + empresaDB);
//
//			empresa.setRazaoSocial("Diego Company WEBDate");
//			this.empresaRepository.save(empresa);
//
//			Empresa empresaCNPJ = empresaRepository.findByCnpj("43423142356776");
//			System.out.println("Empresa por CNPJ: " + empresaCNPJ);
//
//			this.empresaRepository.delete(1L);
//			empresas = empresaRepository.findAll();
//			System.out.println("Empresas: " + empresas.size());

		};
	}
}
