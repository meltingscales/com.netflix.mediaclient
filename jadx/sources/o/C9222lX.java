package o;

import java.io.File;
import java.util.UUID;

/* renamed from: o.lX  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9222lX {
    public static final e d = new e(null);
    private final String b;
    private String c;
    private final long e;

    public static final String e(File file, String str) {
        return d.a(file, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9222lX) {
            C9222lX c9222lX = (C9222lX) obj;
            return C8632dsu.c((Object) this.c, (Object) c9222lX.c) && this.e == c9222lX.e && C8632dsu.c((Object) this.b, (Object) c9222lX.b);
        }
        return false;
    }

    public int hashCode() {
        return (((this.c.hashCode() * 31) + Long.hashCode(this.e)) * 31) + this.b.hashCode();
    }

    public String toString() {
        return "SessionFilenameInfo(apiKey=" + this.c + ", timestamp=" + this.e + ", uuid=" + this.b + ')';
    }

    public C9222lX(String str, long j, String str2) {
        this.c = str;
        this.e = j;
        this.b = str2;
    }

    public final String e() {
        return d.c(this.c, this.e, this.b);
    }

    /* renamed from: o.lX$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final String c(String str, long j, String str2) {
            return str + '_' + str2 + j + "_v3.json";
        }

        public final C9222lX d(Object obj, C9258mG c9258mG) {
            return new C9222lX(obj instanceof C9220lV ? ((C9220lV) obj).c() : c9258mG.b(), System.currentTimeMillis(), UUID.randomUUID().toString());
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
            r4 = o.duB.h(r2, 36);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String e(java.io.File r4) {
            /*
                r3 = this;
                java.lang.String r0 = r4.getName()
                boolean r1 = r3.b(r4)
                r2 = 0
                if (r1 == 0) goto L16
                java.lang.String r4 = r4.getName()
                r0 = 95
                r1 = 2
                java.lang.String r0 = o.C8684dus.c(r4, r0, r2, r1, r2)
            L16:
                int r4 = r0.length()
                r1 = 36
                if (r4 < r1) goto L1f
                r2 = r0
            L1f:
                if (r2 != 0) goto L22
                goto L28
            L22:
                java.lang.String r4 = o.C8684dus.c(r2, r1)
                if (r4 != 0) goto L2a
            L28:
                java.lang.String r4 = ""
            L2a:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C9222lX.e.e(java.io.File):java.lang.String");
        }

        public final long d(File file) {
            String d;
            String g;
            Long m;
            String name = file.getName();
            if (b(file)) {
                name = duD.d(file.getName(), '_', (String) null, 2, (Object) null);
            }
            d = duB.d(name, e(file).length());
            g = duD.g(d, '_', (String) null, 2, (Object) null);
            m = C8689dux.m(g);
            if (m == null) {
                return -1L;
            }
            return m.longValue();
        }

        public final String a(File file, String str) {
            String g;
            if (file == null || !b(file)) {
                return str;
            }
            g = duD.g(file.getName(), '_', (String) null, 2, (Object) null);
            String str2 = g.length() != 0 ? g : null;
            return str2 == null ? str : str2;
        }

        public final boolean b(File file) {
            boolean a;
            a = C8691duz.a(file.getName(), "_v3.json", false, 2, null);
            return a;
        }
    }
}
