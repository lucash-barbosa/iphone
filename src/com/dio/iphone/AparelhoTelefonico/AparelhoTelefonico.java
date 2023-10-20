package src.com.dio.iphone.AparelhoTelefonico;

public interface AparelhoTelefonico {
    default void ligar() {
        System.out.println("Ligando o telefone.");
    }

    default void atenderChamada() {
        System.out.println("Chamada atendida.");
    }

    default void iniciarConversa() {
        System.out.println("Conversa iniciada.");
    }
}
