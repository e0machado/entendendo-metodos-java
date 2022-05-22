package br.com.dio.aula01;

public class Mensagem {

    public static void exibirMensagem(int hora) {

        if (hora >= 0 && hora <= 24) {
            if (hora >= 6 && hora < 12) {
                System.out.println("BOM DIA!");

            } else if (hora >= 12 && hora < 18) {
                System.out.println("BOA TARDE!");

            } else {
                System.out.println("BOA NOITE!");

            }
        } else

            System.out.println("HORA INVÁLIDA!");

    }
}
