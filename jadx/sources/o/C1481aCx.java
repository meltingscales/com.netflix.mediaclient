package o;

import com.netflix.mediaclient.service.user.UserAgent;
import java.util.List;

/* renamed from: o.aCx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1481aCx implements InterfaceC1476aCs {
    private final UserAgent b() {
        return AbstractApplicationC1040Mh.getInstance().i().k();
    }

    @Override // o.InterfaceC1476aCs
    public List<InterfaceC5283bvo> a() {
        UserAgent b = b();
        if (b != null) {
            return b.b();
        }
        return null;
    }

    @Override // o.InterfaceC1476aCs
    public InterfaceC5282bvn d() {
        UserAgent b = b();
        if (b != null) {
            return b.i();
        }
        return null;
    }

    @Override // o.InterfaceC1476aCs
    public InterfaceC5283bvo e() {
        UserAgent b = b();
        if (b != null) {
            return b.j();
        }
        return null;
    }
}
