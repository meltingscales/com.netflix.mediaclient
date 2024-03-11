package o;

import androidx.media3.common.Player;
import androidx.media3.common.VideoSize;
import com.netflix.mediaclient.service.player.common.NetflixCroppingMetadataEntry;

/* renamed from: o.bhb  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4601bhb implements InterfaceC4372bdK, Player.Listener {
    private NetflixCroppingMetadataEntry a;
    private InterfaceC5122bsm b;
    private VideoSize d;
    private NetflixCroppingMetadataEntry e;

    public final void a(InterfaceC5122bsm interfaceC5122bsm) {
        this.b = interfaceC5122bsm;
        this.e = null;
        c();
    }

    @Override // o.InterfaceC4372bdK
    public void d(NetflixCroppingMetadataEntry netflixCroppingMetadataEntry) {
        this.a = netflixCroppingMetadataEntry;
        if (this.e == null) {
            c();
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public void onVideoSizeChanged(VideoSize videoSize) {
        C8632dsu.c((Object) videoSize, "");
        this.d = videoSize;
        c();
    }

    private final void c() {
        InterfaceC5122bsm interfaceC5122bsm;
        NetflixCroppingMetadataEntry netflixCroppingMetadataEntry = this.a;
        if (netflixCroppingMetadataEntry == null) {
            VideoSize videoSize = this.d;
            netflixCroppingMetadataEntry = videoSize != null ? C4602bhc.a(videoSize) : null;
        }
        if (C8632dsu.c(this.e, netflixCroppingMetadataEntry)) {
            return;
        }
        this.e = netflixCroppingMetadataEntry;
        if (netflixCroppingMetadataEntry == null || (interfaceC5122bsm = this.b) == null) {
            return;
        }
        interfaceC5122bsm.e(netflixCroppingMetadataEntry.b(), netflixCroppingMetadataEntry.c(), netflixCroppingMetadataEntry.d(), netflixCroppingMetadataEntry.a());
    }
}
