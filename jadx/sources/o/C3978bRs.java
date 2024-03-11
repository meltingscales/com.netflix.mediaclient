package o;

/* renamed from: o.bRs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3978bRs extends C5092bsI {
    private final String e;

    @Override // com.netflix.mediaclient.servicemgr.PlaybackExperience
    public boolean l() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3978bRs(String str) {
        super(str);
        C8632dsu.c((Object) str, "");
        this.e = str;
    }

    @Override // o.C5092bsI, com.netflix.mediaclient.servicemgr.PlaybackExperience
    public C5167bte b() {
        return new C5167bte(this.e);
    }
}
