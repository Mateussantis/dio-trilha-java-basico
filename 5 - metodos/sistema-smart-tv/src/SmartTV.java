public class SmartTV {
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar() {
    ligada = true;
    System.out.println("Tv ligada: " + ligada);
  }

  public void desligar() {
    ligada = false;
    System.out.println("Tv desligada: " + ligada);
  }

  public void aumentarVolume() {
    volume++;
    System.out.println("Aumentar volume: " + volume);
  }

  public void diminuirVolume() {
    volume--;
    System.out.println("Diminuir volume: " + volume);
  }

  public void mudarCanal(int novoCanal) {
    canal = novoCanal;
    System.out.println("Canal atual: " + canal);
  }
  
  public void aumentarCanal() {
    canal++;
    System.out.println("Aumentar Canal: " + canal);
  }
  
  public void diminuirCanal() {
    canal--;
    System.out.println("Diminuir Canal: " + canal);
  }
}
