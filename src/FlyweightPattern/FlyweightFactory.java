package FlyweightPattern;

import java.util.Hashtable;

/**
 * ÏíÔª¹¤³§
 * @author Bywinkey
 *
 */
public class FlyweightFactory {
	
	private Hashtable flyweights = new Hashtable();
	
	public void flyweightFactory() {
		
		flyweights.put("X", new Flyweight());
		flyweights.put("Y", new Flyweight());
		flyweights.put("Z", new Flyweight());
	}
	public AbstractFlyweight getFlyweight(String key) {
		return (AbstractFlyweight)(flyweights.get(key));
	}
}
