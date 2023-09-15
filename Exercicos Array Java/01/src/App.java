/*
Desenvolva um programa contendo um  array capaz de armazenar 100 números 
inteiros. Esse mesmo programa deve inicializar os elementos desse array com 
valores presentes no intervalo [0, 99] de acordo com a “posição” de cada elemento. 
Após o array ter sido inicializado, esse programa deve calcular a soma de todos os 
elementos desse array 
*/

public class App {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i % 100;
            sum += arr[i];
        }
        System.out.println("Soma dos elementos do array: " + sum);
    }
}