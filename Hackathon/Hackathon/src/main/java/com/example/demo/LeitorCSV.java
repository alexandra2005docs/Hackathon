
package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {

    public static List<Recebivel> lerCSV(String caminhoArquivo) {

        List<Recebivel> recebiveis = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader(caminhoArquivo))) {

            String linha;
            int numeroLinha = 0;

            while ((linha = br.readLine()) != null) {

                numeroLinha++;

                // Ignora linhas vazias
                if (linha.trim().isEmpty()) {
                    continue;
                }

                // Divide as colunas pelo ponto e vírgula
                String[] dados = linha.split(";", -1);

                // Ignora o cabeçalho do CSV
                if (dados[0].trim().equalsIgnoreCase("nomeFundo")) {
                    continue;
                }

                // Verifica se a linha possui as 11 colunas
                if (dados.length != 11) {
                    System.out.println(
                            "ERRO na linha " + numeroLinha
                                    + ": esperadas 11 colunas, encontradas "
                                    + dados.length
                    );
                    continue;
                }

                try {

                    Recebivel recebivel = new Recebivel(
                            dados[0].trim(), // nomeFundo
                            dados[1].trim(), // docFundo
                            dados[2].trim(), // nomeCedente
                            dados[3].trim(), // docCedente
                            dados[4].trim(), // nomeSacado
                            dados[5].trim(), // docSacado
                            dados[6].trim(), // nuDocumento
                            dados[7].trim(), // tipoRecebivel
                            converterValor(dados[8]), // valorNominal
                            dados[9].trim(),  // dataVencimentoOriginal
                            dados[10].trim()  // dataAquisicao
                    );

                    recebiveis.add(recebivel);

                } catch (NumberFormatException e) {

                    System.out.println(
                            "ERRO na linha " + numeroLinha
                                    + ": valor nominal inválido: "
                                    + dados[8]
                    );

                }
            }

        } catch (IOException e) {

            System.out.println(
                    "ERRO ao ler o arquivo CSV: "
                            + e.getMessage()
            );

        }

        return recebiveis;
    }

    // Converte o valor nominal para double
    private static double converterValor(String valor) {

        valor = valor.trim()
                .replace("R$", "")
                .replace(" ", "");

        if (valor.isEmpty()) {
            throw new NumberFormatException(
                    "Valor nominal vazio"
            );
        }

        // Formato brasileiro: 1.500,50
        if (valor.contains(",")) {
            valor = valor.replace(".", "")
                    .replace(",", ".");
        }

        return Double.parseDouble(valor);
    }
}
