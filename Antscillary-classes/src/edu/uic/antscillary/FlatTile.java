package edu.uic.antscillary;

import processing.core.PApplet;
import processing.core.PVector;

public class FlatTile extends Tile {

	public FlatTile(PApplet _parent, PVector pos, float _width, float _height) {
		parent = _parent;
		position = pos;
		width = _width;
		height = _height;
		color = parent.color(205/255.0f, 198/255.0f, 115/255.0f);
		dangerous = true;
		predationProbability = 0.5f;
	}
	
	public void render() {
		parent.fill(color);
		parent.rect(position.x, position.y, width, height);
	}

}
