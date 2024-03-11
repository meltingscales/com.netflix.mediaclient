package com.netflix.mediaclient.ui.home.impl.lolomo;

import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.ui.home.impl.lolomo.GraphQLLolomoViewModel$findRowVideos$1;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import o.C4049bUi;
import o.C8187dfe;
import o.C8632dsu;
import o.InterfaceC5222bug;
import o.InterfaceC5223buh;
import o.dpR;
import o.drM;
import o.drX;

/* loaded from: classes4.dex */
public final class GraphQLLolomoViewModel$findRowVideos$1 extends Lambda implements drM<C4049bUi, dpR> {
    final /* synthetic */ String a;
    final /* synthetic */ drX<LoMo, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>, dpR> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GraphQLLolomoViewModel$findRowVideos$1(String str, drX<? super LoMo, ? super List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>, dpR> drx) {
        super(1);
        this.a = str;
        this.d = drx;
    }

    @Override // o.drM
    public /* synthetic */ dpR invoke(C4049bUi c4049bUi) {
        d(c4049bUi);
        return dpR.c;
    }

    public final void d(C4049bUi c4049bUi) {
        final List<InterfaceC5222bug<? extends InterfaceC5223buh>> c;
        C8632dsu.c((Object) c4049bUi, "");
        final LoMo e = c4049bUi.e(this.a);
        if (e == null || (c = c4049bUi.c(e)) == null) {
            return;
        }
        final drX<LoMo, List<? extends InterfaceC5222bug<? extends InterfaceC5223buh>>, dpR> drx = this.d;
        C8187dfe.b(new Runnable() { // from class: o.bTH
            @Override // java.lang.Runnable
            public final void run() {
                GraphQLLolomoViewModel$findRowVideos$1.b(drX.this, e, c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(drX drx, LoMo loMo, List list) {
        C8632dsu.c((Object) drx, "");
        drx.invoke(loMo, list);
    }
}
