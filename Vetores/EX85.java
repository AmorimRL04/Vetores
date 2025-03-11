package Exercicios.Vetores;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class EX85 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "EX85 - Faça um algoritmo que leia o nome, o sexo e o salário de 5\n" +
                "funcionários e guarde esses dados em três vetores. No final,\n" +
                "mostre uma listagem contendo apenas os dados das funcionárias\n" +
                "mulheres que ganham mais de R$5 mil. Faça igual aos exercícios anteriores.");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar os vetores para armazenar os nomes, sexos e salários.");
        String[] nomes = new String[5];
        String[] sexos = new String[5];
        double[] salarios = new double[5];

        JOptionPane.showMessageDialog(null,"2º Passo - Escolher o formato da moeda que será exibida ao usuário.");
        Locale brasil = new Locale("pt", "BR");

        JOptionPane.showMessageDialog(null, "3º Passo - Solicitar ao usuário que digite os dados dos funcionários.");
        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "3º Passo - Solicitar o nome do funcionário " + (i + 1));
            nomes[i] = JOptionPane.showInputDialog("Digite o nome do funcionário " + (i + 1) + ":");

            JOptionPane.showMessageDialog(null, "3º Passo - Solicitar o sexo de " + nomes[i]);
            sexos[i] = JOptionPane.showInputDialog("Digite o sexo (M/F) de " + nomes[i] + ":").toUpperCase();

            JOptionPane.showMessageDialog(null, "3º Passo - Solicitar o salário de " + nomes[i]);
            salarios[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário de " + nomes[i] + ":"));
        }

        JOptionPane.showMessageDialog(null, "4º Passo - Exibir as funcionárias mulheres que ganham mais de R$5 mil.");
        String mulheresAltaRenda = "Funcionárias mulheres que ganham mais de R$5 mil:\n";
        NumberFormat formatarSalario = NumberFormat.getCurrencyInstance(brasil);

        for (int i = 0; i < 5; i++) {
            JOptionPane.showMessageDialog(null, "4º Passo - Verificar se o funcionário é mulher e se o salário é maior que R$5 mil.");
            if (sexos[i].equals("F") && salarios[i] > 5000) {
                mulheresAltaRenda += "Nome: " + nomes[i] + " - Salário: " + formatarSalario.format(salarios[i]) + "\n";
            }
        }

        if (!mulheresAltaRenda.equals("Funcionárias mulheres que ganham mais de R$5 mil:\n")) {
            JOptionPane.showMessageDialog(null, "5º Passo - Exibindo os resultados finais:");
            JOptionPane.showMessageDialog(null, mulheresAltaRenda);
        } else {
            JOptionPane.showMessageDialog(null, "5º Passo - Exibindo os resultados finais:");
            JOptionPane.showMessageDialog(null, " Nenhuma funcionária atende aos critérios.");
        }
    }
}
