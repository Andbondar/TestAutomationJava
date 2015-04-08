package TestTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Student on 4/8/2015.
 * Задание № 1  - 10 points
  Ввести с клавиатуры 10 чисел.
  Четные числа добавляем в конец списка.
  Нечетные числа добавляем в начало списка.
  Вывести результат на экран.
 */
public class Task01 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        System.out.println("Input 10 integer values");

        try{
            for (int i = 0; i < 10; i++){
                int currentInput = Integer.parseInt(reader.readLine());
                if (currentInput%2 == 0) myArrayList.add(currentInput);
                else myArrayList.add(0, currentInput);
            }
        }
        catch (Exception e){
            System.out.println("Input processing error. Only integer values are processed");
            e.printStackTrace();
        }

        System.out.println("Output array: " + Arrays.toString(myArrayList.toArray()));

    }
}
