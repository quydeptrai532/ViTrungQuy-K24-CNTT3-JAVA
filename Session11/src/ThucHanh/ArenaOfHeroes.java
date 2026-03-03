package ThucHanh;

import java.util.ArrayList;
import java.util.List;

interface ISkill {
    void useUltimate(GameCharacter target);
}

abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int attackPower;
    public static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int amount) {
        hp -= amount;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " đã bị hạ gục!");
        } else {
            System.out.println(name + " mất " + amount + " máu. HP còn: " + hp);
        }
    }

    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp);
    }
}

class Warrior extends GameCharacter implements ISkill {
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Chiến binh] " + name + " tấn công " + target.getName() + "!");
        target.takeDamage(attackPower);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println("[Chiến binh] " + name + " dùng chiêu 'Đấm ngàn cân'!");
        int damage = attackPower * 2;
        target.takeDamage(damage);

        int selfDamage = (int) (hp * 0.1);
        hp -= selfDamage;
        System.out.println(name + " mất " + selfDamage + " HP do gắng sức!");
    }

    @Override
    public void takeDamage(int amount) {
        int reducedDamage = amount - armor;
        if (reducedDamage < 0) reducedDamage = 0;
        super.takeDamage(reducedDamage);
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Giáp: " + armor);
    }
}

class Mage extends GameCharacter implements ISkill {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Pháp sư] " + name + " tấn công " + target.getName() + "!");
        if (mana >= 5) {
            mana -= 5;
            target.takeDamage(attackPower);
            System.out.println(name + " tốn 5 mana. Mana còn: " + mana);
        } else {
            int damage = attackPower / 2;
            target.takeDamage(damage);
            System.out.println(name + " hết mana! Sát thương giảm còn một nửa.");
        }
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println("[Pháp sư] " + name + " dùng chiêu 'Hỏa cầu'!");
        if (mana >= 50) {
            mana -= 50;
            target.takeDamage(attackPower * 2);
            System.out.println(name + " tốn 50 mana. Mana còn: " + mana);
        } else {
            System.out.println("Không đủ mana để dùng chiêu cuối!");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Tên: " + name + " | HP: " + hp + " | Mana: " + mana);
    }
}

public class ArenaOfHeroes {

    public static void main(String[] args) {

        System.out.println("=== ARENA OF HEROES ===");

        List<GameCharacter> characters = new ArrayList<>();

        Warrior yasuo = new Warrior("Yasuo", 500, 50, 20);
        Mage veigar = new Mage("Veigar", 400, 40, 200);

        GameCharacter goblin = new GameCharacter("Goblin", 100, 10) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("[Quái vật] Goblin tấn công!");
                System.out.println("Goblin cắn trộm " + target.getName() + "...");
                target.takeDamage(10);
            }
        };

        characters.add(yasuo);
        characters.add(veigar);
        characters.add(goblin);

        System.out.println("Đã khởi tạo " + GameCharacter.count + " nhân vật tham gia đấu trường.\n");

        yasuo.attack(goblin);
        System.out.println();

        veigar.useUltimate(yasuo);
        System.out.println();

        goblin.attack(veigar);
        System.out.println();

        System.out.println("=== THÔNG SỐ SAU LƯỢT ĐẤU ===");
        for (GameCharacter character : characters) {
            character.displayInfo();
        }

        System.out.println("\nTổng số nhân vật đã tạo: " + GameCharacter.count);
    }
}
