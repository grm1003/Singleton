package Ex1_Celular;

import java.util.Objects;
//Singleton
public class Samsung implements FabricanteCelular {

    public Celular constroiCelular(String modelo) {
        Celular celular = null;
        if(Objects.equals(modelo, "Galaxy8"))celular = new Galaxy8();
        if(Objects.equals(modelo, "Galaxy20"))celular = new Galaxy20();
        return celular;
    }
}
