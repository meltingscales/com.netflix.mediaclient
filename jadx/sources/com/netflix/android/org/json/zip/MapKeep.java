package com.netflix.android.org.json.zip;

import com.netflix.android.org.json.Kim;
import java.util.HashMap;

/* loaded from: classes5.dex */
class MapKeep extends Keep {
    private Object[] list;
    private HashMap map;

    public MapKeep(int i) {
        super(i);
        this.list = new Object[this.capacity];
        this.map = new HashMap(this.capacity);
    }

    private void compact() {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.capacity;
            if (i2 >= i) {
                break;
            }
            Object obj = this.list[i2];
            long age = Keep.age(this.uses[i2]);
            if (age > 0) {
                this.uses[i3] = age;
                this.list[i3] = obj;
                this.map.put(obj, new Integer(i3));
                i3++;
            } else {
                this.map.remove(obj);
            }
            i2++;
        }
        if (i3 < i) {
            this.length = i3;
        } else {
            this.map.clear();
            this.length = 0;
        }
        this.power = 0;
    }

    public int find(Object obj) {
        Object obj2 = this.map.get(obj);
        if (obj2 instanceof Integer) {
            return ((Integer) obj2).intValue();
        }
        return -1;
    }

    @Override // com.netflix.android.org.json.zip.PostMortem
    public boolean postMortem(PostMortem postMortem) {
        boolean equals;
        MapKeep mapKeep = (MapKeep) postMortem;
        if (this.length != mapKeep.length) {
            JSONzip.log(this.length + " <> " + mapKeep.length);
            return false;
        }
        for (int i = 0; i < this.length; i++) {
            Object obj = this.list[i];
            if (obj instanceof Kim) {
                equals = ((Kim) obj).equals(mapKeep.list[i]);
            } else {
                String str = mapKeep.list[i];
                if (obj instanceof Number) {
                    obj = obj.toString();
                }
                if (str instanceof Number) {
                    str = str.toString();
                }
                equals = obj.equals(str);
            }
            if (!equals) {
                JSONzip.log("\n[" + i + "]\n " + this.list[i] + "\n " + mapKeep.list[i] + "\n " + this.uses[i] + "\n " + mapKeep.uses[i]);
                return false;
            }
        }
        return true;
    }

    public void register(Object obj) {
        if (this.length >= this.capacity) {
            compact();
        }
        Object[] objArr = this.list;
        int i = this.length;
        objArr[i] = obj;
        this.map.put(obj, new Integer(i));
        long[] jArr = this.uses;
        int i2 = this.length;
        jArr[i2] = 1;
        this.length = i2 + 1;
    }

    @Override // com.netflix.android.org.json.zip.Keep
    public Object value(int i) {
        return this.list[i];
    }
}
