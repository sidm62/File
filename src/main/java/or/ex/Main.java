package or.ex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);





        System.out.println("Valitse tietokoneen kokoonpano:");
        System.out.println("1. Pelitietokone");
        System.out.println("2. Toimistotietokone");
        System.out.println("3. Mukautettu tietokone");

      Computer finalComputer = switch (getChoice(scanner, 1, 3)) {
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


              System.out.println("\n--- Valitse prosessori ---");
              System.out.println("1. Intel Core i5 ");
              System.out.println("2. Intel Core i7 ");
              System.out.println("3. Intel Core i9 ");
              int cpuChoice = getChoice(scanner, 1, 3);
              String cpu = switch (cpuChoice) {
                  case 1 -> "Intel Core i5 ";
                  case 2 -> "Intel Core i7 ";
                  default -> "Intel Core i9 (High-End)";
              };


              System.out.println("\n--- Valitse RAM-muisti ---");
              System.out.println("1. 8 GB ");
              System.out.println("2. 16 GB ");
              System.out.println("3. 32 GB ");
              int ramChoice = getChoice(scanner, 1, 4);
              int ram = switch (ramChoice) {
                  case 1 -> 8;
                  case 2 -> 16;
                  default -> 32;
              };


              System.out.println("\n--- Valitse kiintolevy ---");
              System.out.println("1. 512 GB  ");
              System.out.println("2. 1 TB NVMe ");
              System.out.println("3. 2 TB NVMe  ");
              int storageChoice = getChoice(scanner, 1, 3);
              String storage = switch (storageChoice) {
                  case 1 -> "512 GB";
                  case 2 -> "1 TB NVMe";
                  default -> "2 TB NVMe ";
              };


              System.out.println("\n--- Valitse näytönohjain ---");

              System.out.println("1. NVIDIA RTX 411 ");
              System.out.println("2. NVIDIA RTX 401 ");
              System.out.println("3. NVIDIA RTX 40 ");
              int gpuChoice = getChoice(scanner, 1, 4);
              String gpu = switch (gpuChoice) {
                  case 1 -> "NVIDIA RTX 411";
                  case 2 -> "NVIDIA RTX 401";
                  default -> "NVIDIA RTX 40";
              };


              System.out.println("\n--- Valitse käyttöjärjestelmä ---");
              System.out.println("1. Windows 11 Home ");
              System.out.println("2. Windows 11 Pro ");
              System.out.println("3. Linux Ubuntu ");
              int osChoice = getChoice(scanner, 1, 3);
              String os = switch (osChoice) {
                  case 1 -> "Windows 11 Home";
                  case 2 -> "Windows 11 Pro";
                  default -> "Linux ";
              };
              director.constructCustomComputer(cpu, ram, storage, gpu, os);

              yield customBuilder.getResult();
          }
          default -> throw new IllegalArgumentException("Virheellinen valinta: " + getChoice(scanner, 1, 3));
      };




        System.out.println("       VALITSEMASI KOKOONPANO             ");

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