package com.netflix.mediaclient.externalcrashreporter.bugsnag;

import android.content.Context;
import com.bugsnag.android.BreadcrumbType;
import com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter;
import com.netflix.mediaclient.externalcrashreporter.bugsnag.BugsnagCrashReporter;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import dagger.multibindings.IntoSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.C1045Mp;
import o.C8206dfx;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;
import o.C9187kp;
import o.C9196ky;
import o.C9229le;
import o.InterfaceC1248Uj;
import o.InterfaceC1730aMc;
import o.InterfaceC9218lT;
import o.XC;
import o.XF;
import o.dpR;
import o.dqN;
import o.dqP;

@Singleton
/* loaded from: classes3.dex */
public final class BugsnagCrashReporter implements ExternalCrashReporter {
    public static final c a = new c(null);
    private final InterfaceC1248Uj b;
    private final InterfaceC1730aMc d;
    private final BugsnagErrorHandler e;

    @Module
    @InstallIn({SingletonComponent.class})
    /* loaded from: classes6.dex */
    public interface BugsnagCrashReporterModule {
        @Binds
        @IntoSet
        ExternalCrashReporter c(BugsnagCrashReporter bugsnagCrashReporter);
    }

    @Inject
    public BugsnagCrashReporter(BugsnagErrorHandler bugsnagErrorHandler, InterfaceC1248Uj interfaceC1248Uj, InterfaceC1730aMc interfaceC1730aMc) {
        C8632dsu.c((Object) bugsnagErrorHandler, "");
        C8632dsu.c((Object) interfaceC1248Uj, "");
        C8632dsu.c((Object) interfaceC1730aMc, "");
        this.e = bugsnagErrorHandler;
        this.b = interfaceC1248Uj;
        this.d = interfaceC1730aMc;
    }

    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("BugsnagCrashReporter");
        }
    }

    @Override // com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter
    public void d(Context context, boolean z) {
        C8632dsu.c((Object) context, "");
        if (this.e.b() != z) {
            Throwable th = null;
            if (z) {
                try {
                    C9187kp.a(context, d());
                } catch (Throwable th2) {
                    if (!(th2 instanceof UnsatisfiedLinkError) && !(th2 instanceof NoClassDefFoundError)) {
                        throw th2;
                    }
                    th = th2;
                }
                C9187kp.a(this.e);
            }
            this.e.c(z);
            if (th != null) {
                throw th;
            }
            a.getLogTag();
            return;
        }
        a.getLogTag();
    }

    @Override // com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter
    public void b(final ExternalCrashReporter.a aVar) {
        C8632dsu.c((Object) aVar, "");
        if (this.e.b()) {
            C9187kp.a(aVar.b(), new InterfaceC9218lT() { // from class: o.XA
                @Override // o.InterfaceC9218lT
                public final boolean c(C9229le c9229le) {
                    boolean a2;
                    a2 = BugsnagCrashReporter.a(ExternalCrashReporter.a.this, c9229le);
                    return a2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(ExternalCrashReporter.a aVar, C9229le c9229le) {
        C8632dsu.c((Object) aVar, "");
        C8632dsu.c((Object) c9229le, "");
        for (Map.Entry<String, String> entry : aVar.c().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value == null) {
                value = "null";
            }
            if (value.length() > 500) {
                value = value.substring(0, 500);
                C8632dsu.a(value, "");
            }
            c9229le.a("netflix", key, value);
        }
        XF.d.d(c9229le);
        return true;
    }

    @Override // com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter
    public void c(String str) {
        C8632dsu.c((Object) str, "");
        if (this.e.b()) {
            C9187kp.c(str);
        }
    }

    @Override // com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter
    public void d(String str, String str2) {
        C8632dsu.c((Object) str, "");
        if (this.e.b()) {
            C9187kp.b("netflix", str, str2);
        }
    }

    @Override // com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter
    public void c(List<XC> list) {
        C8632dsu.c((Object) list, "");
        this.e.e(list);
        c();
    }

    @Override // com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter
    public void a(List<XC> list) {
        C8632dsu.c((Object) list, "");
        this.e.b(list);
        c();
    }

    private final void c() {
        int d;
        int d2;
        if (this.e.b()) {
            C9187kp.d();
            List<XC> d3 = this.e.d();
            d = C8572dqo.d(d3, 10);
            ArrayList arrayList = new ArrayList(d);
            for (XC xc : d3) {
                if (xc.b() > 1) {
                    String c2 = xc.c();
                    String d4 = xc.d();
                    C9187kp.d(c2 + " [" + d4 + "]", String.valueOf(xc.b()));
                }
                arrayList.add(dpR.c);
            }
            List<XC> c3 = this.e.c();
            d2 = C8572dqo.d(c3, 10);
            ArrayList arrayList2 = new ArrayList(d2);
            for (XC xc2 : c3) {
                if (xc2.b() > 1) {
                    String c4 = xc2.c();
                    String d5 = xc2.d();
                    C9187kp.d(c4 + " [" + d5 + "]", String.valueOf(xc2.b()));
                }
                arrayList2.add(dpR.c);
            }
        }
    }

    @Override // com.netflix.mediaclient.externalcrashreporter.api.ExternalCrashReporter
    public void e(String str, boolean z) {
        this.e.b(str);
        this.e.e(Boolean.valueOf(z));
    }

    private final C9196ky d() {
        Set<BreadcrumbType> d;
        Set<String> a2;
        C9196ky c9196ky = new C9196ky("046c09611a886f10d1201353b77c886f");
        c9196ky.d(this.b.i());
        c9196ky.a(Integer.valueOf(this.b.e()));
        d = dqN.d(BreadcrumbType.NAVIGATION, BreadcrumbType.MANUAL, BreadcrumbType.STATE);
        c9196ky.b(d);
        c9196ky.a(100);
        a2 = dqP.a("com.netflix");
        c9196ky.d(a2);
        c9196ky.f().e(false);
        c9196ky.f().a(true);
        if (C8206dfx.a()) {
            c9196ky.c("dog fooding");
        }
        return c9196ky;
    }
}
