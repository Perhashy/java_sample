package codeprepExc;

import java.nio.file.Files;
import java.io.File;
import java.io.IOException;

public class Main05 {
  private static String readFile(File file, String encoding) throws IOException {
    return new String(Files.readAllBytes(file.toPath()), encoding);
  }

  public static void main(String[] args) {
    System.out.println("テスト１：" + readFile(new File("file1.txt"), "utf-8"));
    System.out.println("テスト２：" + readFile(new File("file2.txt"), "utf-8"));
    System.out.println("テスト３：" + readFile(new File("file1.txt"), "unknown"));
  }
}
