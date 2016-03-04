package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Interface IOwnable.
 */
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
	 * @param owner the new the owner
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