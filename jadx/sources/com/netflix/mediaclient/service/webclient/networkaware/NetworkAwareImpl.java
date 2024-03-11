package com.netflix.mediaclient.service.webclient.networkaware;

import android.content.Context;
import com.netflix.mediaclient.util.ConnectivityUtils;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1044Mm;
import o.C5035brE;
import o.C5037brG;
import o.C8168dfL;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC5038brH;
import o.TN;
import o.dpR;

@Singleton
/* loaded from: classes4.dex */
public final class NetworkAwareImpl implements InterfaceC5038brH {
    private final Context d;
    private C5037brG e;
    private final Map<C5035brE, C5037brG> f;
    private C5035brE h;
    public static final a b = new a(null);
    private static final Object a = new Object();

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface NetworkAwareModule {
        @Binds
        InterfaceC5038brH c(NetworkAwareImpl networkAwareImpl);
    }

    @Inject
    public NetworkAwareImpl(@ApplicationContext Context context) {
        C8632dsu.c((Object) context, "");
        HashMap hashMap = new HashMap();
        this.f = hashMap;
        C5035brE a2 = C5035brE.a(context, TN.a.d());
        C8632dsu.a(a2, "");
        this.h = a2;
        C5037brG c5037brG = new C5037brG();
        this.e = c5037brG;
        hashMap.put(this.h, c5037brG);
        this.d = context;
    }

    @Override // o.InterfaceC5038brH
    public String c() {
        String e;
        synchronized (a) {
            e = this.e.e();
        }
        return e;
    }

    @Override // o.InterfaceC5038brH
    public void d(String str) {
        if (C8168dfL.g(str)) {
            return;
        }
        synchronized (a) {
            if (C8168dfL.d(str, this.e.b)) {
                this.e.c();
                return;
            }
            C1044Mm.a("nf_networkaware", "changing public ip addr from %s to %s", this.e.b, str);
            b(TN.a.d());
            C5037brG c5037brG = this.e;
            c5037brG.b = str;
            this.f.put(this.h, c5037brG);
        }
    }

    @Override // o.InterfaceC5038brH
    public void e(ConnectivityUtils.NetType netType) {
        synchronized (a) {
            b(netType);
            dpR dpr = dpR.c;
        }
    }

    private final void b(ConnectivityUtils.NetType netType) {
        C5035brE a2 = C5035brE.a(this.d, netType);
        if (C8632dsu.c(a2, this.h)) {
            C1044Mm.a("nf_networkaware", "no network switch. key %s", a2);
            return;
        }
        this.f.put(this.h, this.e);
        C5037brG c5037brG = this.f.get(a2);
        if (c5037brG != null) {
            C8632dsu.d(a2);
            this.h = a2;
            this.e = c5037brG;
            return;
        }
        C8632dsu.d(a2);
        this.h = a2;
        C5037brG c5037brG2 = new C5037brG();
        this.e = c5037brG2;
        this.f.put(a2, c5037brG2);
        C1044Mm.a("nf_networkaware", "(total: %d) switching to new network, %s", Integer.valueOf(this.f.size()), a2);
    }

    /* loaded from: classes4.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }
}
