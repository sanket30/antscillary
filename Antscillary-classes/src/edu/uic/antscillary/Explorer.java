package edu.uic.antscillary;

import java.util.ArrayList;
import java.util.List;

import processing.core.PApplet;
import processing.core.PVector;

public class Explorer extends Ant {
	List<PVector> trace = new ArrayList<PVector>();

	public Explorer(PApplet _parent, PVector _position, int _diameter,
			int _color) {
		super(_parent, _position, _diameter, _color);
	}

	/* After the GPS sampling interval has passed,
	 * set the new current position and save the last
	 * one in the trace to be displayed
	 */
	public void positionChanged(PVector newPos) {
		trace.add(position);
		position = newPos;
	}
	
	public void render() {
		super.render();

		/* Render the trace, i.e. the list of past positions */
		for (PVector p : trace) {
			parent.fill(color);
			parent.ellipse(p.x, p.y, diameter, diameter);
		}
	}
}
