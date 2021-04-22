import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> sentence = new ArrayList<>();
    public static ArrayList<Integer> wordSearch(String word){
        ArrayList<Integer> index = new ArrayList<>();
        for(int i = 0; i <sentence.size(); i++) {
            if (sentence.get(i).contains(word)) {
            index.add(i);
            }
        }
        return index;
    }

    public static void main(String[]args) throws IOException {
        FileReader fr = new FileReader("ProgrammingHistory.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            System.out.println("Just read: " +line);
            sentence.add(line);
        }
        br.close();
        System.out.println(wordSearch("devices"));
    }
}
