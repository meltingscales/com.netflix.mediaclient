package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import j$.time.Instant;
import kotlin.NotImplementedError;

/* renamed from: o.aEu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1532aEu implements InterfaceC5155btS {
    private final C2520ahd b;
    private final boolean d;

    @Override // o.InterfaceC5156btT
    public boolean isFromCache() {
        return this.d;
    }

    public C1532aEu(C2520ahd c2520ahd, boolean z) {
        C8632dsu.c((Object) c2520ahd, "");
        this.b = c2520ahd;
        this.d = z;
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        return this.b.e();
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return LoMoType.a(this.b.f());
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        return this.b.b();
    }

    @Override // o.InterfaceC5156btT
    public int getNumLoMos() {
        return this.b.a();
    }

    @Override // o.InterfaceC5156btT
    public String getLolomoId() {
        return this.b.e();
    }

    @Override // o.InterfaceC8321diF
    public boolean needsRefresh(long j) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC5155btS
    public long getExpiryTimeStamp() {
        Instant c = this.b.c();
        if (c != null) {
            return c.b();
        }
        return -1L;
    }

    @Override // o.InterfaceC5155btS
    public long getCreateTime() {
        Instant d = this.b.d();
        if (d != null) {
            return d.b();
        }
        return -1L;
    }

    @Override // o.InterfaceC8323diH
    public long getTimestamp() {
        return getCreateTime();
    }

    @Override // o.InterfaceC8323diH
    public void setTimestamp(long j) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // o.InterfaceC8321diF
    public void setExpires(Long l) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
