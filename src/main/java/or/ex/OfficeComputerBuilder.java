package or.ex;

public class OfficeComputerBuilder implements ComputerBuild {
    private Computer computer;

    public OfficeComputerBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Intel i5");

    }

    @Override
    public void buildRam() {
       computer.setRamGB(8);
    }



    @Override
    public void buildHardDrive() {
        computer.setHardDrive("2 TB NVMe SSD");

    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard("Integrated Graphics");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 11 Pro");
    }

    @Override
    public void addAccessory() {
        computer.addAccessory("Keyboard and Mouse", 50.0);
    }




    @Override
    public Computer getResult() {
        return this.computer;
    }
}
