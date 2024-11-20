package csci235;

import java.util.ArrayList;
import java.util.List;

public class HashTableMap<K, V> implements Map<K, V> {

    private class KVPair {
        public K key;
        public V value;

        KVPair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private List<KVPair>[] buckets;

    private int size;

    public HashTableMap(int numBuckets) {
        this.buckets = new ArrayList[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            this.buckets[i] = new ArrayList<>();
        }
        this.size = 0;
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % this.buckets.length;
    }

    private double loadFactor() {
        return (double) size / this.buckets.length;
    }

    public V put(K key, V value)
    {
        int k = getIndex(key);
        boolean norehash;

        if(!containsKey(key))
        {
            KVPair pair = new KVPair(key, value);
            buckets[k].add(pair);
            this.size++;
            norehash = true;
        }
        else norehash = false;

        if(norehash == true)
        {
            if(loadFactor() >= 4)
            {
                int resize = 2 * this.buckets.length;
                List<KVPair>[] bucketsNew = new ArrayList[resize]; 
                for (int i = 0; i < resize; i++) {
                    bucketsNew[i] = new ArrayList<>();
                }   
                for (List<KVPair> bucket: this.buckets)
                {
                    for (KVPair p: bucket)
                    {
                        int index = Math.abs(p.key.hashCode()) % resize;
                        bucketsNew[index].add(p);
                    }
                }
                this.buckets = bucketsNew;        
            }
            return null;
        }

        if(norehash == false)
        {
            for(KVPair pair: buckets[k])
            {
                if(pair.key.equals(key)) 
                {
                    V val = pair.value;
                    pair = new KVPair(key, value);
                    return val;
                }
            }
        }
        return null;
    }

    public V get(K key)
    {
        int k = getIndex(key);
        for(KVPair pair: buckets[k])
        {
            if(pair.key.equals(key))
                return pair.value;
        }
        return null;
    }

    public boolean containsKey(K key)
    {
        if(get(key) != null) 
            return true;
        return false;
    }

    public int size()
    {
        return this.size;
    }
    
    public void clear()
    {
        this.size = 0;
        this.buckets = new ArrayList[this.size];
    }

}


