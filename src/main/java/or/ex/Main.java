package or.ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valitse tietokoneen kokoonpano:");
        System.out.println("1. Pelitietokone");
        System.out.println("2. Toimistotietokone");
        System.out.println("3. Mukautettu tietokone");

        int mainChoice = getChoice(scanner, 1, 3);

        Computer finalComputer = switch (mainChoice) {
            case 1 -> {
                GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();
                ComputerDirector director = new ComputerDirector(gamingBuilder);
                director.constructGamingComputer();
                yield gamingBuilder.getResult();
            }
            case 2 -> {
                OfficeComputerBuilder officeBuilder = new OfficeComputerBuilder();
                ComputerDirector director = new ComputerDirector(officeBuilder);
                director.constructOfficeComputer();
                yield officeBuilder.getResult();
            }
            case 3 -> {
                CustomComputerBuilder customBuilder = new CustomComputerBuilder();
                ComputerDirector director = new ComputerDirector(customBuilder);
                System.out.println("Valitse prosessori:");
                System.out.println("1. Intel i9");
                System.out.println("2. AMD Ryzen 9");
                System.out.println("3. Intel i7");
                int processorChoice = getChoice(scanner, 1, 3);
                customBuilder.selectProcessor(processorChoice);

                System.out.println("Valitse RAM:");
                System.out.println("1. 16 GB");
                System.out.println("2. 32 GB");
                System.out.println("3. 64 GB");
                int ramChoice = getChoice(scanner, 1, 3);
                customBuilder.selectRam(ramChoice);

                System.out.println("Valitse kiintolevy:");
                System.out.println("1. 1 TB SSD");
                System.out.println("2. 2 TB HDD");
                System.out.println("3. 3 TB HHD");
                int hardDriveChoice = getChoice(scanner, 1, 3);
                customBuilder.selectHardDrive(hardDriveChoice);

                System.out.println("Valitse näytönohjain:");
                System.out.println("1. NVIDIA RTX 3080");
                System.out.println("2. AMD Radeon RX 6800");
                System.out.println("3. AMD Radeon RX 6700 XT");
                int graphicsCardChoice = getChoice(scanner, 1, 3);
                customBuilder.selectGraphicsCard(graphicsCardChoice);

                System.out.println("Valitse käyttöjärjestelmä:");
                System.out.println("1. Windows 11");
                System.out.println("2. Ubuntu 20.04");
                System.out.println("3. Linux");
                int operatingSystemChoice = getChoice(scanner, 1, 3);
                customBuilder.selectOperatingSystem(operatingSystemChoice);

                director.constructCustomComputer();
                yield customBuilder.getResult();
            }
            default -> throw new IllegalArgumentException("Virheellinen valinta: " + mainChoice);
        };

        System.out.println("\n       VALITSEMASI KOKOONPANO             ");
        System.out.println(finalComputer);

        scanner.close();
    }

    private static int getChoice(Scanner scanner, int min, int max) {
        int choice;
        while (true) {
            System.out.print("Syötä valinta (" + min + "-" + max + "): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice >= min && choice <= max) break;
            } else {
                scanner.next();
            }
            System.out.println("Virheellinen valinta. Yritä uudelleen.");
        }
        return choice;
    }
}