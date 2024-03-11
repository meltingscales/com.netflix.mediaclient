package o;

import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import com.netflix.model.leafs.originals.interactive.InteractiveSummary;
import java.util.ArrayList;
import java.util.List;
import o.C5102bsS;

/* renamed from: o.dcI  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8006dcI {
    public static final void e(InterfaceC5160btX interfaceC5160btX, PlayerPrefetchSource playerPrefetchSource) {
        C8632dsu.c((Object) interfaceC5160btX, "");
        C8632dsu.c((Object) playerPrefetchSource, "");
        e(interfaceC5160btX, playerPrefetchSource, interfaceC5160btX.aF_());
    }

    public static final void e(InterfaceC5160btX interfaceC5160btX, PlayerPrefetchSource playerPrefetchSource, long j) {
        List<C5102bsS> e;
        C8632dsu.c((Object) interfaceC5160btX, "");
        C8632dsu.c((Object) playerPrefetchSource, "");
        C5102bsS b = b(interfaceC5160btX, playerPrefetchSource, j);
        if (b != null) {
            InterfaceC4360bcz a = InterfaceC4360bcz.b.a();
            e = C8566dqi.e(b);
            a.b(e);
        }
    }

    public static final void d(List<? extends InterfaceC5160btX> list, PlayerPrefetchSource playerPrefetchSource) {
        C5102bsS b;
        C8632dsu.c((Object) list, "");
        C8632dsu.c((Object) playerPrefetchSource, "");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC5160btX interfaceC5160btX : list) {
            if (interfaceC5160btX.isPlayable() && (b = b(interfaceC5160btX, playerPrefetchSource, interfaceC5160btX.aF_())) != null) {
                arrayList.add(b);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        InterfaceC4360bcz.b.a().b(arrayList);
    }

    private static final C5102bsS b(InterfaceC5160btX interfaceC5160btX, PlayerPrefetchSource playerPrefetchSource, long j) {
        boolean z;
        if (!interfaceC5160btX.isAvailableToPlay() || interfaceC5160btX.H()) {
            return null;
        }
        C5102bsS.b bVar = C5102bsS.d;
        String aH_ = interfaceC5160btX.aH_();
        if (interfaceC5160btX.az_() != null) {
            InteractiveSummary az_ = interfaceC5160btX.az_();
            C8632dsu.d(az_);
            if (az_.isBranchingNarrative()) {
                z = true;
                return C5102bsS.b.d(bVar, aH_, j, playerPrefetchSource, z, false, 16, null);
            }
        }
        z = false;
        return C5102bsS.b.d(bVar, aH_, j, playerPrefetchSource, z, false, 16, null);
    }
}
