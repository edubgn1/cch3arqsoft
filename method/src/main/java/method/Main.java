package method;

// Main.java
public class Main {
    public static void main(String[] args) {
        BebidaQuente cha = new Cha();
        BebidaQuente cafe = new Cafe();

        System.out.println("Preparando cha:");
        cha.preparar();

        System.out.println("Preparando cafe:");
        cafe.preparar();
    }
}
