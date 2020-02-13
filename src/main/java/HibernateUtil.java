import Entidades.Equipos;
import Entidades.Jugadores;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HibernateUtil {

    public static void main(String[] args) {
        SessionFactory sessionFactory;
        Session sesion;

        sessionFactory = new Configuration().configure().buildSessionFactory();
        sesion = sessionFactory.openSession();
        Transaction transaction = sesion.beginTransaction();
        List<Jugadores> jugadores = new ArrayList<>();
        jugadores = sesion.createQuery("FROM Jugadores").list();

        int option;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Mostrar Procedencia y Posición de los jugadores de los Cavaliers." +
                "\n2. Contar Jugadores Españoles." +
                "\n3. Insertar Jugador.");
        boolean query = true;
        option = sc.nextInt();

        switch (option){
            case 1:
                jugadores.stream().filter(line -> line.getNombre_equipo().equals("Cavaliers")).forEach(System.out::println);;
                break;
            case 2:
                int count= 0;
                try {
                    for (Jugadores jugador : jugadores) {
                        if (jugador.getProcedencia().equals("Spain")) count++ ;
                    }
                }catch (NullPointerException e){
                    System.out.println(count);
                }
                break;
            case 3:
                Jugadores jugador = new Jugadores();
                jugador.setCodigo(888);
                jugador.setNombre("JugadorPrueba");
                jugador.setNombre_equipo("Cavaliers");
                jugador.setAltura("190");
                jugador.setPeso(90);
                jugador.setPosicion("A-C");
                jugador.setProcedencia("Prueba");
                sesion.save(jugador);
                break;
            case 4:
                break;
        }
        transaction.commit();
        sesion.close();
        sessionFactory.close();
    }
}
