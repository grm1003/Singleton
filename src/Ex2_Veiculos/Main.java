package Ex2_Veiculos;

public class Main {
    public static void main(String[] args) {
        Honda honda = Honda.getInstance();
        Toyota toyota = Toyota.getInstance();
        IVehicle a,b;
        a = honda.makeVehicle("Fit");
        b = toyota.makeVehicle("Yaris");
        if(a == null || b == null) System.out.println("Erro");
        else System.out.println("Tudo ok");


    }
}
