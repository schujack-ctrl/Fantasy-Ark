public class Battle
{
  private Enemy enemy;
  private Player player;
  
  public Battle(Enemy enemy, Player player)
  {
    this.player = player;
    this.enemy = enemy;
  }

	public void run()
	{
		int playerTime = 0;
		int enemyTime = 0;

		while(enemy.getCurrentHP() > 0 && player.getCurrentHealth() > 0)
		{
			playerTime += player.getSpeed();
			enemyTime += enemy.getSpeed();

			if(playerTime >= 100)
			{
				System.out.println("What would you like ");
				Main.getInput();
			}

			if(enemyTime >= 100 && enemy.getCurrentHP() > 0)
			{
				player.hurt(enemy.getAttack());
			}

		}
	}
}