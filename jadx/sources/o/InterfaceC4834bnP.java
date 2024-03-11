package o;

import androidx.media3.datasource.DataSpec;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixdatasource.NetflixNetworkError;
import org.chromium.net.RequestFinishedInfo;

/* renamed from: o.bnP  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4834bnP {

    /* renamed from: o.bnP$a */
    /* loaded from: classes3.dex */
    public interface a {
        void b(InterfaceC4835bnQ interfaceC4835bnQ, DataSpec dataSpec, C4857bnm c4857bnm);
    }

    void a(DataSpec dataSpec, long j);

    void c(DataSpec dataSpec);

    void c(DataSpec dataSpec, NetflixNetworkError netflixNetworkError);

    void c(RequestFinishedInfo requestFinishedInfo);
}
