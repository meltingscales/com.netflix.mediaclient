package o;

import com.netflix.mediaclient.servicemgr.interface_.LoMo;
import com.netflix.mediaclient.servicemgr.interface_.LoMoType;
import java.util.List;

/* loaded from: classes3.dex */
public class JU extends JW {
    private final InterfaceC1242Ud h;

    public JU(C0954Iz<?> c0954Iz, LoMo loMo, int i, int i2, boolean z, boolean z2, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchTopTenVideosTask", c0954Iz, loMo, i, i2, z, z2, interfaceC1757aNc);
        this.h = C0956Jb.b(LoMoType.TOP_TEN.a(), loMo.getId(), null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.JW, o.IT
    public void d(List<InterfaceC1242Ud> list) {
        super.d(list);
        C0956Jb.e(list, this.h, ((JW) this).f, ((JW) this).j, true);
    }
}
