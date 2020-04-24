
/**
 * Write a description of class ArrayList here.
 *
 * @author (Anya)
 * @version (1.0.0 and April 21, 2020)
 */
public class ArrayList
{
    private Object [] array;
    private int size;
    
    public ArrayList()
    {
        array = new Object [2]; //creating new array of size 2
        size = 0;
    }
    public ArrayList(int length)
    {
        array = new Object [length];
        size = 0;
    }
    
    public Object get(int index)
    {
        return array[index];
    }
    public Object set(int index, Object name)
    {
        Object temp = array[index];
        array[index] = name;
        
        return temp; 
    }
    public int getSize()
    {
        return size;
    }
    public void increaseLength()
    {
        Object [] temp = new Object [array.length * 2];
        
        for(int i = 0; i < array.length; i++)
            temp[i] = array[i]; 
    }
    public void add(Object name)
    {
        if(size == array.length)
            increaseLength();
        array[size] = name; 
        size++;
    }
    public void add(int index, Object name)
    {
        if(size == array.length)
            increaseLength();
        
        for(int i = size; i > index; i--)
            array[i] = array[i - 1];
        
        array[index] = name; 
        size++;
    }
    public Object remove(int index)
    {
        Object temp = array[index];
        for(int i = index; i < size - 1; i++)
        {
            array[i] = array[i + 1]; 
        }
        size--;
        return temp; 
    }
}
