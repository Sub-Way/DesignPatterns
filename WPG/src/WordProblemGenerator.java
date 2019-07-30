import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import Question.QuestionSheet;

import java.io.*;

public class WordProblemGenerator {

    public static void main(String args[]) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean continueVar = true;
        while (continueVar) {
            QuestionSheet questionsheet = new QuestionSheet();
            System.out.println("\n종료하시겠습니까? Y or N");
            try {
                String input = reader.readLine();
                input = input.replace(" ", "");
                if ((input.equals("N"))){
                    continueVar = true;
                }
                else
                	continueVar = false;
            }
            catch (IOException e) {
                System.err.println(e);
            }
        }
    }
}