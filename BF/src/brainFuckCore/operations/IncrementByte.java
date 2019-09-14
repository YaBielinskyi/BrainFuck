package brainFuckCore.operations;

import brainFuckCore.I.LanguageExecute;

import static brainFuckCore.BrainFuckCore.incrementByte;

public class IncrementByte implements LanguageExecute {

    public char name(){
        return '+';
    }

    public void execute(){
        incrementByte();
    }
}
