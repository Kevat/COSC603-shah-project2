package edu.towson.cis.cosc603.project2.monopoly;

public interface IOwnable {

	/**
	 * Gets the theOwner.
	 *
	 * @return the theOwner
	 */
	Player getTheOwner();

	/**
	 * Sets the theOwner.
	 *
	 * @param theOwner the new theOwner
	 */
	void setTheOwner(Player owner);

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	boolean isAvailable();

	/**
	 * Sets the available.
	 *
	 * @param available the new available
	 */
	void setAvailable(boolean available);

}