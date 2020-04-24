
/**
 * Write a description of class CircleQueueAL here.
 *
 * @author (Anya and Ornith O'Mimus)
 * @version (1.0.0 and April 21, 2020)
 */
public class CircleQueueAL
{  private int current; //defining current index
   private ArrayList al; //defining arraylist 

  /**
   *  Constructor for the CircleQueueAL
   *  Generates an empty arraylist.
   */
  public CircleQueueAL()
  {
    al = new ArrayList();
    current = 0;
  }
  
  /**
   *  
   *
   * @return  the first object in array list.
   */
  public Object getFirstObject()
  {
  current = 0;

  return (al.getSize() == 0) ? (null) : (al.get(current));
  //return null if arraylist size is 0 else return the first object in the list
  }

  /**
   *  
   *
   * @return  the last object in the arraylist.
   */
  public Object getLastObject()
  {
current = al.getSize() - 1;

        return (al.getSize() == 0) ? (null) : (al.get(current));
  //return null if arraylist size is 0 else return the last object in the list
  }
  
  /**
   *  
   *
   * @return  the current Object in arraylist.
   */
  public Object getObject()
  {
        return (al.getSize() == 0) ? (null) : (al.get(current));
        //return null if arraylist size is 0 else return the current object in the list
  }
  
  /**
   *  Advances the current Object.
   *
   */
  public void setNext()
  {
current++;
//never let current be null, wrap to head
if(current == al.getSize())
current = 0;
  }
  
  /**
   *  Reverses the current node.
   *
   */
  public void setPrevious()
  {
current--;
// never let currentNode be null, wrap to head
if(current == -1)
current = al.getSize() - 1;
  }
  
  
  /**
   *  Add a new object at the end of the Queue,
   *
   * @param  opaqueObject  is the data to be inserted in the Queue object.
   */
  public void add(Object obj)
  {
 // add new object to end of Queue
 current = al.getSize();
 al.add(obj);
  }
  
  /**
   *  Delete an object from the front of the Queue,
   *
   */
  public Object delete()
  {
 if(current != 0)
     current--;
  
 return al.remove(0);
  }
  
  
  /**
   *  Returns a string representation of this Queue,
   *  polymorphic nature of toString overrides of standard System.out.print behavior
   *
   * @return    string representation of this Queue
   */
  public String toString()
  {
    String queueToString = "[";

    Object o = al.get(0);  
// start from the head
    for(int i = 0; i < al.getSize(); i++)
    {
        queueToString += al.get(i);
        if(i < al.getSize() - 1)
            queueToString += ", ";
    }
    queueToString += "]";
    return queueToString;
  }
  
  /**
   * Performs insertion sort based off of the contents of object
   */
  public void insertionSort() 
  {
      for(int i = 1; i < al.getSize(); i++)
          while(i > 0 && al.get(i).toString().compareTo(al.get(i - 1).toString()) > 0)            
              al.set(i - 1, al.set(i, al.get(i - 1)));
  }
}

