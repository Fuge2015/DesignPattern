package com.fuge.BuilderPattern;

/**
 * Created by dongfu on 17-4-15.
 */
public class Director {
    public Computer produce(Builder builder) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        computerBuilder.buildCPU();
        computerBuilder.buildMemory();
        computerBuilder.buildBoard();
        return computerBuilder.getComputer();
    }
}
