package codeprepExc;

import java.nio.file.Files;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public class Main04 {
  private static String readFile(File file, String encoding) {
    try (FileInputStream is = new FileInputStream(file)){
      byte[] buf = new byte[(int)file.length()];
      is.read(buf);
      return new String(buf, encoding);
    } catch (FileNotFoundException e) {
      System.out.println("ファイルが見つかりませんでした：" + file);
      return "";
    } catch (UnsupportedEncodingException e) {
      System.out.println("エンコーディングが不正です：" + encoding);
      return "";
    } catch (IOException e) {
      System.out.println("ファイルの読み込みに失敗しました：" + file);
      return "";
    }
  }
  public static void main(String[] args) {
    System.out.println("テスト１：" + readFile(new File("file1.txt"), "utf-8"));
    System.out.println("テスト２：" + readFile(new File("file2.txt"), "utf-8"));
    System.out.println("テスト３：" + readFile(new File("file1.txt"), "unknown"));
  }
}
