/**
 * Write code in runJerooCode() to have a single Jeroo 
 * put a flower at (0,0), (1,1), (2,2) and (3,3).
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *      turn(LEFT)
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
  //      new JerooGUI();
        runJerooCode();
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
      Jeroo Kris = new Jeroo(0, 0, EAST, 4);
  Kris.plant();
  Kris.turn(LEFT);
  Kris.turn(LEFT);
  Kris.turn(LEFT);
  Kris.hop();
  Kris.turn(LEFT);
  Kris.hop();
  Kris.plant();
  Kris.turn(LEFT);
  Kris.turn(LEFT);
  Kris.turn(LEFT);
  Kris.hop();
  Kris.turn(LEFT);
  Kris.hop();
  Kris.plant();
  Kris.turn(LEFT);
  Kris.turn(LEFT);
  Kris.turn(LEFT);
  Kris.hop();
  Kris.turn(LEFT);
  Kris.hop();
  Kris.plant();
  Kris.hop();
    }

}
