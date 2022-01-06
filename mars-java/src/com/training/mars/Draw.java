package com.training.mars;

// requires it to be a functional interface, so you cannot have a second abstract method here
@FunctionalInterface
public interface Draw {

	void draw();
}
