package candidatura;

import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("***Processo Seletivo!***");
        Scanner scanner = new Scanner(System.in);
        double pretencaoSalarial;

        System.out.println("Qual a sua pretencão salarial? ");
        pretencaoSalarial = scanner.nextDouble();

        analisarCandidato(pretencaoSalarial);
    }

    /**
     * 
     * @param salarioPretendido Recebe o valor salarial pretendido pelo candidato.
     *                          Esse valor vem pela variavel
     *                          <b>pretencaoSalarial</b> do metodo
     *                          <i>main</i>{@see ProcessoSeletivo}
     * @return Não há retornos esperados para esse método.
     * 
     */
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS!");
        }
    }
}
