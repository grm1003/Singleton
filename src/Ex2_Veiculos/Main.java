package Ex2_Veiculos;

public class Main {
    public static void main(String[] args) {
        IVehicleMaker honda = Singleton.getInstance("honda");
        IVehicleMaker toyota = Singleton.getInstance("toyota");
        IVehicle a,b;
        a = honda.makeVehicle("Fit");
        b = toyota.makeVehicle("Yaris");
        a.start();
        a.drive();
        a.stop();
        b.start();
        b.drive();
        b.stop();
        if(a == null || b == null) System.out.println("Erro");
        else System.out.println("Tudo ok");
    }
}
