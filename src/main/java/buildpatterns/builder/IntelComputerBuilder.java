package buildpatterns.builder;

/**
 * Created by vic on 21.11.16.
 */
public class IntelComputerBuilder extends ComputerBuilder {

    public void buildNewComputer() {
        this.computer = new Computer(null);
    }

    public void buildMotherBoard() {
        //this.computer.setMotherBoard("Intel");
    }

    public void buildCPU() {
        //this.computer.setCPU("Intel");
    }

    public void buildRAM() {
        //this.computer.setRAM("Intel");
    }

    public void buildHDD() {
        //this.computer.setHDD("Intel");
    }
}
