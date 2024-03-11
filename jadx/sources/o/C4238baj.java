package o;

import android.content.Context;
import com.netflix.cl.model.CachedVideoPlayableStatus;
import com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface;
import com.netflix.mediaclient.servicemgr.interface_.offline.DownloadState;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.baj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4238baj {
    C4238baj() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, C4240bal> d(OfflineRegistryInterface offlineRegistryInterface) {
        List<InterfaceC4299bbr> i = offlineRegistryInterface.i();
        List<C4281bbZ> j = offlineRegistryInterface.j();
        HashMap hashMap = new HashMap();
        for (InterfaceC4299bbr interfaceC4299bbr : i) {
            hashMap.put(interfaceC4299bbr.h(), new C4240bal(interfaceC4299bbr.i(), C4206baD.d(interfaceC4299bbr, j), c(interfaceC4299bbr)));
        }
        return hashMap;
    }

    private static CachedVideoPlayableStatus c(InterfaceC4299bbr interfaceC4299bbr) {
        if (interfaceC4299bbr.t() != DownloadState.Complete) {
            return CachedVideoPlayableStatus.downloading;
        }
        if (interfaceC4299bbr.P()) {
            return CachedVideoPlayableStatus.restrictedGeo;
        }
        boolean d = C4221baS.d(interfaceC4299bbr);
        boolean c = C4221baS.c((Context) C1332Xp.b(Context.class), interfaceC4299bbr);
        boolean a = C4221baS.a(interfaceC4299bbr);
        if (d || (!c) || (!a)) {
            return CachedVideoPlayableStatus.staleLicense;
        }
        return CachedVideoPlayableStatus.ready;
    }
}
