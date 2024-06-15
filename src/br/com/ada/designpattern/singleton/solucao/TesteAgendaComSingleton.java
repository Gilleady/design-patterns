package br.com.ada.designpattern.singleton.solucao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Classe de teste para o padrão Singleton.
 * 
 * Demonstra a utilização das três abordagens (Eager, Lazy e Enum) e tenta criar novas instâncias com reflection.
 * 
 * O teste mostra que as abordagens Eager e Lazy são suscetíveis a violações do padrão Singleton através de reflection,
 * enquanto a abordagem Enum é imune a essas violações.
 */
public class TesteAgendaComSingleton {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("=========================================================");
        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sábado");
        System.out.println("---------------------------------------------------------");
        
        //reflection
        Constructor<AgendaSingletonEAGER> construtorTravessoEAGER = AgendaSingletonEAGER.class.getDeclaredConstructor();
        construtorTravessoEAGER.setAccessible(true);
        AgendaSingletonEAGER agendaTravessaEAGER = construtorTravessoEAGER.newInstance();
        AgendaSingletonEAGER agendaTravessaEAGER2 = construtorTravessoEAGER.newInstance();
        System.out.println(agendaTravessaEAGER);
        System.out.println(agendaTravessaEAGER2);
        
        
        System.out.println("=========================================================");
        reservaDiaLAZY("Sexta");
        reservaDiaLAZY("Sábado");
        System.out.println("=========================================================");    
        
        //reflection
        Constructor<AgendaSingletonLAZY> construtorTravessoLAZY = AgendaSingletonLAZY.class.getDeclaredConstructor();
        construtorTravessoLAZY.setAccessible(true);
        AgendaSingletonLAZY agendaTravessaLAZY = construtorTravessoLAZY.newInstance();
        AgendaSingletonLAZY agendaTravessaLAZY2 = construtorTravessoLAZY.newInstance();
        System.out.println(agendaTravessaLAZY);
        System.out.println(agendaTravessaLAZY2);
        

        System.out.println("=========================================================");
        reservaDiaENUM("Sexta");
        reservaDiaENUM("Sábado");
        System.out.println("---------------------------------------------------------");
        
        //reflection
        Constructor<AgendaSingletonENUM> construtorTravessoENUM = AgendaSingletonENUM.class.getDeclaredConstructor();
        construtorTravessoENUM.setAccessible(true);
        AgendaSingletonENUM agendaTravessaENUM = construtorTravessoENUM.newInstance();
        AgendaSingletonENUM agendaTravessaENUM2 = construtorTravessoENUM.newInstance();
        System.out.println(agendaTravessaENUM);
        System.out.println(agendaTravessaENUM2);
    }

    /**
     * Reserva um dia na agenda utilizando a abordagem Eager.
     * 
     * @param dia O dia da semana a ser reservado.
     */
    public static void reservaDiaEAGER(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
    
    /**
     * Reserva um dia na agenda utilizando a abordagem Lazy.
     * 
     * @param dia O dia da semana a ser reservado.
     */
    public static void reservaDiaLAZY(String dia) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }

    /**
     * Reserva um dia na agenda utilizando a abordagem Enum.
     * 
     * @param dia O dia da semana a ser reservado.
     */
    public static void reservaDiaENUM(String dia) {
        AgendaSingletonENUM agenda = AgendaSingletonENUM.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());
    }
}