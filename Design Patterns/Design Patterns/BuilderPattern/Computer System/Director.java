public class Director {
  public void buildC(ComputerBuilder computerBuilder) {
    computerBuilder.Cpu("AMD Ryzen 9")
        .Ram("32GB")
        .Storage("1TB SSD")
        .Gpu("AMD Radeon RX 6800");
  }

  public void buildH(ComputerBuilder computerBuilder) {
    computerBuilder.Cpu("Intel i9")
        .Ram("64GB")
        .Storage("2TB SSD")
        .Gpu("NVIDIA RTX 5090");
  }
}
