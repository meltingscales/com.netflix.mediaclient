package o;

import okio.ByteString;

/* renamed from: o.dHm  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7845dHm {
    public static final ByteString a;
    public static final e b = new e(null);
    public static final ByteString c;
    public static final ByteString d;
    public static final ByteString e;
    public static final ByteString g;
    public static final ByteString h;
    public final ByteString f;
    public final ByteString i;
    public final int j;

    public final ByteString b() {
        return this.i;
    }

    public final ByteString c() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7845dHm) {
                C7845dHm c7845dHm = (C7845dHm) obj;
                return C8632dsu.c(this.f, c7845dHm.f) && C8632dsu.c(this.i, c7845dHm.i);
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ByteString byteString = this.f;
        int hashCode = byteString != null ? byteString.hashCode() : 0;
        ByteString byteString2 = this.i;
        return (hashCode * 31) + (byteString2 != null ? byteString2.hashCode() : 0);
    }

    public C7845dHm(ByteString byteString, ByteString byteString2) {
        C8632dsu.d(byteString, "");
        C8632dsu.d(byteString2, "");
        this.f = byteString;
        this.i = byteString2;
        this.j = byteString.k() + 32 + byteString2.k();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7845dHm(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            o.C8632dsu.d(r2, r0)
            o.C8632dsu.d(r3, r0)
            okio.ByteString$b r0 = okio.ByteString.c
            okio.ByteString r2 = r0.e(r2)
            okio.ByteString r3 = r0.e(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7845dHm.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7845dHm(ByteString byteString, String str) {
        this(byteString, ByteString.c.e(str));
        C8632dsu.d(byteString, "");
        C8632dsu.d((Object) str, "");
    }

    public String toString() {
        return this.f.m() + ": " + this.i.m();
    }

    /* renamed from: o.dHm$e */
    /* loaded from: classes5.dex */
    public static final class e {
        private e() {
        }

        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }
    }

    static {
        ByteString.b bVar = ByteString.c;
        e = bVar.e(":");
        d = bVar.e(":status");
        c = bVar.e(":method");
        g = bVar.e(":path");
        h = bVar.e(":scheme");
        a = bVar.e(":authority");
    }
}
