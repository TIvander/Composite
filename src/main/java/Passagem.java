public class Passagem extends Item{

    private String localViagem;

    public Passagem(float valorFinal, String localViagem) {
        super(valorFinal);
        this.localViagem = localViagem;
    }

    public float getValor() {
        return getValorFinal();
    }
    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }
    @Override
    public String getInfo() {
        return "Passagem: " + this.localViagem +
                "Valor: " + getValor() + "/n";
    }
}
