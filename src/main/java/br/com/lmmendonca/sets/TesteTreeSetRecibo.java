package br.com.lmmendonca.sets;

import br.com.lmmendonca.entidades.Recibo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSetRecibo {

    /**
     * Para adicionarmos um objeto em um TreeSet ele precisa implementar a interface Comparable. Mas
     * o que fazer se estamos trabalhando com uma instância de uma classe que não temos acesso ou
     * não podemos modificar para implementar Comparable? Nesse caso, o construtor do TreeSet recebe
     * como parâmetro um objeto que implementa Comparator. Dessa forma, o critério de comparação
     * pode ser criado em separado da classe na qual opera.
     *
     * @param args
     */
    public static void main(String[] args) {
        Recibo recibo1 = new Recibo("Pagamento aluguel", 200.50, "Leonardo");
        Recibo recibo2 = new Recibo("Financiamento carro", 250.50, "Leonardo1");
        Recibo recibo3 = new Recibo("Emprestimo banco", 300.50, "Leonardo2");


        Set<Recibo> recibos = new TreeSet<>(
                (o1, o2) -> o2.getAssinatura().compareTo(o1.getAssinatura()));

//        Set<Recibo> recibos = new HashSet<>();

        recibos.add(recibo1);
        recibos.add(recibo2);
        recibos.add(recibo3);

        recibos.forEach(System.out::println);
        System.out.println(recibos.size());

    }
}
