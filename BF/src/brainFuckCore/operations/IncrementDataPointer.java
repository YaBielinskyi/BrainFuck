package brainFuckCore.operations;

import brainFuckCore.I.LanguageExecute;

import static brainFuckCore.BrainFuckCore.incrementDataPointer;


public class IncrementDataPointer implements LanguageExecute {

    public char name(){
        return '>';
    }

    public void execute(){
        incrementDataPointer();
    }
}
