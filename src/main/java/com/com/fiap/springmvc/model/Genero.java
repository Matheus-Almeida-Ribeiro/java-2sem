package com.com.fiap.springmvc.model;

public enum Genero {
    TERROR("Terror"),
    ROMANCE("Romance"),
    ACAO("Ação"),
    SUSPENCE("Suspence"),
    FICCAO_CIENTIFICA("Ficção Científica"),
    BIOGRAFIA("Biografia"),
    FILOSOFIA("Filosofia"),
    RELIGIOSO("Religioso"),
    HISTORIA("Historia"),
    CIENCIAS("Ciencia"),
    DIDATICO("Didatico");

    private final String descricao;

    Genero(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
