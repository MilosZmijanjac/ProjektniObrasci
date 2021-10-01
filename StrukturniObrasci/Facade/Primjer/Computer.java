package StrukturniObrasci.Facade.Primjer;


public class Computer {
    CPU cpu;
    Memory memory;
    public Computer(){
        cpu = new CPU();
        memory=new Memory();
    }
    public void run() {
        cpu.processData();
        memory.load();
    }
}
