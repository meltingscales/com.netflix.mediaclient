package o;

import com.netflix.mediaclient.service.offline.registry.OfflineRegistryInterface;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import o.InterfaceC4290bbi;
import o.InterfaceC4348bcn;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.bax  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4252bax implements InterfaceC4290bbi.d, InterfaceC4290bbi.c, InterfaceC4348bcn.b {
    private final List<InterfaceC4290bbi> a;
    private final InterfaceC4348bcn b;
    private final d c;
    private final InterfaceC4262bbG d;
    private final OfflineRegistryInterface e;
    private int j = 0;
    private int f = 0;
    private final AtomicBoolean i = new AtomicBoolean(false);

    /* renamed from: o.bax$d */
    /* loaded from: classes.dex */
    public interface d {
        void h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4252bax(d dVar, InterfaceC4348bcn interfaceC4348bcn, InterfaceC4262bbG interfaceC4262bbG, List<InterfaceC4290bbi> list, OfflineRegistryInterface offlineRegistryInterface) {
        this.b = interfaceC4348bcn;
        this.e = offlineRegistryInterface;
        this.d = interfaceC4262bbG;
        this.c = dVar;
        this.a = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(InterfaceC5298bwC interfaceC5298bwC) {
        C1044Mm.a("nf_MaintenanceJob", "startMaintenanceJob");
        if (this.a.size() > 0) {
            this.j = this.a.size();
            for (InterfaceC4290bbi interfaceC4290bbi : this.a) {
                interfaceC4290bbi.b(this);
            }
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.i.set(true);
    }

    @Override // o.InterfaceC4348bcn.b
    public void e() {
        C1044Mm.a("nf_MaintenanceJob", "onLicenseReplaceDone");
        if (this.i.get()) {
            return;
        }
        this.c.h();
    }

    @Override // o.InterfaceC4290bbi.d
    public void b(InterfaceC4299bbr interfaceC4299bbr) {
        C1044Mm.a("nf_MaintenanceJob", "onDeleteCompleted");
        this.e.b(interfaceC4299bbr);
        int i = this.f - 1;
        this.f = i;
        if (i != 0 || this.i.get()) {
            return;
        }
        this.c.h();
    }

    @Override // o.InterfaceC4290bbi.c
    public void c(InterfaceC4290bbi interfaceC4290bbi) {
        int i = this.j - 1;
        this.j = i;
        if (i != 0 || this.i.get()) {
            return;
        }
        c();
    }

    private void c() {
        C1044Mm.a("nf_MaintenanceJob", "processPendingDelete");
        List<InterfaceC4299bbr> c = this.e.c();
        if (c.size() > 0) {
            C1044Mm.a("nf_MaintenanceJob", "processPendingDelete not calling onAllMaintenanceJobDone");
            this.f = c.size();
            for (InterfaceC4299bbr interfaceC4299bbr : c) {
                C4295bbn.c(this.d, interfaceC4299bbr, this, (InterfaceC4300bbs) null);
            }
            return;
        }
        this.c.h();
    }
}
