package Exercicios.Vetores;

import javax.swing.*;

public class EX77 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX77 - Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor." +
                "\nNo final, mostre uma listagem com todos os nomes informados, na ordem inversa daquela em que eles foram informados.");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar o vetor de 7 posições para armazenar os nomes.");
        String[] nomes = new String[7];

        JOptionPane.showMessageDialog(null, "2º Passo -  Criar um laço que em cada iteração, é solicitada a entrada de um nome pelo usuário.");
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa " + (i + 1) + ":");
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Exibir os nomes na ordem inversa.");
        String resultado = "Nomes na ordem inversa:\n";
        for (int i = nomes.length - 1; i >= 0; i--) {
            resultado += nomes[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
