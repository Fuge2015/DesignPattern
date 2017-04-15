package com.fuge.BuilderPattern;

/**
 * 抽象构建者
 * Created by dongfu on 17-4-15.
 */
interface Builder {
    void buildCPU();
    void buildMemory();
    void buildBoard();
    Computer getComputer();
}
