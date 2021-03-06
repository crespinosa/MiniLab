

/*
 * Songs class
 */
public class Songs extends Generics {	
	/* fields
	 * 
	 */
	public static final String type = "Songs";
	public enum KeyType {combo, songName, yearReleased, artist};
	public static KeyType key = KeyType.combo;
	private String songName; 
	private int yearReleased; 
	private String artist;
	
	/* constructor
	 * 
	 */
	public Songs(String songName, int yearReleased, String artist)
	{
		this.setType(type);
		this.songName = songName; 
		this.yearReleased = yearReleased; 
		this.artist = artist; 
	}
	
	/* 
	 * toString provides output based off of this.key setting
	 */
	@Override
	public String toString()
	{
		String output="";
		switch(key) {
		case songName:
			output += this.songName;
			break;
		case yearReleased:
			output += "000" + this.yearReleased;
			output = output.substring(output.length()-3);
			break;
		case artist:
			output += this.artist;
			break;
		case combo:
		default:
			output += type + ": " + this.songName  + ", " + this.artist + ", " + this.yearReleased; 
		}
		return output;
		
	}
	
	/* Initialize Songs data
	 * 
	 */
	public static Generics[] songsData() {
		Generics[] ad = { 
				new Songs("10/10", 2019, "Rex Orange County"),
				new Songs("Amy", 2012, "Green Day"),
				new Songs("My Own Worst Enemy", 1999, "Lit"),
				new Songs("RACECAR", 2018, "Aries"),
				new Songs("Scared to Live", 2020, "The Weekend"),
				new Songs("Welcome to the Black Parade", 2006, "My Chemical Romance")
		};
		return ad;
	}
	
	/* main to test Song class
	 * 
	 */
	public static void main(String[] args)
	{
		Generics[] ad = songsData();
		for(Generics a : ad)
			System.out.println(a);
	}

}
