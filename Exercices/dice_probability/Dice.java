import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dice {

    private final int numberOfDices;
    private int targetNumber;
    private double probabilityToFindTargetNumber;

    
    public Dice(int numberOfDices, int targetNumber) {
        this.numberOfDices = numberOfDices;
        this.targetNumber = targetNumber;
    }

    public void setTargetNumber(int targetNumber) {
        this.targetNumber = targetNumber;
    }

    public double getProbabilityToFindTargetNumber() {
        return this.probabilityToFindTargetNumber;
    }

    public void probabilityOfSum() {
        List<Integer> combinations = new ArrayList<>(Collections.nCopies(this.targetNumber + 1, 0));
        combinations.set(0, 1);

        for (int i = 0; i < this.numberOfDices; i++) {
            List<Integer> newCombinations = new ArrayList<>(Collections.nCopies(this.targetNumber + 1, 0));
            for (int sum = 0; sum <= this.targetNumber; sum++) {
                for (int face = 1; face <= 6; face++) {
                    if (sum + face <= this.targetNumber) {
                        newCombinations.set(sum + face, newCombinations.get(sum + face) + combinations.get(sum));
                    }
                }
            }
            combinations = newCombinations;
        }

        int totalCombinations = (int) Math.pow(6, this.numberOfDices);
        this.probabilityToFindTargetNumber = (double) combinations.get(this.targetNumber) * 100 / totalCombinations;
    }

    public static void main(String[] args) {
        Dice dice = new Dice(2, 12);
        dice.probabilityOfSum();
        long roundedProbability = Math.round(dice.getProbabilityToFindTargetNumber());
        System.out.println("La probabilité de trouver la somme " + dice.targetNumber + " avec " + dice.numberOfDices
                + " dé(s) est de " + roundedProbability + "%");
    }
}
