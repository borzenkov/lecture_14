package buildpatterns.builder;

/**
 * Created by vic on 21.11.16.
 */
public abstract class ComputerBuilder {
    protected Computer computer;
    public abstract void buildNewComputer();
    public abstract void buildMotherBoard();
    public abstract void buildCPU();
    public abstract void buildRAM();
    public abstract void buildHDD();

    public Computer getComputer() {
        return computer;
    }
}
