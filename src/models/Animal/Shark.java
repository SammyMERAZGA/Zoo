package models.Animal;

public class Shark extends Animal {

    // Un requin n'est pas un mammifère (c'est un poisson) mais c'est un animal qui met bas (il ne fait pas d'oeufs).
    // Le temps de gestation du requin est d'environ au minimum 42 mois.

    // attributes
    private byte durationGestationShark; // (ex: 20 (mois))

    // constructor
    public Shark(String name, String sex, double weight, double size, boolean hungerIndicator, boolean sleepIndicator, boolean healthIndicator, byte durationGestationShark) {
        super(name, sex, weight, size, hungerIndicator, sleepIndicator, healthIndicator);
        this.durationGestationShark = durationGestationShark;
    }

    // getters
    public byte getDurationGestationShark() {
        return durationGestationShark;
    }

    // setters
    public void setDurationGestationShark(byte durationGestationShark) {
        this.durationGestationShark = durationGestationShark;
    }

    // methods
    public void giveBirth() {
        if(super.getSex().equals("Female") && this.getDurationGestationShark() > 42) {
            System.out.println("Le requin femelle vient de mettre bas !");
        }
    }
}
