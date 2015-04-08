package TestTasks;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Student on 4/8/2015.
 * Задание № 2 - 10 points
  Ввести с клавиатуры строку текста.
  Найти все слова, у которых первая и последняя буквы одинаковые.
  Вывести результат на экран.
 */
public class Task02 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input text:");
        String inputString = "";
        try{
            inputString = reader.readLine();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        List<String> parsedStringList = Splitter.onPattern("[ ,\\.]+")
                .trimResults()
                .trimResults(CharMatcher.DIGIT)
                .omitEmptyStrings()
                .splitToList(inputString);

        System.out.println("Words with same letter at the start and at the end:");

        for (String aParsedStringList : parsedStringList) {
            char firstCharacter = aParsedStringList.charAt(0);
            char lastCharacter = aParsedStringList.charAt(aParsedStringList.length() - 1);
            if (firstCharacter == lastCharacter) System.out.println(aParsedStringList);
        }
    }

}
