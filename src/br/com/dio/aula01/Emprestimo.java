package br.com.dio.aula01;

public class Emprestimo {

    public static void calcEmp(double valorEmp, int parcelas) {

        double juros, valorEmpJuros;

        if (parcelas > 0 && parcelas <= 48) {

            juros = 1.01;
            valorEmpJuros = valorEmp * Math.pow(juros, parcelas);
            System.out.println("Valor final do empréstimo: " + valorEmpJuros);

        } else

            System.out.println("Número de parcelas inválido!");

    }

}
