package o;

/* loaded from: classes5.dex */
public class dxF extends dxM implements dwG {
    private final boolean c;

    @Override // o.dxM
    public boolean cr_() {
        return this.c;
    }

    @Override // o.dxM
    public boolean cx_() {
        return true;
    }

    public dxF(dxD dxd) {
        super(true);
        a(dxd);
        this.c = v();
    }

    @Override // o.dwG
    public boolean c(Throwable th) {
        return j(new dwO(th, false, 2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean v() {
        /*
            r3 = this;
            o.dwE r0 = r3.t()
            boolean r1 = r0 instanceof o.dwD
            r2 = 0
            if (r1 == 0) goto Lc
            o.dwD r0 = (o.dwD) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L32
            o.dxM r0 = r0.b()
            if (r0 != 0) goto L16
            goto L32
        L16:
            boolean r1 = r0.cr_()
            if (r1 == 0) goto L1e
            r0 = 1
            return r0
        L1e:
            o.dwE r0 = r0.t()
            boolean r1 = r0 instanceof o.dwD
            if (r1 == 0) goto L29
            o.dwD r0 = (o.dwD) r0
            goto L2a
        L29:
            r0 = r2
        L2a:
            if (r0 == 0) goto L32
            o.dxM r0 = r0.b()
            if (r0 != 0) goto L16
        L32:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dxF.v():boolean");
    }
}
