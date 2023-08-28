package Ex2_Veiculos;

import Ex1_Celular.Apple;
import Ex1_Celular.FabricanteCelular;
import Ex1_Celular.Samsung;

public class Singleton {

    private static IVehicleMaker honda;
    private static IVehicleMaker toyota;


    public static IVehicleMaker getInstance(String tipo){

        if(tipo.equals("honda")){
            if(honda == null)
                honda = new Honda();
            return honda;
        }
        else {
            if(toyota == null)
                toyota = new Toyota();
            return toyota;
        }


    }

}