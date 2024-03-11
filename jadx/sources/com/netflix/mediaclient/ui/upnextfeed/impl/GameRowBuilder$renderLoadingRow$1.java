package com.netflix.mediaclient.ui.upnextfeed.impl;

import android.content.Context;
import android.util.TypedValue;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.mediaclient.ui.upnextfeed.impl.GameRowBuilder$renderLoadingRow$1;
import kotlin.jvm.internal.Lambda;
import o.AbstractC3073as;
import o.C1332Xp;
import o.C1729aMb;
import o.C8632dsu;
import o.bJE;
import o.bKU;
import o.cYQ;
import o.dpR;
import o.drM;

/* loaded from: classes5.dex */
public final class GameRowBuilder$renderLoadingRow$1 extends Lambda implements drM<bJE, dpR> {
    final /* synthetic */ C1729aMb a;
    final /* synthetic */ int b;
    final /* synthetic */ LoMoType c;
    final /* synthetic */ cYQ d;
    final /* synthetic */ cYQ e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameRowBuilder$renderLoadingRow$1(cYQ cyq, C1729aMb c1729aMb, cYQ cyq2, LoMoType loMoType, int i) {
        super(1);
        this.e = cyq;
        this.a = c1729aMb;
        this.d = cyq2;
        this.c = loMoType;
        this.b = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(int i, int i2, int i3) {
        return i;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(bJE bje) {
        a(bje);
        return dpR.c;
    }

    public final void a(bJE bje) {
        int e;
        C8632dsu.c((Object) bje, "");
        bje.b("row-upnext-games");
        e = this.e.e();
        bje.c(e);
        bje.b(this.a);
        bje.e(true);
        bje.b(new AbstractC3073as.b() { // from class: o.cYZ
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int c;
                c = GameRowBuilder$renderLoadingRow$1.c(i, i2, i3);
                return c;
            }
        });
        int m = this.a.m();
        for (int i = 0; i < m + 1; i++) {
            this.d.d(bje, this.c, this.b, i, this.a, null);
        }
        int o2 = this.a.o();
        for (int i2 = 0; i2 < o2; i2++) {
            bKU bku = new bKU();
            bku.d((CharSequence) ("loading-peek-row-upnext-games-" + i2));
            C1332Xp c1332Xp = C1332Xp.b;
            bku.d(Integer.valueOf((int) TypedValue.applyDimension(1, (float) 4, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics())));
            bje.add(bku);
        }
    }
}
