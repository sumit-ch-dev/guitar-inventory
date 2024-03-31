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
                          Wood topWood) {

        GuitarSpec spec = new GuitarSpec(model, builder, backWood, topWood, type);

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


            Builder builder = guitarSpec.getBuilder();

            if(searchSpec.getBuilder() != null && (!builder.equals(g.getSpec().getBuilder()))) continue;

            String model = guitarSpec.getModel().toLowerCase();

            if(searchSpec.getModel() != null && (!model.isEmpty()) && (!model.equals(g.getSpec().getModel().toLowerCase()))) continue;


            if(searchSpec.getType() != guitarSpec.getType()) continue;


            if(searchSpec.getBackWood() != guitarSpec.getBackWood()) continue;


            if(searchSpec.getTopWood() != guitarSpec.getTopWood()) continue;

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
                        " " + spec.getBackWood() + "Back and sides \n" +
                        " " + spec.getTopWood() + " and top \n" +
                        " and you can get it for only $" +
                        guitar.getPrice() + "! \n.."
                );
            }
        } else {
            System.out.println("we have nothing for you");
        }
    }
}
