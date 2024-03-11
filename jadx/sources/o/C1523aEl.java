package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.TrackableListSummary;
import o.C1375Yz;

/* renamed from: o.aEl  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1523aEl implements TrackableListSummary {
    private final C1375Yz.l d;
    private final C1375Yz.c e;

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

    public C1523aEl(C1375Yz.c cVar, C1375Yz.l lVar) {
        C8632dsu.c((Object) cVar, "");
        C8632dsu.c((Object) lVar, "");
        this.e = cVar;
        this.d = lVar;
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return InterfaceC5178btp.c.e();
    }

    @Override // o.InterfaceC5281bvm
    public int getTrackId() {
        return this.e.a();
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        C1375Yz.f b = this.e.b();
        String b2 = b != null ? b.b() : null;
        return b2 == null ? "" : b2;
    }

    @Override // o.InterfaceC5174btl
    public int getLength() {
        Integer e = this.d.e();
        if (e != null) {
            return e.intValue();
        }
        return 0;
    }
}
