package br.masmangan.beecrowd.bee1114;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    private Main() {

    }

    public static void main(String[] args) {
        String senhaCorreta = "2002";
        String senhaDigitada;
        boolean flSenhaInvalida = true;
        Scanner in;

        in = new Scanner(System.in);

        while(flSenhaInvalida){
            senhaDigitada = in.nextLine();
            if(senhaCorreta.equals(senhaDigitada)){
                flSenhaInvalida = false;
                out.printf("Acesso Permitido\n");
            }else{
                out.printf("Senha Invalida\n");
            }
        }
    }
}