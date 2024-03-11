package o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: o.cdM  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6438cdM<T> {
    private final Map<T, Integer> d = new LinkedHashMap();

    public final int d() {
        return this.d.size();
    }

    public final Iterator<T> c() {
        return this.d.keySet().iterator();
    }

    public final void d(T t) {
        Integer num = this.d.get(t);
        this.d.put(t, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
    }

    public final int e(T t) {
        Integer num = this.d.get(t);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
