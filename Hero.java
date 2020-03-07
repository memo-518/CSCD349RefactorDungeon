

public class Hero extends DungeonCharacter
{
	protected double chanceToBlock;
	protected int numTurns;
	protected HeroBehavior hero;


  public Hero(String name, int hitPoints, int attackSpeed,
				     double chanceToHit, int damageMin, int damageMax,
					 double chanceToBlock)
  	{
	  	super(name, hitPoints, attackSpeed, chanceToHit, damageMin, damageMax);
	  		this.chanceToBlock = chanceToBlock;
	  		readName();
  	}


  public void readName() {
		System.out.print("Enter character name: ");
		name = Keyboard.readString();
  }//end readName method


  public boolean defend() {
		return Math.random() <= chanceToBlock;
  }//end defend method

  public void attack(DungeonCharacter that) {
	  hero.attack(that, this);
	  super.attack(that);
  }

  public void performAbility(DungeonCharacter that) {
	  hero.chooseHero(that, this);
  }


public void subtractHitPoints(int hitPoints)
	{
		if (defend()){
			System.out.println(getName() + " BLOCKED the attack!");
		}
		else{
			super.subtractHitPoints(hitPoints);
		}


	}//end method


	public void battleChoices(DungeonCharacter that){
	    numTurns = attackSpeed/that.getAttackSpeed();
	    
		if (numTurns == 0)
			numTurns++;
		System.out.println("Number of turns this round is: " + numTurns);

		int choice;
		do{
		    choice = hero.prompt();
		    switch (choice) {
			    case 1: attack(that);
			        break;
			    case 2: hero.chooseHero(that, this);
			        break;
			    default:
			        System.out.println("invalid choice!");
		    }//end switch

			numTurns--;
			if (numTurns > 0)
			    System.out.println("Number of turns remaining is: " + numTurns);

		} while(numTurns > 0);

	}//end battleChoices

	public void setHeroBehavior(HeroBehavior hero) {
		this.hero = hero;
	}
	public void increaseTurns() {
		numTurns++;
	}

	public String getName() {
		return this.name;
	}

}//end Hero class
