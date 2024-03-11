package com.netflix.partner;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.Surface;
import com.netflix.cl.Logger;
import com.netflix.cl.model.android.PartnerInputSource;
import com.netflix.cl.model.event.session.action.Search;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.webclient.model.leafs.MinusoneConfig;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.partner.INetflixPartner;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;
import javax.inject.Provider;
import o.AbstractServiceC8431dli;
import o.C1044Mm;
import o.C1332Xp;
import o.C8157dfA;
import o.C8168dfL;
import o.InterfaceC5091bsH;
import o.InterfaceC8433dlk;
import o.InterfaceC8440dlr;
import o.InterfaceC8445dlw;
import o.aMN;
import o.aOV;
import o.dlB;
import o.dlF;
import o.dlK;
import o.dlL;

@AndroidEntryPoint
/* loaded from: classes6.dex */
public class PService extends AbstractServiceC8431dli {
    private dlB a;
    private final INetflixPartner.Stub b = new INetflixPartner.Stub() { // from class: com.netflix.partner.PService.4
        @Override // com.netflix.partner.INetflixPartner
        public int e() {
            return 14;
        }

        @Override // com.netflix.partner.INetflixPartner
        public boolean d() {
            boolean d;
            if (PService.this.f == null || !PService.this.f.c()) {
                C1044Mm.e("nf_partner_pservice", "isUserSignedIn: serviceManager not ready - using brute force check");
                PService pService = PService.this;
                d = pService.d(pService.getApplicationContext());
            } else {
                d = PService.this.f.E();
            }
            C1044Mm.a("nf_partner_pservice", "isUserSignedIn: %s", Boolean.valueOf(d));
            return d;
        }

        @Override // com.netflix.partner.INetflixPartner
        public void a(String str) {
            C1044Mm.a("nf_partner_pservice", "searchInApp: got query: %s", str);
            if (PService.this.f == null) {
                C1044Mm.e("nf_partner_pservice", "no connection");
            } else if (!PService.this.f.c()) {
                C1044Mm.e("nf_partner_pservice", "searchInApp: serviceManager not ready");
                PService pService = PService.this;
                pService.h = new e(str, 0, null);
            } else {
                PService.this.g.a(str, PService.this.f);
            }
        }

        @Override // com.netflix.partner.INetflixPartner
        public void a(int i, String str, InterfaceC8433dlk interfaceC8433dlk) {
            if (PService.this.f == null || !PService.this.f.c()) {
                C1044Mm.e("nf_partner_pservice", "cardEvent: serviceManager not ready");
                PService pService = PService.this;
                pService.d = new e(str, i, interfaceC8433dlk);
                return;
            }
            C1044Mm.a("nf_partner_pservice", "cardEvent: inputJson: %s, %s", Integer.valueOf(i), str);
            if (PService.this.a != null) {
                dlB dlb = PService.this.a;
                Context applicationContext = PService.this.getApplicationContext();
                boolean E = PService.this.f.E();
                PService pService2 = PService.this;
                dlb.c(applicationContext, i, str, E, pService2.d(pService2.f), interfaceC8433dlk);
            }
        }

        @Override // com.netflix.partner.INetflixPartner
        public void c(Surface surface, String str, boolean z, InterfaceC8440dlr interfaceC8440dlr) {
            C1044Mm.a("nf_partner_pservice", "openSession: playableId: %s", str);
        }

        @Override // com.netflix.partner.INetflixPartner
        public void e(String str, int i, InterfaceC8433dlk interfaceC8433dlk) {
            C1044Mm.a("nf_partner_pservice", "search: got query: %s", str);
            if (PService.this.f != null && !PService.this.f.c()) {
                C1044Mm.e("nf_partner_pservice", "search: serviceManager not ready");
                PService pService = PService.this;
                pService.h = new e(str, i, interfaceC8433dlk);
            }
            if (PService.this.g != null) {
                PService.this.g.d(PService.this.getApplicationContext(), PService.this.f, str, i, interfaceC8433dlk);
            }
        }

        @Override // com.netflix.partner.INetflixPartner
        public void a(String str, int i, int i2, InterfaceC8433dlk interfaceC8433dlk) {
            C1044Mm.a("nf_partner_pservice", "getRecommendations: got query: %s, toView: %s, toExpanded: %s", str, Integer.valueOf(i), Integer.valueOf(i2));
            if (interfaceC8433dlk == null) {
                C1044Mm.d("nf_partner_pservice", "partner callback null ");
                PService.this.g.a(str, PService.this.f);
            }
            if (PService.this.j != null) {
                PService.this.j.b(PService.this.getApplicationContext(), PService.this.f, str, i, i2, interfaceC8433dlk);
            }
        }
    };
    private HandlerThread c;
    private e d;
    private long e;
    private ServiceManager f;
    private dlL g;
    private e h;
    private dlF j;
    @Inject
    public Provider<ServiceManager> serviceManagerProvider;

    public PService() {
        b();
    }

    @Override // o.AbstractServiceC8431dli, android.app.Service
    public void onCreate() {
        super.onCreate();
        b();
    }

    private void b() {
        C1044Mm.e("nf_partner_pservice", "init: ");
        f();
        if (this.a == null) {
            this.a = new dlB(this.c.getLooper());
        }
        if (this.j == null) {
            this.j = new dlF(this.c.getLooper());
        }
        if (this.g == null) {
            this.g = new dlL(this.c.getLooper());
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.e = System.currentTimeMillis();
        C1044Mm.e("nf_partner_pservice", "onBind ");
        d();
        return this.b;
    }

    private void d() {
        if (Build.VERSION.SDK_INT > 25) {
            ServiceManager serviceManager = this.f;
            if (serviceManager != null) {
                serviceManager.M();
            }
            ServiceManager serviceManager2 = this.serviceManagerProvider.get();
            this.f = serviceManager2;
            serviceManager2.c(new InterfaceC5091bsH() { // from class: com.netflix.partner.PService.3
                @Override // o.InterfaceC5091bsH
                public void onManagerReady(ServiceManager serviceManager3, Status status) {
                    PService.this.e = System.currentTimeMillis() - PService.this.e;
                    if (PService.this.h != null) {
                        try {
                            PService.this.b.e(PService.this.h.b, PService.this.h.c, PService.this.h.a);
                        } catch (RemoteException unused) {
                            C1044Mm.e("nf_partner_pservice", "failed to resume query");
                        }
                        PService.this.h = null;
                    } else {
                        PService pService = PService.this;
                        pService.c(pService.f);
                    }
                    if (PService.this.d != null) {
                        C1044Mm.e("nf_partner_pservice", "performing differed card handling");
                        try {
                            PService.this.b.a(PService.this.d.c, PService.this.d.b, PService.this.d.a);
                        } catch (RemoteException unused2) {
                            int i = PService.this.d.c;
                            C1044Mm.a("nf_partner_pservice", "failed to resume stored card event %s, %s", Integer.valueOf(i), PService.this.d.b);
                        }
                        PService.this.d = null;
                    }
                }

                @Override // o.InterfaceC5091bsH
                public void onManagerUnavailable(ServiceManager serviceManager3, Status status) {
                    PService.this.h = null;
                }
            });
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C1044Mm.a("nf_partner_pservice", "PService.onDestroy.");
        j();
        if (this.a != null) {
            this.a = null;
        }
        if (this.j != null) {
            this.j = null;
        }
        if (this.g != null) {
            this.g = null;
        }
        ServiceManager serviceManager = this.f;
        if (serviceManager != null) {
            serviceManager.M();
            this.f = null;
        }
    }

    /* loaded from: classes6.dex */
    class e {
        public InterfaceC8433dlk a;
        public String b;
        public int c;

        public e(String str, int i, InterfaceC8433dlk interfaceC8433dlk) {
            this.b = str;
            this.c = i;
            this.a = interfaceC8433dlk;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(ServiceManager serviceManager) {
        if (serviceManager == null) {
            return;
        }
        long a = dlK.e.a(serviceManager.f(), PartnerInputSource.sFinderRecommendation);
        Long startSession = Logger.INSTANCE.startSession(new Search(null, "", null, null, null));
        try {
            if (((aMN) C1332Xp.b(aMN.class)).c(aMN.d.e)) {
                ((InterfaceC8445dlw) Class.forName("com.netflix.partner.PRecoDataHandler").getConstructor(Context.class, ServiceManager.class, Handler.class, Long.TYPE, Long.class).newInstance(serviceManager.f(), serviceManager, new Handler(this.c.getLooper()), Long.valueOf(a), startSession)).refreshData(serviceManager.E());
            }
        } catch (NoSuchMethodException e2) {
            C1044Mm.e("nf_partner_pservice", "NoSuchMethodException", e2);
        } catch (Exception e3) {
            C1044Mm.e("nf_partner_pservice", "Exception", e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(ServiceManager serviceManager) {
        if (dlK.e.e()) {
            C1044Mm.e("nf_partner_pservice", "force enabled partner features");
            return false;
        }
        aOV g = serviceManager != null ? serviceManager.g() : null;
        if (g == null || g.M() == null || g.M().minusoneConfig() == null) {
            return false;
        }
        return !MinusoneConfig.isMinusoneEnabled(g.M().minusoneConfig());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Context context) {
        return C8168dfL.h(C8157dfA.e(context, "useragent_userprofiles_data", (String) null));
    }

    private void f() {
        if (this.c == null) {
            HandlerThread handlerThread = new HandlerThread("nf_partner_bg", 10);
            this.c = handlerThread;
            handlerThread.start();
        }
    }

    private void j() {
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            this.c = null;
            handlerThread.quit();
        }
    }
}
