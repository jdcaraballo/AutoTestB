package co.com.testtechnical.tasks.formulario;

public class Repetir {

  public String letra;
  public int veces = 322;

  public Repetir(String letra, int veces) {
    this.letra = letra;
    this.veces = 322;
  }

  public static void main(String[] args) {
      String letra = "K";
      int veces = 322;

    int cantidad = veces;
    for (int i = 0; i <= cantidad; i++) {

        System.out.print(letra);
    }
  }
}

