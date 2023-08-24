package Ex2_Veiculos;

import Ex1_Celular.FabricanteCelularImpl;

public interface IVehicleMaker {

    public  IVehicle makeVehicle(String modelo);
    public IVehicleMaker getInstance();
}
