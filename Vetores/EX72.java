package Exercicios.Vetores;

import javax.swing.*;

public class EX72 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX72 - Faça um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:" +
                "\n5 10 15 20 25 30 35 40 45 50");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar o vetor de 10 posições.");
        int[] vetor = new int[10];
        String resultado = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Preencher o vetor com múltiplos de 5, começando de 5.");
        JOptionPane.showMessageDialog(null, "2º Passo - A variável 'i' será iniciada com 0 e continuará incrementando até 9. A cada laço, o valor na posição 'i' do vetor será o múltiplo de 5 correspondente.");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 5 * (i + 1);
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir o vetor preenchido.");
        JOptionPane.showMessageDialog(null, "3º Passo - A variável 'i' será iniciada com 0 e continuará incrementando até 9, exibindo o valor de cada posição do vetor na variável 'resultado'.");
        for (int i = 0; i < vetor.length; i++) {
            resultado += vetor[i] + " ";
        }

        JOptionPane.showMessageDialog(null, "Vetor preenchido: " + resultado);
    }
}
