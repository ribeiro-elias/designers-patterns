package book.factoryMethod.documentos;

public class GeradorDeArquivos {
    public static void main(String[] args) {
        CriadorDeDocumentos criadorDeDocumentos = new DocumentoCSV();
        Documento documentoCSV = criadorDeDocumentos.criaDocumento();
        documentoCSV.escreveEmDocumento("Elias Ribeiro");

        CriadorDeDocumentos criadorDeDocumentos1 = new DocumentoTxt();
        Documento documento = criadorDeDocumentos1.criaDocumento();
        documento.escreveEmDocumento("Estou escrevendo no txt");
    }
}
