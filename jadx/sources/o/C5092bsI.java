package o;

import com.netflix.mediaclient.servicemgr.PlaybackExperience;

/* renamed from: o.bsI  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C5092bsI implements PlaybackExperience {
    private final String b;

    public C5092bsI() {
        this(null, 1, null);
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean a() {
        return true;
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

    public C5092bsI(String str) {
        C8632dsu.c((Object) str, "");
        this.b = str;
    }

    public /* synthetic */ C5092bsI(String str, int i, C8627dsp c8627dsp) {
        this((i & 1) != 0 ? "multiplePlay" : str);
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public C5167bte b() {
        return new C5167bte(this.b);
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public PlaybackExperience.SubtitleExperience c() {
        return PlaybackExperience.SubtitleExperience.DISABLED;
    }
}
