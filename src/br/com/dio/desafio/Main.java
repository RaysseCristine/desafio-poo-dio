package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main (String [] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("descri��o curso Java");
		curso1.setCargaHoraria(7);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Js");
		curso2.setDescricao("descri��o curso Js");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descri��o mentoria Java");
		mentoria1.setData(LocalDate.now());
		mentoria1.setCargaHoraria(10);
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);
		
	}
}
