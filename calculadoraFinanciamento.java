public class calculadoraFinanciamento{
    public static void main(String[]args){
        int valorDoCarro = 10000;
        int duracaoDoEmprestimo = 3;
        int taxaDeJuros = 5;
        int valorEntrada = 2000;
        int valorEmprestimo = valorDoCarro-valorEntrada;
        int saldoRestante = valorDoCarro-valorEntrada;
        int numeroMeses = duracaoDoEmprestimo*12;
        int saldoMensal = saldoRestante/numeroMeses;
        int juros = (saldoMensal*taxaDeJuros)/100;
        int pagamentoMensal = saldoMensal+juros;
        if(duracaoDoEmprestimo<=0|| taxaDeJuros<=0){
            if(valorEmprestimo<=valorDoCarro){
                if(valorEntrada>=saldoRestante){
                    System.out.println("O valor do carro pode ser pago integralmente ");
                }
            }
        }
        if(pagamentoMensal>=0){
            System.out.println(pagamentoMensal);
        }
        else{
            System.out.println("Erro! Voce deve fazer um emprestimo valido");
        }
    }
}