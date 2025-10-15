public class Programacao extends Funcionario {
    double porcentagem = 20.0;

    public Programacao(String nome, String cpf){
        super(nome, cpf);
    }

    @Override
    public double calcularSalario(){
        return 1500.00 * (porcentagem/100);
    }
}
