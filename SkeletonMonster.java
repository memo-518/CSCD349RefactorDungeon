public class SkeletonMonster implements MonsterBehavior {
    public SkeletonMonster(){}

    public void attack(DungeonCharacter opponent, DungeonCharacter monster) {
        System.out.println(monster.name + " slices his rusty blade at " +
                            opponent.getName() + ":");
    }
}
