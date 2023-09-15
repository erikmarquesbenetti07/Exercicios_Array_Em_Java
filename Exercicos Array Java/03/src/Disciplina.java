/*Utilizando classes, atributos e métodos desenvolva um programa capaz de 
armazenar as disciplinas em que você está matriculado nesse semestre e calcular as 
médias aritméticas do seu rendimento nessas disciplinas.
○ Exemplo de saída:
■ Aluno: Fulano de Tal
■ Linguagem para Aplicações de Internet (Média = 
10,0) */

class Disciplina {
    private String nome;
    private double media;

    public Disciplina(String nome, double media) {
        this.nome = nome;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return media;
    }
}