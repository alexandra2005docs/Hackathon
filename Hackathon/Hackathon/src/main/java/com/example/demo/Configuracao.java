package com.example.demo;

import java.math.BigDecimal;
import java.util.Set;

public class Configuracao {


    // Dados do fundo
    public static final String NOME_FUNDO = "ANTECIPE FIDC";
    public static final String CNPJ_FUNDO = "92.234.400/0001-80";

    // Regras de validação ativadas
    public static final boolean VALIDAR_CNPJ_SACADO = true;
    public static final boolean VALIDAR_SITUACAO_CADASTRAL = true;
    public static final boolean VALIDAR_TIPO_RECEBIVEL = true;
    public static final boolean VALIDAR_VALOR_MINIMO = true;
    public static final boolean VALIDAR_NAO_VENCIDA = true;
    public static final boolean VALIDAR_PRAZO_MAXIMO = true;
    public static final boolean VALIDAR_CONCENTRACAO_SACADO = true;

    // Regras desativadas
    public static final boolean VALIDAR_PRAZO_MINIMO = false;
    public static final boolean VALIDAR_CONCENTRACAO_CEDENTE = false;

    // Parâmetros de validação
    public static final BigDecimal VALOR_MINIMO =
            new BigDecimal("100.00");

    public static final long PRAZO_MAXIMO_DIAS = 180;
    public static final long PRAZO_MINIMO_DIAS = 30;

    public static final Set<String> TIPOS_RECEBIVEIS_ACEITOS = Set.of(
            "Duplicata",
            "Duplicata de Serviço"
    );

    public static final Set<String> SITUACOES_CADASTRAIS_ACEITAS =
            Set.of("ATIVA");

    // Concentração máxima por sacado
    public static final BigDecimal PERCENTUAL_MAXIMO_SACADO =
            new BigDecimal("10.0");

    public static final String AGRUPAMENTO_SACADO = "RAIZ_CNPJ";

    // Concentração máxima por cedente: regra desativada
    public static final BigDecimal PERCENTUAL_MAXIMO_CEDENTE =
            new BigDecimal("8.0");

    // Precificação
    public static final String METODO_PRECIFICACAO = "DESCONTO_SIMPLES";

    public static final BigDecimal TAXA_MENSAL_PERCENTUAL =
            new BigDecimal("2.0");

    public static final int BASE_DIAS = 30;

    // CSV
    public static final char SEPARADOR_CSV = ';';
    public static final String FORMATO_DATA = "dd/MM/yyyy";

    /*
     * Índices das colunas do CSV:
     * 0 = nomeFundo
     * 1 = docFundo
     * 2 = nomeCedente
     * 3 = docCedente
     * 4 = nomeSacado
     * 5 = docSacado
     * 6 = nuDocumento
     * 7 = tipoRecebivel
     * 8 = valorNominal
     * 9 = dataVencimentoOriginal
     * 10 = dataAquisicao
     */

    public static final int COLUNA_NOME_FUNDO = 0;
    public static final int COLUNA_CNPJ_FUNDO = 1;
    public static final int COLUNA_NOME_CEDENTE = 2;
    public static final int COLUNA_DOCUMENTO_CEDENTE = 3;
    public static final int COLUNA_NOME_SACADO = 4;
    public static final int COLUNA_DOCUMENTO_SACADO = 5;
    public static final int COLUNA_NUMERO_DOCUMENTO = 6;
    public static final int COLUNA_TIPO_RECEBIVEL = 7;
    public static final int COLUNA_VALOR_NOMINAL = 8;
    public static final int COLUNA_DATA_VENCIMENTO = 9;
    public static final int COLUNA_DATA_AQUISICAO = 10;

    public boolean prazoConfigurado() {
        return PRAZO_MAXIMO_DIAS >= 0;
    }

    public boolean valorMinimoConfigurado() {
        return VALOR_MINIMO != null;
    }

    public boolean estruturaCSVConfigurada() {
        return COLUNA_NOME_FUNDO >= 0
                && COLUNA_CNPJ_FUNDO >= 0
                && COLUNA_NOME_CEDENTE >= 0
                && COLUNA_DOCUMENTO_CEDENTE >= 0
                && COLUNA_NOME_SACADO >= 0
                && COLUNA_DOCUMENTO_SACADO >= 0
                && COLUNA_NUMERO_DOCUMENTO >= 0
                && COLUNA_TIPO_RECEBIVEL >= 0
                && COLUNA_VALOR_NOMINAL >= 0
                && COLUNA_DATA_VENCIMENTO >= 0
                && COLUNA_DATA_AQUISICAO >= 0;
    }


}
