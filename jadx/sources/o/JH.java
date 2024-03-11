package o;

import android.text.TextUtils;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.falkor.FalkorAgentStatus;
import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import com.netflix.model.leafs.VideoEntityModelImplKt;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class JH extends JW {
    private final InterfaceC1242Ud h;

    public JH(C0954Iz<?> c0954Iz, LoMo loMo, int i, int i2, boolean z, boolean z2, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchROARVideos", c0954Iz, loMo, i, i2, z, z2, interfaceC1757aNc);
        if (TextUtils.isEmpty(loMo.getId())) {
            InterfaceC1598aHf.a("FetchROARVideosTask with null listId");
        }
        this.h = C0956Jb.b(LoMoType.ROAR.a(), loMo.getId(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.JW, o.IT
    public void d(List<InterfaceC1242Ud> list) {
        super.d(list);
        C0956Jb.e(list, this.h, ((JW) this).f, ((JW) this).j);
    }

    @Override // o.JW, o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        interfaceC1757aNc.n(VideoEntityModelImplKt.videosToEntitiesFromJava(this.d.c(this.h.d(IE.b(IE.a(((JW) this).f, ((JW) this).j), "listItem", "tallPanelArt"))), ((JW) this).f), FalkorAgentStatus.c(InterfaceC1078Nw.aJ, s(), k(), q()));
    }

    @Override // o.JW, o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.n(Collections.emptyList(), status);
    }
}
