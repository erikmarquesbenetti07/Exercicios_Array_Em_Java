/*
Utilizando classes, atributos e métodos desenvolva um programa capaz de 
armazenar pessoas e que contenha um método para aumentar a idade dessas 
pessoas quando elas fizerem aniversário. A cada aniversário, deve ser exibida uma 
mensagem contendo nome, idade anterior e idade atual do aniversariante.
○ Exemplo de saída:
■ Parabéns, Fulano de Tal! Você tinha X anos e 
agora tem Y anos!
 */

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("Fulano de Tal", 20));

        for (Pessoa pessoa : pessoas) {
            pessoa.fazerAniversario();
            System.out.println("Parabéns, " + pessoa.getNome() + "! Você tinha " + 
            (pessoa.getIdade() - 1) + " anos e agora tem " + pessoa.getIdade() + " anos!");
        }
    }
}


