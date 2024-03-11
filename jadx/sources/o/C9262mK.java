package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.mK  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9262mK {
    public static final C9262mK b = new C9262mK();

    private C9262mK() {
    }

    public final String b(int i, String str) {
        int length = str.length() - i;
        if (length < 25) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, i);
        C8632dsu.a(substring, "");
        sb.append(substring);
        sb.append("***<");
        sb.append(length);
        sb.append("> CHARS TRUNCATED***");
        return sb.toString();
    }

    public final C9265mN c(int i, List<Object> list) {
        List<Object> n;
        int a;
        int c;
        Map<String, Object> k;
        List<Object> list2;
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C9262mK c9262mK = b;
            Object obj = list.get(i4);
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() > i) {
                    String b2 = c9262mK.b(i, str);
                    int length = str.length();
                    list.set(i4, b2);
                    i2++;
                    i3 += length - i;
                }
            }
            if (c9262mK.c(obj)) {
                if (obj != null) {
                    C9265mN a2 = c9262mK.a(i, dsH.d(obj));
                    a = a2.a();
                    c = a2.c();
                    list2 = obj;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                }
            } else if (c9262mK.a(obj)) {
                if (obj != null) {
                    C9265mN c2 = c9262mK.c(i, dsH.a(obj));
                    a = c2.a();
                    c = c2.c();
                    list2 = obj;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                }
            } else if (obj instanceof Map) {
                k = dqE.k((Map) obj);
                C9265mN a3 = c9262mK.a(i, k);
                a = a3.a();
                c = a3.c();
                list2 = k;
            } else if (obj instanceof Collection) {
                n = C8576dqs.n((Collection) obj);
                C9265mN c3 = c9262mK.c(i, n);
                a = c3.a();
                c = c3.c();
                list2 = n;
            }
            list.set(i4, list2);
            i2 += a;
            i3 += c;
        }
        return new C9265mN(i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C9265mN a(int i, Map<String, Object> map) {
        int a;
        int c;
        Map<String, Object> map2;
        Map<String, Object> k;
        List<Object> n;
        Iterator<T> it = map.entrySet().iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C9262mK c9262mK = b;
            Object value = entry.getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.length() > i) {
                    String b2 = c9262mK.b(i, str);
                    int length = str.length();
                    entry.setValue(b2);
                    i2++;
                    i3 += length - i;
                }
            }
            if (c9262mK.c(value)) {
                if (value != 0) {
                    C9265mN a2 = c9262mK.a(i, dsH.d(value));
                    a = a2.a();
                    c = a2.c();
                    map2 = value;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                }
            } else if (c9262mK.a(value)) {
                if (value != 0) {
                    C9265mN c2 = c9262mK.c(i, dsH.a(value));
                    a = c2.a();
                    c = c2.c();
                    map2 = value;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<kotlin.Any?>");
                }
            } else if (value instanceof Map) {
                k = dqE.k((Map) value);
                C9265mN a3 = c9262mK.a(i, k);
                a = a3.a();
                c = a3.c();
                map2 = k;
            } else if (value instanceof Collection) {
                n = C8576dqs.n((Collection) value);
                C9265mN c3 = c9262mK.c(i, n);
                a = c3.a();
                c = c3.c();
                map2 = n;
            }
            entry.setValue(map2);
            i2 += a;
            i3 += c;
        }
        return new C9265mN(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c(Object obj) {
        return (obj instanceof HashMap) || (obj instanceof TreeMap) || (obj instanceof ConcurrentMap) || (obj instanceof EnumMap) || (obj instanceof Hashtable) || (obj instanceof WeakHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean a(Object obj) {
        return (obj instanceof ArrayList) || (obj instanceof LinkedList) || (obj instanceof CopyOnWriteArrayList) || (obj instanceof Vector);
    }
}
