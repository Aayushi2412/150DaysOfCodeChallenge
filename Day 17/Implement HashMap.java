import java.util.HashMap;

public class myHashMap 
{
    private HashMap<String,Integer> map=new HashMap<>();
    public myHashMap() 
    {
        // Implement the Constructor(s).
    }

    public void insert(String key, int value) 
    {
        // Implement the insert(k, v) function.
        map.put(key,value);
    }

    public int get(String key) 
    {
        // Implement the get(k) function.
        if(map.containsKey(key))
            return map.get(key);
        else return -1;
    }

    public void remove(String key) 
    {
        // Implement the remove(k) function.
        if(map.containsKey(key))
        map.remove(key);
    }

    public boolean search(String key) 
    {
        // Implement the search(k) function.
        if(map.containsKey(key)) return true;
        else return false; 
    }

    public int getSize() 
    {
        // Implement the getSize() function.
        return map.size();
    }

    public boolean isEmpty() 
    {
        // Implement the isEmpty() function.
        return (map.isEmpty());
    }

}
