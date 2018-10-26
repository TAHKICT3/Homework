package T5;

public class Main {

    public static void main(String[] args) {
        int s = 0;
	    for (int i = 21; i < 100; i++){
            if (i % 3 == 0 && (i % 10 == 2 || i % 10 == 4 || i % 10 == 8)){
                s+=i;
            }
        }
        System.out.print(s);
    }
}
