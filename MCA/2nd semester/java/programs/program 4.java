public class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

    class Processor {
        int numOfCores;
        String manufacturer;

        Processor(int numOfCores, String manufacturer) {
            this.numOfCores = numOfCores;
            this.manufacturer = manufacturer;
        }

        void displayProcessorInfo() {
            System.out.println("Processor Information:");
            System.out.println("Number of Cores: " + numOfCores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void displayRAMInfo() {
            System.out.println("RAM Information:");
            System.out.println("Memory: " + memory);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU(500); // Creating an object of CPU

        // Creating an object of Processor
        CPU.Processor processor = cpu.new Processor(4, "Intel");
        // Creating an object of RAM
        CPU.RAM ram = new CPU.RAM(8, "Kingston");

        // Displaying information of Processor and RAM
        processor.displayProcessorInfo();
        ram.displayRAMInfo();
    }
}
