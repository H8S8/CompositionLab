import garage.land.Car;
import garage.engine.CombustionEngine;
import garage.engine.ElectricEngine;
import garage.engine.IEngine;
import garage.water.Speedboat;

public class Runner {

    public static void main(String[] args) {

        //instead of car.getEngine().getHorsePower(), make car implement garage.engine.IEngine:

        IEngine combustionEngine = new CombustionEngine(99, "01/01/2024");
        Car hondaJazz = new Car(1300, 150, "hatchback", combustionEngine);
        System.out.println(hondaJazz.getHorsePower());

        IEngine electricEngine = new ElectricEngine(399, 100);
        hondaJazz.setEngine(electricEngine);
        System.out.println(hondaJazz.getHorsePower());

        Speedboat gottaGoFast = new Speedboat(500, 70, true, "Planing", combustionEngine);
        System.out.println(gottaGoFast.getHorsePower());

        gottaGoFast.setEngine(electricEngine);
        System.out.println(gottaGoFast.getHorsePower());
    }

}
