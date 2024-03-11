package com.netflix.mediaclient.externalcrashreporter.bugsnag;

import android.content.Context;
import com.netflix.cl.util.NavigationLevelCollector;
import com.netflix.mediaclient.externalcrashreporter.bugsnag.BugsnagCrashReporter;
import com.netflix.mediaclient.service.webclient.model.leafs.UmaAlert;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import o.C8284dhV;
import o.C8569dql;
import o.C8572dqo;
import o.C8576dqs;
import o.C8632dsu;
import o.C9229le;
import o.InterfaceC9218lT;
import o.XC;
import o.XE;
import o.XF;

/* loaded from: classes3.dex */
public final class BugsnagErrorHandler implements InterfaceC9218lT {
    private boolean a;
    private Boolean b;
    private List<XC> c;
    private String d;
    private final Context e;
    @Inject
    public XE encryptedUserIds;
    private List<XC> j;

    public final void b(String str) {
        this.d = str;
    }

    public final void b(List<XC> list) {
        C8632dsu.c((Object) list, "");
        this.j = list;
    }

    public final boolean b() {
        return this.a;
    }

    public final List<XC> c() {
        return this.c;
    }

    public final void c(boolean z) {
        this.a = z;
    }

    public final List<XC> d() {
        return this.j;
    }

    public final void e(Boolean bool) {
        this.b = bool;
    }

    public final void e(List<XC> list) {
        C8632dsu.c((Object) list, "");
        this.c = list;
    }

    @Inject
    public BugsnagErrorHandler(@ApplicationContext Context context) {
        List<XC> i;
        List<XC> i2;
        C8632dsu.c((Object) context, "");
        this.e = context;
        i = C8569dql.i();
        this.c = i;
        i2 = C8569dql.i();
        this.j = i2;
    }

    protected final XE a() {
        XE xe = this.encryptedUserIds;
        if (xe != null) {
            return xe;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.InterfaceC9218lT
    public boolean c(C9229le c9229le) {
        C8632dsu.c((Object) c9229le, "");
        if (!this.a) {
            BugsnagCrashReporter.a.getLogTag();
            return false;
        }
        BugsnagCrashReporter.a.getLogTag();
        try {
            b(c9229le);
            d(c9229le);
            e(c9229le);
            return true;
        } catch (Throwable th) {
            BugsnagCrashReporter.c cVar = BugsnagCrashReporter.a;
            c9229le.a("netflix", UmaAlert.ICON_ERROR, th.toString());
            return true;
        }
    }

    private final void b(C9229le c9229le) {
        List<XC> g;
        int d;
        int d2;
        c9229le.a(NavigationLevelCollector.INSTANCE.getCurrentScreen());
        XF.d.d(c9229le);
        g = C8576dqs.g((Collection) this.c, (Iterable) this.j);
        c9229le.a("netflix", "tests", c(g));
        d = C8572dqo.d(g, 10);
        ArrayList arrayList = new ArrayList(d);
        for (XC xc : g) {
            arrayList.add(xc.d());
        }
        c9229le.a("abTests", "abTests", arrayList.toArray(new String[0]));
        d2 = C8572dqo.d(g, 10);
        ArrayList arrayList2 = new ArrayList(d2);
        for (XC xc2 : g) {
            String d3 = xc2.d();
            int b = xc2.b();
            arrayList2.add(d3 + ":" + b);
        }
        c9229le.a("abTests", "abTestCells", arrayList2.toArray(new String[0]));
    }

    private final void d(C9229le c9229le) {
        String str = this.d;
        if (str == null) {
            return;
        }
        String b = a().b(str);
        if (b.length() < 100) {
            c9229le.a("netflix", "guid1", b);
        } else {
            String substring = b.substring(0, 99);
            C8632dsu.a(substring, "");
            c9229le.a("netflix", "guid1", substring);
            String substring2 = b.substring(99);
            C8632dsu.a(substring2, "");
            c9229le.a("netflix", "guid2", substring2);
        }
        c9229le.a("netflix", "isKidsProfile", this.b);
    }

    private final void e(C9229le c9229le) {
        String a = C8284dhV.a();
        if (a != null) {
            c9229le.a("netflix", "nfvdid", a);
        }
    }

    private final String c(List<XC> list) {
        StringBuilder sb = new StringBuilder();
        for (XC xc : list) {
            sb.append(xc.d());
            sb.append("=");
            sb.append(xc.b());
            sb.append(",");
        }
        String sb2 = sb.toString();
        C8632dsu.a(sb2, "");
        return sb2;
    }
}
