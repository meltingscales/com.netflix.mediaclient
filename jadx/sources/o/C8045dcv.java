package o;

import com.netflix.mediaclient.servicemgr.PlaybackExperience;

/* renamed from: o.dcv  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8045dcv implements PlaybackExperience {
    private final C5167bte b = new C5167bte("UserMarkPreview");

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean a() {
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public C5167bte b() {
        return this.b;
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
        return true;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean g() {
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean h() {
        return true;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean j() {
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public PlaybackExperience.SubtitleExperience c() {
        return PlaybackExperience.SubtitleExperience.DEFAULT;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public String m() {
        String d = C8126deW.d();
        C8632dsu.a(d, "");
        return d;
    }
}
