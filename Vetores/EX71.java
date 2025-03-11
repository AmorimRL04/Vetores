package Exercicios.Vetores;

import javax.swing.*;

public class EX71 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX71 - Faça um programa que preencha automaticamente um vetor numérico com 8 posições, conforme abaixo:" +
                "\n999 999 999 999 999 999 999 999");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar o vetor de 8 posições.");
        int[] vetor = new int[8];
        String resultado = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Preencher as 8 posições do vetor com o valor 999.");
        JOptionPane.showMessageDialog(null, "2º Passo - A variável 'i' será iniciada com 0 e continuará incrementando até 7, preenchendo cada posição do vetor com o valor 999.");
        for (int i = 0; i < 8; i++) {
            vetor[i] = 999;
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir o vetor preenchido.");
        JOptionPane.showMessageDialog(null, "3º Passo - A variável 'i' será iniciada com 0 e continuará incrementando até 7, exibindo o valor de cada posição do vetor na variável 'resultado'.");
        for (int i = 0; i < vetor.length; i++) {
            resultado += vetor[i] + " ";
        }

        JOptionPane.showMessageDialog(null, "Vetor preenchido: " + resultado);
    }
}
