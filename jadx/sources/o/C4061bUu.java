package o;

import android.view.View;
import com.netflix.cl.Logger;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.cl.model.event.discrete.Selected;
import com.netflix.mediaclient.ui.home.impl.lolomo.items.ErrorCreator$errorLoadingLolomo$2$3;
import o.AbstractC3073as;
import o.C9834xU;
import o.bSJ;

/* renamed from: o.bUu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4061bUu {
    private final drM<bSJ, dpR> a;
    private final bSY e;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int a(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(int i, int i2, int i3) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(int i, int i2, int i3) {
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4061bUu(bSY bsy, drM<? super bSJ, dpR> drm) {
        C8632dsu.c((Object) bsy, "");
        C8632dsu.c((Object) drm, "");
        this.e = bsy;
        this.a = drm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4061bUu c4061bUu, View view) {
        C8632dsu.c((Object) c4061bUu, "");
        c4061bUu.a.invoke(new bSJ.n(null, 0, 3, null));
        Logger.INSTANCE.logEvent(new Selected(AppView.tryAgainButton, null, CommandValue.RetryCommand, null));
    }

    public final void a(InterfaceC2023aX interfaceC2023aX, String str) {
        C8632dsu.c((Object) interfaceC2023aX, "");
        bJK bjk = new bJK();
        bjk.d((CharSequence) "filler-top");
        bjk.b(new AbstractC3073as.b() { // from class: o.bUs
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int e;
                e = C4061bUu.e(i, i2, i3);
                return e;
            }
        });
        interfaceC2023aX.add(bjk);
        C3794bKx c3794bKx = new C3794bKx();
        c3794bKx.b((CharSequence) "error-lolomo-retry");
        c3794bKx.c(new AbstractC3073as.b() { // from class: o.bUr
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int a;
                a = C4061bUu.a(i, i2, i3);
                return a;
            }
        });
        c3794bKx.c((CharSequence) C8168dfL.d(C9834xU.h.j));
        c3794bKx.e((CharSequence) C8168dfL.d(C9834xU.h.f));
        c3794bKx.d(new View.OnClickListener() { // from class: o.bUv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4061bUu.b(C4061bUu.this, view);
            }
        });
        c3794bKx.a(bSY.a(this.e, false, 1, null));
        c3794bKx.c((drO<? extends TrackingInfo>) ErrorCreator$errorLoadingLolomo$2$3.d);
        interfaceC2023aX.add(c3794bKx);
        bJK bjk2 = new bJK();
        bjk2.d((CharSequence) "filler-bottom");
        bjk2.b(new AbstractC3073as.b() { // from class: o.bUt
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int g;
                g = C4061bUu.g(i, i2, i3);
                return g;
            }
        });
        interfaceC2023aX.add(bjk2);
    }
}
