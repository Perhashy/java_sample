package codeprepExc;

import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main２ {
  private static String readFile(File file, String encoding) {
    try {
      return new String(Files.readAllBytes(file.toPath()), encoding);
    // } catch (NoSuchFileException e) {
    //   System.out.println("ファイルが見つかりませんでした：" + file);
    //   return "";
    // } catch (UnsupportedEncodingException e) {
    //   System.out.println("エンコーディングが不正です：" + encoding);
    //   return "";
    // } catch (NoSuchFileException | UnsupportedEncodingException e) {
    //   System.out.println("ファイルが見つからないかエンコーディングが不正です。");
    //   return "";
    // } catch (IOException e) {
    //   System.out.println("ファイルの読み込みに失敗しました：" + file);
    //   return "";
    } catch (Exception e) {
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
