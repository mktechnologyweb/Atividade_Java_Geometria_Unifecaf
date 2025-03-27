package br.com.fecaf.controller;

import br.com.fecaf.model.Circulo;
import br.com.fecaf.model.Retangulo;
import br.com.fecaf.model.Triangulo;

import java.util.Scanner;

// Classe  menu que formara o objeto menu para o usuario escolher o que desejara fazer
public class Menu {
    Scanner scanner = new Scanner(System.in);

    // Vai ser executado o menu com o metodo apos a criação do objeto na classe
    // principal
    public void executarMenu() {
        // Quando sair for falso o menu para de ser executado
        boolean exit = false;
        /* Enquanto sair for verdadeiro o loop continuara. Obss O sinal ! inverte o valor */
        while (!exit) {
            System.out.println("*/*********************/");
            System.out.println("*/********** Geometrie ******  */");
            System.out.println("*/* 1 - Círculo  */");
            System.out.println("*/* 2 - Retângulo  */");
            System.out.println("*/* 3 - Triângulo  */");
            System.out.println("*/* 4 - Sair  */");
            System.out.println("*/*********************/");

            System.out.println("Informe a opção desejada:");
            int optionUser = scanner.nextInt();

            // Aqui o usuario pode escolher a opção desejada no menu
            switch (optionUser) {
                case 1:
                    boolean exitCirculo = false;
                    // Aqui esta sendo criado o objeto (instanciado)
                    Circulo circulo = new Circulo();
                    boolean validaCadastro = false;
                    // loop do cisrculo
                    while (!exitCirculo) {
                        System.out.println("/*********************");
                        System.out.println("*********** Círculo **************");
                        System.out.println("/*********************");
                        System.out.println(" 1 - Cadastrar Círculo */");
                        System.out.println(" 2 - Calcular Área */");
                        System.out.println(" 3 - Calcular Perímetro */");
                        System.out.println(" 4 - Sair */");
                        System.out.println("/*********************");

                        int optionCirculo = scanner.nextInt();

                        switch (optionCirculo) {
                            case 1:
                                circulo.cadastrarCirculo();
                                validaCadastro = true;
                                break;
                            case 2:
                                if (validaCadastro) {
                                    circulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um círculo primeiro.");
                                }
                                break;
                            case 3:
                                if (validaCadastro) {
                                    circulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um círculo primeiro.");
                                }
                                break;
                            // Esta opção permite voltar ao menu do principal
                            case 4:
                                System.out.println("Saindo do círculo...");
                                exitCirculo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida.");
                        }
                    }
                    break;

                // A opção 2 permite acessar o menu do retangulo
                case 2:

                    boolean exitRetangulo = false;
                    Retangulo retangulo = new Retangulo();
                    boolean validaRetangulo = false;
                    while (!exitRetangulo) {
                        System.out.println("/*********************");
                        System.out.println("*********** Retangulo **************");
                        System.out.println("/*********************");
                        System.out.println(" 1 - Cadastrar Retangulo */");
                        System.out.println(" 2 - Calcular Área */");
                        System.out.println(" 3 - Calcular Perímetro */");
                        System.out.println(" 4 - Ver se é um quadrado */");
                        System.out.println(" 5 - Sair */");
                        System.out.println("/*********************");

                        int optionRetangulo = scanner.nextInt();

                        switch (optionRetangulo) {
                            case 1:
                                validaRetangulo = retangulo.cadastrarRetangulo();
                                break;

                            case 2:
                                if (validaRetangulo) {
                                    retangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um novo retangulo");
                                }
                                break;
                            case 3:
                                if (validaRetangulo) {
                                    retangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um novo perimetro");
                                }
                                break;

                            case 4:
                                if (validaRetangulo) {
                                    retangulo.definirQuadrado();
                                } else {
                                    System.out.println("Cadastre um novo retangulo");
                                }
                                break;
                            case 5:
                                System.out.println("Saindo do retangulo...");
                                exitRetangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida.");
                        }
                    }
                    break;

                // A opção 3 permite acessar o menu do triangulo
                case 3:
                    boolean exitTriangulo = false;
                    Triangulo triangulo = new Triangulo();
                    boolean validaTriangulo = false;

                    while (!exitTriangulo) {
                        System.out.println("/*********************");
                        System.out.println("*********** Triangulo **************");
                        System.out.println("/*********************");
                        System.out.println(" 1 - Cadastrar Triangulo */");
                        System.out.println(" 2 - Calcular Área */");
                        System.out.println(" 3 - Calcular Perímetro */");
                        System.out.println(" 4 - Verificar se o triângulo é retângulo */");
                        System.out.println(" 5 - Verificar se o triangulo retangulo é 3, 4, 5 */");
                        System.out.println(" 6 - Verificar o tipo do triangulo */");
                        System.out.println(" 7 - Sair */");
                        System.out.println("/*********************");

                        int optionTriangulo = scanner.nextInt();
                        switch (optionTriangulo) {
                            case 1:
                                validaTriangulo = triangulo.cadastrarTriangulo();
                                break;

                            case 2:
                                if (validaTriangulo) {
                                    triangulo.calcularArea();
                                } else {
                                    System.out.println("Cadastre um novo triangulo");
                                }
                                break;
                            case 3:
                                if (validaTriangulo) {
                                    triangulo.calcularPerimetro();
                                } else {
                                    System.out.println("Cadastre um novo perimetro");
                                }
                                break;
                            case 4:
                                if (validaTriangulo) {
                                    triangulo.oTrianguloERetangulo();
                                } else {
                                    System.out.println("Cadastre um novo triangulo");
                                }
                                break;

                            case 5:
                                if (validaTriangulo) {
                                    triangulo.eTresQuatroCinco();
                                } else {
                                    System.out.println("Cadastre um novo triangulo");
                                }
                                break;
                            case 6:
                                if (validaTriangulo) {
                                    triangulo.definirTipo();
                                } else {
                                    System.out.println("Cadastre um novo triangulo");
                                }
                                break;
                            case 7:
                                System.out.println("Saindo do triangulo...");
                                exitTriangulo = true;
                                break;
                            default:
                                System.out.println("Escolha uma opção válida.");
                        }
                    }
                    break;
                // A opção 4 para a aplicação
                case 4:
                    System.out.println("Saindo...");
                    exit = true;
                    break;
                default:

            }
        }
        scanner.close();
    }
}
