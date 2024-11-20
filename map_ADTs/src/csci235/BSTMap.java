package csci235;

public class BSTMap<K extends Comparable<K>, V> implements Map<K, V>  {

    private class Node {
        public K key;
        public V value;
        public Node left;
        public Node right;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
        
    }

    private Node root;

    private int size;

    public BSTMap() {
        this.root = null;
        this.size = 0;
    }

    public V put(K key, V value)
    {
        V return_value = null;
        if(get(key) != null){
            return_value = get(key);
        }
        root = helperMethod(this.root, key, value);
        return return_value;

    }

    private Node helperMethod(Node node, K key, V value) {
        if (node == null) 
        {
            this.size++;
            node = new Node(key, value);
            return node;
        } 
        
        if(key.compareTo(node.key) < 0) node.left = helperMethod(node.left, key, value);
        else if(key.compareTo(node.key) > 0) node.right = helperMethod(node.right, key, value);
        else
        {
            return node;
        } 

        return node;
    }
    
    public V get(K key)
    {   
        Node current = root;
        while(current != null){
            K cur_key = current.key;
            int comp = key.compareTo(cur_key);
            if(comp > 0){
                current = current.right;
            }else if(comp == 0){
                return current.value;
            }else{
                current = current.left;
            }
        }
        return null;
    }

    public boolean containsKey(K key)
    {
        if(get(key) == null)
        {
            return false;
        }
        return true;
    }
    
    public int size()
    {
        return this.size;
    }

    public void clear()
    {
        this.root = null;
        this.size = 0;
    }

  
}


