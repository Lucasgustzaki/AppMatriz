/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author lucassamuelgustzaki
 */
public class AppMatriz {

    public static void main(String[] args) throws IOException {
        String arquivo = "/Users/lucassamuelgustzaki/Desktop/FURB-2-Semestre/pooProgOrientadaObje/MunicipioMatriz.txt";

        try (Scanner br = new Scanner(new File(arquivo))) {
            String cidadeMaiorPopulacao = "";
            String cidadeMenorPopulacao = "";
            br.nextLine();
            int maiorPopulacao = 0;
            long menorPopulacao = Long.MAX_VALUE;

            while (br.hasNext()) {
                String[] campos = br.nextLine().split(";");

                String cidade = campos[1];
                int PosicaoPopulacaoAtual = Integer.parseInt(campos[3]);
                for (String campo : campos) {
                    System.out.print(campo + ";");

                    if (maiorPopulacao < PosicaoPopulacaoAtual) {
                        maiorPopulacao = PosicaoPopulacaoAtual;
                        cidadeMaiorPopulacao = campos[1];

                    }

                    if (PosicaoPopulacaoAtual < menorPopulacao) {
                        menorPopulacao = PosicaoPopulacaoAtual;
                        cidadeMenorPopulacao = campos[1];
                    }

                }
                System.out.println();
            }
            System.out.println("Cidade com maior Populacao: " + cidadeMaiorPopulacao + " - " + maiorPopulacao);
            System.out.println("Cidade com menor Populcacao: " + cidadeMenorPopulacao + " - " + menorPopulacao);
        } catch (IOException ex) {
            System.out.println("Diretório inválido!");
        }
    }
}
