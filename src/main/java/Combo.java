import java.util.ArrayList;
import java.util.List;

public class Combo extends Item {

    private List<Item> item;

    public Combo(float valorFinal) {
        super(valorFinal);
        this.item = new ArrayList<Item>();
    }

    public void insertItem(Item item) {
        this.item.add(item);
    }

    @Override
    public String getInfo() {
        String desc = "";
        desc = "Item selecionado: " + this.descricao + "/n";
        for(Item item : item) {
            desc += item.descricao;
        }
        return desc;
    }
}
