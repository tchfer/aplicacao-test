package br.com.treinamento;

public class MultiplasVerificacoes {
 public static void main(String[] args)  {
   int num = 10;
   switch (num) {
     case 5:
      System.out.println("Valor e 5");
      break;
     case 10:
      System.out.println("Valor e 10");
      break;
     case 20:
      System.out.println("Valor e 20");
      break;
     default:
      System.out.println("Valor inicial foi -> " + num);
      break;
   }
 }
}
