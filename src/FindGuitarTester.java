public class FindGuitarTester {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec("Stratocaster", Builder.GIBSON, Wood.MAHOGANY, Wood.INDIAN_ROSEWOOD, Type.ELECTRIC, 6);
        inventory.printMatchingGuitars(whatErinLikes);

        // Search for another preference
//        GuitarSpec jazzPreference = new GuitarSpec("Jazzmaster", Builder.FENDER, Wood.ALDER, Wood.ROSEWOOD, Type.ELECTRIC);
//        inventory.printMatchingGuitars(jazzPreference);
//
//        // Search for acoustic guitar with specific wood
//        GuitarSpec acousticPreference = new GuitarSpec(null, Builder.MARTIN, Wood.MAHOGANY, Wood.EBONY, Type.ACOUSTIC);
//        inventory.printMatchingGuitars(acousticPreference);


    }

    private static void initializeInventory(Inventory inventory) {
        // add guitar to the inventory



        inventory.addGuitar("v12322", 1340, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY, 6);
        inventory.addGuitar("v12323", 2240, Builder.GIBSON, "Stratocaster", Type.ELECTRIC, Wood.MAHOGANY, Wood.INDIAN_ROSEWOOD, 6);
        inventory.addGuitar("v12324", 1240, Builder.FENDER, "Stratocaster", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAHOGANY, 6);
        inventory.addGuitar("v12325", 1500, Builder.GIBSON, "Les Paul", Type.ELECTRIC, Wood.MAHOGANY, Wood.INDIAN_ROSEWOOD, 6);
        inventory.addGuitar("v12326", 1800, Builder.FENDER, "Telecaster", Type.ELECTRIC, Wood.ALDER, Wood.MAPLE, 6);
        inventory.addGuitar("v12327", 2100, Builder.MARTIN, "D-28", Type.ACOUSTIC, Wood.SITKA, Wood.ROSEWOOD, 12);
        inventory.addGuitar("v12328", 1350, Builder.TAYLOR, "814ce", Type.ACOUSTIC_ELECTRIC, Wood.CEDAR, Wood.OVANGKOL, 12);
        inventory.addGuitar("v12329", 2500, Builder.GIBSON, "SG", Type.ELECTRIC, Wood.MAHOGANY, Wood.ROSEWOOD, 12);
        inventory.addGuitar("v12330", 1900, Builder.FENDER, "Jazzmaster", Type.ELECTRIC, Wood.ALDER, Wood.ROSEWOOD, 6);
        inventory.addGuitar("v12331", 2800, Builder.MARTIN, "000-15M", Type.ACOUSTIC, Wood.MAHOGANY, Wood.EBONY, 6);
        inventory.addGuitar("v12332", 2200, Builder.TAYLOR, "GS Mini", Type.ACOUSTIC, Wood.MAHOGANY, Wood.EBONY, 6);
        inventory.addGuitar("v12333", 1600, Builder.GIBSON, "ES-335", Type.SEMI_HOLLOW, Wood.MAPLE, Wood.ROSEWOOD, 6);
        inventory.addGuitar("v12334", 2000, Builder.FENDER, "Precision Bass", Type.BASS, Wood.ALDER, Wood.MAPLE, 6);



    }
}
