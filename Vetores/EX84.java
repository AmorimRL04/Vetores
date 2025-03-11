package Exercicios.Vetores;

import javax.swing.*;

public class EX84 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX84 - Crie um programa que leia o nome e a idade de 9 pessoas e" +
                "\nguarde esses valores em dois vetores, em posições relacionadas." +
                "\nNo final, mostre uma listagem contendo apenas os dados das pessoas menores de idade.");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar os vetores para armazenar os nomes e idades.");
        String[] nomes = new String[9];
        int[] idades = new int[9];

        JOptionPane.showMessageDialog(null, "2º Passo - Solicitar ao usuário que digite os nomes e as idades.");
        for (int i = 0; i < nomes.length; i++) {
            JOptionPane.showMessageDialog(null, "2º Passo - Solicitar o nome da pessoa " + (i + 1));
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");

            JOptionPane.showMessageDialog(null, "2º Passo - Solicitar a idade de " + nomes[i]);
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de " + nomes[i] + ":"));
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir os dados das pessoas menores de idade.");
        String pessoasMenores = "Pessoas menores de idade:\n";

        for (int i = 0; i < idades.length; i++) {
            JOptionPane.showMessageDialog(null, "3º Passo - Verificar se a idade de " + nomes[i] + " é menor que 18.");
            if (idades[i] < 18) {
                pessoasMenores += "Nome: " + nomes[i] + " - Idade: " + idades[i] + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Exibindo os resultados finais:");
        JOptionPane.showMessageDialog(null, pessoasMenores);
    }
}
