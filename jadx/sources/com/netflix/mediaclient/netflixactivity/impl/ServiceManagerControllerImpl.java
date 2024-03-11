package com.netflix.mediaclient.netflixactivity.impl;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import o.C1045Mp;
import o.C1596aHd;
import o.C8141del;
import o.C8571dqn;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC1643aIx;
import o.InterfaceC5091bsH;
import o.aIB;
import o.dpR;
import o.dqE;
import o.drM;

@ActivityScoped
/* loaded from: classes3.dex */
public final class ServiceManagerControllerImpl implements InterfaceC1643aIx, aIB {
    public static final b a = new b(null);
    private ServiceManager b;
    private final List<drM<ServiceManager, dpR>> c;
    private final Activity d;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes6.dex */
    public interface NetflixActivityModule {
        @Binds
        aIB a(ServiceManagerControllerImpl serviceManagerControllerImpl);

        @Binds
        InterfaceC1643aIx c(ServiceManagerControllerImpl serviceManagerControllerImpl);
    }

    @Inject
    public ServiceManagerControllerImpl(Activity activity) {
        C8632dsu.c((Object) activity, "");
        this.d = activity;
        this.c = new ArrayList();
    }

    @Override // o.aIB
    public void c(aIB.e eVar) {
        aIB.a.a(this, eVar);
    }

    /* loaded from: classes3.dex */
    public static final class b extends C1045Mp {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
            super("ServiceManagerControllerImpl");
        }
    }

    @Override // o.InterfaceC1643aIx
    public void c(ServiceManager serviceManager, InterfaceC5091bsH interfaceC5091bsH) {
        C8632dsu.c((Object) serviceManager, "");
        C8632dsu.c((Object) interfaceC5091bsH, "");
        if (this.b != null) {
            throw new IllegalStateException();
        }
        this.b = serviceManager;
        serviceManager.c(new a(this, interfaceC5091bsH));
        Activity activity = this.d;
        C8632dsu.d(activity);
        ((AppCompatActivity) activity).getLifecycle().addObserver(new ActivityListener());
    }

    @Override // o.aIB
    public void e(drM<? super ServiceManager, dpR> drm) {
        C8632dsu.c((Object) drm, "");
        ServiceManager serviceManager = this.b;
        if (serviceManager != null && serviceManager.c()) {
            drm.invoke(serviceManager);
        } else {
            this.c.add(drm);
        }
    }

    /* loaded from: classes3.dex */
    public final class ActivityListener implements DefaultLifecycleObserver {
        public ActivityListener() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            C8632dsu.c((Object) lifecycleOwner, "");
            ServiceManagerControllerImpl.this.c.clear();
        }
    }

    /* loaded from: classes3.dex */
    public final class a implements InterfaceC5091bsH {
        private final InterfaceC5091bsH c;
        final /* synthetic */ ServiceManagerControllerImpl e;

        public a(ServiceManagerControllerImpl serviceManagerControllerImpl, InterfaceC5091bsH interfaceC5091bsH) {
            C8632dsu.c((Object) interfaceC5091bsH, "");
            this.e = serviceManagerControllerImpl;
            this.c = interfaceC5091bsH;
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerReady(ServiceManager serviceManager, Status status) {
            Object v;
            C8632dsu.c((Object) serviceManager, "");
            C8632dsu.c((Object) status, "");
            ServiceManagerControllerImpl.a.getLogTag();
            if (C8141del.c(this.e.d)) {
                return;
            }
            this.c.onManagerReady(serviceManager, status);
            while (!this.e.c.isEmpty()) {
                v = C8571dqn.v(this.e.c);
                ((drM) v).invoke(serviceManager);
            }
        }

        @Override // o.InterfaceC5091bsH
        public void onManagerUnavailable(ServiceManager serviceManager, Status status) {
            Map d;
            Map k;
            Throwable th;
            Map d2;
            Map k2;
            Throwable th2;
            C8632dsu.c((Object) status, "");
            ServiceManagerControllerImpl.a.getLogTag();
            if (C8141del.c(this.e.d)) {
                if (this.e.d.isFinishing()) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d2 = dqE.d();
                    k2 = dqE.k(d2);
                    C1596aHd c1596aHd = new C1596aHd("onManagerUnavailable called when activity is finishing", null, null, false, k2, false, false, 96, null);
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
                        th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                    } else if (c1596aHd.b() != null) {
                        th2 = new Throwable(c1596aHd.b());
                    } else {
                        Throwable th3 = c1596aHd.i;
                        if (th3 == null) {
                            th2 = new Throwable("Handled exception with no message");
                        } else if (th3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        } else {
                            th2 = th3;
                        }
                    }
                    InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                    InterfaceC1598aHf a = dVar.a();
                    if (a != null) {
                        a.e(c1596aHd, th2);
                        return;
                    } else {
                        dVar.e().b(c1596aHd, th2);
                        return;
                    }
                }
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd2 = new C1596aHd("onManagerUnavailable called when activity is destroyed", null, null, false, k, false, false, 96, null);
                ErrorType errorType2 = c1596aHd2.a;
                if (errorType2 != null) {
                    c1596aHd2.e.put("errorType", errorType2.c());
                    String b2 = c1596aHd2.b();
                    if (b2 != null) {
                        String c2 = errorType2.c();
                        c1596aHd2.a(c2 + " " + b2);
                    }
                }
                if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                    th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
                } else if (c1596aHd2.b() != null) {
                    th = new Throwable(c1596aHd2.b());
                } else {
                    Throwable th4 = c1596aHd2.i;
                    if (th4 == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th4 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    } else {
                        th = th4;
                    }
                }
                InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar2.a();
                if (a2 != null) {
                    a2.e(c1596aHd2, th);
                    return;
                } else {
                    dVar2.e().b(c1596aHd2, th);
                    return;
                }
            }
            this.c.onManagerUnavailable(serviceManager, status);
            this.e.c.clear();
        }
    }
}
