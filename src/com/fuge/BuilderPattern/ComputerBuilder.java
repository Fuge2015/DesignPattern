package com.fuge.BuilderPattern;

/**
 * 具体构建者
 * Created by dongfu on 17-4-15.
 */
public class ComputerBuilder implements Builder {
    private Computer computer = new Computer();
    public void buildCPU() {
        System.out.println("build CPU.");
        computer.setCpu("intel cpu.");
    }

    public void buildMemory() {
        System.out.println("build memory.");
        computer.setMemory("king memory.");
    }

    public void buildBoard() {
        System.out.println("build board.");
        computer.setBoard("nvidia board.");
    }

    public Computer getComputer() {
        return computer;
    }
}
