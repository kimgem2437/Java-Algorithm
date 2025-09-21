import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();


        int[] directions = new int[6];
        int[] lengths = new int[6];

        int maxH = 0;
        int maxV = 0;
        int maxH_idx = -1;
        int maxV_idx = -1;

        for (int i = 0; i < 6; i++) {
            directions[i] = sc.nextInt();
            lengths[i] = sc.nextInt();

            if (directions[i] == 1 || directions[i] == 2) {
                if (lengths[i] > maxH) {
                    maxH = lengths[i];
                    maxH_idx = i;
                }
            } 
            else {
                if (lengths[i] > maxV) {
                    maxV = lengths[i];
                    maxV_idx = i;
                }
            }
        }

        int largeArea = maxH * maxV;

        int smallWidth = lengths[(maxV_idx + 3) % 6];

        int smallHeight = lengths[(maxH_idx + 3) % 6];

        int smallArea = smallWidth * smallHeight;
        
        int finalArea = largeArea - smallArea;
        
        System.out.println(finalArea * K);
        
        sc.close();
    }
}