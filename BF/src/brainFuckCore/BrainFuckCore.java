package brainFuckCore;

import brainFuckCore.I.LanguageExecute;
import brainFuckCore.operations.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BrainFuckCore {
    private static final int STACK_LENGHT = 30000;
    private static int cmd_pointer = 0;
    private static int pointer = 0;

    private static char[] cmd_stack;
    private static short[] arr;

    private static ArrayList<Integer> queue;
    private static List<LanguageExecute> languageOperations;
    private static StringBuilder retString;
    private static BufferedReader reader;

    public BrainFuckCore(String code) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        retString = new StringBuilder();
        cmd_stack = code.toCharArray();

        arr = new short[STACK_LENGHT];
        queue = new ArrayList<>();
        languageOperations = new ArrayList<>();

        Collections.addAll(languageOperations, new DecrementByte(), new IncrementByte(), new StoringValue(),
                new IncrementDataPointer(), new DecrementDataPointer(), new Output(), new StartLoop(), new EndLoop());

    }

    public static void incrementByte() {
        if ((arr[pointer]+1) > 255) arr[pointer] = 0;
        else arr[pointer]++;

        cmd_pointer++;
    }

    public static void decrementByte() {
        if ((arr[pointer]-1) < 0) arr[pointer] = 255;
        else arr[pointer]--;
        cmd_pointer++;
    }

    public static void incrementDataPointer() {
        pointer++;
        cmd_pointer++;
    }

    public static void decrementDataPointer() {
        pointer--;
        cmd_pointer++;
    }

    public static void output() {
        retString.append((char) arr[pointer]);
        cmd_pointer++;
    }

    public static void storingValue() {
        try {
            arr[pointer] = (short) Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        cmd_pointer++;
    }

    public static void startLoop() {
        queue.add(cmd_pointer);
        cmd_pointer++;
    }

    public static void endLoop() {
        if ((arr[pointer]) > 0) cmd_pointer = queue.remove(queue.size()-1);
        else cmd_pointer++;
    }

    public String interprete() {
        while (cmd_pointer < cmd_stack.length) {
            for (LanguageExecute x: languageOperations) {
                if(x.name() == cmd_stack[cmd_pointer]) { x.execute(); break; }
            }
        }
        return retString.toString();
    }
}