import java.util.ArrayList;
import java.util.Scanner;

	public class pokemonAttacks
	{
	public static int MultresHealth = 200;
	public static int ArticunoHealth = 200;
	public static int newMultresHealth;
	public static int newArticunoHealth;
	static String[] MultresMoveNames = {"Flamethrower", "Fly", "Tackle", "Whirlwind"};
	static String[] ArticunoMoveNames = {"Ice Beam", "Tackle", "Solar Beam", "Frostbite"};
	static int[] MultresMoves = {25,6,9,14};
	static int[] ArticunoMoves = {14,6,25,9};
	private String name;
	private static int health;
	private String attack1Name;
	private int attack1Damage;
	private String attack2Name;
	private int attack2Damage;
	private String attack3Name;
	private int attack3Damage;
	private String attack4Name;
	private int attack4Damage;
	private static ArrayList <pokemonAttacks> pokemon = new ArrayList <pokemonAttacks>();
	public pokemonAttacks(int h, String n, String a, int b, String c, int d, String e, int f, String g, int i )
		{
		health = h;
		name = n;
		attack1Name = a;
		attack1Damage = b;
		attack2Name = c;
		attack2Damage = d;
		attack3Name = e;
		attack3Damage = f;
		attack4Name = g;
		attack4Damage = i;
		}
	public static void attacks()
		{
		pokemon.add(new pokemonAttacks (120, "Multres", "Flamethrower", 25, "Fly", 6, "Tackle", 9, "Whirlwind", 14));
		pokemon.add(new pokemonAttacks (120, "Charizard", "Ice Beam", 14, "Tackle", 6, "Solar Beam", 25, "Ember", 9));
		System.out.println("Which pokemon do you choose(pick number next to pokemon)");
		System.out.println("1.Venesaur 2.Charizard");
		Scanner userInput = new Scanner(System.in);
		int choice = userInput.nextInt();
		
		if (choice == 1)
			{
			pokemonAttacks player = new pokemonAttacks (120, "Multres", "Flamethrower", 25, "Fly", 6, "Tackle", 9, "Whirlwind", 14);
			pokemonAttacks opponent = new pokemonAttacks (120, "Charizard", "Ice Beam", 14, "Tackle", 6, "Solar Beam", 25, "Ember", 9);
			System.out.println("You choose " + player.getName() + " and you will battle " + opponent.getName());
			System.out.println("Pick your move: 1.Flamethrower 2. Fly 3. Tackle 4.Whirlwind");
			int move = userInput.nextInt();
			switch(move)
			{
				case 1:
						{
						System.out.println("Your move is " + player.getAttack1Name() + " and does "+ player.getAttack1Damage() + " damage and your opponent has " + opponent.setHealth(health - player.getAttack1Damage() + " health left"));
						break;
						}
				case 2:
						{
							System.out.println("Your move is " + player.getAttack2Name() + " and does "+ player.getAttack2Damage() + " damage and your opponent has " + opponent.setHealth(health - player.getAttack2Damage() + " health left"));
							break;
						}
				case 3:
						{
							System.out.println("Your move is " + player.getAttack3Name() + " and does "+ player.getAttack3Damage() + " damage and your opponent has " + opponent.setHealth(health - player.getAttack3Damage() + " health left"));
							break;
						}
				case 4:
						{
							System.out.println("Your move is " + player.getAttack4Name() + " and does "+ player.getAttack4Damage() + " damage and your opponent has " + opponent.setHealth(health - player.getAttack4Damage() + " health left"));
							break;	
						}
			}
		
	public String getName()
		{
		return name;
		}
	public void setName(String name)
		{
		this.name = name;
		}
	public static int getHealth()
		{
		return health;
		}
	public static void setHealth(int health)
		{
		pokemonAttacks.health = health;
		}
	public String getAttack1Name()
		{
		return attack1Name;
		}
	public void setAttack1Name(String attack1Name)
		{
		this.attack1Name = attack1Name;
		}
	public int getAttack1Damage()
		{
		return attack1Damage;
		}
	public void setAttack1Damage(int attack1Damage)
		{
		this.attack1Damage = attack1Damage;
		}
	public String getAttack2Name()
		{
		return attack2Name;
		}
	public void setAttack2Name(String attack2Name)
		{
		this.attack2Name = attack2Name;
		}
	public int getAttack2Damage()
		{
		return attack2Damage;
		}
	public void setAttack2Damage(int attack2Damage)
		{
		this.attack2Damage = attack2Damage;
		}
	public String getAttack3Name()
		{
		return attack3Name;
		}
	public void setAttack3Name(String attack3Name)
		{
		this.attack3Name = attack3Name;
		}
	public int getAttack3Damage()
		{
		return attack3Damage;
		}
	public void setAttack3Damage(int attack3Damage)
		{
		this.attack3Damage = attack3Damage;
		}
	public String getAttack4Name()
		{
		return attack4Name;
		}
	public void setAttack4Name(String attack4Name)
		{
		this.attack4Name = attack4Name;
		}
	public int getAttack4Damage()
		{
		return attack4Damage;
		}
	public void setAttack4Damage(int attack4Damage)
		{
		this.attack4Damage = attack4Damage;
		}
	public static void attack()
		{
			
		}

	}
