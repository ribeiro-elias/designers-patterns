package book.observable.guru.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
