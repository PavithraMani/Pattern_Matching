import java.util.*;
import java.util.regex.*;

public class PatternMatching {

	/*Matcher matcher = null;
	Pattern pattern = Pattern.compile("(.*)hello(.*)");
	matcher = pattern.matcher("hello world");
	if(matcher.matches())
		flag=true;*/

	public static void main(String[] args) {

		Matcher matcher = null;
		Scanner in = new Scanner(System.in);
		String[] G = null;
		String P[] = null;
		System.out.println("Enter the number of grids : ");
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			System.out.println("Enter the starting size of grid values : ");
			int R = in.nextInt();
			System.out.println("Enter the ending size of grid values : ");
			int C = in.nextInt();
			System.out.println("Enter the grid : ");
			G= new String[R];
			for(int G_i=0; G_i < R; G_i++){
				G[G_i] = in.next();
			}
			System.out.println("Enter the starting size of pattern : ");
			int r = in.nextInt();
			System.out.println("Enter the ending size of pattern : ");
			int c = in.nextInt();
			System.out.println("Enter the pattern : ");
			P = new String[r];
			for(int P_i=0; P_i < r; P_i++){
				P[P_i] = in.next();
			}
		}
		int flag=0;
		for(int j=0; j < P.length; j++){
			Pattern pattern = Pattern.compile("(.*)"+P[j]+"(.*)");

			for(int i=0; i<G.length;i++){

				//System.out.println(G[i]);
				matcher = pattern.matcher(G[i]);
				if(matcher.matches())
					flag=1;
			}
			if (flag==1)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}
}

