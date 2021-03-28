package br.com.treinamento;

public class ListaTabulada {
  public static void main(String[] args) {
    System.out.printf("Numero\t Quadrado\t Cubo\n");
    for(int i = 0; i <= 10; i++) {
      System.out.printf("%d\t %d\t \t%d\n", i, i * i, i * i * i);
    }
  }
}
