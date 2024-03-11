package o;

import com.netflix.mediaclient.servicemgr.PlaybackExperience;

/* loaded from: classes4.dex */
public final class bMV implements PlaybackExperience {
    private final String b;
    private final boolean c;
    private final drO<String> d;

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean a() {
        return false;
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

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean l() {
        return true;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean o() {
        return this.c;
    }

    public bMV(String str, boolean z, drO<String> dro) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
        this.b = str;
        this.c = z;
        this.d = dro;
    }

    public /* synthetic */ bMV(String str, boolean z, drO dro, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? false : z, dro);
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public C5167bte b() {
        return new C5167bte(this.b);
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public PlaybackExperience.SubtitleExperience c() {
        return PlaybackExperience.SubtitleExperience.FORCED_VISIBLE_ON_MUTE;
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public String m() {
        return this.d.invoke();
    }
}
