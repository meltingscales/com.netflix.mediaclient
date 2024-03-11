package o;

import com.netflix.mediaclient.servicemgr.PlaybackExperience;

/* renamed from: o.bso  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5124bso implements PlaybackExperience {
    private final C5167bte e;

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean a() {
        return false;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public C5167bte b() {
        return this.e;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean d() {
        return true;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean e() {
        return true;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean f() {
        return false;
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
    public boolean i() {
        return true;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean j() {
        return true;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean n() {
        return false;
    }

    public C5124bso(String str) {
        this.e = new C5167bte(str);
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public PlaybackExperience.SubtitleExperience c() {
        return PlaybackExperience.SubtitleExperience.DEFAULT;
    }
}
