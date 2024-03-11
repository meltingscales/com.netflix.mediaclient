package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CompactStringObjectMap implements Serializable {
    private static final CompactStringObjectMap d = new CompactStringObjectMap(1, 0, new Object[4]);
    private static final long serialVersionUID = 1;
    private final int a;
    private final int b;
    private final Object[] c;

    private static final int d(int i) {
        if (i <= 5) {
            return 8;
        }
        if (i <= 12) {
            return 16;
        }
        int i2 = 32;
        while (i2 < (i >> 2) + i) {
            i2 += i2;
        }
        return i2;
    }

    private CompactStringObjectMap(int i, int i2, Object[] objArr) {
        this.b = i;
        this.a = i2;
        this.c = objArr;
    }

    public static <T> CompactStringObjectMap a(Map<String, T> map) {
        if (map.isEmpty()) {
            return d;
        }
        int d2 = d(map.size());
        int i = d2 - 1;
        int i2 = (d2 >> 1) + d2;
        Object[] objArr = new Object[i2 * 2];
        int i3 = 0;
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                int hashCode = key.hashCode() & i;
                int i4 = hashCode + hashCode;
                if (objArr[i4] != null) {
                    i4 = ((hashCode >> 1) + d2) << 1;
                    if (objArr[i4] != null) {
                        i4 = (i2 << 1) + i3;
                        i3 += 2;
                        if (i4 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i4] = key;
                objArr[i4 + 1] = entry.getValue();
            }
        }
        return new CompactStringObjectMap(i, i3, objArr);
    }

    public Object e(String str) {
        int hashCode = str.hashCode() & this.b;
        int i = hashCode << 1;
        Object obj = this.c[i];
        if (obj == str || str.equals(obj)) {
            return this.c[i + 1];
        }
        return c(str, hashCode, obj);
    }

    private final Object c(String str, int i, Object obj) {
        if (obj == null) {
            return null;
        }
        int i2 = this.b + 1;
        int i3 = ((i >> 1) + i2) << 1;
        Object obj2 = this.c[i3];
        if (str.equals(obj2)) {
            return this.c[i3 + 1];
        }
        if (obj2 != null) {
            int i4 = (i2 + (i2 >> 1)) << 1;
            int i5 = this.a;
            for (int i6 = i4; i6 < i5 + i4; i6 += 2) {
                Object obj3 = this.c[i6];
                if (obj3 == str || str.equals(obj3)) {
                    return this.c[i6 + 1];
                }
            }
        }
        return null;
    }

    public Object c(String str) {
        int length = this.c.length;
        for (int i = 0; i < length; i += 2) {
            Object obj = this.c[i];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return this.c[i + 1];
            }
        }
        return null;
    }

    public List<String> e() {
        int length = this.c.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i = 0; i < length; i += 2) {
            Object obj = this.c[i];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }
}
