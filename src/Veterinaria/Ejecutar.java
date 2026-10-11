package Veterinaria;

public class Ejecutar {
    public static void main(String[] args) {

        //Objeto
        Veterinaria[] m = new Veterinaria[4];

        //Pantalla de inicio
        System.out.println("============================");
        System.out.println("===== SuperVeterinaria =====");
        System.out.println("============================");
        System.out.println("\nBienvenido a mi SuperVeterinaria");
        System.out.println("Acá le atendemos bien a su animalito\n");


        //Mascotas
        m[0] = new Veterinaria("Luna", "Perro", 28.2, 9);
        m[1] = new Veterinaria("Michi", "Gato", 4.2, 3);
        m[2] = new Veterinaria("Rocky", "Perro", 12.0, 5);
        m[3] = new Veterinaria("Pepa", "Conejo", 2.1, 1);

        m[0].setEdad(-3);

        int i;
        for (i = 0; i < m.length; i++) {
            m[i].descripcion(m[i].getNombre(), m[i].getEspecie(),m[i].getPeso(), m[i].getEdad());
            System.out.println("Valor de la consulta: $" + m[i].valorConsulta(m[i].getEdad(), m[i].getPeso()) + "\n");
        }

        int totalrecaudo = 0;
        for (i = 0; i < m.length; i++ ) {
            totalrecaudo = totalrecaudo + m[i].valorConsulta(m[i].getEdad(), m[i].getPeso());
        }
        System.out.println("Total recaudado: $" + totalrecaudo);

    }
}
