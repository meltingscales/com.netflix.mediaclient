package o;

import com.netflix.mediaclient.servicemgr.PlaybackExperience;

/* renamed from: o.bsV  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5105bsV implements PlaybackExperience {
    private final boolean b;
    private final drO<String> d;
    private final String e;

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
        return this.b;
    }

    public C5105bsV(String str, boolean z, drO<String> dro) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) dro, "");
        this.e = str;
        this.b = z;
        this.d = dro;
    }

    public /* synthetic */ C5105bsV(String str, boolean z, drO dro, int i, C8627dsp c8627dsp) {
        this(str, (i & 2) != 0 ? false : z, dro);
    }

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public C5167bte b() {
        return new C5167bte(this.e);
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
