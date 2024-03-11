package com.netflix.mediaclient.service.webclient.ftl;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import com.google.gson.Gson;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.Config_FastProperty_Ftl;
import com.netflix.mediaclient.service.webclient.ftl.FtlSession;
import com.netflix.mediaclient.service.webclient.model.leafs.FtlConfig;
import java.util.Objects;
import o.AbstractApplicationC1040Mh;
import o.C1044Mm;
import o.C1076Nu;
import o.C1332Xp;
import o.C5033brC;
import o.C5036brF;
import o.C8157dfA;
import o.InterfaceC1072Nq;
import o.InterfaceC5090bsG;
import o.NC;

/* loaded from: classes.dex */
public enum FtlController {
    INSTANCE;
    
    private FtlConfig a;
    private NetworkInfo b;
    private final ConnectivityManager f;
    private boolean h;
    private long i;
    private FtlSession j;
    private final C5033brC g = new C5033brC();
    private InterfaceC1072Nq e = new C1076Nu() { // from class: com.netflix.mediaclient.service.webclient.ftl.FtlController.3
        @Override // o.C1076Nu, o.InterfaceC1072Nq
        public void c(NC nc, Intent intent) {
            b(true);
        }

        @Override // o.C1076Nu, o.InterfaceC1072Nq
        public void a(NC nc, boolean z) {
            b(false);
        }

        @Override // o.C1076Nu, o.InterfaceC1072Nq
        public void b(NC nc) {
            b(true);
            FtlConfig ftlConfig = FtlController.this.a;
            if (ftlConfig == null || FtlController.this.i + ftlConfig.samuraiWarmAppThreshold() >= SystemClock.elapsedRealtime()) {
                return;
            }
            FtlController.this.a();
        }

        void b(boolean z) {
            if (FtlController.this.h != z) {
                FtlController.this.h = z;
                FtlSession ftlSession = FtlController.this.j;
                if (ftlSession != null) {
                    ftlSession.b(FtlController.this.h);
                }
            }
        }
    };

    public FtlSession d() {
        return this.j;
    }

    FtlController() {
        Context context = (Context) C1332Xp.b(Context.class);
        this.f = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            this.a = (FtlConfig) ((Gson) C1332Xp.b(Gson.class)).fromJson(C8157dfA.e(context, "ftl_config", (String) null), (Class<Object>) FtlConfig.class);
        } catch (Exception e) {
            C1044Mm.b("nf_ftl", e, "unable to deserialize FTL config", new Object[0]);
        }
        this.b = b();
        this.h = AbstractApplicationC1040Mh.getInstance().o().i();
        AbstractApplicationC1040Mh.getInstance().o().c(this.e);
        c(FtlSession.Type.COLD);
    }

    public void c(InterfaceC5090bsG interfaceC5090bsG) {
        this.g.c(interfaceC5090bsG);
    }

    public void e(FtlConfig ftlConfig) {
        synchronized (this) {
            C8157dfA.a((Context) C1332Xp.b(Context.class), "ftl_config", ((Gson) C1332Xp.b(Gson.class)).toJson(ftlConfig));
            if (!Objects.equals(this.a, ftlConfig)) {
                this.a = ftlConfig;
                c(FtlSession.Type.CONFIGCHANGE);
            }
        }
    }

    public void e() {
        synchronized (this) {
            NetworkInfo b = b();
            NetworkInfo networkInfo = this.b;
            if (networkInfo != null && d(networkInfo, b)) {
                c(FtlSession.Type.NETWORKCHANGE);
            }
            FtlSession ftlSession = this.j;
            if (ftlSession != null) {
                ftlSession.a(b != null && b.isConnectedOrConnecting());
            }
            if (b != null) {
                this.b = b;
            }
        }
    }

    public void a() {
        synchronized (this) {
            c(FtlSession.Type.WARM);
        }
    }

    private boolean h() {
        FtlConfig ftlConfig = this.a;
        return (ftlConfig != null && ftlConfig.isValid()) && Config_FastProperty_Ftl.enabled();
    }

    private void c(FtlSession.Type type) {
        synchronized (this) {
            FtlSession ftlSession = this.j;
            if (ftlSession != null) {
                ftlSession.f();
            }
            if (h()) {
                C1044Mm.a("nf_ftl", "starting FTL session (%s)", type);
                this.i = SystemClock.elapsedRealtime();
                FtlSession ftlSession2 = new FtlSession(this.g, type, this.a);
                this.j = ftlSession2;
                ftlSession2.b(this.h);
                this.j.a(i());
                this.g.a(new C5036brF(this.j));
            } else {
                this.j = null;
            }
        }
    }

    private NetworkInfo b() {
        ConnectivityManager connectivityManager = this.f;
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    private boolean i() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = this.f;
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return activeNetworkInfo.isConnectedOrConnecting();
    }

    private static boolean d(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if (networkInfo == networkInfo2) {
            return false;
        }
        if (networkInfo == null || networkInfo2 == null) {
            return true;
        }
        return (networkInfo.getType() == networkInfo2.getType() && networkInfo.getSubtype() == networkInfo2.getSubtype()) ? false : true;
    }
}
