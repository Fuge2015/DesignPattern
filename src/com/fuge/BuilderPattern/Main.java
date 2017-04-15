package com.fuge.BuilderPattern;

/**
 * 需要产品的客户
 * Created by dongfu on 17-4-15.
 */
public class Main {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();
        Director director = new Director();
        Computer computer = director.produce(computerBuilder);
        System.out.println(computer.toString());
    }
}
