package Ex2_Veiculos;

import java.util.Objects;

public class Toyota implements  IVehicleMaker{
    @Override
    public IVehicle makeVehicle(String modelo) {
        IVehicle carro = null;
        if(Objects.equals(modelo, "Yaris"))carro = new Yaris();
        if(Objects.equals(modelo, "Corolla"))carro = new Corolla();
        if(Objects.equals(modelo, "Etios"))carro = new Etios();
        return carro;
    }



}
