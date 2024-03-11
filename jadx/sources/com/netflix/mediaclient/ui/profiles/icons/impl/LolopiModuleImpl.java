package com.netflix.mediaclient.ui.profiles.icons.impl;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import java.util.Map;
import o.AbstractC1608aHp;
import o.ActivityC5963cOx;
import o.C1596aHd;
import o.C5960cOu;
import o.C7017coI;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.InterfaceC5958cOs;
import o.dpR;
import o.dqE;
import o.drM;

/* loaded from: classes4.dex */
public final class LolopiModuleImpl implements InterfaceC5958cOs {

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface LolopiModuleImplModule {
        @Binds
        InterfaceC5958cOs a(LolopiModuleImpl lolopiModuleImpl);
    }

    @Override // o.InterfaceC5958cOs
    public void a() {
        C7017coI.a aVar = C7017coI.c;
        aVar.e().b(AbstractC1608aHp.a.e, new drM<C7017coI.e<Activity, AbstractC1608aHp.e>, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.icons.impl.LolopiModuleImpl$init$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(C7017coI.e<Activity, AbstractC1608aHp.e> eVar) {
                b(eVar);
                return dpR.c;
            }

            public final void b(C7017coI.e<Activity, AbstractC1608aHp.e> eVar) {
                dpR dpr;
                Map d;
                Map k;
                Throwable th;
                C8632dsu.c((Object) eVar, "");
                AbstractC1608aHp.e b = eVar.b();
                if (b != null) {
                    eVar.e().startActivityForResult(ActivityC5963cOx.e.b(eVar.e(), b.c(), b.d(), b.b()), 6001);
                    dpr = dpR.c;
                } else {
                    dpr = null;
                }
                if (dpr == null) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd("Route data was null when launching LolopiModule from activity", null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c = errorType.c();
                            c1596aHd.a(c + " " + b2);
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
                    InterfaceC1598aHf a2 = dVar.a();
                    if (a2 != null) {
                        a2.e(c1596aHd, th);
                    } else {
                        dVar.e().b(c1596aHd, th);
                    }
                }
            }
        });
        aVar.e().b(AbstractC1608aHp.f.d, new drM<C7017coI.e<Fragment, AbstractC1608aHp.e>, dpR>() { // from class: com.netflix.mediaclient.ui.profiles.icons.impl.LolopiModuleImpl$init$2
            @Override // o.drM
            public /* synthetic */ dpR invoke(C7017coI.e<Fragment, AbstractC1608aHp.e> eVar) {
                a(eVar);
                return dpR.c;
            }

            public final void a(C7017coI.e<Fragment, AbstractC1608aHp.e> eVar) {
                dpR dpr;
                Map d;
                Map k;
                Throwable th;
                C8632dsu.c((Object) eVar, "");
                AbstractC1608aHp.e b = eVar.b();
                if (b != null) {
                    ActivityC5963cOx.a aVar2 = ActivityC5963cOx.e;
                    FragmentActivity requireActivity = eVar.e().requireActivity();
                    C8632dsu.a(requireActivity, "");
                    eVar.e().startActivityForResult(aVar2.b(requireActivity, b.c(), b.d(), b.b()), 6001);
                    dpr = dpR.c;
                } else {
                    dpr = null;
                }
                if (dpr == null) {
                    InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
                    d = dqE.d();
                    k = dqE.k(d);
                    C1596aHd c1596aHd = new C1596aHd("Route data was null when launching LolopiModule from fragment", null, null, true, k, false, false, 96, null);
                    ErrorType errorType = c1596aHd.a;
                    if (errorType != null) {
                        c1596aHd.e.put("errorType", errorType.c());
                        String b2 = c1596aHd.b();
                        if (b2 != null) {
                            String c2 = errorType.c();
                            c1596aHd.a(c2 + " " + b2);
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
            }
        });
    }

    @Override // o.InterfaceC5958cOs
    public void b() {
        C5960cOu.b.c();
    }
}
