package or.ex;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private String Processor;
    private int ramGB;
    private String HardDrive;
    private String GraphicsCard;
    private String OperatingSystem;
    private List<String> accessories = new ArrayList<>();
    private double totalPrice;

    public void setProcessor(String processor) {
        Processor = processor;
    }

    public void setRamGB(int ramGB) {
        this.ramGB = ramGB;
    }
    public void setHardDrive(String HardDrive) {
        this.HardDrive = HardDrive;
    }
    public void setGraphicsCard(String GraphicsCard) {
        this.GraphicsCard = GraphicsCard;
    }
    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void addAccessory(String accessory, double price) {
        accessories.add(accessory);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Processor='" + Processor + '\'' +
                ", ramGB=" + ramGB +
                ", HardDrive='" + HardDrive + '\'' +
                ", GraphicsCard='" + GraphicsCard + '\'' +
                ", OperatingSystem='" + OperatingSystem + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }

}
