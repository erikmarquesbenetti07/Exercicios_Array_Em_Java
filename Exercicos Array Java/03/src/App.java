/*Utilizando classes, atributos e métodos desenvolva um programa capaz de 
armazenar as disciplinas em que você está matriculado nesse semestre e calcular as 
médias aritméticas do seu rendimento nessas disciplinas.
○ Exemplo de saída:
■ Aluno: Fulano de Tal
■ Linguagem para Aplicações de Internet (Média = 
10,0) */

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        disciplinas.add(new Disciplina("Linguagem para Aplicações de Internet", 10.0));
        // Adicione outras disciplinas aqui

        String nomeAluno = "Fulano de Tal";
        System.out.println("Aluno: " + nomeAluno);
        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome() + " (Média = " + disciplina.getMedia() + ")");
        }
    }
}

