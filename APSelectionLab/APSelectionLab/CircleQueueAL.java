/**
 * Circle Queue Using ArrayList
 * @author     Andrew Zhang
 *
 */
import java.util.*;
public class CircleQueueAL {
	ArrayList<Object> ob = new ArrayList<Object>();
	private int[] slist; int scompares = 0; int sswaps = 0;
	Object opaqueObject;
	/**
	 * get the first object in the arrayList
	 */
	public Object getFirstObject() {
		if(ob.get(0) == null) {
			return null;
		}else {
			return ob.get(0);
		}
		
	}
	/**
	 * get the last object in the arrayList
	 */
	public Object getLastObject() {
		if(ob.get(ob.size()-1) == null) {
			return null;
		}else {
			return ob.get(ob.size()-1);
		}
	}

	/**
	 * add stuff to the list
	 */
	public void add(Object opaqueObject) {
		ob.add(opaqueObject);
	}
	/**
	 * Delete an object from the front of the Queue,
	 */
	public Object delete() {
		 Object opaqueObject = null;
	  	  
		  if (ob.get(0)!= null) {
			  opaqueObject = ob.get(0); 		  				 
		  }	 
		  ob.remove(0);
		  return opaqueObject;
	}
	/**
	 * 
	 */
	 public String toString()
	  {
	    String queueToString = "[";
	    for(int i = 0; i<ob.size();i++) {
	    	if(ob.get(i)!=null) {
	    	queueToString += "("+ob.get(i)+")";
	    		if(ob.get(i+1)!=null) {
	    			queueToString += ", ";
	    		}
	    	}
	    }
	    queueToString += "]";
	    return queueToString;

	    
	  }
	 public int[] SelectionSort() {
	    	for (int i = 0; i < slist.length - 1; i++)
	    	{
	    		//find min val in unsorted part of array
	    		int minIndex = i;
	    		for (int j=i+1; j < slist.length; j++)
	    			if (slist[j] < slist[minIndex])
	    			minIndex = j;    				
	    			
	    			// swap min element with current first index
	    			int temp = slist[minIndex];
	    			slist[minIndex] = slist[i];
	    			slist[i] = temp;
	    			
	    			//stats
	    			this.scompares++;
					this.sswaps++;
	    			}
	    	return slist;
	    	}
	  
}

	
		
	
	
