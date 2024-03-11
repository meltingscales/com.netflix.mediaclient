package o;

import android.text.TextUtils;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.falkor.FalkorAgentStatus;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.VideoEntityModelImplKt;
import com.netflix.model.leafs.originals.BillboardSummaryImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C8143den;

/* loaded from: classes3.dex */
public class IZ extends IT {
    private final boolean f;
    private final InterfaceC1242Ud h;
    private final int i;
    private final int j;

    @Override // o.IT
    protected boolean y() {
        return this.f;
    }

    public IZ(C0954Iz<?> c0954Iz, int i, int i2, String str, boolean z, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchBillboardVideos", c0954Iz, interfaceC1757aNc);
        this.i = i;
        this.j = i2;
        this.f = z;
        this.h = C0956Jb.b(LoMoType.BILLBOARD.a(), str, null, null);
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        C0956Jb.d(list, this.h, this.i, this.j, true);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        List<I> c = this.d.c(this.h.d(IE.b("videoEvidence", IE.a(this.j), IE.c("summary", "detail", "inQueue"))));
        List<I> c2 = this.d.c(this.h.d(IE.b("billboardData", IE.a(this.j), "billboardSummary")));
        int i = 0;
        while (true) {
            if (i >= c.size()) {
                break;
            }
            C8329diN c8329diN = (C8329diN) c.get(i);
            BillboardSummaryImpl billboardSummaryImpl = i < c2.size() ? (BillboardSummaryImpl) c2.get(i) : null;
            if (billboardSummaryImpl != null) {
                c8329diN.d("billboardSummary", billboardSummaryImpl);
                if (billboardSummaryImpl.getVideoAssets() != null && billboardSummaryImpl.getVideoAssets().horizontalBackground() != null && !TextUtils.isEmpty(billboardSummaryImpl.getVideoAssets().horizontalBackground().motionUrl())) {
                    c.clear();
                    c.add(c8329diN);
                    break;
                }
            }
            i++;
        }
        interfaceC1757aNc.a(VideoEntityModelImplKt.videosToEntitiesFromJava(c, this.i), FalkorAgentStatus.c(InterfaceC1078Nw.aJ, s(), k(), q()));
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.a(Collections.emptyList(), status);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.IT
    public List<C8143den.d> c() {
        ArrayList arrayList = new ArrayList();
        if (C8153dex.g()) {
            arrayList.add(new C8143den.d("disableBillboard", Boolean.TRUE.toString()));
        }
        return arrayList;
    }
}
