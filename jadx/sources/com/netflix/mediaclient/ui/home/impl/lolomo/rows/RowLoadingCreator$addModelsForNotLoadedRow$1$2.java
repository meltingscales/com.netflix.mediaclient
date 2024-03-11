package com.netflix.mediaclient.ui.home.impl.lolomo.rows;

import com.netflix.mediaclient.ui.home.impl.lolomo.rows.RowLoadingCreator$addModelsForNotLoadedRow$1$2;
import kotlin.jvm.internal.Lambda;
import o.AbstractC3073as;
import o.C1729aMb;
import o.C8632dsu;
import o.bJE;
import o.bVV;
import o.dpR;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class RowLoadingCreator$addModelsForNotLoadedRow$1$2 extends Lambda implements drM<bJE, dpR> {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ C1729aMb c;
    final /* synthetic */ bVV d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowLoadingCreator$addModelsForNotLoadedRow$1$2(int i, C1729aMb c1729aMb, bVV bvv, int i2, int i3) {
        super(1);
        this.a = i;
        this.c = c1729aMb;
        this.d = bvv;
        this.e = i2;
        this.b = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(int i, int i2, int i3) {
        return i;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(bJE bje) {
        a(bje);
        return dpR.c;
    }

    public final void a(bJE bje) {
        C8632dsu.c((Object) bje, "");
        int i = this.a;
        bje.b("more-row-load-" + i);
        bje.d(this.a);
        bje.b(this.c);
        bje.b(new AbstractC3073as.b() { // from class: o.bWc
            @Override // o.AbstractC3073as.b
            public final int b(int i2, int i3, int i4) {
                int d;
                d = RowLoadingCreator$addModelsForNotLoadedRow$1$2.d(i2, i3, i4);
                return d;
            }
        });
        bje.e(true);
        int m = this.c.m();
        int m2 = this.c.m();
        final bVV bvv = this.d;
        final int i2 = this.a;
        C1729aMb c1729aMb = this.c;
        final int i3 = this.e;
        final int i4 = this.b;
        bvv.a(bje, null, i2, m + 1, (r22 & 16) != 0 ? 0 : 0, m2 + 1, c1729aMb, (r22 & 128) != 0, new drO<dpR>() { // from class: com.netflix.mediaclient.ui.home.impl.lolomo.rows.RowLoadingCreator$addModelsForNotLoadedRow$1$2.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                c();
                return dpR.c;
            }

            public final void c() {
                bVV.this.a(i2, i3, i4);
            }
        });
    }
}
