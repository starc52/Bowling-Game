/* ControlDeskObserver.java
 *
 *  Version
 *  $Id$
 * 
 *  Revisions:
 * 		$Log$
 * 
 */

/**
 * Interface for classes that observe control desk events
 *
 */

public interface ControlDeskObserver extends UnivObserver{

	public void receiveControlDeskEvent(ControlDeskEvent ce);

};
