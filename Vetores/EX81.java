package Exercicios.Vetores;

import javax.swing.*;

public class EX81 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX81 - Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor." +
                "\nNo final, mostre:" +
                "\n• Qual é a média de idade das pessoas cadastradas" +
                "\n• Em quais posições temos pessoas com mais de 25 anos" +
                "\n• Qual foi a maior idade digitada (podem haver repetições)" +
                "\n• Em que posições digitamos a maior idade.");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar o vetor de 8 posições para armazenar as idades.");
        int[] idades = new int[8];
        int soma = 0;

        JOptionPane.showMessageDialog(null, "2º Passo - Criar um laço que solicita que o usuário que digite 8 idades.");
        for (int i = 0; i < idades.length; i++) {
            idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da pessoa " + (i + 1) + ":"));
            soma += idades[i];
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Calcula a média de idade dividindo a soma total pela quantidade de pessoas.");
        double media = (double) soma / idades.length;

        JOptionPane.showMessageDialog(null, "4º Passo - Inicializa a variável que vai armazenar as posições com idades acima de 25.");
        String maioresDe25 = "Pessoas com mais de 25 anos nas posições:\n";
        boolean encontrouMaior25 = false;

        JOptionPane.showMessageDialog(null, "4º Passo - Criar um laço para percorrer as idades para encontrar quem tem mais de 25 anos.");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] > 25) {
                JOptionPane.showMessageDialog(null, "4º Passo - Verificar se dentro do vetor existe idade maior que 25 anos.");
                maioresDe25 += "Posição " + i + " - Idade: " + idades[i] + "\n";
                encontrouMaior25 = true;
            }
        }
        if (!encontrouMaior25) {
            JOptionPane.showMessageDialog(null, "4º Passo - Caso não exista idade maior que 25 anos no vetor exibir uma mensagem de idade não encontrada.");
            maioresDe25 = "Nenhuma pessoa com mais de 25 anos foi cadastrada.";
        }

        JOptionPane.showMessageDialog(null, "5º Passo - Encontrar a maior idade digitada.");
        JOptionPane.showMessageDialog(null, "5º Passo - Inicializa a maior idade com o primeiro valor do vetor.");
        int maiorIdade = idades[0];
        JOptionPane.showMessageDialog(null, "5º Passo - Percorre as idades para encontrar a maior.");
        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maiorIdade) {
                JOptionPane.showMessageDialog(null, "5º Passo - Verificar qual a maior idade dentro do vetor");
                maiorIdade = idades[i];
            }
        }

        JOptionPane.showMessageDialog(null, "6º Passo - Encontrar as posições onde a maior idade foi digitada.");
        JOptionPane.showMessageDialog(null, "6º Passo - Inicializa a variável que vai armazenar as posições da maior idade.");
        String posicoesMaior = "A maior idade foi " + maiorIdade + " e aparece nas posições:\n";
        JOptionPane.showMessageDialog(null, "6º Passo - Percorre as idades para encontrar as posições onde a maior idade aparece.");
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] == maiorIdade) {
                JOptionPane.showMessageDialog(null, "6º Passo - Verificar em qual posição do vetor está a maior idade.");
                posicoesMaior += "Posição " + i + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, "7.1 - Exibe todos os resultados calculados para o usuário.");
        JOptionPane.showMessageDialog(null, "Resultados Finais \n" +
                "\nMédia de idade: " + String.format("%.2f", media) +
                "\n\nPessoas com mais de 25 anos:\n" + maioresDe25 +
                "\nPosições da maior idade:\n" + posicoesMaior);
    }
}
