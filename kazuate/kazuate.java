package kazuate;

import java.util.Scanner;
import java.lang.Math;

class Kazuate{
    private static final int correctNum = 27;

    private static int readInt() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.println("２桁の正の整数を予想してください：");
            num = scanner.nextInt();
            
            if (10 <= num & num < 100) {
                return num;
            }              
        }
    }

    private static void doGame() {
        for (int i = 5; i > 0; i) {
            System.out.println("チャンス：残り" + i + "回");
            int userNum = readInt();
        
            if (userNum < correctNum) {
                System.out.println("予想された値が正解の値より小さいです。");
            } 
            else if (userNum > correctNum) {
                System.out.println("予想された値が正解の値より大きいです。");
            }
            else {
                System.out.println("正解です。");
                return;
            }

            if (20 <= Math.abs(correctNum - userNum)) {
                System.out.println("正解との差が20以上あります。");;
            }
        }
    }

    public static void main(String[] args){
        doGame();
    }
}
