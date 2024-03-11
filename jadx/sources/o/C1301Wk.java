package o;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.commanderinfra.api.util.ConnectionState;
import com.netflix.mediaclient.commanderinfra.impl.CommanderUiInfraImpl$1;
import com.netflix.mediaclient.commanderinfra.impl.logging.CommanderFlexEventType;
import dagger.hilt.android.scopes.ActivityScoped;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineExceptionHandler;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

@ActivityScoped
/* renamed from: o.Wk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1301Wk implements InterfaceC1290Vz {
    public static final d d = new d(null);
    private final ComponentActivity a;
    private final InterfaceC1284Vt b;
    private final InterfaceC8812dzl<Boolean> c;
    private final InterfaceC1286Vv e;
    private final VH f;
    private final dwQ g;
    private final VF j;

    @Inject
    public C1301Wk(Activity activity, InterfaceC1284Vt interfaceC1284Vt, VF vf, VH vh, InterfaceC1286Vv interfaceC1286Vv, dwQ dwq) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) interfaceC1284Vt, "");
        C8632dsu.c((Object) vf, "");
        C8632dsu.c((Object) vh, "");
        C8632dsu.c((Object) interfaceC1286Vv, "");
        C8632dsu.c((Object) dwq, "");
        this.b = interfaceC1284Vt;
        this.j = vf;
        this.f = vh;
        this.e = interfaceC1286Vv;
        this.g = dwq;
        ComponentActivity componentActivity = (ComponentActivity) C9737vz.e(activity, ComponentActivity.class);
        this.a = componentActivity;
        this.c = dzB.d(Boolean.FALSE);
        c cVar = new c(CoroutineExceptionHandler.Key);
        Lifecycle lifecycle = componentActivity.getLifecycle();
        C8632dsu.a(lifecycle, "");
        C8737dwr.c(LifecycleKt.getCoroutineScope(lifecycle), cVar.plus(dwq), null, new CommanderUiInfraImpl$1(this, null), 2, null);
    }

    /* renamed from: o.Wk$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("CommanderUiInfraImpl");
        }
    }

    /* renamed from: o.Wk$c */
    /* loaded from: classes3.dex */
    public static final class c extends dqT implements CoroutineExceptionHandler {
        public c(CoroutineExceptionHandler.c cVar) {
            super(cVar);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(dqZ dqz, Throwable th) {
            d dVar = C1301Wk.d;
        }
    }

    @Override // o.InterfaceC1290Vz
    public boolean a() {
        boolean z = false;
        if (this.j.e() && (!C1330Xn.c.d(false))) {
            this.f.a(ConnectionState.c);
        }
        d.getLogTag();
        return z;
    }

    @Override // o.InterfaceC1290Vz
    public Long b() {
        return C1325Xi.a.b();
    }

    @Override // o.InterfaceC1290Vz
    public String e() {
        return C1325Xi.a.c();
    }

    @Override // o.InterfaceC1290Vz
    public boolean e(String str, String str2) {
        boolean g;
        boolean g2;
        Object obj;
        List<VY> e;
        boolean d2;
        if (this.j.e() && str != null) {
            g = C8691duz.g(str);
            if (!g && str2 != null) {
                g2 = C8691duz.g(str2);
                if (!g2) {
                    Iterator<T> it = this.j.b().b().iterator();
                    while (true) {
                        obj = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        d2 = duD.d((CharSequence) ((VZ) next).e(), (CharSequence) str, false, 2, (Object) null);
                        if (d2) {
                            obj = next;
                            break;
                        }
                    }
                    VZ vz = (VZ) obj;
                    if (vz != null) {
                        InterfaceC1286Vv interfaceC1286Vv = this.e;
                        ConnectionState connectionState = ConnectionState.g;
                        e = C8566dqi.e(new VY(vz));
                        interfaceC1286Vv.e(connectionState, e);
                        d.getLogTag();
                        return true;
                    }
                }
            }
        }
        d.getLogTag();
        return false;
    }

    @Override // o.InterfaceC1290Vz
    public void c(boolean z) {
        this.c.d(Boolean.valueOf(z));
    }

    private final void g() {
        Map d2;
        Map k;
        Throwable th;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://help.netflix.com/node/132821?netflixsource=android"));
        intent.setFlags(872415232);
        if (intent.resolveActivity(AbstractApplicationC1040Mh.d().getPackageManager()) != null) {
            AbstractApplicationC1040Mh.d().startActivity(intent);
            return;
        }
        InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
        d2 = dqE.d();
        k = dqE.k(d2);
        C1596aHd c1596aHd = new C1596aHd("SPY-38443: Unable to open help article as activity is unavailable that can handle the intent", null, null, false, k, false, false, 96, null);
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
        InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
        InterfaceC1598aHf a = dVar.a();
        if (a != null) {
            a.e(c1596aHd, th);
        } else {
            dVar.e().b(c1596aHd, th);
        }
    }

    @Override // o.InterfaceC1290Vz
    public void d() {
        d.getLogTag();
        WL.d(WL.d, this.b.g(), CommanderFlexEventType.a, null, 4, null);
        this.b.c();
        for (VQ vq : this.j.a()) {
            vq.a();
        }
    }

    @Override // o.InterfaceC1290Vz
    public void c() {
        d.getLogTag();
        WL.d(WL.d, this.b.g(), CommanderFlexEventType.h, null, 4, null);
        g();
    }
}
