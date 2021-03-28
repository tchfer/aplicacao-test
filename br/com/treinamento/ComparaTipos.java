package br.com.treinamento;

public class ComparaTipos {
  public static void main(String[] args) {
    String nome = "Fernando";
    if(nome instanceof String) {
      System.out.println("E uma string");
    } else {
      System.out.println("Nao e uma String");
    }
  }
}
