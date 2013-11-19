package edu.uic.antscillary;

import processing.core.PApplet;
import processing.core.PVector;

public class SimpleTile extends Tile {

	public SimpleTile(PApplet _parent, PVector pos, float _width, float _height) {
		parent = _parent;
		position = pos;
		width = _width;
		height = _height;
		color = parent.color(162/255.0f, 205/255.0f, 90/255.0f);
	}
	
	public void render() {
		parent.fill(color);
		parent.rect(position.x, position.y, width, height);
	}

}
