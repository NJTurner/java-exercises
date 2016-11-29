import java.util.List;
// Package visibility
// * public available to everyone
// *   package level - available to the classes inside the package

// types of methods

// * static
//       to the class: Player
//       Player.sluggingAverage();  //
// * instance
//     Player player = new Player(atBats); // creating an instance (object)
//     player.sluggingAverage();


// Object = data + operations (behaviour)

class Player {

    int[] atBats;
    List<Integer> atBatsList;
    int next = 0;

    // constructor ?
    Player(int[] atBats) {
        this.atBats = atBats;
    }

    void addAtBatBases(int basesEarned) {
        atBats[next] = basesEarned;
        next++;
    }

    // belongs to the class
    // static -> instance
    double sluggingAverage() {
        double sumOfBases = 0;
        for (int numberOfBases : atBats) {
            sumOfBases += numberOfBases;
        }
        return sumOfBases / atBats.length;
    }

    // belongs to the class
    // static -> instance
    double battingAverage() {
        double countOfHits = 0;
        for (int numberOfBases : atBats) {
            if (numberOfBases > 0) {
                countOfHits++;
            }
        }
        return countOfHits / atBats.length;
    }
}