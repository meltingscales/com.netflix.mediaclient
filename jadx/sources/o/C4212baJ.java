package o;

import android.os.Handler;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.NetflixPowerManager;
import com.netflix.mediaclient.service.offline.agent.CreateRequest;
import com.netflix.mediaclient.servicemgr.interface_.offline.StopReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.InterfaceC4348bcn;

/* renamed from: o.baJ  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4212baJ {
    private NetflixPowerManager a;
    private final List<InterfaceC4209baG> b = new ArrayList();
    private long c = System.currentTimeMillis();
    private InterfaceC4348bcn.d d;
    private long e;

    public void c(NetflixPowerManager netflixPowerManager) {
        this.a = netflixPowerManager;
    }

    public void c(InterfaceC4348bcn.d dVar) {
        this.d = dVar;
    }

    public void b(Handler handler, final String str) {
        handler.post(new Runnable() { // from class: o.baJ.5
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.b(str);
                }
            }
        });
    }

    public void b(Handler handler, final String str, final Status status) {
        handler.post(new Runnable() { // from class: o.baJ.9
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.b(str, status);
                }
            }
        });
    }

    public void b(Handler handler, final InterfaceC5206buQ interfaceC5206buQ, final int i) {
        handler.post(new Runnable() { // from class: o.baJ.10
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.a();
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.c(interfaceC5206buQ, i);
                }
                C4212baJ.this.b(interfaceC5206buQ.h());
            }
        });
    }

    public void b(Handler handler, final InterfaceC5206buQ interfaceC5206buQ) {
        C1044Mm.c("nf_offlineAgent", "onDownloadCompleted playableId=%s", interfaceC5206buQ.aH_());
        handler.post(new Runnable() { // from class: o.baJ.12
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.d();
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.a(interfaceC5206buQ);
                }
            }
        });
    }

    public void a(Handler handler, final InterfaceC5206buQ interfaceC5206buQ, final StopReason stopReason) {
        C1044Mm.c("nf_offlineAgent", "onDownloadStopped playableId=%s", interfaceC5206buQ.aH_());
        handler.post(new Runnable() { // from class: o.baJ.14
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.d();
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.d(interfaceC5206buQ, stopReason);
                }
            }
        });
    }

    public void e(Handler handler, final InterfaceC5206buQ interfaceC5206buQ) {
        C1044Mm.c("nf_offlineAgent", "onDownloadResumedByUser playableId=%s", interfaceC5206buQ.aH_());
        handler.post(new Runnable() { // from class: o.baJ.15
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.a();
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.b(interfaceC5206buQ);
                }
            }
        });
    }

    public void e(final Handler handler, final String str, final Status status, final InterfaceC4208baF interfaceC4208baF, final C4242ban c4242ban) {
        handler.post(new Runnable() { // from class: o.baJ.13
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.d();
                C4212baJ.this.b();
                boolean z = status.j() && c4242ban != null;
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.b(str, status, z);
                }
                if (z) {
                    handler.post(new Runnable() { // from class: o.baJ.13.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                            InterfaceC4208baF interfaceC4208baF2 = interfaceC4208baF;
                            C4242ban c4242ban2 = c4242ban;
                            interfaceC4208baF2.b(new CreateRequest(c4242ban2.e, c4242ban2.a, c4242ban2.d, c4242ban2.i, c4242ban2.c));
                        }
                    });
                }
            }
        });
    }

    public void c(Handler handler, final List<String> list, final Status status) {
        handler.post(new Runnable() { // from class: o.baJ.11
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.d();
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.c(list, status);
                }
            }
        });
    }

    public void c(Handler handler, final Status status) {
        handler.post(new Runnable() { // from class: o.baJ.19
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.d();
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.d(status);
                }
            }
        });
    }

    public void a(Handler handler, final Status status) {
        handler.post(new Runnable() { // from class: o.baJ.3
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.d();
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.b(status);
                }
            }
        });
    }

    public void c(Handler handler, final InterfaceC5206buQ interfaceC5206buQ, final Status status) {
        handler.post(new Runnable() { // from class: o.baJ.2
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.e(interfaceC5206buQ, status);
                }
            }
        });
    }

    public void a(Handler handler, final InterfaceC5206buQ interfaceC5206buQ, final Status status) {
        handler.post(new Runnable() { // from class: o.baJ.4
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.d(interfaceC5206buQ, status);
                }
            }
        });
    }

    public void e(Handler handler, final boolean z) {
        handler.post(new Runnable() { // from class: o.baJ.1
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.b();
                for (InterfaceC4209baG interfaceC4209baG : C4212baJ.this.b) {
                    interfaceC4209baG.e(z);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        NetflixPowerManager netflixPowerManager = this.a;
        if (netflixPowerManager != null) {
            netflixPowerManager.a(NetflixPowerManager.PartialWakeLockReason.DownloadGoingOn);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        NetflixPowerManager netflixPowerManager = this.a;
        if (netflixPowerManager != null) {
            netflixPowerManager.c(NetflixPowerManager.PartialWakeLockReason.DownloadGoingOn);
        }
    }

    public void c(Handler handler, final InterfaceC4209baG interfaceC4209baG) {
        Objects.requireNonNull(handler);
        Objects.requireNonNull(interfaceC4209baG);
        handler.post(new Runnable() { // from class: o.baJ.6
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.b();
                if (!C4212baJ.this.b.contains(interfaceC4209baG)) {
                    C4212baJ.this.b.add(interfaceC4209baG);
                    C1044Mm.c("nf_offlineAgent", "addOfflineAgentListener after count=%d", Integer.valueOf(C4212baJ.this.b.size()));
                    return;
                }
                C1044Mm.a("nf_offlineAgent", "already added addOfflineAgentListener");
            }
        });
    }

    public void d(Handler handler, final InterfaceC4209baG interfaceC4209baG) {
        if (handler == null || interfaceC4209baG == null) {
            return;
        }
        C1044Mm.a("nf_offlineAgent", "removeOfflineAgentListener before listener=" + interfaceC4209baG.getClass().getName() + " count=" + this.b.size());
        handler.post(new Runnable() { // from class: o.baJ.8
            @Override // java.lang.Runnable
            public void run() {
                C4212baJ.this.b.remove(interfaceC4209baG);
                C4212baJ.this.b();
                C1044Mm.c("nf_offlineAgent", "removeOfflineAgentListener after count=%d", Integer.valueOf(C4212baJ.this.b.size()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        Iterator<InterfaceC4209baG> it = this.b.iterator();
        while (it.hasNext()) {
            InterfaceC4209baG next = it.next();
            if (next != null && next.c()) {
                C1044Mm.a("nf_offlineAgent", "...removing deadListener... " + next.getClass().getName());
                it.remove();
            }
        }
    }

    public void c() {
        d();
        this.a = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        InterfaceC4348bcn.d dVar;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis <= this.c + InterfaceC4348bcn.d.e || (dVar = this.d) == null || this.e == j) {
            return;
        }
        this.c = currentTimeMillis;
        this.e = j;
        dVar.d();
    }

    public void c(Handler handler) {
        handler.post(new Runnable() { // from class: o.baJ.7
            @Override // java.lang.Runnable
            public void run() {
                if (C4212baJ.this.d != null) {
                    C4212baJ.this.d.b();
                }
            }
        });
    }
}
