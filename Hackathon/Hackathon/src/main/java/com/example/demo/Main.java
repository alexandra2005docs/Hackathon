package com.example.demo;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String caminho = "recebiveis.csv";

        List<Recebivel> lista =
                LeitorCSV.lerCSV(caminho);

        for (Recebivel r : lista) {
            System.out.println("Fundo: " + r.getNomeFundo());
            System.out.println("Cedente: " + r.getNomeCedente());
            System.out.println("Sacado: " + r.getNomeSacado());
            System.out.println("Documento: " + r.getNuDocumento());
            System.out.println("Valor: " + r.getValorNominal());
            System.out.println("-------------------------");
        }
    }
}