public class GremlinMonster implements MonsterBehavior {
    public GremlinMonster(){}

    public void attack(DungeonCharacter opponent, DungeonCharacter monster) {
        System.out.println(monster.name + " jabs his kris at " +
                            opponent.getName() + ":");
    }
}
