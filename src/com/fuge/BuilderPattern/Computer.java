package com.fuge.BuilderPattern;

/**
 * 被构建的对象
 * Created by dongfu on 17-4-15.
 */
public class Computer {
    private String cpu;
    private String memory;
    private String board;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String toString() {
        return "CPU: " + cpu + "memory: " + memory + "board: " + board;
    }
}
