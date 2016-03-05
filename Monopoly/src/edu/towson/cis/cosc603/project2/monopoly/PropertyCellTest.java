
package edu.towson.cis.cosc603.project2.monopoly;

import junit.framework.TestCase;

// TODO: Auto-generated Javadoc
/**
 * The Class PropertyCellTest.
 */
public class PropertyCellTest extends TestCase {

	/** The game master. */
	GameMaster gameMaster;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() {
		gameMaster();
		gameMaster.setNumberOfPlayers(2);
	}

	/**
	 * Game master.
	 */
	private void gameMaster() {
		gameMaster = GameMaster.instance();
		gameMaster.setGameBoard(new SimpleGameBoard());
		gameMaster.reset();
		gameMaster.setGUI(new MockGUI());
	}
	
	/**
	 * Test player action.
	 */
	public void testPlayerAction() {
		PropertyCell cell = cell();
		int cellIndex = gameMaster.getGameBoard().queryCellIndex("Blue 3");
		gameMaster.movePlayer(0, cellIndex);
		gameMaster.getPlayer(0).purchase();
		gameMaster.movePlayer(1, cellIndex);
	}

	/**
	 * Cell.
	 *
	 * @return the property cell
	 */
	private PropertyCell cell() {
		PropertyCell cell = (PropertyCell) gameMaster.getGameBoard().queryCell("Blue 3");
		gameMaster.switchTurn();
		cell.playAction();
		assertEquals(1500 - cell.getRent(), gameMaster.getPlayer(1).getMoney());
		assertEquals(1380 + cell.getRent(), gameMaster.getPlayer(0).getMoney());
		return cell;
	}
}
