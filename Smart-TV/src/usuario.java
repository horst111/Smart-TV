public class usuario {
    public static void main(String[] args) throws Exception {
    
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar ();
        System.out.println("Mudança de status -> Tv ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Mudança de status -> Tv ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual:" + smartTV.volume);

        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
        smartTV.aumentarCanal();
        System.out.println("Canal Atual: " + smartTV.canal);

        smartTV.selecionarCanal(11);
        
        System.out.println("Canal Atual: " + smartTV.canal);

    }

}
