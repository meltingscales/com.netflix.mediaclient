package o;

import java.util.List;
import o.C2476agm;

/* renamed from: o.aEh  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1519aEh extends C1514aEc {
    private final int a;
    private final C2344aeV b;
    private final C2342aeT c;
    private final String d;
    private final C2476agm.c e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1519aEh(java.lang.String r9, int r10, o.C2344aeV r11, o.C2342aeT r12, o.C2476agm.c r13) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r11, r0)
            o.C8632dsu.c(r12, r0)
            o.C8632dsu.c(r13, r0)
            o.aeT$e r0 = r12.c()
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.String r0 = r0.e()
            r6 = r0
            goto L19
        L18:
            r6 = r1
        L19:
            o.aeT$e r0 = r12.c()
            if (r0 == 0) goto L23
            java.lang.String r1 = r0.a()
        L23:
            r7 = r1
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r8.d = r9
            r8.a = r10
            r8.b = r11
            r8.c = r12
            r8.e = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1519aEh.<init>(java.lang.String, int, o.aeV, o.aeT, o.agm$c):void");
    }

    @Override // o.C1514aEc, o.InterfaceC5185btw
    public String a() {
        C2476agm.a d;
        C2476agm.b e;
        List<C2476agm.g> c;
        Object x;
        C2476agm.e c2 = this.e.c();
        if (c2 != null && (d = c2.d()) != null && (e = d.e()) != null && (c = e.c()) != null) {
            x = C8576dqs.x(c);
            C2476agm.g gVar = (C2476agm.g) x;
            if (gVar != null) {
                return gVar.d();
            }
        }
        return null;
    }
}
