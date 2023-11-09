package org.example;

import java.util.*;

public class Equipo {

	private Evento evento;
	private String nombre;
	private ArrayList<Atleta> listaAtletas;
	private Disciplina disciplina;

	public Equipo(String nombre, Disciplina disciplina) {
		this.nombre = nombre;
		this.disciplina = disciplina;
	}

	public void agregarAtleta() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese el equipo del atleta: ");
	}

	public void eliminarAtleta() {
		// TODO - implement Equipo.eliminarAtleta
		throw new UnsupportedOperationException();
	}

	public void mostrarInformacionEquipo() {
		// TODO - implement Equipo.mostrarInformacionEquipo
		throw new UnsupportedOperationException();
	}

}