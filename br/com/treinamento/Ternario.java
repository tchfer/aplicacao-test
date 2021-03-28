package br.com.treinamento;

public class Ternario {
  public static void main(String[] args) {
    int a = 0;
    int b = 3;
    int c = 4;

    //variável = (condicao) ? se true : se false
    a = b > c ? b : c;

    System.out.println(a);
  }
}
