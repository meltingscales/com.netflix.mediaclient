package o;

import com.netflix.mediaclient.clutils.PlayContextImp;
import com.netflix.mediaclient.ui.player.PlayerFragmentV2;

/* renamed from: o.czf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7621czf extends AbstractC4322bcN {
    private final PlayerFragmentV2 d;

    public C7621czf(PlayerFragmentV2 playerFragmentV2) {
        this.d = playerFragmentV2;
    }

    @Override // o.AbstractC4322bcN
    public void d() {
        InterfaceC5198buI v = this.d.v();
        if (v != null) {
            this.d.a(v, PlayContextImp.f, v.aE_().aF_());
        }
    }
}
