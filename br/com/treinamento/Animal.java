package br.com.treinamento;

public class Animal {
  
  private String nome;

  public void andar() {
    System.out.println("O " + nome + " esta andando");
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void imprimirNomeCompleto() {
    System.out.println(this.nome + " esta andando!");
  }
}
