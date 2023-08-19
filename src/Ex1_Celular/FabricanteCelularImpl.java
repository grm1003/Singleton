package Ex1_Celular;

import java.util.Objects;
//Singleton
public class FabricanteCelularImpl implements FabricanteCelular {
    private static FabricanteCelularImpl instance;
    private FabricanteCelularImpl(){
    }

    public static FabricanteCelularImpl getInstance(){
        if(instance == null){
            instance = new FabricanteCelularImpl();
        }
        return instance;
    }

    public static CelularImpl constroiCelular(String modelo) {
        CelularImpl celular = null;
        if(Objects.equals(modelo, "Galaxy8"))celular = new Galaxy8();
        if(Objects.equals(modelo, "Galaxy20"))celular = new Galaxy20();
        if(Objects.equals(modelo, "IphoneX"))celular = new IphoneX();
        if(Objects.equals(modelo, "IphoneS"))celular = new IphoneS();
        return celular;
    }
}
