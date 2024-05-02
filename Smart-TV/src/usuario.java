public class usuario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.ligar ();
        System.out.println("Mudança de status -> Tv ligada? " + smartTV.ligada);

    }

}
