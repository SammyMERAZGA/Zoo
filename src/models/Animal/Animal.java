package models.Animal;

public abstract class Animal {

    // attributes
    private String name; // (ex: "lion")
    private String sex; // (ex: "Female")
    private double weight; // (ex: 130.2)
    private double size; // (ex: 1,6)
    private boolean hungerIndicator; // (ex: false)
    private boolean sleepIndicator; // (ex: true)
    private boolean healthIndicator; // (ex: true)

    // constructor
    public Animal(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthIndicator) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
        this.hungerIndicator = hungerIndicator;
        this.sleepIndicator = sleepIndicator;
        this.healthIndicator = healthIndicator;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public double getWeight() {
        return weight;
    }

    public double getSize() {
        return size;
    }

    public boolean getHungerIndicator() {
        return hungerIndicator;
    }

    public boolean getSleepIndicator() {
        return sleepIndicator;
    }

    public boolean getHealthIndicator() {
        return healthIndicator;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setHungerIndicator(boolean hungerIndicator) {
        this.hungerIndicator = hungerIndicator;
    }

    public void setSleepIndicator(boolean sleepIndicator) {
        this.sleepIndicator = sleepIndicator;
    }

    public void setHealthIndicator(boolean healthIndicator) {
        this.healthIndicator = healthIndicator;
    }

    // methods
    public void eat() {
        if(hungerIndicator == true) {
            System.out.println(this.name + " est en train de manger");
            this.hungerIndicator = false;
            System.out.println(this.name + " n'a plus faim");
        }
    }

    public void makeSound() {
        System.out.println(this.name + " est en train d'émettre un son");
    }

    public void beCared() {
        if(healthIndicator == false) {
            System.out.println(this.name + " est en train d'être soigné");
            this.healthIndicator = true;
            System.out.println(this.name + " est de nouveau en bonne santé");
        }
    }

    public void sleep() {
        if(sleepIndicator == false) {
            System.out.println(this.name + " est en train de dormir");
            this.sleepIndicator = true;
        }
    }

    public void wakeUp() {
        if(sleepIndicator == true) {
            System.out.println(this.name + " vient tout juste de se réveiller");
            this.sleepIndicator = false;
        }
    }
}