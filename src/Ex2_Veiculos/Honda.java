package Ex2_Veiculos;

import Ex1_Celular.*;

import java.util.Objects;

public class Honda implements  IVehicleMaker{
    @Override
    public IVehicle makeVehicle(String modelo) {
        IVehicle carro = null;
        if(Objects.equals(modelo, "Fit"))carro = new Fit();
        if(Objects.equals(modelo, "City"))carro = new City();
        if(Objects.equals(modelo, "Civic"))carro = new Civic();
        return carro;
    }


}
