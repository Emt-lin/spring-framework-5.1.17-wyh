package event_demo.jdk;

import java.util.Observable;

/**
 * @author psl
 * @date 2020/9/25
 */
public class Move4JDK extends Observable {

	public void move() {
		setChanged();
		notifyObservers();
	}
}
