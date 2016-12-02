package game;

public class RockPlayer extends Player {
    @Override
    public String generateRoshambo() {
        return Roshambo.ROCK.toString(); //this one always returns rock
    }
}