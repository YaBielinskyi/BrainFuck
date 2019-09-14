package brainFuckCore.operations;

import brainFuckCore.I.LanguageExecute;

import static brainFuckCore.BrainFuckCore.storingValue;


public class StoringValue implements LanguageExecute {

    public char name() {
        return ',';
    }

    public void execute() {
        storingValue();
    }
}
