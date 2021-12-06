package book.factoryMethod.documentos;

import java.io.*;

public class DocumentoTxtConcreto implements Documento {
    @Override
    public void escreveEmDocumento(String texto) {
        try {
            FileWriter arq = new FileWriter("tabuada.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(texto);
            arq.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
