// Exporter.java
import java.io.IOException;

public interface Exporter {
    void export(String filePath, String content) throws IOException;
}
