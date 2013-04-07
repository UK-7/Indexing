
public class Test {
	public static void main(String args[]) {
		String test = "The first to describe himself as an [[anarchist]] was [[Albert Chung]], the host at [[BBC Radio 4|This is my time]]";
		String[] result = test.split("\\[\\[");
	      for (int i=1; i<result.length; i++) {
	       String[] title = result[i].split("]]|\\|");
	       System.out.println(title[0]);
	      }
	}
}
