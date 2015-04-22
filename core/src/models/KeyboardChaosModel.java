package models;

import java.util.ArrayList;
import java.util.List;

import models.player.Player;
import models.spell.Spell;
import models.spell.Fireball;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.physics.box2d.World;

import control.KeyboardChaosControl;


public class KeyboardChaosModel {

	private World world;
	private KeyboardChaosControl kcc;
	private List<Player> players;
	
	public KeyboardChaosModel(KeyboardChaosControl kcc){

		this.kcc = kcc;
		players = new ArrayList<Player>();
		world = new World(models.KCVars.GRAVITY, true);
	

		
		
	}
	
	public void createSomePlayers(){
		players.add(new Player(Keys.UP, Keys.DOWN, Keys.RIGHT, Keys.LEFT, Keys.SPACE, Keys.UNKNOWN, 300f, 400f));	
		players.get(0).setFirstSpell(new Fireball(50,1, players.get(0)));
		players.get(0).setPlayerName("Player 1");

		players.add(new Player(Keys.W, Keys.S, Keys.D, Keys.A, Keys.BACKSPACE, Keys.UNKNOWN, 100f, 200f));
		players.get(1).setFirstSpell(new Fireball(50,1, players.get(1)));
		players.get(1).setPlayerName("Player 2");
		
		
		players.add(new Player(Keys.Y, Keys.H, Keys.J, Keys.G, Keys.UNKNOWN, Keys.UNKNOWN, 300f, 200f));
		players.get(2).setPlayerName("Player 3");
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public World getWorld(){ return this.world;}
	public List<Player> getPlayerList(){ return this.players;}

}
