package book.factoryMethod.documentos;

public class DocumentoTxt extends CriadorDeDocumentos{
    @Override
    public Documento criaDocumento() {
        return new DocumentoTxtConcreto();
    }
}
