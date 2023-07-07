import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class principal {
    public static void main(String[] args) {
        String filepath="datos.dat";
        mclase miobjeto = new mclase("Erick",20);
        try(FileOutputStream fileout = new FileOutputStream(filepath);
            ObjectOutputStream abOut = new ObjectOutputStream(fileout);){
            objOut.write(miobjeto);
            System.out.println("El archivo escrito correctamente");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
