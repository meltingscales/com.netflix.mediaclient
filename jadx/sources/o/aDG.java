package o;

import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import kotlin.NotImplementedError;
import o.C2270adA;
import o.C2392afQ;
import o.C2454agQ;
import o.InterfaceC5222bug;

/* loaded from: classes3.dex */
public final class aDG implements InterfaceC5223buh, InterfaceC5222bug<aDG> {
    private final C2454agQ.d c;
    private final C2392afQ.d e;

    @Override // o.InterfaceC5222bug
    /* renamed from: a */
    public aDG getVideo() {
        return this;
    }

    @Override // o.InterfaceC5222bug
    public InterfaceC5149btM getEvidence() {
        return null;
    }

    @Override // o.InterfaceC5223buh
    public String getVideoMerchComputeId() {
        return null;
    }

    @Override // o.InterfaceC5151btO
    public boolean isPlayable() {
        return true;
    }

    public aDG(C2454agQ.d dVar, C2392afQ.d dVar2) {
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) dVar2, "");
        this.c = dVar;
        this.e = dVar2;
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: e */
    public aDG mo3081getEntity() {
        return (aDG) InterfaceC5222bug.a.d(this);
    }

    private final C2270adA c() {
        C2392afQ.e a;
        C2392afQ.c a2 = this.e.a();
        C2270adA b = (a2 == null || (a = a2.a()) == null) ? null : a.b();
        C8632dsu.d(b);
        return b;
    }

    @Override // o.InterfaceC5175btm
    public String getId() {
        String valueOf = String.valueOf(c().d());
        return valueOf == null ? "" : valueOf;
    }

    @Override // o.InterfaceC5175btm
    public String getTitle() {
        String e = c().e();
        return e == null ? "" : e;
    }

    @Override // o.InterfaceC5175btm
    public VideoType getType() {
        return VideoType.CHARACTERS;
    }

    @Override // o.InterfaceC5175btm
    public String getUnifiedEntityId() {
        return c().a();
    }

    @Override // o.InterfaceC5223buh
    public String getBoxshotUrl() {
        C2270adA.a c = c().c();
        String c2 = c != null ? c.c() : null;
        return c2 == null ? "" : c2;
    }

    @Override // o.InterfaceC5223buh
    public String getBoxartId() {
        C2270adA.a c = c().c();
        String b = c != null ? c.b() : null;
        return b == null ? "" : b;
    }

    @Override // o.InterfaceC5151btO
    public boolean isOriginal() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableToPlay() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5151btO
    public boolean isAvailableForDownload() {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5222bug
    /* renamed from: getCursor */
    public String mo3080getCursor() {
        String c = this.c.c();
        return c == null ? "" : c;
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
