package Exercicios.Vetores;

import javax.swing.*;

public class EX74 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX74 - Faça um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:" +
                "\n5 3 5 3 5 3 5 3 5 3");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar o vetor de 10 posições.");
        int[] vetor = new int[10];
        String resultado = "";

        JOptionPane.showMessageDialog(null, "2º Passo - Preencher o vetor alternando entre os valores 5 e 3.");
        JOptionPane.showMessageDialog(null, "2º Passo - A variável 'i' será iniciada com 0 e continuará incrementando até 9. A cada iteração, se 'i' for par, o valor da posição 'i' será preenchido com 5. Caso contrário, será preenchido com 3.");
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) {
                vetor[i] = 5;
            } else {
                vetor[i] = 3;
            }
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir o vetor preenchido.");
        JOptionPane.showMessageDialog(null, "3º Passo - A variável 'i' será iniciada com 0 e continuará incrementando até 9. A cada iteração, o valor de cada posição do vetor será adicionado à variável 'resultado' para ser exibido.");
        for (int i = 0; i < vetor.length; i++) {
            resultado += vetor[i] + " ";
        }

        JOptionPane.showMessageDialog(null, "Vetor preenchido: " + resultado);
    }
}
