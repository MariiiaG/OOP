package OOP.Lec1.Ex06;

import java.util.Random;

public class BaseHero {
    protected static int number; // protected means it's available within this class and all classes that inherit from it  
    protected static Random r;

    protected String name;
    protected int hp; // здоровье
    protected int maxHp;

    static { // инициализатор статических полей
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }
 
    public BaseHero(String name, int hp) { // конструктор. Отвечает за инициализацию имени и здоровья
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() { // конструктор по умолчанию
        this(String.format("Hero_Priest #%d", ++BaseHero.number),
        BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() { // получение информации
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }
    
    public void healed(int Hp) { // метод лечения
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) { // метод нанесения атаки
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}
