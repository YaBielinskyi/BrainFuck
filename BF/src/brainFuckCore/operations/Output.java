package brainFuckCore.operations;

import brainFuckCore.I.LanguageExecute;

import static brainFuckCore.BrainFuckCore.output;

public class Output implements LanguageExecute {

    public char name() {
        return '.';
    }

    public void execute() {
        output();
    }
}
