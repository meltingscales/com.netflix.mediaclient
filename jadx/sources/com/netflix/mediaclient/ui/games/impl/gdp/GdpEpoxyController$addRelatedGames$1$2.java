package com.netflix.mediaclient.ui.games.impl.gdp;

import android.view.View;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpEpoxyController$addRelatedGames$1$2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import o.AbstractC3073as;
import o.AbstractC3910bPe;
import o.C1729aMb;
import o.C8569dql;
import o.C8572dqo;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC3825bMa;
import o.InterfaceC5185btw;
import o.bJE;
import o.bLU;
import o.bNN;
import o.bNV;
import o.dpR;
import o.drM;

/* loaded from: classes4.dex */
public final class GdpEpoxyController$addRelatedGames$1$2 extends Lambda implements drM<bJE, dpR> {
    final /* synthetic */ C1729aMb a;
    final /* synthetic */ Ref.ObjectRef<TrackingInfoHolder> c;
    final /* synthetic */ GdpEpoxyController d;
    final /* synthetic */ List<InterfaceC5185btw> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GdpEpoxyController$addRelatedGames$1$2(C1729aMb c1729aMb, List<? extends InterfaceC5185btw> list, Ref.ObjectRef<TrackingInfoHolder> objectRef, GdpEpoxyController gdpEpoxyController) {
        super(1);
        this.a = c1729aMb;
        this.e = list;
        this.c = objectRef;
        this.d = gdpEpoxyController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(int i, int i2, int i3) {
        return i;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(bJE bje) {
        b(bje);
        return dpR.c;
    }

    public final void b(bJE bje) {
        int d;
        bNN bnn;
        bNV bnv;
        bLU blu;
        C8632dsu.c((Object) bje, "");
        bje.b("game-sims-group");
        bje.b(this.a);
        bje.b(new AbstractC3073as.b() { // from class: o.bPB
            @Override // o.AbstractC3073as.b
            public final int b(int i, int i2, int i3) {
                int b;
                b = GdpEpoxyController$addRelatedGames$1$2.b(i, i2, i3);
                return b;
            }
        });
        List<InterfaceC5185btw> list = this.e;
        Ref.ObjectRef<TrackingInfoHolder> objectRef = this.c;
        final GdpEpoxyController gdpEpoxyController = this.d;
        C1729aMb c1729aMb = this.a;
        d = C8572dqo.d(list, 10);
        ArrayList arrayList = new ArrayList(d);
        int i = 0;
        for (Object obj : list) {
            if (i < 0) {
                C8569dql.h();
            }
            final InterfaceC5185btw interfaceC5185btw = (InterfaceC5185btw) obj;
            final TrackingInfoHolder e = objectRef.d.e(interfaceC5185btw, i);
            bnn = gdpEpoxyController.gameModels;
            bnv = gdpEpoxyController.gamesUtils;
            int b = bnv.b(c1729aMb);
            AppView appView = AppView.boxArt;
            InterfaceC3825bMa.a aVar = new InterfaceC3825bMa.a(null, null, Integer.valueOf(e.a()), 3, null);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: o.bPK
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GdpEpoxyController$addRelatedGames$1$2.b(GdpEpoxyController.this, interfaceC5185btw, e, view);
                }
            };
            blu = gdpEpoxyController.epoxyPresentationTracking;
            ArrayList arrayList2 = arrayList;
            bNN.b.a(bnn, bje, interfaceC5185btw, null, i, null, Integer.valueOf(b), appView, aVar, onClickListener, e, blu, null, 1034, null);
            arrayList2.add(dpR.c);
            i++;
            arrayList = arrayList2;
            gdpEpoxyController = gdpEpoxyController;
            c1729aMb = c1729aMb;
            objectRef = objectRef;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(GdpEpoxyController gdpEpoxyController, InterfaceC5185btw interfaceC5185btw, TrackingInfoHolder trackingInfoHolder, View view) {
        C9935zP c9935zP;
        C8632dsu.c((Object) gdpEpoxyController, "");
        C8632dsu.c((Object) interfaceC5185btw, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        c9935zP = gdpEpoxyController.eventBusFactory;
        String id = interfaceC5185btw.getId();
        C8632dsu.a(id, "");
        String title = interfaceC5185btw.getTitle();
        C8632dsu.a(title, "");
        c9935zP.b(AbstractC3910bPe.class, new AbstractC3910bPe.c(id, title, trackingInfoHolder, "sims"));
    }
}
