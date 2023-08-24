package Ex1_Celular;

import Ex1_Celular.CelularImpl;
import Ex1_Celular.FabricanteCelularImpl;

public class Main {
    public static void main(String[] args) {

        FabricanteCelularImpl.getInstance();
        CelularImpl galaxy8;
        galaxy8 = FabricanteCelularImpl.constroiCelular("Galaxy8");
        FabricanteCelularImpl.getInstance();
        CelularImpl iphone = FabricanteCelularImpl.constroiCelular("IphoneX");
        if(galaxy8 == null || iphone == null) System.out.println("Erro");
        System.out.println("Tudo ok");
    }
}