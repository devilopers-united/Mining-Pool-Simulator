import java.io.*;
import java.util.Date;

// Make Block serializable
class Block implements Serializable {
    //Add variables that hold the current and the previous block hashes, holds some blockchain data, nonce and timestamp.

    // Block Constructor.
    public Block(String data, String previousHash) {
    //assign variables in this method to the variables declared above using a special keyword.
    }

    // Calculate new hash based on blocks contents
    public String calculateHash() {
        
    }

    // Increases nonce value until hash target is reached.
    public void mineBlock(int difficulty) {
    // Loop until the hash's leading characters match the difficulty target.
    }
}