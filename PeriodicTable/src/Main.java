import java.util.*;

// aggiungere il codice necessario per inserire un nuovo elemento all'interno della tavola periodica implementata da List
// bonus inserirlo nella posizone corretta// (compito per casa)
//reimplementare come set e come map
//quale struttura dati è migliore per questo caso

public class Main {
    public static void main(String[] args) {
        List<Element> periodicTable = createPeriodicTableList();
        System.out.printf("This is your periodic table: %s\n", periodicTable);
        Set<Element> periodicTable2 = createPeriodicTableSet();
        System.out.printf("This is your periodic table: %s\n", periodicTable2);
        Map<Integer, Element> periodicTable3 = createPeriodicTableMap();
        System.out.printf("This is your periodic table: %s\n", periodicTable3);
        System.out.println("Insert a new element into your periodic table");
        Scanner scanner = new Scanner(System.in);
        //Element element = getNewElement(scanner);
        Element element1 = new Element("test", "T", 3, 10.0);
        System.out.println(periodicTable);
        insertNewElementList(periodicTable, element1);
        System.out.println(periodicTable);
        Element element2 = new Element("TEST2", "T2", 8, 9.0);
        insertNewElementList(periodicTable, element2);
        System.out.println(periodicTable);
        insertNewElementMap(periodicTable3, element1);
        insertNewElementMap(periodicTable3, element2);
        System.out.println(periodicTable3);
    }

    private static void insertNewElementList(List<Element> periodicTable, Element element) {
        for (int i = periodicTable.size() - 1; i >= 0; i--) {
            if (element.getAtomicNumber() < periodicTable.get(i).getAtomicNumber()) {
                if (element.getAtomicNumber() < periodicTable.get(i).getAtomicNumber() &&
                        element.getAtomicNumber() > periodicTable.get(i - 1).getAtomicNumber()) {
                    periodicTable.add(i, element);
                    return;
                }
            }
        }
        periodicTable.add(periodicTable.size(), element);
    }

    private static Element getNewElement(Scanner scanner) {
        System.out.print("Insert the name: ");
        String name = scanner.nextLine();
        System.out.print("Insert the symbol: ");
        String symbol = scanner.nextLine();
        System.out.print("Insert the atomic number: ");
        int atomicNumber = scanner.nextInt();
        System.out.print("Insert the atomic mass: ");
        double atomicMass = scanner.nextDouble();
        scanner.close();
        return new Element(name, symbol, atomicNumber, atomicMass);
    }

    private static List<Element> createPeriodicTableList() {

        Element hydrogen = new Element("Hydrogen", "H", 1, 1.0078);
        Element helium = new Element("Helium", "He", 2, 4.0026);
        Element lithium = new Element("Lithium", "Li", 4, 6.9410);
        Element beryllium = new Element("Beryllium", "Be", 5, 9.0122);
        Element boron = new Element("Boron", "B", 8, 10.811);
        Element carbon = new Element("Carbon", "C", 9, 12.011);

        List<Element> periodicTable = new ArrayList<>();
        periodicTable.add(hydrogen);
        periodicTable.add(helium);
        periodicTable.add(lithium);
        periodicTable.add(beryllium);
        periodicTable.add(boron);
        periodicTable.add(carbon);

        return periodicTable;
    }

    private static Set<Element> createPeriodicTableSet() {

        Element hydrogen = new Element("Hydrogen", "H", 1, 1.0078);
        Element helium = new Element("Helium", "He", 2, 4.0026);
        Element lithium = new Element("Lithium", "Li", 3, 6.9410);
        Element beryllium = new Element("Beryllium", "Be", 4, 9.0122);
        Element boron = new Element("Boron", "B", 5, 10.811);
        Element carbon = new Element("Carbon", "C", 6, 12.011);

        Set<Element> periodicTable = new HashSet<>();
        periodicTable.add(hydrogen);
        periodicTable.add(helium);
        periodicTable.add(lithium);
        periodicTable.add(beryllium);
        periodicTable.add(boron);
        periodicTable.add(carbon);

        return periodicTable;
    }

    private static Map<Integer, Element> createPeriodicTableMap() {

        Element hydrogen = new Element("Hydrogen", "H", 1, 1.0078);
        Element helium = new Element("Helium", "He", 2, 4.0026);
        Element lithium = new Element("Lithium", "Li", 4, 6.9410);
        Element beryllium = new Element("Beryllium", "Be", 5, 9.0122);
        Element boron = new Element("Boron", "B", 6, 10.811);
        Element carbon = new Element("Carbon", "C", 7, 12.011);

        Map<Integer, Element> periodicTable = new HashMap<>();
        periodicTable.put(1, hydrogen);
        periodicTable.put(2, helium);
        periodicTable.put(4, lithium);
        periodicTable.put(5, beryllium);
        periodicTable.put(6, boron);
        periodicTable.put(7, carbon);

        return periodicTable;
    }

    private static void insertNewElementMap(Map<Integer, Element> periodicTable, Element element) {
        for (int k = 1; k < periodicTable.size(); k++) {
            if (periodicTable.get(k) != null) {
                if (element.getAtomicNumber() < periodicTable.get(k).getAtomicNumber()) {
                    if (element.getAtomicNumber() < periodicTable.get(k).getAtomicNumber() &&
                            element.getAtomicNumber() > periodicTable.get(k - 1).getAtomicNumber()) {
                        periodicTable.put(k, element);
                        return;
                    }
                }
            } else if (element.getAtomicNumber() + 1 == periodicTable.get(k + 1).getAtomicNumber()) {
                periodicTable.put(k, element);
                return;
            }
        }
        periodicTable.put(periodicTable.size() + 1, element);
    }
}