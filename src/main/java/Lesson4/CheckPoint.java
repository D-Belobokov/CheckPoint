package Lesson4;

import Lesson4.Auto;
import Lesson4.exceptions.GabaritException;
import Lesson4.exceptions.Speed100Exception;
import Lesson4.exceptions.Speed80Exception;

public class CheckPoint {
    private int height = 400;
    private int width = 250;
    private int weight = 8;

    public boolean checkGabarit(Auto auto) throws GabaritException{
        if (auto.getHeight() > this.height || auto.getWeight() > this.weight || auto.getWidth() > this.width) {
            throw new GabaritException("Машина не проходит по габаритам, номер авто"
                    + auto.getNumber() + "тип авто:" + (auto.isCargo() ? "грузовой" : "легковой"));

        }else {
            return true;
        }
    }
    public boolean checkSpeed(Auto auto) throws Speed80Exception, Speed100Exception{
        if (auto.getSpeed() > 80 && auto.getSpeed() < 100) {
            throw new Speed80Exception("Внимание превышение скорости, номер автомобиля" + auto.getNumber());
        }else if(auto.getSpeed() > 100) {
            throw new Speed100Exception("Полиция преследует автомобиль");
        }else {
            return true;
        }
    }
}
