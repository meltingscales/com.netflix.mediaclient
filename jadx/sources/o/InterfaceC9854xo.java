package o;

import java.util.Collections;
import java.util.Map;

/* renamed from: o.xo  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9854xo {
    d c(String str);

    void d();

    void e(String str, d dVar);

    /* renamed from: o.xo$d */
    /* loaded from: classes2.dex */
    public static class d {
        public String a;
        public long b;
        public byte[] c;
        public Map<String, String> d = Collections.emptyMap();
        public long e;
        public long g;

        public boolean e() {
            return this.g < System.currentTimeMillis();
        }

        public boolean d() {
            return this.b < System.currentTimeMillis();
        }
    }
}
