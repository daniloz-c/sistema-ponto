package main.java.br.com.sistemaponto.model;

import java.sql.Date;

public class Funcionario extends Pessoa {
    private int id;
    private String senha;
    private float valorHora;
    private float qtdHorasTrabalhoDia;
    private float qtdHorasAlmoco;
    private Date dataAdmissao;
    private Date dataDemissao;
    private Funcao funcao;
    private Setor setor;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }

        public float getValorHora() {
            return valorHora;
        }

        public void setValorHora(float valorHora) {
            this.valorHora = valorHora;
        }

        public float getQtdHorasTrabalhoDia() {
            return qtdHorasTrabalhoDia;
        }

        public void setQtdHorasTrabalhoDia(float qtdHorasTrabalhoDia) {
            this.qtdHorasTrabalhoDia = qtdHorasTrabalhoDia;
        }

        public float getQtdHorasAlmoco() {
            return qtdHorasAlmoco;
        }

        public void setQtdHorasAlmoco(float qtdHorasAlmoco) {
            this.qtdHorasAlmoco = qtdHorasAlmoco;
        }

        public Date getDataAdmissao() {
            return dataAdmissao;
        }

        public void setDataAdmissao(Date dataAdmissao) {
            this.dataAdmissao = dataAdmissao;
        }

        public Date getDataDemissao() {
            return dataDemissao;
        }

        public void setDataDemissao(Date dataDemissao) {
            this.dataDemissao = dataDemissao;
        }

        public Funcao getFuncao() {
            return funcao;
        }

        public void setFuncao(Funcao funcao) {
            this.funcao = funcao;
        }

        public Setor getSetor() {
            return setor;
        }

        public void setSetor(Setor setor) {
            this.setor = setor;
        }
}