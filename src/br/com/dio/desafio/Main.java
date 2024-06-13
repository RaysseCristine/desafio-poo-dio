package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
	
	public static void main (String [] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("descrição curso Java");
		curso1.setCargaHoraria(7);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Js");
		curso2.setDescricao("descrição curso Js");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Mentoria de Java");
		mentoria1.setDescricao("Descrição mentoria Java");
		mentoria1.setData(LocalDate.now());
		mentoria1.setCargaHoraria(10);
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria1);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer.");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devRaysse = new Dev();
		devRaysse.setNome("Raysse");
		devRaysse.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Raysse" + devRaysse.getConteudosInscritos());
		
		devRaysse.progredir();
		devRaysse.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Raysse" + devRaysse.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Raysse" + devRaysse.getConteudosConcluidos());
		System.out.println("XP: " + devRaysse.calcularTotalXp());
		
		System.out.println("----------");
		
		Dev devPedro = new Dev();
		devPedro.setNome("Pedro");
		devPedro.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Pedro" + devPedro.getConteudosInscritos());
		
		devPedro.progredir();
		devPedro.progredir();
		devPedro.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos Pedro" + devPedro.getConteudosInscritos());
		System.out.println("Conteudos Concluídos Raysse" + devRaysse.getConteudosConcluidos());
		System.out.println("XP: " + devPedro.calcularTotalXp());



		
		
	}
}
