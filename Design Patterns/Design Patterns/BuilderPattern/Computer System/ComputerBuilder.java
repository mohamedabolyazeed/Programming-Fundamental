public class ComputerBuilder {
  private String cpu = "Default CPU";
  private String ram = "8GB";
  private String storage = "256GB SSD";
  private String gpu = "Integrated Graphics";

  public ComputerBuilder Cpu(String cpu) {
    this.cpu = cpu;
    return this;
  }

  public ComputerBuilder Ram(String ram) {
    this.ram = ram;
    return this;
  }

  public ComputerBuilder Storage(String storage) {
    this.storage = storage;
    return this;
  }

  public ComputerBuilder Gpu(String gpu) {
    this.gpu = gpu;
    return this;
  }

  public Computer build() {
    return new Computer(cpu, ram, storage, gpu);
  }
}
