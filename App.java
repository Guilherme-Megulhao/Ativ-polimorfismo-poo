public class App {
    public static void main(String[] args) throws Exception {
        
         Funcionario dev = new Desenvolvedor(3000.0);
        Funcionario suporte = new Suporte(2500.0);

        System.out.printf("Desenvolvedor - Salário Final: R$ %.2f%n", dev.calcularSalarioFinal());
        System.out.printf("Suporte       - Salário Final: R$ %.2f%n", suporte.calcularSalarioFinal());
    }
}
