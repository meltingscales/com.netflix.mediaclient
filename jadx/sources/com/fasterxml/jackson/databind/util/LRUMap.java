package com.fasterxml.jackson.databind.util;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public class LRUMap<K, V> implements Serializable {
    private static final long serialVersionUID = 1;
    protected final transient int b;
    protected final transient ConcurrentHashMap<K, V> c;
    protected transient int e;

    public LRUMap(int i, int i2) {
        this.c = new ConcurrentHashMap<>(i, 0.8f, 4);
        this.b = i2;
    }

    public V c(K k, V v) {
        if (this.c.size() >= this.b) {
            synchronized (this) {
                if (this.c.size() >= this.b) {
                    e();
                }
            }
        }
        return this.c.put(k, v);
    }

    public V e(K k, V v) {
        if (this.c.size() >= this.b) {
            synchronized (this) {
                if (this.c.size() >= this.b) {
                    e();
                }
            }
        }
        return this.c.putIfAbsent(k, v);
    }

    public V a(Object obj) {
        return this.c.get(obj);
    }

    public void e() {
        this.c.clear();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        this.e = objectInputStream.readInt();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.e);
    }

    protected Object readResolve() {
        int i = this.e;
        return new LRUMap(i, i);
    }
}
