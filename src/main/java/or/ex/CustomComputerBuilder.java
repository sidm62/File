package or.ex;

public class CustomComputerBuilder implements ComputerBuild {

    private Computer computer;
    private double runningTotal;

    public CustomComputerBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.computer = new Computer();
        this.runningTotal = 0.0;
    }

    @Override
    public void buildProcessor(String grade) {
        computer.setProcessor(grade);
    }

    @Override
    public void buildRam(int gb) {
        computer.setRamGB(gb);
    }

    @Override
    public void buildHardDrive(String storage) {
        computer.setHardDrive(storage);
    }

    @Override
    public void buildGraphicsCard(String gpu) {
        computer.setGraphicsCard(gpu);
    }

    @Override
    public void buildOperatingSystem(String os) {
        computer.setOperatingSystem(os);
    }

    @Override
    public void addAccessory(String accessory, double price) {
        computer.addAccessory(accessory, price);
        runningTotal += price;
    }

    @Override
    public Computer getResult() {
        computer.setTotalPrice(runningTotal);
        Computer finalProduct = this.computer;
        this.reset();
        return finalProduct;
    }
}