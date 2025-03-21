public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("\nStatus: " + smartTV.ligada);
        System.out.println("Canal: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

        smartTV.ligar();
        smartTV.desligar();

        smartTV.aumentarVolume();
        smartTV.diminuirVolume();

        smartTV.mudarCanal(55);
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
    }
}
