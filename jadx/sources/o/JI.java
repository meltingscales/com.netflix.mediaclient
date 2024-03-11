package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.List;

/* loaded from: classes3.dex */
public class JI extends IT {
    private final String g;
    private final String h;

    public JI(C0954Iz<?> c0954Iz, VideoType videoType, String str, String str2, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchScenePosition", c0954Iz, interfaceC1757aNc);
        this.g = str;
        this.h = str2;
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(C0956Jb.e(SignupConstants.Field.VIDEOS, this.g, this.h));
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        C8330diO c8330diO = (C8330diO) this.d.a(C0956Jb.e(SignupConstants.Field.VIDEOS, this.g, this.h));
        int a = c8330diO == null ? 0 : c8330diO.a();
        C1044Mm.e("FetchScenePosition", String.format("FetchScenePositionTask rtn: %s", c8330diO));
        interfaceC1757aNc.b(a, InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.b(-1, status);
    }
}
