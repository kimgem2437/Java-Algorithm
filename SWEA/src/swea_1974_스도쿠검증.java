package Im_Test;

import java.util.Scanner;

public class swea_1974_스도쿠검증 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			int T = sc.nextInt();
			
			for(int t = 1; t <= T; t++) {
				
				int N = 9;
				
				int[][] sdk = new int[N][N];
				
				//스도쿠 값을 받는다.
				for(int r = 0; r < N; r++) {
					for(int c = 0; c < N; c++) {
						sdk[r][c] = sc.nextInt();
					}
				}
				
				//중복값이 있는지 확인 하기 위한 boolean
				boolean isok = true;
				
				
				// 3x3 정사각형
				// 3칸씩 띄어서 값을 구해야 하기 때문에 +=3을 해준다.
				for(int r = 0; r < N; r += 3) {
					for(int c = 0; c < N; c += 3) {
						//3x3만 따로 계산한다.
						int[] square = new int[N + 1];
						
						//3x3이기 때문에 3전까지 값을 구하고 중복값이 있는지 확인하기 위한 square에 담는다.
						for(int i = 0; i < 3; i++) {
							for(int j = 0; j < 3; j++) {
								square[sdk[i + r][j + c]] = sdk[i + r][j + c];
							}
						}
						//3x3을 계산을 한 후 square에 값이 1~9까지 다 들어 있는지 확인, 중복값이 있다면 한칸이 비어있기 때문에 0이 출력 그러면  false로 바꾼다.
						for(int i = 1; i < N + 1; i++) {
							if(square[i] == 0) {
								isok = false;
							}
						}
					}
					}
				

				//가로
				if(isok == true) {
				for(int r = 0; r < N; r++) {
					int[] num = new int[N + 1];
					
					
					for(int c = 0; c < N; c++) {
						num[sdk[r][c]] = sdk[r][c];
						
						}
					//위에 가로 값을 num배열에 담고, 중복값이 존재하다면 주어지지 않았던 어느 한 값이 주어지지 않아서 0인 상태로 있기 때문에 false로 바꾼다.
					for(int i = 1; i < N + 1; i++) {
						if(num[i] == 0) {
							isok = false;
						}
					}
				}
				}	
				
				//세로
				if(isok == true) {
				for(int c = 0; c < N; c++) {
					int[] num = new int[N + 1];
					
					for(int r = 0; r < N; r++) {
						num[sdk[r][c]] = sdk[r][c];
						
						
					}
					//위에 세로 값을 num배열에 담고, 중복값이 존재하다면 주어지지 않았던 어느 한 값이 주어지지 않아서 0인 상태로 있기 때문에 false로 바꾼다.
					for(int i = 1; i < N + 1; i++) {
						if(num[i] == 0) {
							isok = false;
						}
					}
					}
				}
				
				//중복값이 없었다면 true로 존재하기 때문에 1을 출력, 그게 아니라면 0을 출력한다.
				if(isok == true) {
					System.out.println("#" + t + " " + 1);
				} else {
					System.out.println("#" + t + " " + 0);
				}
				
			} // Test case
	} // main
}
 