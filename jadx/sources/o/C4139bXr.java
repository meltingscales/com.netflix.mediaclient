package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.RecommendedTrailer;
import o.C2403afb;
import o.C2454agQ;
import o.C2561aiR;
import o.InterfaceC5222bug;

/* renamed from: o.bXr  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4139bXr implements InterfaceC5222bug<InterfaceC5232buq>, InterfaceC5232buq {
    private final String a;
    private final C2561aiR.b c;
    private final C2454agQ.d d;
    private final C2403afb e;

    public Void a() {
        return null;
    }

    public final String c() {
        return this.a;
    }

    public Void d() {
        return null;
    }

    public Void g() {
        return null;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: h */
    public InterfaceC5232buq getVideo() {
        return this;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        return false;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return true;
    }

    public C4139bXr(C2454agQ.d dVar, C2403afb c2403afb, C2561aiR.b bVar, String str) {
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) c2403afb, "");
        this.d = dVar;
        this.e = c2403afb;
        this.c = bVar;
        this.a = str;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: e */
    public InterfaceC5232buq mo3081getEntity() {
        return (InterfaceC5232buq) InterfaceC5222bug.a.d(this);
    }

    @Override // o.InterfaceC5223buh
    public /* synthetic */ String getBoxartId() {
        return (String) d();
    }

    @Override // o.InterfaceC5223buh
    public /* synthetic */ String getBoxshotUrl() {
        return (String) a();
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: getCursor */
    public String mo3080getCursor() {
        return InterfaceC5222bug.a.b(this);
    }

    @Override // o.InterfaceC5223buh
    public /* synthetic */ String getVideoMerchComputeId() {
        return (String) g();
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return this.e.e();
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String c = this.e.c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        VideoType create = VideoType.create(this.e.j());
        C8632dsu.a(create, "");
        return create;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.e.g();
    }

    public String i() {
        C2561aiR.b bVar = this.c;
        String d = bVar != null ? bVar.d() : null;
        return d == null ? "" : d;
    }

    @Override // o.InterfaceC5197buH
    public String T() {
        C2561aiR.b bVar = this.c;
        if (bVar == null || !C8632dsu.c(bVar.c(), Boolean.TRUE)) {
            return null;
        }
        return this.c.d();
    }

    @Override // o.InterfaceC5232buq
    public String ab() {
        return this.e.b();
    }

    @Override // o.InterfaceC5232buq
    public RecommendedTrailer ci_() {
        return C1526aEo.d(this.e.a());
    }

    @Override // o.InterfaceC5232buq
    public String Y() {
        C2403afb.d d = this.e.d();
        if (d != null) {
            return d.e();
        }
        return null;
    }

    @Override // o.InterfaceC5222bug
    public int getPosition() {
        Integer b = this.d.b();
        if (b != null) {
            return b.intValue();
        }
        return -1;
    }

    @Override // o.InterfaceC5222bug
    public InterfaceC5149btM getEvidence() {
        boolean g;
        g = C8691duz.g(i());
        if (g) {
            return null;
        }
        return new e(this);
    }

    /* renamed from: o.bXr$e */
    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC5149btM {
        private String b;
        private String c;
        private String d;

        @Override // o.InterfaceC5149btM
        public String getImageKey() {
            return this.c;
        }

        @Override // o.InterfaceC5149btM
        public String getImageUrl() {
            return this.b;
        }

        @Override // o.InterfaceC5149btM
        public String getTcardUrl() {
            return this.d;
        }

        e(C4139bXr c4139bXr) {
            C2561aiR.b bVar = c4139bXr.c;
            this.b = bVar != null ? bVar.d() : null;
            C2561aiR.b bVar2 = c4139bXr.c;
            this.c = bVar2 != null ? bVar2.e() : null;
        }
    }
}
