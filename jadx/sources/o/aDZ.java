package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.TrackableListSummary;

/* loaded from: classes3.dex */
public final class aDZ implements TrackableListSummary {
    private final int b;
    private final int d;
    private final String e;

    public Void a() {
        return null;
    }

    public Void b() {
        return null;
    }

    public Void c() {
        return null;
    }

    public Void d() {
        return null;
    }

    public Void e() {
        return null;
    }

    @Override // o.InterfaceC5178btp
    public String getId() {
        return "-1";
    }

    @Override // o.InterfaceC5174btl
    public int getLength() {
        return this.b;
    }

    @Override // o.InterfaceC5281bvm
    public int getListPos() {
        return -1;
    }

    @Override // o.InterfaceC5281bvm
    public String getRequestId() {
        return this.e;
    }

    @Override // o.InterfaceC5281bvm
    public int getTrackId() {
        return this.d;
    }

    public aDZ(int i, String str, int i2) {
        this.d = i;
        this.e = str;
        this.b = i2;
    }

    @Override // o.InterfaceC5281bvm
    public /* synthetic */ String getImpressionToken() {
        return (String) c();
    }

    @Override // o.InterfaceC5281bvm
    public /* synthetic */ String getListContext() {
        return (String) d();
    }

    @Override // o.InterfaceC5281bvm
    public /* synthetic */ String getListId() {
        return (String) a();
    }

    @Override // o.InterfaceC5281bvm
    public /* synthetic */ String getSectionUid() {
        return (String) b();
    }

    @Override // o.InterfaceC5178btp
    public /* synthetic */ String getTitle() {
        return (String) e();
    }

    @Override // o.InterfaceC5178btp
    public LoMoType getType() {
        return InterfaceC5178btp.c.e();
    }
}
