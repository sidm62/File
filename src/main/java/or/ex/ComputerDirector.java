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
        computerBuilder.buildProcessor();
        computerBuilder.buildRam();
        computerBuilder.buildHardDrive();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOperatingSystem();
        computerBuilder.addAccessory();
    }
    public void constructOfficeComputer() {
        computerBuilder.reset();
        computerBuilder.buildProcessor();
        computerBuilder.buildRam();
        computerBuilder.buildHardDrive();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOperatingSystem();
    }
    public void constructCustomComputer() {
        computerBuilder.reset();
        computerBuilder.buildProcessor();
        computerBuilder.buildRam();
        computerBuilder.buildHardDrive();
        computerBuilder.buildGraphicsCard();
        computerBuilder.buildOperatingSystem();
        computerBuilder.addAccessory();
    }


}
