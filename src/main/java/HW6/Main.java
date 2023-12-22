package HW6;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    static Random random;
    static Map<Integer, Boolean> statistics;
    static int doorsCount;

    public static void main(String[] args) {
        random = new Random();
        statistics = new HashMap<>();
        doorsCount = 3;


        for (int i = 0; i < 1000; i++) {
            round(i);
        }


        int win = 0;
        for (Map.Entry<Integer, Boolean> entry: statistics.entrySet()){
            if (entry.getValue()){
                win++;
            }
        }
        System.out.println("Игроку удалось выиграть " + win + " раз");
    }

    private static void round(int numRound) {
        int success = random.nextInt(doorsCount);
        int firstChoice = random.nextInt(doorsCount);
        int freeOpenDoor = -1;
        int secondChoice = -1;


        for (int i = 0; i < doorsCount; i++) {
            if (i != success && i != firstChoice){
                freeOpenDoor = i;
            }
        }


        for (int i = 0; i < doorsCount; i++) {
            if (i != freeOpenDoor && i != firstChoice){
                secondChoice = i;
            }
        }


        statistics.put(numRound, success == secondChoice);
    }
}
