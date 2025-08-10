import java.io.FileWriter;
import java.io.IOException;

public class SimpleExporter {
    public void exportToFile(String filaName, String content) {
        try (FileWriter writer = new FileWriter(filaName)) {
            writer.write(content);
            System.out.println("已成功匯出至檔案: " + filaName);
        } catch (IOException e) {
            System.out.println("寫入檔案時發生錯誤: " + e.getMessage());
        }
    }
}
