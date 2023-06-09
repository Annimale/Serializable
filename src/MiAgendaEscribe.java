
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ivamarrrr
 */
public class MiAgendaEscribe {

    public static void main(String[] args) throws IOException {

        File f = new File("archivo.dat");
        String otro;
        String nombre, email, direccion;

        Scanner tcl = new Scanner(System.in);
        FileOutputStream ficha;
        ObjectOutputStream d;
        try {

            if (f.exists()) {
                ficha = new FileOutputStream(f);

                d = new MiObjectOutputStream(ficha);

            } else {
                ficha = new FileOutputStream(f);

                d = new ObjectOutputStream(ficha);
            }

            do {
                ArrayList lista = new ArrayList();
                System.out.println("Introduzca su nombre: ");
                nombre = tcl.nextLine();
                System.out.println("Introduzca su direccion:  ");
                direccion = tcl.nextLine();

                System.out.println("Introduzca su email:    ");
                email = tcl.nextLine();

                do {
                    System.out.println("Telefono:  ");
                    String fono = tcl.nextLine();
                    lista.add(fono);
                    System.out.println("Otro fono (s/n) :   ");
                    otro = tcl.nextLine();
                } while (otro.equals("s") || otro.equals("S"));
                d.writeObject(new MiAgenda(nombre, direccion, lista, email));
                System.out.println("Quieres otro registro s/n");
                otro = tcl.nextLine();
            } while (otro.equals("s") || otro.equals("S"));
            d.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }
}
