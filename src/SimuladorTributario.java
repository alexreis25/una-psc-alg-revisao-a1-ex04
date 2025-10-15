
public class SimuladorTributario{

        public static double calcularImpostoAntigo(double valorFaturamento, int aliquotaBase) {
        return valorFaturamento * (aliquotaBase / 100.0);
        }
        public static double calcularImpostoProposto(double valorFaturamento , int aliquotaProposta){
            return valorFaturamento * (aliquotaProposta/100.0);
        }
        public static double calcularDiferenca(double impostoAntigo, double impostoProposto){
            return Math.abs(impostoProposto - impostoAntigo);
        }
        public void statusDialogo(boolean acessoAoGoverno) {
        if (acessoAoGoverno) {
            System.out.println("STATUS: Diálogo aberto. Há espaço para negociação.");
        } else {
            System.out.println("STATUS: Fintechs reclamam de falta de acesso ao governo. Risco de derrota política.");
        }
        }   
    

public static void main(String[]args){
    double faturamento = 80000000.00;
    int aliquotaAntiga = 9;

    System.out.println("\n=== Análise de Tributação de Fintechs ===");
    System.out.println("\nFaturamento base : R$ " + String.format("%,.2f",faturamento));
    System.out.println("\n=====================");

    double impostoAntigo = calcularImpostoAntigo(faturamento, aliquotaAntiga);
    double impostoProposto9 = calcularImpostoProposto(faturamento, 9);
    double diferenca9 = calcularDiferenca(impostoAntigo, impostoProposto9);

    System.out.println("\n====Proposta A (9% -> 15%)====");
    System.out.println("\nImposto antigo(9%): R$ " +  String.format("%,.2f", impostoAntigo));
    System.out.println("Imposto proposto(15%): R$ " + String.format("%,.2f", impostoProposto9));
    System.out.println("Aumento imposto: " +  String.format("%,.2f", diferenca9));

    double impostoProposto15 = calcularImpostoProposto(faturamento, 15);
    double diferenca15 = calcularDiferenca(impostoAntigo, impostoProposto15);


    System.out.println("\n====Proposta B (15% -> 20%)====");
    System.out.println("\nImposto Antigo (15%): " + String.format("%,.2f", impostoAntigo));
    System.out.println("Imposto proposto(20%): " + String.format("%,.2f", impostoProposto15));
    System.out.println("Aumento de imposto: " + String.format("%,.2f", diferenca15));

    System.out.println("\n====Análise de Diálogo====");

    SimuladorTributario simulador = new SimuladorTributario();


    simulador.statusDialogo(true);
    simulador.statusDialogo(false);


}
}