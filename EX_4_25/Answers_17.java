package EX_4_25;

//The loop starts with count = 1 and continues while count <= 10.
//Each time through the loop:
//If count is odd (count % 2 == 1), it prints "****".
//If count is even, it prints "++++++++".

public class Answers_17 {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 10) {
            System.out.println(count % 2 == 1 ? "****" : "++++++++");
            ++count;
        }
    }
}

//Output:
//****
//++++++++
//****
//++++++++
//****
//++++++++
//****
//++++++++
//****
//++++++++