package o;

import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.offline.log.OfflineErrorLogblob;
import com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface;
import com.netflix.mediaclient.service.offline.registry.PersistRegistryException;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import o.C4250bav;
import o.C4294bbm;

/* renamed from: o.baL  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4214baL {
    private final boolean a;
    private final InterfaceC4262bbG b;
    private final OfflineRegistryInterface c;
    private final InterfaceC4268bbM d;
    private final Queue<String> e;
    private final List<InterfaceC4290bbi> g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.baL$b */
    /* loaded from: classes3.dex */
    public interface b {
        void a();
    }

    public C4214baL(OfflineRegistryInterface offlineRegistryInterface, List<InterfaceC4290bbi> list, C4250bav.b bVar, InterfaceC4268bbM interfaceC4268bbM, InterfaceC4262bbG interfaceC4262bbG) {
        LinkedList linkedList = new LinkedList();
        this.e = linkedList;
        this.c = offlineRegistryInterface;
        this.g = list;
        if (bVar.d.isEmpty()) {
            for (InterfaceC4290bbi interfaceC4290bbi : list) {
                this.e.add(interfaceC4290bbi.aH_());
            }
        } else {
            linkedList.addAll(bVar.d);
        }
        this.d = interfaceC4268bbM;
        this.b = interfaceC4262bbG;
        this.a = bVar.b;
    }

    public void c(b bVar) {
        e(bVar);
    }

    private void e(final b bVar) {
        if (!this.e.isEmpty()) {
            final String remove = this.e.remove();
            final InterfaceC4290bbi d = C4206baD.d(remove, this.g);
            if (d == null) {
                e(bVar);
                return;
            } else {
                new C4294bbm(d, this.d, this.b, this.a).c(new C4294bbm.b() { // from class: o.baI
                    @Override // o.C4294bbm.b
                    public final void e(InterfaceC4299bbr interfaceC4299bbr, Status status) {
                        C4214baL.this.a(remove, d, bVar, interfaceC4299bbr, status);
                    }
                });
                return;
            }
        }
        C1044Mm.a("nfLicenseReplacer", "replaceTillListEmpty all replaced");
        bVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, InterfaceC4290bbi interfaceC4290bbi, b bVar, InterfaceC4299bbr interfaceC4299bbr, Status status) {
        C1044Mm.c("nfLicenseReplacer", "replaceTillListEmpty %s %s", str, status);
        d(interfaceC4290bbi, status);
        e(status);
        e(bVar);
    }

    private void d(InterfaceC4290bbi interfaceC4290bbi, Status status) {
        IClientLogging f = AbstractApplicationC1040Mh.getInstance().i().f();
        if (f != null) {
            OfflineErrorLogblob.c(f.e(), interfaceC4290bbi.e(), status);
        }
    }

    private void e(Status status) {
        if (status.j()) {
            try {
                this.c.m();
            } catch (PersistRegistryException unused) {
            }
        }
    }
}
