package o;

import com.netflix.mediaclient.servicemgr.PlaybackExperience;

/* renamed from: o.czZ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7615czZ implements PlaybackExperience {
    public static final C7615czZ b = new C7615czZ();
    private static final C5167bte e = new C5167bte("postplay");

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean a() {
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public C5167bte b() {
        return e;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean d() {
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean e() {
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean f() {
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean g() {
        return true;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean h() {
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean j() {
        return false;
    }

    private C7615czZ() {
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public PlaybackExperience.SubtitleExperience c() {
        return PlaybackExperience.SubtitleExperience.FORCED_VISIBLE_ON_MUTE;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public String m() {
        String d = C8126deW.d();
        C8632dsu.a(d, "");
        return d;
    }
}
