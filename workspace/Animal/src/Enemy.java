
public class Enemy {
	int hitpoint,lives;
	
	public Enemy(int hitpoint,int lives ){
		
		this.hitpoint=hitpoint;
		this.lives=lives;
		
	}
 
	public int TakeDamage(int damage)
{
		int remainHits;
		remainHits= hitpoint-damage;
		remainHits=hitpoint;
		
		
		return hitpoint;
		
		System.out.println(""+hitpoint);
		
}
	
}
