
public class OgreMonster implements MonsterBehavior {
    public OgreMonster(){}

    public void attack(DungeonCharacter opponent, DungeonCharacter monster) {
        System.out.println(monster.name + " slowly swings a club toward's " +
							opponent.getName() + ":");

    }
}
