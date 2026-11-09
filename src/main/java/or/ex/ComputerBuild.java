package or.ex;

public interface ComputerBuild {
    void reset();


    void buildProcessor();

    void buildRam();
    void buildHardDrive();


    void buildGraphicsCard();
    void buildOperatingSystem();
    void addAccessory();

    Computer getResult();
}
