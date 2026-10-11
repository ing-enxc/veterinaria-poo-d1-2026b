package Veterinaria;

public class Veterinaria {
    //Atributos
    private String nombre;
    private String especie;
    private double peso;
    private int edad;

    //Método constructor
    public Veterinaria(String nombre, String especie, double peso, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.edad = edad;
    }

    //Geters y seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso<0) {
            System.out.println("RECHAZADO. No se puede tener " + peso + " Kg de peso");
        }
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad<0) {
            System.out.println("RECHAZADO. No se puede tener " + edad + " años\n");
            return;
        }
        this.edad = edad;
    }

    //Método valorCnsulta
    int valorConsulta(int edad, double peso) {
        int consltabase = 35000;

        if (peso>25) {
            consltabase = consltabase + 20000;
            if (edad>=8) {
                consltabase = consltabase + 12000;
            }
        }

        else if (peso>10) {
            consltabase = consltabase + 10000;
            if (edad>=8) {
                consltabase = consltabase + 12000;
            }
        }

        return consltabase;
    }

    int descripcion(String nombre, String especie, double peso, int edad) {
        System.out.println(nombre + " ( " + especie + ", " + peso + "Kg, " + edad + " años ).");
        return 0;
    }
}
