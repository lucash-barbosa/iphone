package src.com.dio.iphone.NavegadorNaInternet;

public interface NavegadorNaInternet {
    default void exibirPagina() {
        System.out.println("Página exibida.");
    }

    default void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    default void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}