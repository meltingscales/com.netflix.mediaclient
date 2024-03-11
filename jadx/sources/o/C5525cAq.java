package o;

import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import o.AbstractC5531cAw;
import o.AbstractC7612czW;
import o.cBR;

/* renamed from: o.cAq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5525cAq implements InterfaceC5527cAs {
    public static final e e = new e(null);

    /* renamed from: o.cAq$e */
    /* loaded from: classes4.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("PostPlayUIEventHandlerImpl");
        }
    }

    @Override // o.InterfaceC5527cAs
    public AbstractC7612czW a(cBR cbr, AbstractC5531cAw abstractC5531cAw) {
        C8632dsu.c((Object) cbr, "");
        C8632dsu.c((Object) abstractC5531cAw, "");
        if (cbr instanceof cBR.e) {
            if (abstractC5531cAw instanceof C5529cAu) {
                return a((cBR.e) cbr, (C5529cAu) abstractC5531cAw);
            }
            return AbstractC7612czW.d.a;
        } else if (cbr instanceof cBR.d) {
            if (abstractC5531cAw instanceof AbstractC5531cAw.b) {
                return a((cBR.d) cbr);
            }
            return AbstractC7612czW.d.a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final AbstractC7612czW a(cBR.e eVar, C5529cAu c5529cAu) {
        if (C8632dsu.c(eVar, cBR.e.C0109e.d)) {
            C7496cxM c7496cxM = C7496cxM.e;
            c7496cxM.c();
            c7496cxM.e("manualPlayNextEp");
            return a(false, c5529cAu);
        } else if (C8632dsu.c(eVar, cBR.e.c.c)) {
            C7496cxM.e.c();
            return AbstractC7612czW.d.a;
        } else if (C8632dsu.c(eVar, cBR.e.d.a)) {
            C7496cxM c7496cxM2 = C7496cxM.e;
            c7496cxM2.e();
            c7496cxM2.e("autoPlayNextEp");
            return a(true, c5529cAu);
        } else if (C8632dsu.c(eVar, cBR.e.a.e)) {
            Integer a = c5529cAu.a();
            if (a != null) {
                C7496cxM.e.a(TimeUnit.SECONDS.toMillis(a.intValue()));
            }
            return AbstractC7612czW.d.a;
        } else if (C8632dsu.c(eVar, cBR.e.b.a)) {
            C7496cxM.e.e("screenTap");
            return AbstractC7612czW.b.d;
        } else if (C8632dsu.c(eVar, cBR.e.f.e)) {
            C7496cxM.e.e("watchCredits");
            return AbstractC7612czW.b.d;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final AbstractC7612czW.e a(boolean z, C5529cAu c5529cAu) {
        Integer j;
        if (!z && (j = c5529cAu.j()) != null) {
            C7496cxM.e.d(j.intValue());
        }
        boolean z2 = !c5529cAu.b() && z;
        C7631czp c7631czp = new C7631czp(true, "postplay", c5529cAu.d(), false);
        c cVar = new c(z, c5529cAu);
        int f = c5529cAu.f();
        PlayLocationType playLocationType = PlayLocationType.POST_PLAY;
        PlayContextImp playContextImp = new PlayContextImp(cVar, f, null, playLocationType, null, null);
        playContextImp.b(z);
        playContextImp.d(playLocationType);
        return new AbstractC7612czW.e(z, c5529cAu.i(), playContextImp, c5529cAu.c(), c7631czp, z2);
    }

    /* renamed from: o.cAq$c */
    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC5281bvm {
        final /* synthetic */ boolean a;
        final /* synthetic */ C5529cAu c;

        @Override // o.InterfaceC5281bvm
        public String getImpressionToken() {
            return null;
        }

        @Override // o.InterfaceC5281bvm
        public String getListContext() {
            return null;
        }

        @Override // o.InterfaceC5281bvm
        public String getSectionUid() {
            return null;
        }

        c(boolean z, C5529cAu c5529cAu) {
            this.a = z;
            this.c = c5529cAu;
        }

        @Override // o.InterfaceC5281bvm
        public int getTrackId() {
            Integer j;
            if (this.a) {
                j = this.c.g();
            } else {
                j = this.c.j();
            }
            if (j != null) {
                return j.intValue();
            }
            return 0;
        }

        @Override // o.InterfaceC5281bvm
        public int getListPos() {
            return this.c.f();
        }

        @Override // o.InterfaceC5281bvm
        public String getRequestId() {
            return this.c.m();
        }

        @Override // o.InterfaceC5281bvm
        public String getListId() {
            return this.c.k();
        }
    }

    private final AbstractC7612czW a(cBR.d dVar) {
        if (C8632dsu.c(dVar, cBR.d.c.e)) {
            return c();
        }
        if (C8632dsu.c(dVar, cBR.d.a.c)) {
            return c();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final AbstractC7612czW.a c() {
        C7496cxM.d();
        return AbstractC7612czW.a.b;
    }
}
