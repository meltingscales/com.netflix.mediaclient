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

/* renamed from: o.bcl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC4346bcl {
    InterfaceC5085bsB a(InterfaceC5097bsN interfaceC5097bsN, UserAgent userAgent, aOV aov, InterfaceC4942bpR interfaceC4942bpR, IClientLogging iClientLogging, Handler handler, Looper looper, long j, PlayContext playContext, PlaylistTimestamp playlistTimestamp, Pair<Long, Long> pair, InterfaceC4607bhh interfaceC4607bhh, PlaybackExperience playbackExperience, InterfaceC4708bjc interfaceC4708bjc, boolean z, long j2, boolean z2, String str, PreferredLanguageData preferredLanguageData);

    void b();

    <T extends C5209buT> InterfaceC5085bsB c(UserAgent userAgent, aOV aov, InterfaceC4942bpR interfaceC4942bpR, IClientLogging iClientLogging, Handler handler, Looper looper, PlaylistMap<T> playlistMap, PlayContext playContext, PlaylistTimestamp playlistTimestamp, Pair<Long, Long> pair, InterfaceC4607bhh interfaceC4607bhh, PlaybackExperience playbackExperience, InterfaceC4708bjc interfaceC4708bjc, boolean z, long j, boolean z2, String str, PreferredLanguageData preferredLanguageData);
}
