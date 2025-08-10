import java.io.IOException;
import java.nio.file.Paths;

public class ExportMain {
    public static void main(String[] args) {
        Exporter resultExporter = new FileExporter(false); // 覆寫模式
        Exporter errorExporter = new FileExporter(true);   // 追加模式

        try {
            int result = MathUtil.divide(10, 0); // 這行會拋出 DivisionByZeroException
            // 跨平台路徑
            String resultPath = Paths.get("output", "result.txt").toString();
            resultExporter.export(resultPath, "計算結果: " + result);

        } catch (DivisionByZeroException e) {
            try {
                // 跨平台路徑
                String errorPath = Paths.get("logs", "error.log").toString();
                errorExporter.export(errorPath, "錯誤訊息: " + e.getMessage());
            } catch (Exception ioEx) {
                ioEx.printStackTrace();
            }
        }catch(IOException ioEx1) {
            ioEx1.printStackTrace();
        }





        // 建立匯出器物件
        // SimpleExporter exporter = new SimpleExporter();

        // try {
            // 嘗試計算除法（此例會拋出 DivisionByZeroException）
            // int result = MathUtil.divide(10, 0);

            // 如果成功，將結果寫入 result.txt
            // exporter.exportToFile("result.txt", "計算結果: " + result);

        // } catch (DivisionByZeroException e) {
            // 捕捉自訂例外，將錯誤訊息寫入 error.txt
        //     exporter.exportToFile("error.txt", "錯誤訊息: " + e.getMessage());
        // }

        // 備註：原本也可以單純測試寫檔功能
        // String content = "Hello, this is exported content.";
        // String fileName = "exported_note.txt";
        // exporter.exportToFile(fileName, content);
    }
}

