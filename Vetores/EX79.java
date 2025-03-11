package Exercicios.Vetores;

import javax.swing.*;

public class EX79 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX79 - Desenvolva um programa que leia 10 números inteiros e guarde-os " +
                "em um vetor. No final, mostre quais são os números pares que foram digitados e em que posições eles estão armazenados.");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar o vetor de 10 posições para armazenar os números.");
        int[] numeros = new int[10];

        JOptionPane.showMessageDialog(null, "2º Passo - Solicitar ao usuário que digite 10 números.");
        for (int i = 0; i < numeros.length; i++) {
            JOptionPane.showMessageDialog(null, "2º Passo - Laço para solicitar os números.");
            JOptionPane.showMessageDialog(null, "2º Passo - Solicitar ao usuário o número e armazenar no vetor.");
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir os números pares e suas posições.");
        JOptionPane.showMessageDialog(null, "3º Passo - Inicializar a variável de resultado.");
        String resultado = "Números pares e suas posições:\n";
        boolean encontrouPar = false;

        JOptionPane.showMessageDialog(null, "4º Passo - Laço para verificar os números pares e suas posições.");
        for (int i = 0; i < numeros.length; i++) {
            JOptionPane.showMessageDialog(null, "4º Passo - Verificar se o número é par.");
            if (numeros[i] % 2 == 0) {
                resultado += "Número: " + numeros[i] + " - Posição: " + i + "\n";
                encontrouPar = true;
            }
        }

        JOptionPane.showMessageDialog(null, "5º Passo - Se não houver números pares, exibir uma mensagem.");
        if (!encontrouPar) {
            resultado = "Não foram digitados números pares.";
        }

        JOptionPane.showMessageDialog(null, "6º Passo - Exibir a lista de números pares e suas posições.");
        JOptionPane.showMessageDialog(null, resultado);
    }
}
