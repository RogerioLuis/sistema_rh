package com.sistema_rh.sistemarh;
import java.util.Scanner;

public class RHapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Sistema de RH");
        System.out.print("Nome do Funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do Funcionário: ");
        int idade = scanner.nextInt();

        System.out.print("Salário Base do Funcionário: ");
        double salarioBase = scanner.nextDouble();

        double fgts = salarioBase * 0.08;
        double inss = salarioBase * 0.10;
        double decimoTerceiro = salarioBase / 12;
        double ferias = salarioBase * 0.2;

        System.out.println("\nResultados para " + nome + ":");
        System.out.println("Idade: " + idade);
        System.out.println("FGTS: " + fgts);
        System.out.println("INSS: " + inss);
        System.out.println("13º Salário: " + decimoTerceiro);
        System.out.println("Férias: " + ferias);

        scanner.close();
    }
}
