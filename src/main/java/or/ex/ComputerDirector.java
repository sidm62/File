package or.ex;

public class ComputerDirector {
    private ComputerBuild computerBuilder;

    public ComputerDirector(ComputerBuild computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
    public void setBuild(ComputerBuild computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public void constructGamingComputer() {
        computerBuilder.reset();
        computerBuilder.buildProcessor("Intel Core i9 (High-End)");
        computerBuilder.buildRam(32);
        computerBuilder.buildHardDrive("2 TB NVMe SSD");
        computerBuilder.buildGraphicsCard("NVIDIA RTX 4090");
        computerBuilder.buildOperatingSystem("Windows 11 Pro");
        computerBuilder.addAccessory("Mechanical RGB Keyboard", 80.0);
    }
    public void constructOfficeComputer() {
        computerBuilder.reset();
        computerBuilder.buildProcessor("Intel Core i5 (Entry)");
        computerBuilder.buildRam(16);
        computerBuilder.buildHardDrive("512 GB SSD");
        computerBuilder.buildGraphicsCard("Integrated Graphics");
        computerBuilder.buildOperatingSystem("Windows 11 Home");
    }
    public void constructCustomComputer(String processor, int ram, String hardDrive, String graphicsCard, String operatingSystem) {
        computerBuilder.reset();
        computerBuilder.buildProcessor(processor);
        computerBuilder.buildRam(ram);
        computerBuilder.buildHardDrive(hardDrive);
        computerBuilder.buildGraphicsCard(graphicsCard);
        computerBuilder.buildOperatingSystem(operatingSystem);
    }


}
