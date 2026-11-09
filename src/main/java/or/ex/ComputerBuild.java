package or.ex;

public interface ComputerBuild {
    void reset();
    void buildProcessor(String grade);
    void buildRam(int gb);
    void buildHardDrive(String storage);


    void buildGraphicsCard(String gbu);
    void buildOperatingSystem(String os);
    void addAccessory(String accessory, double price);

    Computer getResult();
}
