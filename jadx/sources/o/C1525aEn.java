package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.RecommendedTrailer;
import o.C2348aeZ;
import o.C2403afb;
import o.C2454agQ;
import o.InterfaceC5222bug;

/* renamed from: o.aEn  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1525aEn implements InterfaceC5222bug<InterfaceC5232buq>, InterfaceC5232buq {
    private final C2348aeZ.d b;
    private final C2454agQ.d c;
    private final C2403afb d;

    public Void a() {
        return null;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: d */
    public InterfaceC5232buq getVideo() {
        return this;
    }

    public Void e() {
        return null;
    }

    @Override // o.InterfaceC5222bug
    public InterfaceC5149btM getEvidence() {
        return null;
    }

    public Void h() {
        return null;
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

    public C1525aEn(C2403afb c2403afb, C2348aeZ.d dVar, C2454agQ.d dVar2) {
        C8632dsu.c((Object) c2403afb, "");
        C8632dsu.c((Object) dVar2, "");
        this.d = c2403afb;
        this.b = dVar;
        this.c = dVar2;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: c */
    public InterfaceC5232buq mo3081getEntity() {
        return (InterfaceC5232buq) InterfaceC5222bug.a.d(this);
    }

    @Override // o.InterfaceC5223buh
    public /* synthetic */ String getBoxartId() {
        return (String) a();
    }

    @Override // o.InterfaceC5223buh
    public /* synthetic */ String getBoxshotUrl() {
        return (String) e();
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: getCursor */
    public String mo3080getCursor() {
        return InterfaceC5222bug.a.b(this);
    }

    @Override // o.InterfaceC5223buh
    public /* synthetic */ String getVideoMerchComputeId() {
        return (String) h();
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        return this.d.e();
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String c = this.d.c();
        return c == null ? "" : c;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        VideoType create = VideoType.create(this.d.j());
        C8632dsu.a(create, "");
        return create;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return this.d.g();
    }

    @Override // o.InterfaceC5232buq
    public String ab() {
        return this.d.b();
    }

    @Override // o.InterfaceC5197buH
    public String T() {
        C2348aeZ.d dVar = this.b;
        if (dVar == null || !C8632dsu.c(dVar.b(), Boolean.TRUE)) {
            return null;
        }
        return this.b.d();
    }

    @Override // o.InterfaceC5232buq
    public RecommendedTrailer ci_() {
        return C1526aEo.d(this.d.a());
    }

    @Override // o.InterfaceC5232buq
    public String Y() {
        C2403afb.d d = this.d.d();
        if (d != null) {
            return d.e();
        }
        return null;
    }

    @Override // o.InterfaceC5222bug
    public int getPosition() {
        Integer b = this.c.b();
        if (b != null) {
            return b.intValue();
        }
        return -1;
    }
}
