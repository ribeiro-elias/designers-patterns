package book.adapter;

import java.util.List;

public enum TypeDocument {
    XML(new ReadDocumentXML()),
    CSV(new ReadDocumentCSV());

    private final ReadDocument readDocument;

    TypeDocument(ReadDocument readDocument) {
        this.readDocument = readDocument;
    }

    public List<Employee> getDocument(){
        return readDocument.readDocument();
    }
}
