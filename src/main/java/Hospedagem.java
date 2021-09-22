public class Hospedagem extends Item{

    private String nomeHotel;

    public Hospedagem(float valorFinal, String nomeHotel) {
        super(valorFinal);
        this.nomeHotel = nomeHotel;
    }

    public float getValor() {
        return getValorFinal();
    }
    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }
    @Override
    public String getInfo() {
        return "Nome do Hotel: " + this.nomeHotel +
                "Valor: " + getValor() + "/n";
    }
}
