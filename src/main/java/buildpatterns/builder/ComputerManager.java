package buildpatterns.builder;

/**
 * Created by vic on 21.11.16.
 */
public class ComputerManager {

    private ComputerBuilder computerBuilder;
    public ComputerManager(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer buildComputer() {
        this.computerBuilder.buildNewComputer();
        this.computerBuilder.buildMotherBoard();
        this.computerBuilder.buildCPU();
        this.computerBuilder.buildRAM();
        this.computerBuilder.buildHDD();
        return this.computerBuilder.getComputer();
    }
}
