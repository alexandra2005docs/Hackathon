package com.example.demo;

public class Recebivel {
    private String nomeFundo;
    private String docFundo;
    private String nomeCedente;
    private String docCedente;
    private String nomeSacado;
    private String docSacado;
    private String nuDocumento;
    private String tipoRecebivel;
    private double valorNominal;
    private String dataVencimentoOriginal;
    private String dataAquisicao;

    // Construtor
    public Recebivel(String nomeFundo, String docFundo, String nomeCedente, String docCedente,
                     String nomeSacado, String docSacado, String nuDocumento, String tipoRecebivel,
                     double valorNominal, String dataVencimentoOriginal, String dataAquisicao) {
        this.nomeFundo = nomeFundo;
        this.docFundo = docFundo;
        this.nomeCedente = nomeCedente;
        this.docCedente = docCedente;
        this.nomeSacado = nomeSacado;
        this.docSacado = docSacado;
        this.nuDocumento = nuDocumento;
        this.tipoRecebivel = tipoRecebivel;
        this.valorNominal = valorNominal;
        this.dataVencimentoOriginal = dataVencimentoOriginal;
        this.dataAquisicao = dataAquisicao;
    }

    // Todos os Getters
    public String getNomeFundo() {
        return nomeFundo;
    }

    public String getDocFundo() {
        return docFundo;
    }

    public String getNomeCedente() {
        return nomeCedente;
    }

    public String getDocCedente() {
        return docCedente;
    }

    public String getNomeSacado() {
        return nomeSacado;
    }

    public String getDocSacado() {
        return docSacado;
    }

    public String getNuDocumento() {
        return nuDocumento;
    }

    public String getTipoRecebivel() {
        return tipoRecebivel;
    }

    public double getValorNominal() {
        return valorNominal;
    }

    public String getDataVencimentoOriginal() {
        return dataVencimentoOriginal;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }
}