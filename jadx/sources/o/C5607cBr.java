package o;

import com.netflix.mediaclient.ui.player.v2.PlayerPrefetcherImpl$prefetch$1;
import java.util.List;
import javax.inject.Inject;

/* renamed from: o.cBr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5607cBr implements InterfaceC5606cBq {
    private final dwU a;
    private final InterfaceC5602cBm d;

    @Inject
    public C5607cBr(InterfaceC5602cBm interfaceC5602cBm, dwU dwu) {
        C8632dsu.c((Object) interfaceC5602cBm, "");
        C8632dsu.c((Object) dwu, "");
        this.d = interfaceC5602cBm;
        this.a = dwu;
    }

    @Override // o.InterfaceC5606cBq
    public void b(List<? extends InterfaceC5177bto> list) {
        C8632dsu.c((Object) list, "");
        if (!list.isEmpty()) {
            C8737dwr.c(this.a, null, null, new PlayerPrefetcherImpl$prefetch$1(this, list, null), 3, null);
        }
    }
}
