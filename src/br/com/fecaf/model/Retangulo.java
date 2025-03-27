package br.com.fecaf.model;

import java.util.Scanner;

// Classe retangulo que formara o objeto retangulo
public class Retangulo {
    // Atributos que recebeão os valores do imput do usuario
    public double lado1, lado2, area, perimetro;
    // Objeto do java que permite fazer imput de dados
    Scanner sc = new Scanner(System.in);

    // Menu que cadastra retangulos
    public boolean cadastrarRetangulo() {

        System.out.println("/*****************");
        System.out.println("Cadastrar Retangulo");
        System.out.println("/*****************");
        System.out.println("Informe o lado 1");
        lado1 = sc.nextDouble();
        System.out.println("Informe o lado 2");
        lado2 = sc.nextDouble();
        System.out.println("Retangulo Cadastrado com Sucesso!");
        System.out.println("/*****************");
        return true;
    }

    // Aqui vamos calcular a area
    public void calcularArea() {
        // Calculando area
        System.out.println("Cauculando area");
        area = lado1 * lado2;
        System.out.println("A area do retangulo é " + area);
    }

    // Aqui vamos calcular o perimetro
    public void calcularPerimetro() {
        System.out.println("Cauculando perimetro");
        perimetro = lado1 * 2 + lado2 * 2;
        System.out.println("O perimetro é " + perimetro);

    }

    // Aqui será definido se é um quadrado
    public boolean definirQuadrado() {
        if (lado1 == lado2) {
            System.out.println("Este é um quadrado.");
            return true;
        }

        System.out.println("Não é um quadrado.");
        return false;
    }
}
