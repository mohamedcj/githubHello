package githubHello;

public class GitHubHello {

	public static void main(String[] args) {
		String[] names = {"Abdessalam","Maryem", "Selsabil", "Sirine", "Beya", "Yacine", "Sara", "Mohammed Aziz", "Sophia" };

		// a greeting msg pour les bons amis !!!
		for(String name : names){
			System.out.println("Hi my name is: " + name);
			System.out.println("How ate you today?");
			System.out.println(aplus());
		}

	}
	
	private static String aplus(){
		return "Au revoir.";
	}

}
