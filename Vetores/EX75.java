package Exercicios.Vetores;

import javax.swing.*;

public class EX75 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX75 - Crie um programa que preencha automaticamente (usando lógica, não apenas atribuindo diretamente) um vetor numérico com 15 posições com os primeiros elementos da sequência de Fibonacci:" +
                "\n1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987.");

        JOptionPane.showMessageDialog(null, "1º Passo - Inicializar o vetor de 15 posições.");
        int[] fibonacci = new int[15];
        String resultado = "";
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        JOptionPane.showMessageDialog(null, "2º Passo - Preencher o vetor com os números da sequência de Fibonacci.");
        JOptionPane.showMessageDialog(null, "2º Passo - A variável 'i' será iniciada com 2 e continuará incrementando até 14. Para cada valor de 'i', o valor da posição 'i' será a soma dos dois valores anteriores do vetor.");
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir o vetor preenchido.");
        JOptionPane.showMessageDialog(null, "3º Passo - A variável 'i' será iniciada com 0 e continuará incrementando até 14. A cada iteração, o valor de cada posição do vetor será adicionado à variável 'resultado' para ser exibido.");
        for (int i = 0; i < fibonacci.length; i++) {
            resultado += fibonacci[i] + " ";
        }

        JOptionPane.showMessageDialog(null, "Vetor preenchido com a sequência de Fibonacci: " + resultado);
    }
}
