package or.ex;

public class CustomComputerBuilder implements ComputerBuild {

    private Computer computer;
    private double runningTotal;
    private String chosenProcessor;
    private int chosenRam;
    private String chosenHardDrive;
    private String chosenGraphicsCard;
    private String chosenOperatingSystem;

    public CustomComputerBuilder() {
        this.reset();
    }


    public void selectProcessor(int choice) {
        this.chosenProcessor = switch (choice) {
            case 1 -> "Intel i9";
            case 2 -> "AMD Ryzen 9";
            default -> "Intel i7";
        };
    }
    public void selectRam(int choice) {
        this.chosenRam = switch (choice) {
            case 1 -> 16;
            case 2 -> 32;
            default ->64;
        };
    }
    public void selectHardDrive(int choice) {
        this.chosenHardDrive = switch (choice) {
            case 1 -> "1TB SSD";
            case 2 -> "2TB HDD";
            default -> "3TB HHD";
        };
    }
    public void selectGraphicsCard(int choice) {
        this.chosenGraphicsCard = switch (choice) {
            case 1 -> "NVIDIA RTX 3080";
            case 2 -> "AMD Radeon RX 6800";
            default -> "AMD Radeon RX 6";
        };
    }
    public void selectOperatingSystem(int choice) {
        this.chosenOperatingSystem = switch (choice) {
            case 1 -> "Windows 11";
            case 2 -> "Ubuntu 20.04";
            default -> "Linux";
        };
    }




    @Override
    public void reset() {
        this.computer = new Computer();
        this.runningTotal = 0.0;
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor(chosenProcessor);

    }

    @Override
    public void buildRam() {
        computer.setRamGB(chosenRam);

    }

    @Override
    public void buildHardDrive() {
        computer.setHardDrive(chosenHardDrive);

    }

    @Override
    public void buildGraphicsCard() {
        computer.setGraphicsCard(chosenGraphicsCard);
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem(chosenOperatingSystem);
    }

    @Override
    public void addAccessory() {
        computer.addAccessory("Gaming Mouse", 50.0);
        runningTotal += 50.0;
        computer.addAccessory("Mechanical Keyboard", 100.0);
        runningTotal += 100.0;
    }

    @Override
    public Computer getResult() {
        computer.setTotalPrice(runningTotal);
        Computer finalProduct = this.computer;
        this.reset();
        return finalProduct;
    }
}