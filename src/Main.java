public class Main {
    public static void main(String[] args) {
    Boss villain = new Boss();
    villain.setDamage(50);
    villain.setHealth(700);
    villain.setProtection("Magic shield");

        System.out.println("Boss : " );
        System.out.println(" Health: " + villain.getHealth() + " Damage: " + " Protection: " + villain.getProtection());


        Hero[] heroes = createHeroes();
        System.out.print("Information about heroes: ");
        for (Hero hero: heroes) {
            System.out.println("Health; " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Super power: " + hero.getPower());
        }
    }


    public static Hero[] createHeroes (){
        Hero hero1 = new Hero(100,15,"Telekinesis");
        Hero hero2 = new Hero(150,20);
        Hero hero3 = new Hero(200,25);
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}