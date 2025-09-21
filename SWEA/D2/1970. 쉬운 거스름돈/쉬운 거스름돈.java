import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // 10으로 나눈 화폐 단위
        int[] money = {5000, 1000, 500, 100, 50, 10, 5, 1};

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());

            // 10으로 나눈 금액을 사용
            int tmpmoney = N / 10;

            int[] mincnt = new int[tmpmoney + 1];
            int[] lastcoin = new int[tmpmoney + 1];

            Arrays.fill(mincnt, Integer.MAX_VALUE - 1);
            mincnt[0] = 0;

            for (int currentAmount = 1; currentAmount <= tmpmoney; currentAmount++) {
                for (int i = 0; i < money.length; i++) {
                    int coin = money[i];
                    
                    if (currentAmount >= coin) {
                        if (mincnt[currentAmount - coin] + 1 < mincnt[currentAmount]) {
                            mincnt[currentAmount] = mincnt[currentAmount - coin] + 1;

                            lastcoin[currentAmount] = coin;
                        }
                    }
                }
            }

            int[] finalmoney = new int[8];
            int amount = tmpmoney;

            while (amount > 0) {
                int coinToCount = lastcoin[amount];

                for (int i = 0; i < money.length; i++) {
                    if (coinToCount == money[i]) {
                        finalmoney[i]++;
                        break; 
                    }
                }
                
                amount = amount - coinToCount;
            }

            System.out.println("#" + tc);
            for (int i = 0; i < finalmoney.length; i++) {
                System.out.print(finalmoney[i] + " ");
            }
            System.out.println();
        }
    }
}