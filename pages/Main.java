package pages;

import src.com.dio.iphone.*;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.ligar();
        iphone.atenderChamada();
        iphone.iniciarConversa();

        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.selecionarMusica();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}