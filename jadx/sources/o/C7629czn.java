package o;

import com.netflix.mediaclient.ui.player.PlayerFragmentV2;

/* renamed from: o.czn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7629czn implements InterfaceC7448cwR {
    private C7631czp c;
    PlayerFragmentV2 d;

    public C7629czn(PlayerFragmentV2 playerFragmentV2, C7631czp c7631czp) {
        this.d = playerFragmentV2;
        this.c = c7631czp;
    }

    @Override // o.InterfaceC7448cwR
    public InterfaceC7450cwT c() {
        if (this.d.j()) {
            return new C7513cxd(this.d, this.c);
        }
        return new C7632czq(this.d, this.c);
    }
}
