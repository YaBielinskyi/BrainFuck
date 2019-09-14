package brainFuckCore.operations;

import brainFuckCore.I.LanguageExecute;

import static brainFuckCore.BrainFuckCore.decrementDataPointer;


public class DecrementDataPointer implements LanguageExecute {

    public char name() {
        return '<';
    }

    public void execute(){
        decrementDataPointer();
    }
}
