/*
Utilizando classes, atributos e métodos desenvolva um programa capaz de 
armazenar e exibir os funcionários de uma empresa. Sendo que cada funcionário 
possui um endereço.
○ Exemplo de saída:
■ Funcionário: Fulano de Tal
■ Rua dos Bobos, 0 
*/

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("Fulano de Tal", "Rua dos Bobos, 0"));
        // Adicione outros funcionários aqui

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.println(funcionario.getEndereco());
        }
    }
}

