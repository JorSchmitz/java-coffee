public class Coche {
  int puertas = 0;

  public static void main(String[] args) {
    System.out.println(suma(1, 2, 3));

    Coche miCoche = new Coche();
    miCoche.incrementarPuertas();
    System.out.println(miCoche.puertas);
  }

  public static int suma(int a, int b, int c) {
    return a + b + c;
  }

  public void incrementarPuertas() {
    puertas++;
  }
}

// Primera parte:

// Crear una función con tres parámetros que sean números que se suman entre sí.

// Llamar a la función en el main y darle valores.

// Segunda parte:

// Crear una clase coche.

// Dentro de la clase coche, una variable numérica que almacene el número de
// puertas que tiene.

// Una función que incremente el número de puertas que tiene el coche.

// Crear un objeto miCoche en el main y añadirle una puerta.

// Mostrar el número de puertas que tiene el objeto.
