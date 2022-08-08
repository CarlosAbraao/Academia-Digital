package me.dio.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.MatriculaRepository;
import me.dio.academia.digital.service.IMatriculaService;


@Service
public class MatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	private MatriculaRepository matriculaRepository;

	@Override
	public Matricula create(MatriculaForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matricula get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Matricula> getAll(String bairro) {
		if(bairro == null) {
			return matriculaRepository.findAll();
		}else {
			return matriculaRepository.findByBuscaAlunuPorBairro(bairro);
		}
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
