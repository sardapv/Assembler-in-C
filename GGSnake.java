// GGSnake.java

import ch.aplu.jgamegrid.*;
import java.awt.Color;

public class GGSnake extends GameGrid
{
  private int startingSpeed = 150;
  private int gameNb = 1;

  public GGSnake()
  {
    super(20, 20, 20, null, false);
    setBgColor(new Color(255, 255, 255));
    reset();
    show();
    doRun();
  }

  public void reset()
  {
    removeAllActors();
    if (gameNb == 6)
      gameNb = 1;
    setSimulationPeriod(startingSpeed - 50 * gameNb);
    setTitle("Hey!! Help me catch my Food!!Yumm..");
    gameNb++;
    Snake snake = new Snake();
    addActor(snake, new Location(10, 10));
    addActor(new Food(), getRandomEmptyLocation());
    snake.setDirection(Location.EAST);
  }

  public static void main(String[] args)
  {
    new GGSnake();
  }
}
