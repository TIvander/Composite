public abstract class Item {
    public String descricao;
    private float valorFinal;

    public Item(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public float getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(float valorFinal) {
        this.valorFinal = valorFinal;
    }

    public abstract String getInfo();
}
