package Ex1_Celular;

import java.util.Objects;

public class Apple implements FabricanteCelular{
    @Override
    public Celular constroiCelular(String modelo){
            Celular celular = null;
            if(Objects.equals(modelo, "IphoneX"))celular = new IphoneX();
            if(Objects.equals(modelo, "IphoneS"))celular = new IphoneS();
            return celular;
        }

}
