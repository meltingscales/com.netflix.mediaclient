package o;

import com.netflix.mediaclient.graphqlrepo.transformers.GraphQLTimeCodes;
import com.netflix.model.leafs.VideoInfo;
import java.util.List;
import o.C2513ahW;
import o.C2539ahw;

/* renamed from: o.aEt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1531aEt extends C1535aEx {
    private final C2630ajh a;
    private final C2514ahX b;
    private final C2637ajo c;
    private final C2539ahw d;
    private final C2576aig e;

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public boolean F() {
        return false;
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public boolean M() {
        return false;
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public int an_() {
        return 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1531aEt(C2514ahX c2514ahX, C2539ahw c2539ahw, C2637ajo c2637ajo, C2630ajh c2630ajh, C2576aig c2576aig) {
        super(c2514ahX);
        C8632dsu.c((Object) c2514ahX, "");
        C8632dsu.c((Object) c2539ahw, "");
        this.b = c2514ahX;
        this.d = c2539ahw;
        this.c = c2637ajo;
        this.a = c2630ajh;
        this.e = c2576aig;
    }

    @Override // o.C1535aEx, o.InterfaceC5176btn
    public boolean aY_() {
        return (f() == null && this.d.a() == null) ? false : true;
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public boolean aU_() {
        Boolean a;
        C2572aic j;
        C2513ahW f = f();
        if (f == null || (a = f.b()) == null) {
            C2539ahw.d a2 = this.d.a();
            a = (a2 == null || (j = a2.j()) == null) ? null : j.a();
            if (a == null) {
                return false;
            }
        }
        return a.booleanValue();
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public String aL_() {
        C2539ahw.i c;
        C2513ahW.e c2;
        String e;
        C2513ahW f = f();
        if (f == null || (c2 = f.c()) == null || (e = c2.e()) == null) {
            C2539ahw.d a = this.d.a();
            String a2 = (a == null || (c = a.c()) == null) ? null : c.a();
            return a2 == null ? "" : a2;
        }
        return e;
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public String aK_() {
        C2539ahw.i c;
        C2513ahW.e c2;
        String c3;
        C2513ahW f = f();
        if (f == null || (c2 = f.c()) == null || (c3 = c2.c()) == null) {
            C2539ahw.d a = this.d.a();
            String a2 = (a == null || (c = a.c()) == null) ? null : c.a();
            return a2 == null ? "" : a2;
        }
        return c3;
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public int x() {
        Integer d;
        C2539ahw.i c;
        C2513ahW.e c2;
        C2513ahW f = f();
        if (f == null || (c2 = f.c()) == null || (d = c2.d()) == null) {
            C2539ahw.d a = this.d.a();
            d = (a == null || (c = a.c()) == null) ? null : c.d();
            if (d == null) {
                return -1;
            }
        }
        return d.intValue();
    }

    public final C2572aic i() {
        C2539ahw.c d;
        C2572aic d2;
        C2539ahw.h b = this.d.b();
        if (b == null || (d = b.d()) == null || (d2 = d.d()) == null) {
            C2539ahw.d a = this.d.a();
            if (a != null) {
                return a.j();
            }
            return null;
        }
        return d2;
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public boolean G() {
        List<Integer> h = this.d.h();
        if (h != null) {
            return h.contains(1681383);
        }
        return false;
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public boolean aV_() {
        Boolean c;
        C2539ahw.b e;
        C2539ahw.c d;
        C2539ahw.e b;
        C2539ahw.h b2 = this.d.b();
        if (b2 == null || (d = b2.d()) == null || (b = d.b()) == null || (c = b.b()) == null) {
            C2539ahw.d a = this.d.a();
            c = (a == null || (e = a.e()) == null) ? null : e.c();
            if (c == null) {
                return false;
            }
        }
        return c.booleanValue();
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public boolean N() {
        C2572aic i;
        C2513ahW f;
        C2513ahW.e c;
        Integer d;
        C2513ahW f2;
        Integer a;
        return (i() == null || (i = i()) == null || !C8632dsu.c(i.b(), Boolean.TRUE) || (f = f()) == null || (c = f.c()) == null || (d = c.d()) == null || d.intValue() <= 1 || (f2 = f()) == null || (a = f2.a()) == null || a.intValue() != 1) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r0 != null) goto L17;
     */
    @Override // o.C1535aEx, o.InterfaceC5160btX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int aB_() {
        /*
            r2 = this;
            o.ahw r0 = r2.d
            java.lang.String r0 = r0.e()
            o.aqU$a r1 = o.C2988aqU.e
            o.hF r1 = r1.c()
            java.lang.String r1 = r1.toString()
            boolean r0 = o.C8632dsu.c(r0, r1)
            if (r0 == 0) goto L29
            o.ahw r0 = r2.d
            o.ahw$a r0 = r0.d()
            if (r0 == 0) goto L53
            java.lang.Integer r0 = r0.b()
            if (r0 == 0) goto L53
            int r0 = r0.intValue()
            goto L54
        L29:
            o.ahw r0 = r2.d
            o.ahw$h r0 = r0.b()
            if (r0 == 0) goto L3e
            o.ahw$c r0 = r0.d()
            if (r0 == 0) goto L3e
            java.lang.Integer r0 = r0.a()
            if (r0 == 0) goto L3e
            goto L4e
        L3e:
            o.ahw r0 = r2.d
            o.ahw$d r0 = r0.a()
            if (r0 == 0) goto L4b
            java.lang.Integer r0 = r0.a()
            goto L4c
        L4b:
            r0 = 0
        L4c:
            if (r0 == 0) goto L53
        L4e:
            int r0 = r0.intValue()
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1531aEt.aB_():int");
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public VideoInfo.TimeCodes B() {
        C2630ajh c2630ajh;
        C2637ajo c2637ajo = this.c;
        if (c2637ajo == null || (c2630ajh = this.a) == null) {
            return null;
        }
        return new GraphQLTimeCodes(c2637ajo, c2630ajh);
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public String aO_() {
        String num;
        C2576aig c2576aig = this.e;
        if (c2576aig == null || (num = Integer.valueOf(c2576aig.a()).toString()) == null) {
            String aO_ = super.aO_();
            return aO_ == null ? "" : aO_;
        }
        return num;
    }

    @Override // o.C1535aEx, o.InterfaceC5160btX
    public int aw_() {
        Integer c;
        C2572aic j;
        C2513ahW f = f();
        if (f == null || (c = f.a()) == null) {
            C2539ahw.d a = this.d.a();
            c = (a == null || (j = a.j()) == null) ? null : j.c();
            if (c == null) {
                return 0;
            }
        }
        return c.intValue();
    }
}
