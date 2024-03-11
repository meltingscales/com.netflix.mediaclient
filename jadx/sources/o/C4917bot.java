package o;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.util.PlayContext;

/* renamed from: o.bot  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4917bot implements InterfaceC4346bcl {
    private final C4606bhg d;

    @Override // o.InterfaceC4346bcl
    public void b() {
    }

    public C4917bot(C4606bhg c4606bhg) {
        this.d = c4606bhg;
    }

    @Override // o.InterfaceC4346bcl
    public InterfaceC5085bsB a(InterfaceC5097bsN interfaceC5097bsN, UserAgent userAgent, aOV aov, InterfaceC4942bpR interfaceC4942bpR, IClientLogging iClientLogging, Handler handler, Looper looper, long j, PlayContext playContext, PlaylistTimestamp playlistTimestamp, Pair<Long, Long> pair, InterfaceC4607bhh interfaceC4607bhh, PlaybackExperience playbackExperience, InterfaceC4708bjc interfaceC4708bjc, boolean z, long j2, boolean z2, String str, PreferredLanguageData preferredLanguageData) {
        C4905boh c4905boh = new C4905boh(this.d.d(), new Handler(Looper.getMainLooper()), looper, j, playContext, playlistTimestamp, playbackExperience, this.d, interfaceC4708bjc, z, j2, z2, str, preferredLanguageData, c(aov, iClientLogging), new C4875boD(this.d, userAgent, aov, interfaceC4942bpR, iClientLogging, handler, looper, playContext, playbackExperience, interfaceC4607bhh, z2, preferredLanguageData, d(aov, iClientLogging)));
        c4905boh.d(interfaceC5097bsN);
        return c4905boh;
    }

    @Override // o.InterfaceC4346bcl
    public <T extends C5209buT> InterfaceC5085bsB c(UserAgent userAgent, aOV aov, InterfaceC4942bpR interfaceC4942bpR, IClientLogging iClientLogging, Handler handler, Looper looper, PlaylistMap<T> playlistMap, PlayContext playContext, PlaylistTimestamp playlistTimestamp, Pair<Long, Long> pair, InterfaceC4607bhh interfaceC4607bhh, PlaybackExperience playbackExperience, InterfaceC4708bjc interfaceC4708bjc, boolean z, long j, boolean z2, String str, PreferredLanguageData preferredLanguageData) {
        return new C4882boK(this.d.d(), handler, looper, playlistMap, playContext, playlistTimestamp, playbackExperience, this.d, interfaceC4708bjc, z, j, str, preferredLanguageData, c(aov, iClientLogging), new C4875boD(this.d, userAgent, aov, interfaceC4942bpR, iClientLogging, handler, looper, playContext, playbackExperience, interfaceC4607bhh, z2, preferredLanguageData, d(aov, iClientLogging)));
    }

    private InterfaceC4856bnl d(aOV aov, IClientLogging iClientLogging) {
        return aov.N().getDisableStreamingLogblobs() ? new C4848bnd() : new C4575bhB(iClientLogging.e());
    }

    private InterfaceC4766bmA c(aOV aov, IClientLogging iClientLogging) {
        if (aov.N().getDisableStreamingPdsEvents()) {
            return new C4807bmp();
        }
        return new C4590bhQ(this.d.d(), iClientLogging);
    }
}
