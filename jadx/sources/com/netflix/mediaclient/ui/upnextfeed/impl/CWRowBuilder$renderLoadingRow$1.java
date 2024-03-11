package com.netflix.mediaclient.ui.upnextfeed.impl;

import android.content.Context;
import android.util.TypedValue;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.upnextfeed.impl.CWRowBuilder$renderLoadingRow$1;
import kotlin.jvm.internal.Lambda;
import o.AbstractC3073as;
import o.C1332Xp;
import o.C1729aMb;
import o.C3787bKq;
import o.C6238cYz;
import o.C8632dsu;
import o.bJE;
import o.bKU;
import o.dpR;
import o.drM;

/* loaded from: classes5.dex */
public final class CWRowBuilder$renderLoadingRow$1 extends Lambda implements drM<bJE, dpR> {
    final /* synthetic */ C6238cYz a;
    final /* synthetic */ C6238cYz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CWRowBuilder$renderLoadingRow$1(C6238cYz c6238cYz, C6238cYz c6238cYz2) {
        super(1);
        this.a = c6238cYz;
        this.d = c6238cYz2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(int i, int i2, int i3) {
        return i;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(bJE bje) {
        d(bje);
        return dpR.c;
    }

    public final void d(bJE bje) {
        int b;
        C1729aMb c1729aMb;
        C1729aMb c1729aMb2;
        C1729aMb c1729aMb3;
        C8632dsu.c((Object) bje, "");
        bje.b("row-cw-videos");
        b = this.a.b();
        bje.c(b);
        c1729aMb = this.d.b;
        bje.b(c1729aMb);
        bje.e(true);
        bje.b(new AbstractC3073as.b() { // from class: o.cYD
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int b2;
                b2 = CWRowBuilder$renderLoadingRow$1.b(i, i2, i3);
                return b2;
            }
        });
        c1729aMb2 = this.d.b;
        int m = c1729aMb2.m();
        for (int i = 0; i < m + 1; i++) {
            C3787bKq c3787bKq = new C3787bKq();
            c3787bKq.b((CharSequence) ("shim-cw-row-" + i));
            c3787bKq.c(400L);
            c3787bKq.a(BrowseExperience.e());
            c3787bKq.c(true);
            c3787bKq.d(true);
            bje.add(c3787bKq);
        }
        c1729aMb3 = this.d.b;
        int o2 = c1729aMb3.o();
        for (int i2 = 0; i2 < o2; i2++) {
            bKU bku = new bKU();
            bku.d((CharSequence) ("loading-peek-cw-row-" + i2));
            C1332Xp c1332Xp = C1332Xp.b;
            bku.d(Integer.valueOf((int) TypedValue.applyDimension(1, (float) 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            bje.add(bku);
        }
    }
}
