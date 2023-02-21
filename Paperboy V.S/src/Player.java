import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class Player {

	// Public floats used to store the players cordinates and speed
	public float playCordX, playCordY, playSpeed, MinSpeed, MaxSpeed;
	//Player hit box used for interactions with hazards
	private float playWidth, playLength;
	// Variable for player team, Blue if true, orange if false
	public boolean PlayerIsBlue;
	// index of deliveries made and deliveries left
	public String ToMake[], Made[];
	// Int holding the player's score
	public int score;
	// int measure of the players stamina (used only for V.S. Mode)
	private int stamina, staminaLimit;
	
	public Player(float startX, float startY, boolean team, boolean isVS) {
		playCordX = startX;
		playCordY = startY;
		
		score = 0;
		
		PlayerIsBlue =  team;
		
		playWidth = 1.5f;
		playLength = 3f;
		
		ToMake = new String[15];
		Made = new String[15];
		
		if (PlayerIsBlue == true) {
			int deliverTo = 0;
			for(int i = 0; i < 15; i++) {
				ToMake[i] = Integer.toString(deliverTo);
				deliverTo += 2;
			}
		}
		else if (PlayerIsBlue == false) {
			int deliverTo = 1;
			for(int i = 0; i < 15; i++) {
				ToMake[i] = Integer.toString(deliverTo);
				deliverTo += 2;
			}
		}
		
		for(int i = 0; i < 15; i++) {
			Made[i] = "";
		}
		
		stamina = 0;
		staminaLimit = 0;
		if (isVS == true) {
			stamina = 100;
			staminaLimit = 100;
		}
	}
	
	public void ShovePlayer(Player Other) {
		
	}
	
}
