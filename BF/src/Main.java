import brainFuckCore.BrainFuckCore;

public class Main {
    public static void main(String[] args) {
        BrainFuckCore brainFuckCore = new BrainFuckCore("++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>.");
        System.out.println(brainFuckCore.interprete());
    }
}
