package o;

import com.netflix.mediaclient.servicemgr.PlaybackExperience;

/* renamed from: o.cwP  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7446cwP extends C5124bso {
    public C7446cwP() {
        this(null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7446cwP(String str) {
        super(str);
        C8632dsu.c((Object) str, "");
    }

    public /* synthetic */ C7446cwP(String str, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? "Default" : str);
    }

    @Override // o.C5124bso, com.netflix.mediaclient.servicemgr.PlaybackExperience
    public PlaybackExperience.SubtitleExperience c() {
        return PlaybackExperience.SubtitleExperience.FORCED_VISIBLE_ON_MUTE;
    }
}
