import java.util.Arrays;

public class BracketStack {
    private char[] array;
    private int size;
    private int index = 0;
    public BracketStack(int size) {
        this.size = size;
        array = new char[this.size];
    }
    private void ensureSize() {
        int newSize = this.size*2;
        if (index==size) {
            array = Arrays.copyOf(array,newSize);
        }
    }
    public void push(char element) {
        ensureSize();
        array[index] = element;
        index++;
    }
    private boolean isEmpty() {
        if (index == 0) {
            return true;
        }
        return false;
    }
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is null");
        } else {
            array[index] = ' ';
            index--;
        }
    }
    public boolean checkSymbol() {
        int countLeft = 0;
        int countRight = 0;
        for (int i =0;i<=array.length && i+1<index;i++) {
            if (array[i]=='(' && array[i+1] == ')') {
                return false;
            }
            if (array[i]=='(') {
                countLeft++;
            }
            if (array[i]==')') {
                countRight++;
            }
        }
        if (countLeft==countRight) {
            return true;
        } else {
            return false;
        }
    }
}
