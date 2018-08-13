package com.testing.lift;

public class Lift {

    private int maxWeight;

    private int currentWeight;

    private int floor;

    private int currentFloor;

    private int targetFloor;

    private String control;

	/**
	 * @return the maxWeight
	 */
	public int getMaxWeight() {
		return maxWeight;
	}

	/**
	 * @return the targetFloor
	 */
	public int getTargetFloor() {
		return targetFloor;
	}

	/**
	 * @param targetFloor the targetFloor to set
	 */
	public void setTargetFloor(int targetFloor) {
		this.targetFloor = targetFloor;
	}

	/**
	 * @return the control
	 */
	public String getControl() {
		return control;
	}

	/**
	 * @param control the control to set
	 */
	public void setControl(String control) {
		this.control = control;
	}

	/**
	 * @return the currentFloor
	 */
	public int getCurrentFloor() {
		return currentFloor;
	}

	/**
	 * @param currentFloor the currentFloor to set
	 */
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	/**
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}

	/**
	 * @return the currentWeight
	 */
	public int getCurrentWeight() {
		return currentWeight;
	}

	/**
	 * @param currentWeight the currentWeight to set
	 */
	public void setCurrentWeight(int currentWeight) {
		this.currentWeight = currentWeight;
	}

	/**
	 * @param maxWeight the maxWeight to set
	 */
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}

}