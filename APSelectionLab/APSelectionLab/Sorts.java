
/**
 * Write a description of class isort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sorts
{
    enum ListType {Standard, Bubble, Selection, Insert};
    ListType listType = ListType.Standard;
    
    private int[] list;
    private int[] blist; int bcompares = 0; int bswaps = 0;
    private int[] ilist; int icompares = 0; int iswaps = 0;
    private int[] slist; int scompares = 0; int sswaps = 0;

    /**
     * Constructor for objects of class isort
     */
    public Sorts()
    {
        int size = 50;
        list = new int[size];
        for (int i = 0; i < list.length; i++)
            list[i] = (int)(Math.random() * size) + 1;
            
        blist = list.clone();
        this.BubbleSort();
        ilist = list.clone();
        this.InsertionSort();
        slist = list.clone();
        this.SelectionSort();
    }
    
    public String toString() {
        int[] list;
        
        switch(listType) {
            case Standard:
                System.out.println("Original List");
                list = this.list;
                break;
            case Bubble:
                System.out.println("Bubble Sort -- "
                  + " Operations: " + (this.bcompares + this.bswaps)
                  + " Compares: " + this.bcompares
                  + " Swaps: " + this.bswaps);
                list = this.blist;
                break;
           case Selection:
                System.out.println("Selections Sort -- "
                  + " Operations: " + (this.scompares + this.sswaps)
                  + " Compares: " + this.scompares
                  + " Swaps: " + this.sswaps);
                list = this.slist;
                break;
            case Insert:
            default:
                System.out.println("Insertions Sort -- "
                  + " Operations: " + (this.icompares + this.iswaps)
                  + " Compares: " + this.icompares
                  + " Swaps: " + this.iswaps);
                list = this.ilist;
                break;
        }
                
        String output = "[";
        for (int i = 0; i < list.length; i++)
            output += " " + list[i];
        return output +" ]";    
    }
    
    private int[] BubbleSort() { 
        
        // iterate list, one less than length
        for (int i = 0; i < blist.length - 1; i++) {
            
            // bubble sort key logic
            for (int k = 1; k < blist.length - i; k++) {
                
                // analytics
                this.bcompares++; // compare counter
                
                // bubble sort swap logic
                if (blist[k-1] > blist[k]) {
                    int swap = blist[k];
                    blist[k] = blist[k-1];
                    blist[k-1] = swap;
               
                    // analytics
                    this.bswaps++; // swap counter
                }
            
            }
            
        }
        return blist;
    }
    private int[] SelectionSort() {
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
    
    private int[] InsertionSort() {

        // iterate list, one less than length
        for (int i = 0; i < ilist.length - 1; i++) {
            
            // insertion sort key logic
            int k = i + 1;
            int swap = ilist[k];            
            while( k > 0 && swap < ilist[k-1]) {
                ilist[k] = ilist[k-1];
                k--;
                
                // analytics
                this.icompares++; // compare counter
                this.iswaps++; // shift counter
            }
            ilist[k] = swap;
            
            this.iswaps++;  // increment swap counter
            
        }
        
        return ilist;
    }

    public static void selectionSorts() {
    	System.out.println();
    	System.out.println("Best sort is selection sort due to its simplicity, efficiency, and ability to be used on lists such as linkedlists.");
    }
    
    /**
     *
     */
    public static void main(String[] args)
    {
        // Original List
        Sorts is = new Sorts();
        System.out.println(is);
        
        // Bubble Sort
        is.listType = ListType.Bubble;
        System.out.println(is);
        
        // Selection Sort
        is.listType = ListType.Selection;
        System.out.println(is);        
        
        // Insertion Sort
        is.listType = ListType.Insert;
        System.out.println(is);
        
        //selectionSorts
        selectionSorts();
    }
}
