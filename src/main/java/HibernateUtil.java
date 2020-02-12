import Entidades.Equipos;
import Entidades.Jugadores;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
        sesion.beginTransaction();
        List<Jugadores> jugadores = new ArrayList<>();
        int option, id = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Mostrar Procedencia y Posición de los jugadores de los Cavaliers.");
        boolean query = true;
        option = sc.nextInt();

        switch (option){
            case 1:
                jugadores = sesion.createQuery("FROM Jugadores").list();
                jugadores.stream().filter(line -> line.getNombre_equipo().equals("Cavaliers"));
                break;
            case 2:
                break;
            case 3:
                Jugadores jugador = new Jugadores();
                jugador.setCodigo(999);
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

    }
}
