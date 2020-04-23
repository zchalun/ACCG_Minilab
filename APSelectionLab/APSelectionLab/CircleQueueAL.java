/**
 * Circle Queue Using ArrayList
 * @author     Andrew Zhang
 *
 */
import java.util.*;
public class CircleQueueAL {
	ArrayList<LinkedList> ob = new ArrayList<LinkedList>();
	/**
	 * get the first object in the arrayList
	 */
	public Object getFirstObject() {
		if(ob.get(0) == null) {
			return null;
		}else {
			return ob.get(0).getObject();
		}
		
	}
	/**
	 * get the last object in the arrayList
	 */
	public Object getLastObject() {
		if(ob.get(ob.size()-1) == null) {
			return null;
		}else {
			return ob.get(ob.size()-1).getObject();
		}
	}
	/**
	 * 
	 */
}
	
		
	
	
