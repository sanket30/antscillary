package edu.uic.antscillary;

import processing.core.PApplet;
import processing.core.PVector;

public class RockTile extends Tile {

	public RockTile(PApplet _parent, PVector pos, float _width, float _height) {
		parent = _parent;
		position = pos;
		width = _width;
		height = _height;
		color = parent.color(138/255.0f, 138/255.0f, 138/255.0f);
		dangerous = true;
		predationProbability = 0.6f;
	}
	
	public void render() {
		parent.fill(color);
		parent.rect(position.x, position.y, width, height);
	}

}
