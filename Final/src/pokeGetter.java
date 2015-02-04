import java.util.ArrayList;
import java.util.Scanner;


public class pokeGetter
	{
		static int charizardMove;
		public static int venesaurHealth = 120;
		public static int charizardHealth = 120;
		public static int newCharizardHealth;
		public static int newVenesaurHealth;
		static String[] venesaurMoveNames = {"Razor Leaf", "Tackle", "Scratch", "Pound"};
		static String[] charizardMoveNames = {"Flamethrower", "Tackle", "Solar Beam", "Ember"};
		static int[] venesaurMoves = {20,8,12,15};
		static int[] charizardMoves = {18,6,20,12};
		private String name;
		private int health;
		private String attack1Name;
		private int attack1Damage;
		private String attack2Name;
		private int attack2Damage;
		private String attack3Name;
		private int attack3Damage;
		private String attack4Name;
		private int attack4Damage;
		
		public pokeGetter(int h, String n, String a, int b, String c, int d, String e, int f, String g, int i )
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
		
		

		private String getName()
			{
				return name;
			}



		private void setName(String name)
			{
				this.name = name;
			}



		private int getHealth()
			{
				return health;
			}



		private void setHealth(int health)
			{
				this.health = health;
			}



		private String getAttack1Name()
			{
				return attack1Name;
			}



		private void setAttack1Name(String attack1Name)
			{
				this.attack1Name = attack1Name;
			}



		private int getAttack1Damage()
			{
				return attack1Damage;
			}



		private void setAttack1Damage(int attack1Damage)
			{
				this.attack1Damage = attack1Damage;
			}



		private String getAttack2Name()
			{
				return attack2Name;
			}



		private void setAttack2Name(String attack2Name)
			{
				this.attack2Name = attack2Name;
			}



		private int getAttack2Damage()
			{
				return attack2Damage;
			}



		private void setAttack2Damage(int attack2Damage)
			{
				this.attack2Damage = attack2Damage;
			}



		private String getAttack3Name()
			{
				return attack3Name;
			}



		private void setAttack3Name(String attack3Name)
			{
				this.attack3Name = attack3Name;
			}



		private int getAttack3Damage()
			{
				return attack3Damage;
			}



		private void setAttack3Damage(int attack3Damage)
			{
				this.attack3Damage = attack3Damage;
			}



		private String getAttack4Name()
			{
				return attack4Name;
			}



		private void setAttack4Name(String attack4Name)
			{
				this.attack4Name = attack4Name;
			}



		private int getAttack4Damage()
			{
				return attack4Damage;
			}



		private void setAttack4Damage(int attack4Damage)
			{
				this.attack4Damage = attack4Damage;
			}



		public static void main(String[] args)
			{
				ArrayList <pokeGetter> roster = new ArrayList <pokeGetter>();

				roster.add(new pokeGetter (120, "Venesaur", "Razor Leaf", 20, "Tackle", 8, "Scratch", 12, "Pound", 15));
				roster.add(new pokeGetter (120, "Charizard", "Flamethrower", 18, "Tackle", 6, "Solar Beam", 20, "Ember", 12));
				
				System.out.println("Welcome get ready for your pokemon battle");
				System.out.println("1.Venesaur 2.Charizard");
				System.out.println("Choose your pokemon(pick number next to pokemon)");
				Scanner userInput = new Scanner(System.in);
				int choice = userInput.nextInt();
				for (int i=0; i<1;i++)
					{
				if (choice == 1)
					{
					pokeGetter p = new pokeGetter(120, "Venesaur", "Razor Leaf", 20, "Tackle", 8, "Scratch", 12, "Pound", 15);
					pokeGetter o = new pokeGetter(120, "Charizard", "Flamethrower", 18, "Tackle", 6, "Solar Beam", 20, "Ember", 12);
					System.out.println("You choose " + p.getName() + " and you will battle " + o.getName());
					System.out.println("Pick your move: 1.Razor Leaf 2. Tackle 3. Scratch 4.Pound");
					int move = userInput.nextInt();
					
					switch(move)
					{
						case 1:
								{
								System.out.println("Your move is " + p.getAttack1Name() + " and does "+ p.getAttack1Damage() + " damage and your opponent has " + o.setHealth(health - p.getAttack1Damage() + " health left"));
								break;
								}
						case 2:
								{
									System.out.println("Your move is " + p.getAttack2Name() + " and does "+ p.getAttack2Damage() + " damage and your opponent has " + o.setHealth(health - p.getAttack2Damage() + " health left"));
									break;
								}
						case 3:
								{
									System.out.println("Your move is " + p.attack3Name() + " and does "+ p.attack3Damage() + " damage and your opponent has " + o.setHealth(health - p.getAttack3Damage() + " health left"));
									break;
								}
						case 4:
								{
									System.out.println("Your move is " + p.attack4Name() + " and does "+ p.attack4Damage() + " damage and your opponent has " + o.setHealth(health - p.attack4Damage() + " health left"));
									break;
								
					charizardMove = (int)(Math.random() * 3) + 0 ;	
					
					switch(charizardMove)
					{
					case 1:
							{
							System.out.println("Your opponent's move is " + o.attack1Name() + " and does "+ o.attack1Damage() + " damage and you have " + p.setHealth(health - o.attack1Damage() + " health left"));
							break;
							}
					case 2:
							{
								System.out.println("Your opponent's move is " + o.attack2Name() + " and does "+ o.attack2Damage() + " damage and you have " + p.setHealth(health - o.attack2Damage() + " health left"));							
								break;
							}
					case 3:
							{
								System.out.println("Your opponent's move is " + o.attack3Name() + " and does "+ o.attack3Damage() + " damage and you have " + p.setHealth(health - o.attack3Damage() + " health left"));
								break;
							}
					case 4:
							{
								System.out.println("Your opponent's move is " + o.attack4Name() + " and does "+ o.attack4Damage() + " damage and you have " + p.setHealth(health - o.attack4Damage() + " health left"));
								break;
							}
					}
					}
					}
					}
				else if (choice == 2)
					{
					int venesaurMove;
					System.out.println("You choose Charizard you will battle Venesaur!");
					System.out.println("Pick your move: 1.Flamethrower 2.Tackle 3.Solar Beam 4.Ember");
					int move = userInput.nextInt();
					//roster.get(choice.setHealth((roster.get(choice.getHealth())-venesaurMoves[move - 1])));
					newVenesaurHealth = venesaurHealth - charizardMoves[move - 1];
					System.out.println("Your move is " + charizardMoveNames[move - 1] + " and does " + charizardMoves[move - 1] + " damage and your opponent has " + newVenesaurHealth + " health left.");
					venesaurMove = (int)(Math.random() * 3) + 0 ;
					newCharizardHealth = charizardHealth - venesaurMoves[venesaurMove];
					System.out.println("Venesaur's move is " + venesaurMoveNames[venesaurMove] + " and does " +  venesaurMoves[venesaurMove] + " damage and you have " + newCharizardHealth + " health left");
					}
					}
				}
			}
