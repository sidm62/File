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
    public void buildProcessor(String grade) {
        this.computer.setProcessor(grade);
    }

    @Override
    public void buildRam(int gb) {
        this.computer.setRamGB(gb);
    }



    @Override
    public void buildHardDrive(String storage) {
        this.computer.setHardDrive((storage));
    }

    @Override
    public void buildGraphicsCard(String gbu) {
        this.computer.setGraphicsCard(gbu);
    }

    @Override
    public void buildOperatingSystem(String os) {
        this.computer.setOperatingSystem(os);
    }

    @Override
    public void addAccessory(String accessory, double price) {
        this.computer.addAccessory(accessory, price);
    }




    @Override
    public Computer getResult() {
        return this.computer;
    }
}
