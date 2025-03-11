package Exercicios.Vetores;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class EX83 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX83 Desafio - Crie uma lógica que preencha um vetor de 20 posições" +
                "\ncom números aleatórios (entre 0 e 99) gerados pelo computador." +
                "\nLogo em seguida, mostre os números gerados e depois coloque o" +
                "\nvetor em ordem crescente, mostrando no final os valores ordenados.");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar a variáveis que serão incrementadas.");
        int[] vetor = new int[20];
        Random random = new Random();

        JOptionPane.showMessageDialog(null, "1º Passo - Criar o vetor de 20 posições do tipo int.");
        for (int i = 0; i < vetor.length; i++) {
            JOptionPane.showMessageDialog(null, "1º Passo - Preencher a posição  i  do vetor com um número aleatório.");
            vetor[i] = random.nextInt(100);
        }

        JOptionPane.showMessageDialog(null, "2º Passo - Criar um laço para percorrer todas as 20 posições do vetor e vai exibindo os números gerados\n" +
        "para cada posição, no formato \"Posição i: valor\".");
        String numerosGerados = "Vetor DESORDENADO:\n";
        for (int i = 0; i < vetor.length; i++) {
            numerosGerados += "Posição " + i + ": " + vetor[i] + "\n";
            JOptionPane.showMessageDialog(null, "2º Passo - Mostrar o número gerado na posição  i do vetor");
        }
        JOptionPane.showMessageDialog(null, "2º Passo - Todos os números gerados são exibidos após o preenchimento do vetor.");
        JOptionPane.showMessageDialog(null, numerosGerados);

        JOptionPane.showMessageDialog(null, "3º Passo - Criar um laço para percorrer todas as 20 posições do vetor e ordenar os números gerados");
        Arrays.sort(vetor);
        String numerosOrdenados = "Vetor ORDENADO:\n";
        for (int i = 0; i < vetor.length; i++) {
            numerosOrdenados += "Posição " + i + ": " + vetor[i] + "\n";
            JOptionPane.showMessageDialog(null, "3º Passo - Exibir o número ordenado na posição i do vetor");
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Exibindo os resultados finais:");
        JOptionPane.showMessageDialog(null, numerosGerados + "\n" + numerosOrdenados);
    }
}
