import java.util.Scanner;
public class Zadanie1 implements  IZadanie {
    public void Start(){

                Scanner scanner = new Scanner(System.in);
                System.out.print("Podaj liczbę elementów do posortowania: ");
                int n = scanner.nextInt();
                int[] numbers = new int[n];

                System.out.println("Podaj liczby do posortowania oddzielone spacją:");
                for (int i = 0; i < n; i++) {
                    numbers[i] = scanner.nextInt();
                }

                bubbleSort(numbers);

                System.out.println("Posortowane liczby:");
                for (int number : numbers) {
                    System.out.print(number + " ");
                }
            }

            public static void bubbleSort(int[] numbers) {
                int n = numbers.length;
                boolean swapped;
                for (int i = 0; i < n - 1; i++) {
                    swapped = false;
                    for (int j = 0; j < n - 1 - i; j++) {
                        if (numbers[j] > numbers[j + 1]) {
                            int temp = numbers[j];
                            numbers[j] = numbers[j + 1];
                            numbers[j + 1] = temp;
                            swapped = true;
                        }
                    }
                    if (!swapped) {
                        break;
                    }
                }
            }
        }

