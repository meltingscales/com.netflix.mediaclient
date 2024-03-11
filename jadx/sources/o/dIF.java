package o;

/* loaded from: classes5.dex */
public final class dIF implements dIJ {
    private boolean a;
    private dIE b;
    private long c;
    private int d;
    private final C7872dIo e;
    private final InterfaceC7871dIn g;

    @Override // o.dIJ, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a = true;
    }

    public dIF(InterfaceC7871dIn interfaceC7871dIn) {
        C8632dsu.c((Object) interfaceC7871dIn, "");
        this.g = interfaceC7871dIn;
        C7872dIo o2 = interfaceC7871dIn.o();
        this.e = o2;
        dIE die = o2.c;
        this.b = die;
        this.d = die != null ? die.g : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r3 == r4.g) goto L14;
     */
    @Override // o.dIJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long b(o.C7872dIo r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L7f
            boolean r3 = r8.a
            r3 = r3 ^ 1
            if (r3 == 0) goto L73
            o.dIE r3 = r8.b
            if (r3 == 0) goto L31
            o.dIo r4 = r8.e
            o.dIE r4 = r4.c
            if (r3 != r4) goto L25
            int r3 = r8.d
            o.C8632dsu.d(r4)
            int r4 = r4.g
            if (r3 != r4) goto L25
            goto L31
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L31:
            if (r2 != 0) goto L34
            return r0
        L34:
            o.dIn r0 = r8.g
            long r1 = r8.c
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.j(r1)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            o.dIE r0 = r8.b
            if (r0 != 0) goto L57
            o.dIo r0 = r8.e
            o.dIE r0 = r0.c
            if (r0 == 0) goto L57
            r8.b = r0
            o.C8632dsu.d(r0)
            int r0 = r0.g
            r8.d = r0
        L57:
            o.dIo r0 = r8.e
            long r0 = r0.D()
            long r2 = r8.c
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            o.dIo r2 = r8.e
            long r4 = r8.c
            r3 = r9
            r6 = r10
            r2.a(r3, r4, r6)
            long r0 = r8.c
            long r0 = r0 + r10
            r8.c = r0
            return r10
        L73:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dIF.b(o.dIo, long):long");
    }

    @Override // o.dIJ
    public dIK e() {
        return this.g.e();
    }
}
