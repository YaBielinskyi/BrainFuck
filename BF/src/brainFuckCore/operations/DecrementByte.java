package brainFuckCore.operations;

import brainFuckCore.I.LanguageExecute;

import static brainFuckCore.BrainFuckCore.decrementByte;

public class DecrementByte implements LanguageExecute {

    public char name(){
        return '-';
    }

    public void execute() {
        decrementByte();
    }
}
