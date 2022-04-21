# CMPT 276 Group 15
## Grave Robber Overview

Grave Robber is a 2 dimensional top down computer game where the main character is a grave robber who runs away from skeletons and zombies in a graveyard while digging for treasure found in the graves. 
There are all kinds of treasures and traps in Grave Robber that the player will encounter. 
The main character can be moved up, down, left, or right by arrow keys on the user’s keyboard. 
The player will have a score and elapsed play time visible in the top left corner of the screen.
After the player gathers all the red hearts they may exit through the top right of the map.

### Maven Test
To run all the unit tests perform one of the two options. 
1. If this is your first time, use the command `mvn clean install`
2. Otherwise, use: `mvn test`

### Running the Game
To build the game simply enter the following command: `mvn clean package`.
In the main directory then execute the following command to run the game: `java -jar target/grave-robber-jar-with-dependencies.jar`

### JAVADOCS
For After executing `mvn clean package` Javadocs can be found in the target/apidocs folder.

### .jar PATH
Grave-Robber/out/artifacts/cmpt276_group_15_jar/
