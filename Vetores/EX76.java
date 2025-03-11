package Exercicios.Vetores;

import javax.swing.*;
import java.util.Random;

public class EX76 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX76 - Crie um programa que preencha automaticamente um vetor numérico com 7 números" +
                "\ngerados aleatoriamente pelo computador e depois mostre os valores gerados na tela.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar o vetor de 7 posições e outras variáveis necessárias.");
        int[] numeros = new int[7];
        String resultado = "";
        Random random = new Random();

        JOptionPane.showMessageDialog(null, "2º Passo - Preencher o vetor com números aleatórios gerados pelo computador.");
        JOptionPane.showMessageDialog(null, "2º Passo - A variável 'i' será iniciada com 0 e continuará incrementando até 6, preenchendo cada posição do vetor com um número aleatório, utilizando os números entre 0 e 100.");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101);
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir os números gerados.");
        JOptionPane.showMessageDialog(null, "3º Passo - A variável 'i' será iniciada com 0 e continuará incrementando até 6, exibindo o valor de cada posição do vetor na variável 'resultado'.");
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + " ";
        }

        JOptionPane.showMessageDialog(null, "Os números gerados aleatoriamente são: " + resultado);
    }
}
