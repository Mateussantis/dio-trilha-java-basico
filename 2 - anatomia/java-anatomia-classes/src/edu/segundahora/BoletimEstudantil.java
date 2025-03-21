package edu.segundahora;

public class BoletimEstudantil {
  public static void main(String[] args) {
    int mediaFinal = 10;

    if(mediaFinal < 6) {
      System.out.println("REPROVADO");
    }
    else if(mediaFinal == 6) {
      System.out.println("Media !");
    }
    else {
      System.out.println("Aprovado");
    }
  }
}
