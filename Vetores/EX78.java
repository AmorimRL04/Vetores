package Exercicios.Vetores;

import javax.swing.*;

public class EX78 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX78 - Escreva um programa que leia 15 números e guarde-os em um vetor." +
                "\nNo final, mostre o vetor inteiro na tela e em seguida mostre em que posições foram digitados valores que são múltiplos de 10.");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar o vetor de 15 posições para armazenar os números.");
        int[] numeros = new int[15];

        JOptionPane.showMessageDialog(null, "1º Passo - Criar o laço que vai pedir os 15 números ao usuário.");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º número:"));
        }

        JOptionPane.showMessageDialog(null, "2º Passo - Exibir o vetor com os números informados.");
        String resultado = "Vetor completo:\n";
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i] + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);

        JOptionPane.showMessageDialog(null, "3º Passo - Mostrar as posições dos múltiplos de 10.");
        String multDe10 = "Posições com múltiplos de 10:\n";
        boolean encontrouMultiplo = false;

        JOptionPane.showMessageDialog(null, "3º Passo - Criar o laço para verificar múltiplos de 10 no vetor.");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 10 == 0) {
                multDe10 += "Posição " + i + ": " + numeros[i] + "\n";
                encontrouMultiplo = true;
            }
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Verificar se encontrou algum múltiplo de 10.");
        if (!encontrouMultiplo) {
            multDe10 = "Não há múltiplos de 10 no vetor.";
        }

        JOptionPane.showMessageDialog(null, multDe10);
    }
}
