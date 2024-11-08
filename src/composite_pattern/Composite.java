package composite_pattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements ComputerPart {
    String name;
    List<ComputerPart> computerParts;

    public Composite(String name) {
        super();
        this.name = name;
        computerParts = new ArrayList<>();
    }

    public void addComputerPart(ComputerPart part) {
        computerParts.add(part);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for (ComputerPart part : computerParts) {
            part.showPrice();
        }
    }
}


