import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Binary-search based guessing player.
 * This player is for task C.
 * <p>
 * You may implement/extend other interfaces or classes, but ensure ultimately
 * that this class implements the Player interface (directly or indirectly).
 */
public class BinaryGuessPlayer implements Player {

    HashMap<String, Tree> attributeCollection = new HashMap<>();
    HashMap<String, Boolean> hasAttributeMap = new HashMap<>();
    HashMap<String, Person> peopleMap = new HashMap<>();
    Person currentPlayer;

    /**
     * Loads the game configuration from gameFilename, and also store the chosen
     * person.
     *
     * @param gameFilename Filename of game configuration.
     * @param chosenName   Name of the chosen person for this player.
     * @throws IOException If there are IO issues with loading of gameFilename.
     *                     Note you can handle IOException within the constructor and remove
     *                     the "throws IOException" method specification, but make sure your
     *                     implementation exits gracefully if an IOException is thrown.
     */
    public BinaryGuessPlayer(String gameFilename, String chosenName) {
        int lineCounter = 0;
        try {
            BufferedReader assignedReader = new BufferedReader(new FileReader(gameFilename));
            String line = null;
            while ((line = assignedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }


        //assign the current player to one of the inputted players.
        this.currentPlayer = peopleMap.get(chosenName);


    } // end of BinaryGuessPlayer()


    public Guess guess() {

        // placeholder, replace
        return new Guess(Guess.GuessType.Person, "", "Placeholder");
    } // end of guess()


    public boolean answer(Guess currGuess) {


        // placeholder, replace
        return false;
    } // end of answer()


    public boolean receiveAnswer(Guess currGuess, boolean answer) {
        // placeholder, replace
        return true;
    } // end of receiveAnswer()

} // end of class BinaryGuessPlayer