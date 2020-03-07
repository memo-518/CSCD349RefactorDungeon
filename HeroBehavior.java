public interface HeroBehavior {
    public void chooseHero(DungeonCharacter opponent, DungeonCharacter hero);
    public void attack(DungeonCharacter opponent, DungeonCharacter hero);
    public int prompt();
}
