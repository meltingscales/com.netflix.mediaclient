package o;

import com.netflix.mediaclient.service.cdx.CdxAgentImpl;

/* renamed from: o.aNq  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1771aNq implements aGS {
    private static final b d = new b(null);
    private final CdxAgentImpl e;

    /* renamed from: o.aNq$b */
    /* loaded from: classes3.dex */
    static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("nf_cdx_local_discovery");
        }
    }

    public C1771aNq(CdxAgentImpl cdxAgentImpl) {
        C8632dsu.c((Object) cdxAgentImpl, "");
        this.e = cdxAgentImpl;
    }

    @Override // o.aGS
    public void a(boolean z) {
        b bVar = d;
        bVar.getLogTag();
        if (z) {
            this.e.t();
            bVar.getLogTag();
            return;
        }
        bVar.getLogTag();
        this.e.p();
    }
}
