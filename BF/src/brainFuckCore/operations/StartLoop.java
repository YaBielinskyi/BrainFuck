package brainFuckCore.operations;

import brainFuckCore.I.LanguageExecute;

import static brainFuckCore.BrainFuckCore.startLoop;

public class StartLoop implements LanguageExecute {

    public char name(){
        return '[';
    }

    public void execute() {
        startLoop();
    }
}