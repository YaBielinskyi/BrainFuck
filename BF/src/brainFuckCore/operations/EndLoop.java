package brainFuckCore.operations;

import brainFuckCore.I.LanguageExecute;

import static brainFuckCore.BrainFuckCore.endLoop;

public class EndLoop implements LanguageExecute {

    public char name(){
        return ']';
    }

    public void execute() {
        endLoop();
    }
}