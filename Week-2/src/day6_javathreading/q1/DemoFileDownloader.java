package day6_javathreading.q1;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

// 1. Get all links to get downloaded
class FileUtil{
    //give list of all the videos/file
    public static List<String> readFiles(String fileName){
        List<String> files = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\korber_java_backend\\rg_java_training2025\\Week-2\\link.txt"))) {
            String line = null;
            while ((line = br.readLine()) != null){
                files.add(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return files;
    }
}

// 2. create FileDownloader
class  DownloadManager{
    public static void download(String url){
        System.out.println(Thread.currentThread().getName()+ " is starting download "+ url);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+ " is download done " + url);
    }
}

class  FileDownloadTask {
    
}

public class DemoFileDownloader {
    public static void main(String[] args) {
        List<String> urls = FileUtil.readFiles("D:\\korber_java_backend\\rg_java_training2025\\Week-2\\link.txt");

                for(String url : urls) {
                    DownloadManager.download(url);
                }

    }
}
