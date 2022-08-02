package me.dio.academia.digital.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.engine.internal.CascadePoint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {

	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  // AS ALTERAÇÕES FEITAS NESSA TABELA AFETARÃO DIRETAMENTE A OUTRA
  @ManyToOne(cascade = CascadeType.ALL)
  // VAI CRIAR UM TABELA RELACIONANDO OS IDS
  @JoinColumn(name = "aluno_id")
  private Aluno aluno;

  private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

  @Column(name = "peso_atual")
  private double peso;
  @Column(name = "altura_atual")
  private double altura;

  
  	public AvaliacaoFisica() {
  		
  	}


	public AvaliacaoFisica(Long id, Aluno aluno, LocalDateTime dataDaAvaliacao, double peso, double altura) {
		this.id = id;
		this.aluno = aluno;
		this.dataDaAvaliacao = dataDaAvaliacao;
		this.peso = peso;
		this.altura = altura;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public LocalDateTime getDataDaAvaliacao() {
		return dataDaAvaliacao;
	}


	public void setDataDaAvaliacao(LocalDateTime dataDaAvaliacao) {
		this.dataDaAvaliacao = dataDaAvaliacao;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}
  	
  	
}
