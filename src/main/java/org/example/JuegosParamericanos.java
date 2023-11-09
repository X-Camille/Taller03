package org.example;
import java.util.*;

public class JuegosParamericanos {
    private ArrayList<Atleta> atletas;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Equipo> equipos;
    private ArrayList<Evento> eventos;

    public JuegosParamericanos() {
        atletas = new ArrayList<Atleta>();
        disciplinas = new ArrayList<Disciplina>();
        equipos = new ArrayList<Equipo>();
        eventos = new ArrayList<Evento>();
    }

    public static void main(String[] args) {
        JuegosParamericanos juegos = new JuegosParamericanos();
        Scanner scanner = new Scanner(System.in);
        String opcion;

        do {
            juegos.mostrarOpciones();
            opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    juegos.registrarAtleta();
                    break;
                case "2":
                    juegos.registrarDisciplina();
                    break;
                case "3":
                    juegos.crearEquipo();
                    break;
                case "4":
                    juegos.crearEvento();
                    break;
                case "5":
                    juegos.asignarAtletas();
                    break;
                case "6":
                    juegos.asignarEquipos();
                    break;
                case "0":
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (!opcion.equalsIgnoreCase("0"));
    }

    public void mostrarOpciones(){
        System.out.println("Menú de Juegos Panamericanos");
        System.out.println("1. Registrar Atleta");
        System.out.println("2. Registrar Disciplina");
        System.out.println("3. Crear Equipo");
        System.out.println("4. Crear Evento");
        System.out.println("5. Asignar Atletas");
        System.out.println("6. Asignar Equipos");
        System.out.println("0. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public void registrarAtleta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del atleta: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el país del atleta: ");
        String pais = scanner.nextLine();
        System.out.println("Ingrese la edad del atleta: ");
        int edad = scanner.nextInt();
        Atleta atleta = new Atleta(nombre, pais, edad);
        atletas.add(atleta);
        System.out.println("Atleta registrado correctamente");
    }

    public void registrarDisciplina() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la disciplina: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el número de participantes: ");
        int numeroParticipantes = scanner.nextInt();
        System.out.println("Ingrese el récord mundial actual: ");
        String recordMundial = scanner.nextLine();
        Disciplina disciplina = new Disciplina(nombre, numeroParticipantes, recordMundial);
        disciplinas.add(disciplina);
        System.out.println("Disciplina registrada correctamente");
    }

    public void crearEquipo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del equipo: ");
        String nombreEquipo = scanner.nextLine();
        System.out.print("Ingrese el nombre de la disciplina del equipo: ");
        String nombreDisciplina = scanner.nextLine();

        Disciplina disciplinaEncontrada = disciplinaExiste(nombreDisciplina);

        if (disciplinaEncontrada != null) {
            Equipo equipo = new Equipo(nombreEquipo, disciplinaEncontrada);
            equipos.add(equipo);
            System.out.println("Equipo creado correctamente");
        } else {
            System.out.println("La disciplina '" + nombreDisciplina + "' no existe. No se pudo crear el equipo.");
        }
    }

    public Disciplina disciplinaExiste(String nombreDisciplina){
        for (Disciplina disciplina : disciplinas) {
            if (disciplina.getNombre().equals(nombreDisciplina)) {
                return disciplina;
            }
        }
        return null;
    }

    public void crearEvento() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la disciplina del evento: ");
        String nombreDisciplina = scanner.nextLine();
        System.out.print("Ingrese la fecha del evento: ");
        String fecha = scanner.nextLine();

        Disciplina disciplinaEncontrada = disciplinaExiste(nombreDisciplina);

        if (disciplinaEncontrada != null) {
            Evento evento = new Evento(disciplinaEncontrada, fecha);
            eventos.add(evento);
            System.out.println("Evento creado correctamente");
        } else {
            System.out.println("La disciplina '" + nombreDisciplina + "' no existe. No se pudo crear el evento.");
        }
    }

    public void asignarAtletas() {
        // Implementa la lógica para asignar atletas a eventos o equipos
    }

    public void asignarEquipos() {
        // Implementa la lógica para asignar equipos a eventos
    }
}
