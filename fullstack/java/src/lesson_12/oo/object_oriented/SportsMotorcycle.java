package lesson_12.oo.object_oriented;

public class SportsMotorcycle extends Motorcycle {
    public int racesParticipated;

    public SportsMotorcycle(String model, int racesParticipated) {
        super(model);
        this.racesParticipated = racesParticipated;
        this.color = "Blue";
    }

    public SportsMotorcycle(String model) {
        this(model, 0);
    }
}
