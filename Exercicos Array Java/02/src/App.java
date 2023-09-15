/*
Desenvolva um programa contendo um array capaz de armazenar caracteres. Esse 
mesmo programa deve armazenar a frase “Olá, Java!” nesse array e exibir tal frase 
percorrendo esse array.
*/

public class App {
    public static void main(String[] args) {
        char[] arr = {'O', 'l', 'á', ',', ' ', 'J', 'a', 'v', 'a', '!'};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
