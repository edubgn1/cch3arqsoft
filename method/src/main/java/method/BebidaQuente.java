package method;

// BebidaQuente.java
public abstract class BebidaQuente {
    public final void preparar() {
        ferverAgua();
        adicionarIngrediente();
        servirNaXicara();
    }

    private void ferverAgua() {
        System.out.println("Fervendo agua...");
    }

    protected abstract void adicionarIngrediente();

    private void servirNaXicara() {
        System.out.println("Servindo na xicara.\n");
    }
}
