abstract class Weapon {
    public abstract void attack();
}

class Knife extends Weapon {
    public void attack() {
        System.out.println("Knife attacks!");
    }
}

class Gun extends Weapon {
    private int bullets;

    public Gun(int bullets) {
        this.bullets = bullets;
    }

    public void attack() {
        if (bullets > 0) {
            bullets--;
            System.out.println("Gun fires! Bullets left: " + bullets);
        } else {
            System.out.println("No bullets left.");
        }
    }
}

public class WeaponProgram {
    public static void main(String[] args) {
        System.out.println("Testing Weapon...");
        Weapon knife = new Knife();
        Weapon gun = new Gun(2);

        knife.attack();
        gun.attack();
        gun.attack();
        gun.attack();
    }
}
