import java.util.ArrayList;
public class ProgramRunner
	{
		static ArrayList <Program> TVShows = new ArrayList<Program>();
		
	public static void main(String[] args)
			{
				addArray();
				printList();
			}
	
	public static void addArray()
	{
		TVShows.add(new Program("Arrow", "Action and Superhero", 8));
		TVShows.add(new Program("Peaky Blinders", "Drama and Crime", 5));
		TVShows.add(new Program("Outer Banks", "Adventure and Mystery", 2));
		TVShows.add(new Program("Top Gear", "Comedy and Auto", 23));
		TVShows.add(new Program("Rick and Morty", "Dark Comedy and Sci-Fi", 5));
		
	}
	
	public static void printList()
	{	
		//Arrow
		System.out.println(TVShows.get(0).getTitle() + ", ");
		System.out.println(TVShows.get(0).getGenre() + ", ");
		System.out.println(TVShows.get(0).getNumberOfSeasonsAired());
		
		//Peaky Blinders
		System.out.println(TVShows.get(1).getTitle() + ", ");
		System.out.println(TVShows.get(1).getGenre() + ", ");
		System.out.println(TVShows.get(1).getNumberOfSeasonsAired());
		
		//Outer Banks
		System.out.println(TVShows.get(2).getTitle() + ", ");
		System.out.println(TVShows.get(2).getGenre() + ", ");
		System.out.println(TVShows.get(2).getNumberOfSeasonsAired());
		
		//Top Gear
		System.out.println(TVShows.get(3).getTitle() + ", ");
		System.out.println(TVShows.get(3).getGenre() + ", ");
		System.out.println(TVShows.get(3).getNumberOfSeasonsAired());
		
		//Rick and Morty
		System.out.println(TVShows.get(4).getTitle() + ", ");
		System.out.println(TVShows.get(4).getGenre() + ", ");
		System.out.println(TVShows.get(4).getNumberOfSeasonsAired());
	}

	}
