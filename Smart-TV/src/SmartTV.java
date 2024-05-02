public class SmartTV {
    boolean ligada=false;
    int canal=1; 
    int volume=27;
    


    public void ligar(){ 
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Mudando de canal: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Mudando de canal: " + canal);
    }

    public void selecionarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal selecionado: " + canal);
}
}
