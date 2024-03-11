package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.app.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class JG extends IT {
    private final InterfaceC1242Ud f;
    private final List<String> h;

    @Override // o.IT
    protected boolean u() {
        return true;
    }

    public JG(C0954Iz<?> c0954Iz, List<String> list, InterfaceC1757aNc interfaceC1757aNc) {
        super("FetchBigRowVideos", c0954Iz, interfaceC1757aNc);
        this.h = list;
        this.f = IE.b(SignupConstants.Field.VIDEOS, list, "offlineAvailable");
    }

    @Override // o.IT
    protected void d(List<InterfaceC1242Ud> list) {
        list.add(this.f);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, C1244Uf c1244Uf) {
        HashMap hashMap = new HashMap();
        for (String str : this.h) {
            InterfaceC8322diG b = this.d.b(IE.b(SignupConstants.Field.VIDEOS, str, "offlineAvailable"));
            if (b != null && (b instanceof C8329diN)) {
                hashMap.put(str, Boolean.valueOf(((C8329diN) b).d()));
            } else {
                hashMap.put(str, Boolean.FALSE);
            }
        }
        if (hashMap.size() == 0) {
            C1044Mm.j("FetchBigRowVideosTask", "received 0 videos inside FetchOfflineGeoPlayabilityTask");
            InterfaceC1598aHf.a(new C1596aHd("received 0 videos inside FetchOfflineGeoPlayabilityTask").b(false));
        }
        interfaceC1757aNc.e(hashMap, InterfaceC1078Nw.aJ);
    }

    @Override // o.IT
    protected void a(InterfaceC1757aNc interfaceC1757aNc, Status status) {
        interfaceC1757aNc.e(Collections.emptyMap(), status);
    }
}
