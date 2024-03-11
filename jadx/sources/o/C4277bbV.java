package o;

import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.service.offline.registry.PersistRegistryException;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.bbV  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C4277bbV {
    C4277bbV() {
    }

    public static List<C4276bbU> b(C5293bvy c5293bvy) {
        List<C5332bwk> e = c5293bvy.e();
        ArrayList arrayList = new ArrayList();
        for (C5332bwk c5332bwk : e) {
            arrayList.add(new C4276bbU(c5332bwk));
        }
        return arrayList;
    }

    public static void a(List<C4276bbU> list, C5293bvy c5293bvy) {
        ArrayList arrayList = new ArrayList();
        for (C4276bbU c4276bbU : list) {
            arrayList.add(c4276bbU.Z());
        }
        try {
            c5293bvy.b(arrayList);
        } catch (Exception e) {
            InterfaceC1598aHf.a(new C1596aHd("OfflineRegistryRoomHelper.save").d(e).b(false));
            throw new PersistRegistryException(e.getMessage());
        }
    }

    public static C5332bwk e(CreateRequest createRequest, String str, String str2, String str3, int i, C4284bbc c4284bbc) {
        C5332bwk c5332bwk = new C5332bwk();
        c5332bwk.z = createRequest.e;
        c5332bwk.F = i;
        c5332bwk.S = createRequest.a.getKey();
        c5332bwk.j = createRequest.c.getTrackId();
        c5332bwk.h = createRequest.c.i();
        c5332bwk.a = createRequest.c.getListPos();
        c5332bwk.f = createRequest.c.getRequestId();
        c5332bwk.c = System.currentTimeMillis();
        c5332bwk.x = str;
        c5332bwk.f13638o = str2;
        c5332bwk.B = createRequest.b;
        c5332bwk.g = createRequest.d.a();
        c5332bwk.l = str3;
        c5332bwk.c(StopReason.WaitingToBeStarted);
        c5332bwk.h();
        c5332bwk.b = new ArrayList();
        c5332bwk.L = new ArrayList();
        c5332bwk.N = new ArrayList();
        c5332bwk.f13637J = new ArrayList();
        c5332bwk.O = C4284bbc.b(c4284bbc);
        return c5332bwk;
    }
}
