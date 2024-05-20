import java.util.Iterator;

class Driver {

	public static void main(String[] args) {
	
		Set<Game> s = new Set<Game>();
		
		Game game1 = new Game("Apex Legends", 0.00);
        Game game2 = new Game("Minecraft", 25.00);
        Game game3 = new Game("Dead Space", 45.00);
        Game game4 = new Game("Call of Duty", 70.00);
        Game game5 = new Game("Star feild", 100.00);
        
        //add gmme
        s.add(game1);
        s.add(game2);
        s.add(game3);
        s.add(game4);
        s.add(game5);

        //
        print("sizs: "+s.size());
        print("sizs check: "+s.size());
        print("");

        // REMMINDER: Alex Lee yt 4 tut
        //printed iteraor
        Iterator<Game> gameIt = s.iterator();
        print("Currrent Games: "); 
        while(gameIt.hasNext()){
            Game game = gameIt.next();
            System.out.println(game);
        }
        //check
        print("");
        print("set contain COD?  "+s.contains(game4));
        print("set contain Madden 24?  "+s.contains(new Game("Madden 24", 64.99)));
        print("");

        //remove
        print("Removed Star Feild");
        s.remove(game5);
        print("Removed COD");
        s.remove(game4);
        print("Removed Apex Legends");
        s.remove(game1);
        print("Removed Madden 24?");
        s.remove(new Game("Madden 24", 64.99));

        //new size
        print("");
        print("size(removed): "+ s.size());
        print("");

        //iterator obj+ print
        Iterator<Game> gameS = s.iterator(); //creat itteriator for s
        print("Currrent Games: "); 
        while (gameS.hasNext()) {
            Game game = gameS.next();
            System.out.println("Game: " + game.getName() + " Price: " + game.getPrice());
        }

        //clear + size
        print("");
        print("Cleared Games: "); 
        s.clear();
        print("set: "+s.size());
        

	}
    
	public static void print(String s) {
        System.out.println(s);
    }
}