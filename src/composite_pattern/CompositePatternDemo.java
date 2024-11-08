package composite_pattern;

public class CompositePatternDemo {
    public static void showDemo() {
        ComputerPart hardDrive = new Leaf("HDD", 4000);
        ComputerPart mouse = new Leaf("Mouse", 1000);
        ComputerPart monitor = new Leaf("Samsung LCD", 9000);
        ComputerPart ram = new Leaf("Samsung DDR5", 3000);
        ComputerPart cpu = new Leaf("Intel Core Ultra 9", 50000);

        Composite ph = new Composite("Peripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite motherBoard = new Composite("Motherboard");
        Composite computer = new Composite("Computer");

        ph.addComputerPart(mouse);
        ph.addComputerPart(monitor);

        motherBoard.addComputerPart(cpu);
        motherBoard.addComputerPart(ram);

        cabinet.addComputerPart(hardDrive);
        cabinet.addComputerPart(motherBoard);

        computer.addComputerPart(ph);
        computer.addComputerPart(cabinet);

        computer.showPrice();
    }
}
