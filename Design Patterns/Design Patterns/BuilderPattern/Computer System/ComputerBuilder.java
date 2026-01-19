public class ComputerBuilder {
  private String cpu;
  private String ram;
  private String storage;
  private String gpu;

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
