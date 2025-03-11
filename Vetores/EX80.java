package Exercicios.Vetores;

import javax.swing.*;
import java.util.Random;

public class EX80 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX80 - Faça um algoritmo que preencha um vetor de 30 posições com números entre 1 e 15 sorteados pelo computador." +
                "\nDepois disso, peça para o usuário digitar um número (chave) e seu programa deve mostrar em que posições essa chave foi encontrada." +
                "\nMostre também quantas vezes a chave foi sorteada.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar o vetor e preencher com números sorteados aleatoriamente.");
        int[] vetor = new int[30];
        Random random = new Random();
        JOptionPane.showMessageDialog(null, "1º Passo - Preenche o vetor com números aleatórios entre 1 e 15.");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(15) + 1;
        }

        JOptionPane.showMessageDialog(null, "2º Passo - Solicitar ao usuário que digite um número (chave).");
        JOptionPane.showMessageDialog(null, "2º Passo - Solicita ao usuário um número (chave).");
        int chave = Integer.parseInt(JOptionPane.showInputDialog("Digite um número (chave) entre 1 e 15 para buscar no vetor:"));

        JOptionPane.showMessageDialog(null, "3º Passo - Verificar em que posições o número (chave) foi encontrado.");
        JOptionPane.showMessageDialog(null, "3º Passo - Inicializa a variável para armazenar as posições encontradas.");
        String posicoes = "";
        JOptionPane.showMessageDialog(null, "3º Passo - Inicializa o contador para contar as ocorrências da chave.");
        int contador = 0;
        JOptionPane.showMessageDialog(null, "3º Passo - Criar um laço para percorrer todas as 30 posições do vetor.");
        for (int i = 0; i < vetor.length; i++) {
            JOptionPane.showMessageDialog(null, "3º Passo - Verifica se o valor da posição é igual à chave.");
            if (vetor[i] == chave) {
                JOptionPane.showMessageDialog(null, "3º Passo - Se encontrar, adiciona a posição e o valor à variável 'posicoes'.");
                posicoes += "Posição " + i + " - Valor: " + vetor[i] + "\n";
                JOptionPane.showMessageDialog(null, "3º Passo - Incrementa o contador.");
            }
        }
    }
}
