import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private final List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber,
                          double price,
                          Builder builder,
                          String model,
                          Type type,
                          Wood backWood,
                          Wood topWood,
                          int numStrings) {

        GuitarSpec spec = new GuitarSpec(model, builder, backWood, topWood, type, numStrings);

        Guitar guitar = new Guitar(serialNumber,price, spec);
        guitars.add(guitar);

    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar o : guitars) {
            if (o.getSerialNumber().equals(serialNumber)) {
                return o;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<>();
        for(Guitar g: guitars) {
            GuitarSpec guitarSpec = g.getSpec();

            if(g.getSpec().matches(searchSpec))
                matchingGuitars.add(g);
        }
        return matchingGuitars;
    }

    public void printMatchingGuitars(GuitarSpec searchSpecs) {
        List<Guitar> matchingList = search(searchSpecs);

        if(!matchingList.isEmpty()) {
            for(Guitar guitar: matchingList) {

                GuitarSpec spec = guitar.getSpec();
                System.out.println("We have a "+
                        spec.getBuilder() + "  " +
                        spec.getModel() +
                        " " + spec.getType() + " guitar \n" +
                        " " + spec.getBackWood() + " back and sides \n" +
                        " " + spec.getTopWood() + " top \n" +
                        " with " + spec.getNumStrings() + " strings \n" +
                        " and you can get it for only $" +
                        guitar.getPrice() + "! \n--------"
                );
            }
        } else {
            System.out.println("we have nothing for you");
        }
    }
}
