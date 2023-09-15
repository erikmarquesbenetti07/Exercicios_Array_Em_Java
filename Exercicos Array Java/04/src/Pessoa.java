/*
Utilizando classes, atributos e métodos desenvolva um programa capaz de 
armazenar pessoas e que contenha um método para aumentar a idade dessas 
pessoas quando elas fizerem aniversário. A cada aniversário, deve ser exibida uma 
mensagem contendo nome, idade anterior e idade atual do aniversariante.
○ Exemplo de saída:
■ Parabéns, Fulano de Tal! Você tinha X anos e 
agora tem Y anos!
 */

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void fazerAniversario() {
        idade++;
    }
}