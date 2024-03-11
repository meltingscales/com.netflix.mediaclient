package o;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: o.bii  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4661bii {

    /* renamed from: o.bii$c */
    /* loaded from: classes3.dex */
    public static class c extends e {
        public HashMap<String, String> c;
        public Integer e;
        public Integer f;
        public Double g;
        public Integer h;
        public Integer i;
        public Integer j;
        public Integer k;
        public String n;
    }

    e d();

    /* renamed from: o.bii$e */
    /* loaded from: classes3.dex */
    public static class e {
        public List<c> a;
        public Integer b;
        public Integer d;

        public String toString() {
            return "ThroughputHistory{histbw=" + this.d + ", histage=" + this.b + ", secondary=" + this.a + '}';
        }

        public void b(C4758blF c4758blF, C4762blt c4762blt) {
            if (c4758blF != null) {
                this.b = Integer.valueOf(c4758blF.e);
                this.d = Integer.valueOf((int) c4758blF.d);
            }
            if (c4762blt != null) {
                this.d = Integer.valueOf((int) c4762blt.d);
            }
        }

        public void e(C4758blF c4758blF, C4762blt c4762blt, String str) {
            if (c4762blt == null || c4758blF == null) {
                return;
            }
            if (this.a == null) {
                this.a = new LinkedList();
            }
            c cVar = new c();
            cVar.d = Integer.valueOf((int) c4762blt.d);
            cVar.f = Integer.valueOf(c4762blt.b);
            cVar.n = str;
            cVar.g = Double.valueOf(c4758blF.b);
            int i = c4758blF.m;
            if (i > 0) {
                cVar.j = Integer.valueOf(i);
            }
            int i2 = c4758blF.g;
            if (i2 > 0) {
                cVar.i = Integer.valueOf(i2);
            }
            int i3 = c4758blF.h;
            if (i3 > 0) {
                cVar.h = Integer.valueOf(i3);
            }
            cVar.b = Integer.valueOf(c4758blF.e);
            cVar.c = c4758blF.c;
            cVar.e = Integer.valueOf(c4758blF.a);
            cVar.k = Integer.valueOf(c4758blF.f);
            this.a.add(cVar);
        }
    }
}
