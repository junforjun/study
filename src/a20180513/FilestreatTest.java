package a20180513;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FilestreatTest {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("C:\\git\\god.txt");
            InputStreamReader is = new InputStreamReader(fs);
            BufferedInputStream bs = new BufferedInputStream(fs);
            
            int data;
            while((data =is.read()) != -1) {
                System.out.print( (char) data);
            }

        } catch (Exception e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }
}