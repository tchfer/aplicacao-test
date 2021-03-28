package br.com.treinamento;

public class SerHumano {
  
  public static void main(String[] args) {
    Animal objeto1 = new Animal();
    objeto1.setNome("Apollo");
    
    Animal objeto2 = new Animal();
    objeto2.setNome("Leia");

    objeto1.imprimirNomeCompleto();
    objeto2.imprimirNomeCompleto();
  }
}
