package or.ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   TERVETULOA TIETOKONEEN RAKENTAJAN   ");
        System.out.println("==========================================\n");

        System.out.println("Valitse tietokoneen kokoonpano:");
        System.out.println("1. Pelitietokone");
        System.out.println("2. Toimistotietokone");
        System.out.println("3. Mukautettu tietokone");

      Computer finalComputer = switch (getValidChoice(scanner, 1, 3)) {
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


              System.out.println("\n--- Valitse prosessoritaso ---");
              System.out.println("1. Intel Core i5 (Entry) - 180 €");
              System.out.println("2. Intel Core i7 (Mid-Tier) - 320 €");
              System.out.println("3. Intel Core i9 (High-End) - 550 €");
              int cpuChoice = getValidChoice(scanner, 1, 3);
              String cpu = switch (cpuChoice) {
                  case 1 -> "Intel Core i5 (Entry)";
                  case 2 -> "Intel Core i7 (Mid-Tier)";
                  default -> "Intel Core i9 (High-End)";
              };


              System.out.println("\n--- Valitse RAM-muisti ---");
              System.out.println("1. 8 GB - 40 €");
              System.out.println("2. 16 GB - 75 €");
              System.out.println("3. 32 GB - 140 €");
              System.out.println("4. 64 GB - 260 €");
              int ramChoice = getValidChoice(scanner, 1, 4);
              int ram = switch (ramChoice) {
                  case 1 -> 8;
                  case 2 -> 16;
                  case 3 -> 32;
                  default -> 64;
              };


              System.out.println("\n--- Valitse kiintolevy ---");
              System.out.println("1. 512 GB SSD - 50 €");
              System.out.println("2. 1 TB NVMe SSD - 90 €");
              System.out.println("3. 2 TB NVMe SSD - 170 €");
              int storageChoice = getValidChoice(scanner, 1, 3);
              String storage = switch (storageChoice) {
                  case 1 -> "512 GB SSD";
                  case 2 -> "1 TB NVMe SSD";
                  default -> "2 TB NVMe SSD";
              };


              System.out.println("\n--- Valitse näytönohjain ---");
              System.out.println("1. Integrated Graphics - 0 €");
              System.out.println("2. NVIDIA RTX 4060 - 300 €");
              System.out.println("3. NVIDIA RTX 4080 - 1000 €");
              System.out.println("4. NVIDIA RTX 4090 - 1600 €");
              int gpuChoice = getValidChoice(scanner, 1, 4);
              String gpu = switch (gpuChoice) {
                  case 1 -> "Integrated Graphics";
                  case 2 -> "NVIDIA RTX 4060";
                  case 3 -> "NVIDIA RTX 4080";
                  default -> "NVIDIA RTX 4090";
              };


              System.out.println("\n--- Valitse käyttöjärjestelmä ---");
              System.out.println("1. Windows 11 Home - 110 €");
              System.out.println("2. Windows 11 Pro - 150 €");
              System.out.println("3. Linux Ubuntu - 0 €");
              int osChoice = getValidChoice(scanner, 1, 3);
              String os = switch (osChoice) {
                  case 1 -> "Windows 11 Home";
                  case 2 -> "Windows 11 Pro";
                  default -> "Linux Ubuntu";
              };
              director.constructCustomComputer(cpu, ram, storage, gpu, os);

              yield customBuilder.getResult();
          }
          default -> throw new IllegalArgumentException("Virheellinen valinta: " + getValidChoice(scanner, 1, 3));
      };



        System.out.println("\n==========================================");
        System.out.println("       VALITSEMASI KOKOONPANO             ");
        System.out.println("==========================================");
        System.out.println(finalComputer);

        scanner.close();
    }






    private static int getValidChoice(Scanner scanner, int min, int max) {
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