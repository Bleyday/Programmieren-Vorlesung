
package java_09_07_21;

public class TowerOfHanoi {
    private int stackSize;
    private int[][] stacks;

    public TowerOfHanoi(int stackSize) {
        this.stackSize = stackSize;

        this.stacks = new int[3][stackSize];
        for(int i = 0; i < stackSize; i++) {
            this.stacks[0][i] = stackSize - i;
            this.stacks[1][i] = 0;
            this.stacks[2][i] = 0;
        }
    }

    public int getStackSize() {
        return stackSize;
    }

    public void solve() {
        moveStack(stackSize, 0, 1, 2);
    }

    private void moveStack(int n, int stackA, int stackB, int stackC) {
        if(n > 0) {
            moveStack(n - 1, stackA, stackC, stackB);
            moveTopPlate(stackA, stackC);
            moveStack(n - 1, stackB, stackA, stackC);
        }
    }

    private void moveTopPlate(int fromStack, int toStack) {
        // find top plate on source stack
        int fromIndex = stackSize - 1;
        while(stacks[fromStack][fromIndex] == 0) {
            fromIndex--;
            if(fromIndex < 0) return;
        }

        // find top plate on target stack
        int toIndex = stackSize - 1;
        while(stacks[toStack][toIndex] == 0) {
            toIndex--;
            if(toIndex < 0) break;
        }

        // check if draw is invalid
        if(toIndex >= 0 && stacks[fromStack][fromIndex] > stacks[toStack][toIndex]) {
            return;
        }

        // move the plate
        stacks[toStack][toIndex + 1] = stacks[fromStack][fromIndex];
        stacks[fromStack][fromIndex] = 0;

        printState();
    }

    private void printState() {
        for(int i = stackSize; i > 0; i--) {
            System.out.println(stacks[0][i - 1] + " | " + stacks[1][i - 1] + " | " + stacks[2][i - 1]);
        }
        System.out.println("----------");
    }



    public static void main(String[] args) {
        new TowerOfHanoi(20).solve();
    }
}
