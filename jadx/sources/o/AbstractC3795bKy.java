package o;

import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import o.InterfaceC3825bMa;
import o.aLX;

/* renamed from: o.bKy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3795bKy extends AbstractC1754aN implements InterfaceC3829bMe {
    public drO<? extends TrackingInfo> c;
    public AppView d;
    private boolean h;
    private boolean i;
    private InterfaceC3825bMa.a j;

    public void a(InterfaceC3825bMa.a aVar) {
        this.j = aVar;
    }

    public final void c(boolean z) {
        this.h = z;
    }

    public final boolean k() {
        return this.h;
    }

    @Override // o.InterfaceC3825bMa
    public InterfaceC3825bMa.a n() {
        return this.j;
    }

    public final boolean t() {
        return this.i;
    }

    public final void w_(boolean z) {
        this.i = z;
    }

    @Override // o.InterfaceC3829bMe
    public drO<TrackingInfo> m() {
        drO dro = this.c;
        if (dro != null) {
            return dro;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC3829bMe
    public AppView aj_() {
        AppView appView = this.d;
        if (appView != null) {
            return appView;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.C3126at, o.AbstractC3336ax
    /* renamed from: d */
    public void e(C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        if (this.i) {
            c2077aZ.b().setTag(aLX.a.e, Boolean.TRUE);
        } else {
            c2077aZ.b().setTag(aLX.a.e, null);
        }
        if (this.h) {
            c2077aZ.b().setTag(aLX.a.a, Boolean.TRUE);
        } else {
            c2077aZ.b().setTag(aLX.a.a, null);
        }
        super.e(c2077aZ);
    }

    @Override // o.C3126at, o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(C2077aZ c2077aZ) {
        C8632dsu.c((Object) c2077aZ, "");
        c2077aZ.b().setTag(aLX.a.e, null);
        c2077aZ.b().setTag(aLX.a.a, null);
        super.e(c2077aZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        if (((o.InterfaceC3829bMe) r5).h(r2) != false) goto L16;
     */
    @Override // o.InterfaceC3829bMe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean h(o.AbstractC3179au r11) {
        /*
            r10 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r11, r0)
            java.lang.Class<o.aZ> r1 = o.C2077aZ.class
            java.lang.Object r11 = o.C9726vo.d(r11, r1)
            o.aZ r11 = (o.C2077aZ) r11
            java.util.List<o.as<?>> r1 = r10.b
            o.C8632dsu.a(r1, r0)
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = 0
            r4 = r3
        L19:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5e
            java.lang.Object r5 = r1.next()
            if (r4 >= 0) goto L28
            o.C8570dqm.e()
        L28:
            o.as r5 = (o.AbstractC3073as) r5
            java.util.ArrayList r6 = r11.d()
            java.lang.Object r6 = o.C8570dqm.a(r6, r4)
            o.aE r6 = (o.C1511aE) r6
            r7 = 1
            if (r2 == 0) goto L3c
            boolean r8 = r2.booleanValue()
            goto L3d
        L3c:
            r8 = r7
        L3d:
            if (r6 != 0) goto L40
            return r3
        L40:
            boolean r9 = r5 instanceof o.InterfaceC3829bMe
            if (r9 == 0) goto L5b
            if (r8 == 0) goto L56
            o.bMe r5 = (o.InterfaceC3829bMe) r5
            o.au r2 = r6.b()
            o.C8632dsu.a(r2, r0)
            boolean r2 = r5.h(r2)
            if (r2 == 0) goto L56
            goto L57
        L56:
            r7 = r3
        L57:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)
        L5b:
            int r4 = r4 + 1
            goto L19
        L5e:
            if (r2 == 0) goto L65
            boolean r11 = r2.booleanValue()
            return r11
        L65:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Group require at least 1 nested model implementing PresentableModelCL"
            r11.<init>(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC3795bKy.h(o.au):boolean");
    }
}
