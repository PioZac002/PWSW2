import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
public class Zadanie2 implements  IZadanie {
    public void Start() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        double[] possibleValues = {2, 3, 3.5, 4, 4.5, 5};
        Map<Double, Integer> frequencyMap = new HashMap<>();

        System.out.println("Podaj liczbę elementów tablicy:");
        int n = scanner.nextInt();

        double[] array = new double[n];
        System.out.println("Elementy tablicy:");

        for (int i = 0; i < n; i++) {
            array[i] = possibleValues[random.nextInt(possibleValues.length)];
            frequencyMap.put(array[i], frequencyMap.getOrDefault(array[i], 0) + 1);
            System.out.println(array[i]);
        }

        Arrays.sort(array);
        double min = array[0];
        double max = array[n - 1];

        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        double mean = sum / n;

        double squaredDiffSum = 0;
        for (double value : array) {
            squaredDiffSum += Math.pow(value - mean, 2);
        }
        double standardDeviation = Math.sqrt(squaredDiffSum / n);

        System.out.println("Średnia: " + mean);
        System.out.println("Minimum: " + min);
        System.out.println("Maksimum: " + max);
        System.out.println("Wartości wyższe niż średnia: " + Arrays.stream(array).filter(val -> val > mean).toArray().length);
        System.out.println("Wartości niższe niż średnia: " + Arrays.stream(array).filter(val -> val < mean).toArray().length);
        System.out.println("Częstotliwość występowania poszczególnych liczb: " + frequencyMap);
        System.out.println("Odchylenie standardowe: " + standardDeviation);
    }

}