package edu.primeirahora;
public class MinhaClasse {
  public static void main(String[] args) {
    String primeiroNome = "Mateus";
    String segundoNome = "Silva De Santis";

    System.out.println(nomeCompleto(primeiroNome, segundoNome));
  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
  }

}
