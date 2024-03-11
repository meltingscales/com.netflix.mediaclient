package com.netflix.mediaclient.ui.notificationpermission.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionImpl;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.scopes.ActivityScoped;
import io.reactivex.rxkotlin.SubscribersKt;
import java.util.Map;
import javax.inject.Inject;
import o.AbstractC6677chn;
import o.AbstractC7097cpl;
import o.C1030Lx;
import o.C1045Mp;
import o.C1596aHd;
import o.C7095cpj;
import o.C7098cpm;
import o.C7105cpt;
import o.C7109cpx;
import o.C8126deW;
import o.C8627dsp;
import o.C8632dsu;
import o.C9737vz;
import o.C9935zP;
import o.InterfaceC1597aHe;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5283bvo;
import o.InterfaceC6675chl;
import o.InterfaceC7089cpd;
import o.InterfaceC7090cpe;
import o.dpR;
import o.dqE;
import o.drM;
import o.drO;

/* loaded from: classes4.dex */
public final class NotificationPermissionImpl implements InterfaceC7090cpe {
    private final C9935zP a;
    private final InterfaceC6675chl d;
    private final NotificationPermissionLaunchHelperImpl f;
    private final InterfaceC7089cpd h;
    private ActivityResultLauncher<String> i;
    private final NetflixActivity j;
    public static final c e = new c(null);
    public static final int c = 8;

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes6.dex */
    public interface NotificationPermissionModule {
        @ActivityScoped
        @Binds
        InterfaceC7090cpe a(NotificationPermissionImpl notificationPermissionImpl);
    }

    @Inject
    public NotificationPermissionImpl(Activity activity, InterfaceC6675chl interfaceC6675chl, InterfaceC7089cpd interfaceC7089cpd) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC6675chl, "");
        C8632dsu.c((Object) interfaceC7089cpd, "");
        this.d = interfaceC6675chl;
        this.h = interfaceC7089cpd;
        NetflixActivity netflixActivity = (NetflixActivity) C9737vz.e(activity, NetflixActivity.class);
        this.j = netflixActivity;
        C9935zP d = C9935zP.b.d(netflixActivity);
        this.a = d;
        this.f = new NotificationPermissionLaunchHelperImpl(activity);
        e(d);
    }

    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("NotificationPermissionImpl");
        }
    }

    @Override // o.InterfaceC7090cpe
    public void d() {
        LifecycleOwner e2 = this.d.e(e(), Integer.valueOf(C1030Lx.d.i), false);
        if (e2 != null) {
            C7095cpj.d.b();
            e2.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionImpl$showRationaleDialog$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner) {
                    C8632dsu.c((Object) lifecycleOwner, "");
                    C7095cpj.d.d();
                }
            });
        }
    }

    @Override // o.InterfaceC7090cpe
    public void d(String str) {
        C8632dsu.c((Object) str, "");
        LifecycleOwner e2 = this.d.e(a(str), Integer.valueOf(C1030Lx.d.i), false);
        if (e2 != null) {
            C7095cpj.d.b();
            e2.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionImpl$showRemindMePrompt$1$1
                @Override // androidx.lifecycle.DefaultLifecycleObserver
                public void onDestroy(LifecycleOwner lifecycleOwner) {
                    C8632dsu.c((Object) lifecycleOwner, "");
                    C7095cpj.d.d();
                }
            });
        }
    }

    @Override // o.InterfaceC7090cpe
    public void b() {
        this.j.getLifecycle().addObserver(new NotificationPermissionImpl$registerForPermissionResult$1(this));
    }

    public final AbstractC6677chn e() {
        InterfaceC5283bvo b = C8126deW.b();
        if (Build.VERSION.SDK_INT < 33) {
            return new C7105cpt(this.a, b);
        }
        return new C7098cpm(this.a, b);
    }

    public final AbstractC6677chn a(String str) {
        return new C7109cpx(this.a, str);
    }

    @SuppressLint({"CheckResult"})
    private final void e(C9935zP c9935zP) {
        SubscribersKt.subscribeBy$default(c9935zP.d(AbstractC7097cpl.class), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionImpl$subscribe$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(Throwable th) {
                d(th);
                return dpR.c;
            }

            public final void d(Throwable th) {
                Map d;
                Map k;
                Throwable th2;
                C8632dsu.c((Object) th, "");
                InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd(null, th, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c2 = errorType.c();
                        c1596aHd.a(c2 + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th2 = new Throwable(c1596aHd.b());
                } else {
                    th2 = c1596aHd.i;
                    if (th2 == null) {
                        th2 = new Throwable("Handled exception with no message");
                    } else if (th2 == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a2 = dVar.a();
                if (a2 != null) {
                    a2.e(c1596aHd, th2);
                } else {
                    dVar.e().b(c1596aHd, th2);
                }
            }
        }, (drO) null, new drM<AbstractC7097cpl, dpR>() { // from class: com.netflix.mediaclient.ui.notificationpermission.impl.NotificationPermissionImpl$subscribe$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(AbstractC7097cpl abstractC7097cpl) {
                c(abstractC7097cpl);
                return dpR.c;
            }

            public final void c(AbstractC7097cpl abstractC7097cpl) {
                InterfaceC6675chl interfaceC6675chl;
                NotificationPermissionLaunchHelperImpl notificationPermissionLaunchHelperImpl;
                ActivityResultLauncher activityResultLauncher;
                dpR dpr;
                Throwable th;
                InterfaceC7089cpd interfaceC7089cpd;
                C8632dsu.c((Object) abstractC7097cpl, "");
                interfaceC6675chl = NotificationPermissionImpl.this.d;
                interfaceC6675chl.e(abstractC7097cpl.e());
                if (abstractC7097cpl instanceof AbstractC7097cpl.b) {
                    interfaceC7089cpd = NotificationPermissionImpl.this.h;
                    interfaceC7089cpd.e();
                } else if (abstractC7097cpl instanceof AbstractC7097cpl.a) {
                } else {
                    if (!(abstractC7097cpl instanceof AbstractC7097cpl.d)) {
                        if (abstractC7097cpl instanceof AbstractC7097cpl.c) {
                            notificationPermissionLaunchHelperImpl = NotificationPermissionImpl.this.f;
                            notificationPermissionLaunchHelperImpl.a();
                            return;
                        }
                        boolean z = abstractC7097cpl instanceof AbstractC7097cpl.e;
                    } else if (Build.VERSION.SDK_INT >= 33) {
                        activityResultLauncher = NotificationPermissionImpl.this.i;
                        if (activityResultLauncher != null) {
                            activityResultLauncher.launch("android.permission.POST_NOTIFICATIONS");
                            dpr = dpR.c;
                        } else {
                            dpr = null;
                        }
                        if (dpr == null) {
                            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                            C1596aHd c1596aHd = new C1596aHd("NotificationPermissionImpl.registerForPermissionResult needs to be called before this.", null, null, false, null, false, false, 126, null);
                            ErrorType errorType = c1596aHd.a;
                            if (errorType != null) {
                                c1596aHd.e.put("errorType", errorType.c());
                                String b = c1596aHd.b();
                                if (b != null) {
                                    String c2 = errorType.c();
                                    c1596aHd.a(c2 + " " + b);
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
                            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                            InterfaceC1597aHe c3 = dVar2.c();
                            if (c3 != null) {
                                c3.d(c1596aHd, th);
                            } else {
                                dVar2.e().b(c1596aHd, th);
                            }
                        }
                    } else {
                        NotificationPermissionImpl.c cVar = NotificationPermissionImpl.e;
                    }
                }
            }
        }, 2, (Object) null);
    }
}
