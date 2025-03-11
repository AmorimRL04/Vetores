package Exercicios.Vetores;

import javax.swing.*;

public class EX82 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "EX82 - Leia a nota de 10 alunos de uma turma e guarde-as em um vetor." +
                "\nNo final, mostre:" +
                "\n• Qual é a média da turma" +
                "\n• Quantos alunos estão acima da média da turma" +
                "\n• Qual foi a maior nota digitada" +
                "\n• Em que posições a maior nota aparece.");

        JOptionPane.showMessageDialog(null, "1º Passo - Criar o vetor para armazenar as notas.");
        double[] notas = new double[10];
        double soma = 0;

        JOptionPane.showMessageDialog(null, "2º Passo - Solicitar ao usuário que digite as notas dos alunos.");
        for (int i = 0; i < notas.length; i++) {
            JOptionPane.showMessageDialog(null, "2º Passo - Converter a nota digitada para o formato americano caso seja em formato brasileiro.");
            String entrada = JOptionPane.showInputDialog("Digite a nota do aluno  (i + 1) :");
            entrada = entrada.replace(",", ".");
            notas[i] = Double.parseDouble(entrada);
            soma += notas[i];
        }

        JOptionPane.showMessageDialog(null, "3º Passo - Calcular a média da turma.");
        double media = soma / notas.length;
        JOptionPane.showMessageDialog(null, "3º Passo - Formatar a média para exibição no formato brasileiro (usando vírgula).");
        String mediaFormatada = String.format("%.2f", media).replace(".", ",");


        JOptionPane.showMessageDialog(null, "4º Passo - Contar quantos alunos estão acima da média.");
        int acimaDaMedia = 0;
        String alunosAcima = "";
        for (int i = 0; i < notas.length; i++) {
            JOptionPane.showMessageDialog(null, "4º Passo - Verificar se a nota do aluno  (i + 1) é superior à média.");
            if (notas[i] > media) {
                acimaDaMedia++;
                alunosAcima += "Aluno " + (i + 1) + " - Nota: " + String.format("%.2f", notas[i]).replace(".", ",") + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, "5º Passo - Encontrar a maior nota digitada.");
        double maiorNota = notas[0];
        for (int i = 1; i < notas.length; i++) {
            JOptionPane.showMessageDialog(null, "5º Passo - Verificar se a nota do aluno  (i + 1)  é maior que a maior nota registrada.");
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }
        String maiorNotaFormatada = String.format("%.2f", maiorNota).replace(".", ",");

        JOptionPane.showMessageDialog(null, "6º Passo - Encontrar as posições da maior nota.");
        String posicoesMaiorNota = "A maior nota foi " + maiorNotaFormatada + " e aparece nas posições:\n";
        for (int i = 0; i < notas.length; i++) {
            JOptionPane.showMessageDialog(null, "6º Passo - Verificar se a nota do aluno  (i + 1)  é igual à maior nota.");
            if (notas[i] == maiorNota) {
                posicoesMaiorNota += "Posição " + i + "\n";
            }
        }

        JOptionPane.showMessageDialog(null, "7º Passo - Exibir os resultados finais.");
        JOptionPane.showMessageDialog(null, "Resultados Finais\n" +
                "\nMédia da turma: " + mediaFormatada +
                "\n\nAlunos acima da média (" + acimaDaMedia + "):\n" + alunosAcima +
                "\nPosições da maior nota:\n" + posicoesMaiorNota);
    }
}
