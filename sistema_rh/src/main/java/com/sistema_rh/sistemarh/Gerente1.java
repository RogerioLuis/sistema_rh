package com.sistema_rh.sistemarh;

public class Gerente1 extends Funcionario1 {
    public Gerente1(String nome, int idade, String endereco, String telefone, String email, int matricula,
            double salarioBase) {
        super(nome, idade, endereco, telefone, email, matricula, salarioBase);
    }

    @Override
    public double calcularFGTS() {
        // Implemente a lógica de cálculo do FGTS para Gerente
        double salarioBase = getSalarioBase();
        return salarioBase * 0.08; // Exemplo simples: 8% do salário base
    }

    @Override
    public double calcularDecimoTerceiro() {
        // Implemente a lógica de cálculo do 13º salário para Gerente
        // Por exemplo, você pode calcular com base no salário base
        double salarioBase = getSalarioBase();
        return salarioBase / 12; // Exemplo simples: dividir o salário base por 12 meses
    }
}

