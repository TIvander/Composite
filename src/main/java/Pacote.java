public class Pacote {
    private Item item;

    public void setItem(Item item) {
        this.item = item;
    }

    public String getItem() {
        if(this.item == null) {
            throw new NullPointerException("Pacote vazio");
        } else {
            return this.item.getInfo();
        }
    }
}
