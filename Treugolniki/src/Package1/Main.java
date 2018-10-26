package Package1;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 21; i++){
            if ( i < 10) {
                for (int j = 0; j < i; j++) {
                    System.out.print("█");
                }
                System.out.println("█");
            }
            else{
                for (int j = i - 10; j < 10; j++){
                    System.out.print("█");
                }
                System.out.println("█");
            }
        }
        System.out.println("");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 10 - i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++){
            for (int j = i; j < 9; j++){
                System.out.print(" ");
            }
            for (int j = i+1; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++){
            for (int j = i; j < 9; j++){
                System.out.print(" ");
            }
            for (int j = i+1; j > 0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < 10 - i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                for (int j = i; j < 9; j++) {
                    System.out.print(" ");
                }
                for (int j = i + 1; j > 0; j--) {
                    System.out.print("*");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } else {
                for (int j = i - 10; j < 9; j++) {
                    System.out.print(" ");
                }
                for (int j = i + 1 - 10; j > 0; j--) {
                    System.out.print("*");
                }
                for (int j = 0; j < i - 10; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
            System.out.println("");
            for (int i = 0; i < 30; i++) {
                if (i < 10) {
                    System.out.print("  ");
                    for (int j = i; j < 9; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i + 1; j > 0; j--) {
                        System.out.print("*");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                else if (i < 20){
                    if (i !=19 ){
                        System.out.print("  ");
                    }
                    else if (i == 19){
                        System.out.print(" ");
                    }
                    for (int j = i - 9; j < 9; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i + 1 - 9; j > 0; j--) {
                        System.out.print("*");
                    }
                    for (int j = 0; j < i - 9; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                else{
                    if (i == 28){
                        System.out.print(" ");
                    }
                    else if (i == 29){
                        System.out.print("");
                    }
                    else{
                        System.out.print("  ");
                    }
                    for (int j = i - 18; j < 9; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i + 1 - 18; j > 0; j--) {
                        System.out.print("*");
                    }
                    for (int j = 0; j < i - 18; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
    }
}
