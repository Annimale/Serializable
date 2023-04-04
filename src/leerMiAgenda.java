
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ivamar
 */
public class leerMiAgenda {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try ( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("archivo.dat"))) {

            while (true) {
                MiAgenda aux = (MiAgenda) ois.readObject();
                System.out.println("Nombre: " + aux.getNombre());
                System.out.println("Direccion: " + aux.getDireccion());
                System.out.println("Email: " + aux.getEmail());
                System.out.print("Telefono: ");

                for (int i = 0; i < aux.getFono().size(); i++) {
                    System.out.print("[" + aux.getFono().get(i) + "] ");

                }

                System.out.println("\n");
            }
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("Final de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
} 
    

