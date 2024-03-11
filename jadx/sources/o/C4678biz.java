package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: o.biz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4678biz {
    private final Map<String, b> b;

    public C4678biz() {
        this.b = Collections.synchronizedMap(new HashMap());
    }

    public C4678biz(Map<String, b> map) {
        Map<String, b> synchronizedMap = Collections.synchronizedMap(new HashMap());
        this.b = synchronizedMap;
        synchronizedMap.putAll(map);
    }

    public void e(C4678biz c4678biz) {
        this.b.putAll(c4678biz.b);
    }

    public Set<String> c() {
        return this.b.keySet();
    }

    public b a(String str) {
        return this.b.get(str);
    }

    /* renamed from: o.biz$b */
    /* loaded from: classes3.dex */
    public static class b {
        private final String a;
        private final int c;
        private final int e;

        public String b() {
            return this.a;
        }

        public int c() {
            return this.c;
        }

        public int e() {
            return this.e;
        }

        public b(int i, int i2, String str) {
            this.e = i;
            this.c = i2;
            this.a = str;
        }
    }
}
