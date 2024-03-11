package com.netflix.mediaclient.ui.games.impl.gdp.mvrx;

import com.netflix.mediaclient.ui.games.impl.gdp.mvrx.GdpViewModel$onCleared$1;
import kotlin.jvm.internal.Lambda;
import o.AbstractC5100bsQ;
import o.C3952bQt;
import o.C8187dfe;
import o.C8632dsu;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class GdpViewModel$onCleared$1 extends Lambda implements drM<C3952bQt.c, dpR> {
    public static final GdpViewModel$onCleared$1 a = new GdpViewModel$onCleared$1();

    GdpViewModel$onCleared$1() {
        super(1);
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(C3952bQt.c cVar) {
        e(cVar);
        return dpR.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C3952bQt.c cVar) {
        AbstractC5100bsQ b;
        C8632dsu.c((Object) cVar, "");
        C3952bQt.d c = cVar.c().c();
        if (c == null || (b = c.b()) == null) {
            return;
        }
        b.e();
    }

    public final void e(final C3952bQt.c cVar) {
        C8632dsu.c((Object) cVar, "");
        C8187dfe.c(new Runnable() { // from class: o.bQw
            @Override // java.lang.Runnable
            public final void run() {
                GdpViewModel$onCleared$1.c(C3952bQt.c.this);
            }
        });
    }
}
