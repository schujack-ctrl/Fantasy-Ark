public class BaseStats
{
	//	--------------------------------------
	//	Properties
	private int baseHealth;
	private int baseAttack;
	private int baseDefense;
	private int baseSpecialAttack;
	private int baseSpecialDefense;
	private int baseSpeed;
  private int baseMana;

	public BaseStats(int baseHealth, int baseAttack, int baseDefense, int baseSpecialAttack, int baseSepcialDefense, int baseSpeed, int baseMana)
	{
		this.baseHealth = baseHealth;
		this.baseAttack = baseAttack;
		this.baseDefense = baseDefense;
		this.baseSpecialAttack = baseSpecialAttack;
		this.baseSpecialDefense = baseSpecialDefense;
		this.baseSpeed = baseSpeed;
		this.baseMana = baseMana;
	}

	public void setStats(Player player)
	{
		player.setAttack(baseAttack);
    player.setHealth(baseHealth);
    player.setDefense(baseDefense);
    player.setSpecialDefense(baseSpecialDefense);
    player.setSpecialAttack(baseSpecialAttack);
    player.setSpeed(baseSpeed);
    player.setMana(baseMana);
	}

}