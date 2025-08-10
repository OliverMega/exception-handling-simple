// FileExporter.java
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class FileExporter implements Exporter {
    private boolean append;

    FileExporter(boolean append) {
        this.append = append;
    }

    @Override
    public void export(String filePath, String content) throws IOException {
        Path path = Paths.get(filePath);
        Files.createDirectories(path.getParent());

        OpenOption option = append ? StandardOpenOption.APPEND : StandardOpenOption.CREATE;
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE, option)) {
            writer.write(content);
            writer.newLine();
        }
    }
}
