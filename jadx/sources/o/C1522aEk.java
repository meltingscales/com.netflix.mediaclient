package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.TrackableListSummary;
import java.util.List;
import o.C1375Yz;

/* renamed from: o.aEk  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1522aEk implements TrackableListSummary {
    private final C1375Yz.c d;
    private final C1375Yz.g e;

    @Override // o.InterfaceC5178btp
    public String getId() {
        return "-1";
    }

    @Override // o.InterfaceC5281bvm
    public String getImpressionToken() {
        return null;
    }

    @Override // o.InterfaceC5281bvm
    public String getListContext() {
        return null;
    }

    @Override // o.InterfaceC5281bvm
    public String getListId() {
        return null;
    }

    @Override // o.InterfaceC5281bvm
    public int getListPos() {
        return -1;
    }

    @Override // o.InterfaceC5281bvm
    public String getSectionUid() {
        return null;
    }

    @Override // o.InterfaceC5178btp
    public String getTitle() {
        return null;
    }

    public C1522aEk(C1375Yz.c cVar, C1375Yz.g gVar) {
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) gVar, "");
        this.d = cVar;
        this.e = gVar;
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return InterfaceC5178btp.c.e();
    }

    @Override // o.InterfaceC5281bvm
    public int getTrackId() {
        return this.d.c();
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        C1375Yz.f b = this.d.b();
        String b2 = b != null ? b.b() : null;
        return b2 == null ? "" : b2;
    }

    @Override // o.InterfaceC5174btl
    public int getLength() {
        List<C1375Yz.n> m = this.e.m();
        if (m != null) {
            return m.size();
        }
        return 0;
    }
}
