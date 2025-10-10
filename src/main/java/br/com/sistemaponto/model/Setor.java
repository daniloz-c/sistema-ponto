package main.java.br.com.sistemaponto.model;

import java.util.ArrayList;
import java.util.List;

public class Setor {
    private String id;
    private String nome;
    List<Funcionario> funcionarios = new ArrayList<>();
    List<Funcao> funcoes = new ArrayList<>();
    private Gestor gestor;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public List<Funcionario> getFuncionarios() {
            return funcionarios;
        }

        public void setFuncionarios(List<Funcionario> funcionarios) {
            this.funcionarios = funcionarios;
        }

        public List<Funcao> getFuncoes() {
            return funcoes;
        }

        public void setFuncoes(List<Funcao> funcoes) {
            this.funcoes = funcoes;
        }

        public Gestor getGestor() {
            return gestor;
        }

        public void setGestor(Gestor gestor) {
            this.gestor = gestor;
        }
}
