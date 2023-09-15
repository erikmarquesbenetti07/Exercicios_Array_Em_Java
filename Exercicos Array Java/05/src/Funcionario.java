/*
Utilizando classes, atributos e métodos desenvolva um programa capaz de 
armazenar e exibir os funcionários de uma empresa. Sendo que cada funcionário 
possui um endereço.
○ Exemplo de saída:
■ Funcionário: Fulano de Tal
■ Rua dos Bobos, 0 
*/

class Funcionario {
    private String nome;
    private String endereco;

    public Funcionario(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}