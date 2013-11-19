package edu.uic.antscillary;

import processing.core.PApplet;
import processing.core.PVector;

public abstract class Tile {
	PApplet parent;
	boolean dangerous = false;
	float predationProbability = 0.0f;	
	int color;
	float width;
	float height;
	PVector position;

}
