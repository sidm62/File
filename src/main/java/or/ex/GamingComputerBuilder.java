package or.ex;

public class GamingComputerBuilder implements ComputerBuild {
    private Computer computer;

    public GamingComputerBuilder() {
        reset();
    }

    @Override
    public void reset() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
       computer.setProcessor("High-end Gaming Processor");

    }

    @Override
    public void buildRam() {
        computer.setRamGB(16);
        
    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive("1TB SSD");
    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("High-end Gaming Graphics Card");

    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 10 Pro");
    }

    @Override
    public void addAccessory() {
        computer.addAccessory("Gaming Mouse", 50.0);
        computer.addAccessory("Mechanical Keyboard", 100.0);
    }




    @Override
    public Computer getResult() {
        return computer;
    }
}
