package com.netflix.mediaclient.netflixactivity.api;

import android.content.Intent;
import android.os.Bundle;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractActivityC1635aIp;
import o.C1596aHd;
import o.C1641aIv;
import o.C1645aIz;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC1643aIx;
import o.InterfaceC5107bsX;
import o.dpR;
import o.dqE;
import o.drM;

@AndroidEntryPoint
/* loaded from: classes.dex */
public abstract class NetflixActivityBase extends AbstractActivityC1635aIp implements InterfaceC5107bsX {
    @Inject
    public InterfaceC1643aIx serviceManagerController;
    @Inject
    public ServiceManager serviceManagerInstance;
    private UserAgent userAgent;

    public final UserAgent getUserAgent() {
        return this.userAgent;
    }

    protected final void setServiceManagerController(InterfaceC1643aIx interfaceC1643aIx) {
        C8632dsu.c((Object) interfaceC1643aIx, "");
        this.serviceManagerController = interfaceC1643aIx;
    }

    protected final void setServiceManagerInstance(ServiceManager serviceManager) {
        C8632dsu.c((Object) serviceManager, "");
        this.serviceManagerInstance = serviceManager;
    }

    public final void setUserAgent(UserAgent userAgent) {
        this.userAgent = userAgent;
    }

    protected final ServiceManager getServiceManagerInstance() {
        ServiceManager serviceManager = this.serviceManagerInstance;
        if (serviceManager != null) {
            return serviceManager;
        }
        C8632dsu.d("");
        return null;
    }

    protected final InterfaceC1643aIx getServiceManagerController() {
        InterfaceC1643aIx interfaceC1643aIx = this.serviceManagerController;
        if (interfaceC1643aIx != null) {
            return interfaceC1643aIx;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC5107bsX
    public ServiceManager getServiceManager() {
        Map d;
        Map k;
        Throwable th;
        if (!getServiceManagerInstance().z()) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("Invalid state when called netflixActivity.getServiceManager()", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        return getServiceManagerInstance();
    }

    @Override // o.AbstractActivityC1635aIp, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1641aIv.a(this);
        C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.netflixactivity.api.NetflixActivityBase$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                b(serviceManager);
                return dpR.c;
            }

            public final void b(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                NetflixActivityBase.this.setUserAgent(serviceManager.u());
            }
        });
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        C8632dsu.c((Object) intent, "");
        C1641aIv.b(this, intent);
        super.startActivity(intent, bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C8632dsu.c((Object) intent, "");
        C1641aIv.b(this, intent);
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void setIntent(Intent intent) {
        C1641aIv.c(getIntent(), intent);
        super.setIntent(intent);
    }

    @Override // o.InterfaceC5107bsX
    public boolean isServiceManagerReady() {
        return getServiceManagerInstance().c();
    }
}
