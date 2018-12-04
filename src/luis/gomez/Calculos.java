package luis.gomez;

public class Calculos implements Metodos {

    // He puesto implement ya que esta class implementa los metoos de la interfaz Metodos


    // Aqui he creado un atributo numero
    private String numero;

    //He creado el constructor

    public Calculos(String numero) {
        this.numero = numero;
    }

    // Creo los getter y Setter

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    //Aqui he implementado los metodos de la interface Metodos


    @Override
    public boolean esCapicua() {

        int n = Integer.parseInt(numero);

        boolean result = false;


        if (numero.length() == 2){
            if (numero.charAt(0)==numero.charAt(1)){
                result = true;
            }
            else {

            }
        }

        if (numero.length() == 3){
            if (numero.charAt(0)==numero.charAt(2)){ //Aqui he rectificado el valor 1 por un 2, ya que para numeros de 3 cifras, queremos que compare la primera cifra (0) y la ultima (2)
                result = true;
            }
            else {

            }
        }
        return result;
    }

    @Override
    public boolean esPar() {

        int n = Integer.parseInt(numero);

        if (n%2==0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean esDivisiblePorTres() {

        int n = Integer.parseInt(numero);

        if (n%3==0){
            return true;
        } else {
            return false;
        }
    }
}
