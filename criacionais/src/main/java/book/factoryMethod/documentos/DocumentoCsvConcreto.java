package book.factoryMethod.documentos;

import com.opencsv.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class DocumentoCsvConcreto implements Documento {
    @Override
    public void escreveEmDocumento(String texto) {
        String[] cabecalho = {"nome"};
        List<String[]> linhas = new ArrayList<>();
        linhas.add(new String[]{texto});
        try {
            Writer writer = Files.newBufferedWriter(Paths.get("pessoas.csv"));
            CSVWriter csvWriter = new CSVWriter(writer);

            csvWriter.writeNext(cabecalho);
            csvWriter.writeAll(linhas);

            csvWriter.flush();
            writer.close();
        }
        catch (IOException exception){
            System.out.println("Deu ruim");
        }
    }
}
