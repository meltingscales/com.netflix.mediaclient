package com.netflix.mediaclient.ui.home.impl;

import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.ui.home.impl.HomeLoadingScreens$renderShimmerRow$2;
import kotlin.jvm.internal.Lambda;
import o.AbstractC3073as;
import o.C1729aMb;
import o.C3787bKq;
import o.C8632dsu;
import o.bJE;
import o.bSM;
import o.bSS;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class HomeLoadingScreens$renderShimmerRow$2 extends Lambda implements drM<bJE, dpR> {
    final /* synthetic */ Integer a;
    final /* synthetic */ C1729aMb b;
    final /* synthetic */ int c;
    final /* synthetic */ Boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeLoadingScreens$renderShimmerRow$2(int i, C1729aMb c1729aMb, Integer num, Boolean bool) {
        super(1);
        this.c = i;
        this.b = c1729aMb;
        this.a = num;
        this.d = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i, int i2, int i3) {
        return i;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(bJE bje) {
        e(bje);
        return dpR.c;
    }

    public final void e(bJE bje) {
        C8632dsu.c((Object) bje, "");
        int i = this.c;
        bje.b("row-load-" + i);
        bje.d(this.c);
        bje.b(this.b);
        bje.b(new AbstractC3073as.b() { // from class: o.bSK
            @Override // o.AbstractC3073as.b
            public final int b(int i2, int i3, int i4) {
                int c;
                c = HomeLoadingScreens$renderShimmerRow$2.c(i2, i3, i4);
                return c;
            }
        });
        int m = this.b.m();
        for (int i2 = 0; i2 < m + 1; i2++) {
            int i3 = this.c;
            Integer num = this.a;
            Boolean bool = this.d;
            C3787bKq c3787bKq = new C3787bKq();
            String d = bSS.d(i3, i2);
            c3787bKq.b((CharSequence) ("row-load-inner-" + d));
            c3787bKq.a(BrowseExperience.e());
            if (num != null) {
                c3787bKq.c(num.intValue());
            }
            if (bool == null || c3787bKq.b(bool.booleanValue()) == null) {
                c3787bKq.d(true);
            }
            c3787bKq.c(bSM.e.b());
            c3787bKq.c(true);
            bje.add(c3787bKq);
        }
    }
}
