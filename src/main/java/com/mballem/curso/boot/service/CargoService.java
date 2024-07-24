package com.mballem.curso.boot.service;

import java.util.List;

import com.mballem.curso.boot.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargos);
	
	void editar(Cargo cargos);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
	
	boolean cargoTemFuncionarios(Long id);
}