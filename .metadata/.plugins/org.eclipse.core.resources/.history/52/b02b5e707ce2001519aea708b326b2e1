package edu.towson.cis.cosc603.project2.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class Cell.
 */
public abstract class Cell implements IOwnable {
	
	/** The name. */
	private String name;
	
	/** The theOwner. */
	protected Player theOwner;

	/** The available. */
	private boolean available = true;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.IOwnable#getTheOwner()
	 */
	@Override
	public Player getTheOwner() {
		return theOwner;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public int getPrice() {
		return 0;
	}

	/**
	 * Play action.
	 * @return TODO
	 */
	public abstract boolean playAction();

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.IOwnable#setTheOwner(edu.towson.cis.cosc603.project2.monopoly.Player)
	 */
	@Override
	public void setTheOwner(Player owner) {
		this.theOwner = owner;
	}
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return name;
    }

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.IOwnable#isAvailable()
	 */
	@Override
	public boolean isAvailable() {
		return available;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc603.project2.monopoly.IOwnable#setAvailable(boolean)
	 */
	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}

	public abstract void playerMoved(Player player, int playerIndex, GameMaster gameMaster);
}
