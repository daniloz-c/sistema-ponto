package main.java.br.com.sistemaponto.model;

public class Gestor extends Pessoa {
    private int id;
    private String senha;
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

        public Setor getSetor() {
            return setor;
        }

        public void setSetor(Setor setor) {
            this.setor = setor;
        }
}