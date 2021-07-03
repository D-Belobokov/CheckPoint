package Lesson4;
import Lesson4.exceptions.GabaritException;
import Lesson4.exceptions.Speed100Exception;
import Lesson4.exceptions.Speed80Exception;

import java.util.Random;

public class RunCheckPoint {
    public static void main(String[] args) {
        final int size = 25;
        Auto[] automotive = new Auto[size];
        for (int i = 0; i < automotive.length; i++) {
            automotive[i] = new Auto(i);
        }
        CheckPoint checkPoint = new CheckPoint();
        for (Auto auto : automotive) {
            try {
                checkPoint.checkSpeed(auto);
            } catch (Speed100Exception e) {
                System.out.println(e.getMessage());
                continue;
            } catch (Speed80Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            try {
                checkPoint.checkGabarit(auto);
            } catch (GabaritException e) {
                System.out.println(e.getMessage());
                continue;
            }
            System.out.println("Автомобиль с номером " + auto.getNumber() + " успешно прошел КПП");
        }
    }
}

