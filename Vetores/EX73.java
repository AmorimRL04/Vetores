package Exercicios.Vetores;

import javax.swing.*;

public class EX73 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX73 - Faça um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:" +
                "\n9 8 7 6 5 4 3 2 1 0");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar o vetor de 10 posições.");
        int[] vetor = new int[10];
        String resultado = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Preencher o vetor com valores de 9 a 0 de forma decrescente.");
        JOptionPane.showMessageDialog(null, "2º Passo - A variável 'i' será iniciada com 0 e continuará incrementando até 9. A cada iteração, o valor da posição 'i' será preenchido com o valor de 9 subtraído de 'i'.");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 9 - i;
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir o vetor preenchido.");
        JOptionPane.showMessageDialog(null, "3º Passo - A variável 'i' será iniciada com 0 e continuará incrementando até 9. A cada iteração, o valor de cada posição do vetor será adicionado à variável 'resultado' para ser exibido.");
        for (int i = 0; i < vetor.length; i++) {
            resultado += vetor[i] + " ";
        }

        JOptionPane.showMessageDialog(null, "Vetor preenchido: " + resultado);
    }
}
