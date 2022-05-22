package br.com.dio.aula01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valor1, valor2;

        System.out.println("CALCULADORA:");
        System.out.println("Digite o primeiro valor: ");
        valor1 = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valor2 = scan.nextDouble();

        Calculadora.somar(valor1, valor2);
        Calculadora.subtrair(valor1, valor2);
        Calculadora.multiplicar(valor1, valor2);
        Calculadora.dividir(valor1, valor2);

        System.out.println("\nMENSAGEM:");
        System.out.println("Digite a hora atual: ");
        int hora = scan.nextInt();

        Mensagem.exibirMensagem(hora);

        System.out.println("\nEMPRÉSTIMO:");
        System.out.println("Digite o valor do empréstimo: ");
        double valorEmp = scan.nextDouble();
        System.out.println("Digite a quantidade de parcelas: ");
        int parcelas = scan.nextInt();

        Emprestimo.calcEmp(valorEmp, parcelas);

    }

}
