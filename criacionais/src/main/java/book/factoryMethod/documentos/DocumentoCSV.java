package book.factoryMethod.documentos;

public class DocumentoCSV extends CriadorDeDocumentos{
    @Override
    public Documento criaDocumento() {
        return new DocumentoCsvConcreto();
    }
}
