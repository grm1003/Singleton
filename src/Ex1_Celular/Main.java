package Ex1_Celular;


public class Main {
    public static void main(String[] args) {

        FabricanteCelular apple = Singleton.getInstance("apple");
        FabricanteCelular samsung = Singleton.getInstance("samsung");
        Celular galaxy8;
        galaxy8 = samsung.constroiCelular("Galaxy8");
        Celular iphone = apple.constroiCelular("IphoneX");
        galaxy8.fazLigacao();
        galaxy8.tiraFoto();
        iphone.tiraFoto();
        iphone.fazLigacao();
        if(galaxy8 == null || iphone == null) System.out.println("Erro");
        System.out.println("Tudo ok");
    }
}