package luis.gomez;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        // Abrimos Scanner para poder escribir un numero por teclado
        Scanner sc = new Scanner(System.in);

        // Ahora preguntamos por un numero entero
        System.out.print("Introduce un numero entero" +"\n");

        // Aqui recogemos el valor introducido para usarlo despues
        String nuevoNumero = sc.next();
        sc.close();

        // Ahora creamos un objeto de la clase Cálculos para poder controlar el valor del atributo numero a traves de Scanner

        Calculos numero1=new Calculos("0"); // Aqui inicio a cero el valor del numero, ya que despues va a ir variando segun lo introducido por teclado

        // Aqui lo que hago es decirle  que al atributo numero de la clase Cálculos le ponga el valor introducido por teclado
        numero1.setNumero(nuevoNumero);

        // Ahora si el número introducido tiene 2 o 3 cifras, llamamos al metodo esCapicua

        if(nuevoNumero.length()==2 || nuevoNumero.length()==3){

            // Ahora uso este formato para obtener el resultado del metodo, se trata de poner a la hora de imprimir,
            // el metodo seguido de una interrogacion, seguido de comillas y entre comillas ponemos
            // el texto que queremos que aparezca si el metodo devuelve un true, despues ponemos 2 puntos
            // y seguido y entre comillas el texto para cuando el metodo devuelva false
            System.out.println((numero1.esCapicua()?"El numero es capicúa":"El número no es capicúa"));
        }

        //Si el número  tiene tres o mas cifras, llamamos al metodo esPar
        if(nuevoNumero.length()>=3){
            System.out.println((numero1.esPar()?"El numero es par":"El numero es no es par"));
        }

        //Si el número tiene una cifra, llamamos al metodo esDivisiblePorTres
        if (nuevoNumero.length()==1){
            System.out.println((numero1.esDivisiblePorTres()?"El numero es divisible por 3":"El numero no es divisible por 3"));
        }

    }

}
