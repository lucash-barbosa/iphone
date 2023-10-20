package src.com.dio.iphone.ReprodutorMusical;

public interface ReprodutorMusical {
  default void tocarMusica() {
    System.out.println("Música Reproduzida");
  }

  default void pausarMusica() {
    System.out.println("Música Pausada");
  }

  default void selecionarMusica() {
      System.out.println("Música Selecionada");
  }
}