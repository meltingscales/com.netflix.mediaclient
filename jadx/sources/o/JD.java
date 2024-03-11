package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.model.leafs.VideoEntityModelImplKt;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class JD extends IT {
    private final boolean g;
    private final int j;

    @Override // o.IT
    protected boolean g() {
        return true;
    }

    @Override // o.IT
    protected boolean v() {
        return false;
    }

    @Override // o.IT
    protected boolean y() {
        return this.g;
    }

    public JD(C0954Iz<?> c0954Iz, int i, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchNonMemberVideos", c0954Iz, interfaceC1757aNc);
        this.j = i;
        this.g = z;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(IE.b("nonMemberVideos", IE.a(this.j), IE.c("summary", "detail", "synopsisDP")));
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        if (!this.g || interfaceC1757aNc == null) {
            return;
        }
        interfaceC1757aNc.k(VideoEntityModelImplKt.videosToEntitiesFromJava(this.d.b(c1244Uf.e), 0), InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        if (interfaceC1757aNc != null) {
            interfaceC1757aNc.k(VideoEntityModelImplKt.videosToEntitiesFromJava(Collections.emptyList(), 0), status);
        }
    }
}
