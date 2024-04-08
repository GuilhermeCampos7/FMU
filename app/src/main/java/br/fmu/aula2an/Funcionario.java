package br.fmu.aula2an;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Funcionario {
    @PrimaryKey
    private int re;
    private String nome;
    private Date dataAdmissao;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(int re, String nome, Date dataAdmissao, double salario) {
        this.re = re;
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public int getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "re=" + re +
                ", nome='" + nome + '\'' +
                ", dataAdmissao=" + dataAdmissao +
                ", salario=" + salario +
                '}';
    }
}
