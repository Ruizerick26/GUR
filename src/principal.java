import java.io.*;

public class principal {
    public static void main(String[] args) {
        String filepath="datos.dat";
        mclase miobjeto = new mclase("Erick",20);
        try(FileOutputStream fileout = new FileOutputStream(filepath);
            ObjectOutputStream abOut = new ObjectOutputStream(fileout);){
            abOut.writeObject(miobjeto);
            System.out.println("El archivo escrito correctamente");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        try(
                FileInputStream filen = new FileInputStream(filepath);
                ObjectInputStream obin = new ObjectInputStream(filen);
                )
        {
            mclase readobjeto=(mclase) obin.readObject();
            System.out.println("El objeto en disco es: "+readobjeto);
            System.out.println(readobjeto.getEdad());
            System.out.println(readobjeto.getNombre());
        }catch (IOException e){
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
