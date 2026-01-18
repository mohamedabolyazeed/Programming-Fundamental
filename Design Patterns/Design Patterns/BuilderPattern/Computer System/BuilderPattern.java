public class BuilderPattern {
  public static void main(String[] args) {
    System.out.println("Building Computer with Builder (Standard Build)");
    ComputerBuilder builder = new ComputerBuilder();
    builder.Cpu("Intel i7").Ram("16GB").Storage("512GB SSD").Gpu("NVIDIA RTX 3060");
    Computer c = builder.build();
    System.out.println(c.getCpu());
    System.out.println(c.getRam());
    System.out.println(c.getStorage());
    System.out.println(c.getGpu());

    System.out.println("--------------------------------");
    System.out.println("Building Computer with Director (Standard Build)");
    Director director = new Director();
    director.buildC(builder);
    Computer c2 = builder.build();
    System.out.println(c2.getCpu());
    System.out.println(c2.getRam());
    System.out.println(c2.getStorage());
    System.out.println(c2.getGpu());

    System.out.println("--------------------------------");
    System.out.println("Building Computer with Director (High-End Build)");
    director.buildH(builder);
    Computer c3 = builder.build();
    System.out.println(c3.getCpu());
    System.out.println(c3.getRam());
    System.out.println(c3.getStorage());
    System.out.println(c3.getGpu());
  }
}
