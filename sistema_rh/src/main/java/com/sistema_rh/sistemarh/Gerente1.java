package com.sistema_rh.sistemarh;

public class Gerente1 extends Funcionario1 {
    public Gerente1(String nome, int idade, String endereco, String telefone, String email, int matricula,
            double salarioBase) {
        super(nome, idade, endereco, telefone, email, matricula, salarioBase);
    }

    @Override
    public double calcularFGTS() {
        double salarioBase = getSalarioBase();
        return salarioBase * 0.08; 
    }

    @Override
    public double calcularDecimoTerceiro() {
        double salarioBase = getSalarioBase();
        return salarioBase / 12;
    } 
}

