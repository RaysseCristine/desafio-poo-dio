package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	
	private int cargaHoraria;
	private LocalDate data;
	
	@Override
	public double calcularXP() {
		return XP_PADRAO + 20d;
	}	
	
	public Mentoria() {
		super();
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoria {" + "titulo= " + getTitulo() + 
				", descri��o= " + getDescricao() + 
				"cargaHoraria= " + cargaHoraria + 
				", data=" + data +
				"}";
	}
}
