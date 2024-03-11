package o;

import android.app.Activity;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.netflix.android.org.json.zip.JSONzip;
import com.netflix.mediaclient.commanderinfra.api.util.CommanderState;
import com.netflix.mediaclient.commanderinfra.impl.UiInfraImpl$onActivityResume$2;
import dagger.hilt.android.scopes.ActivityScoped;
import javax.inject.Inject;

@ActivityScoped
/* renamed from: o.Wv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1312Wv implements VD {
    public static final d e = new d(null);
    private final InterfaceC8812dzl<C1294Wd> a;
    private final dwQ b;
    private final ComponentActivity c;

    @Override // o.VD
    public InterfaceC8822dzv<C1294Wd> a() {
        return this.a;
    }

    @Inject
    public C1312Wv(Activity activity, dwQ dwq) {
        C8632dsu.c((Object) activity, "");
        C8632dsu.c((Object) dwq, "");
        this.b = dwq;
        this.c = (ComponentActivity) C9737vz.e(activity, ComponentActivity.class);
        this.a = dzB.d(new C1294Wd(false, null, false, false, false, false, null, false, false, false, false, false, false, 8191, null));
    }

    /* renamed from: o.Wv$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("UiInfraImpl");
        }
    }

    @Override // o.VD
    public C1294Wd d() {
        return this.a.b();
    }

    @Override // o.VD
    public void d(drM<? super C1294Wd, C1294Wd> drm) {
        C8632dsu.c((Object) drm, "");
        InterfaceC8812dzl<C1294Wd> interfaceC8812dzl = this.a;
        interfaceC8812dzl.d(drm.invoke(interfaceC8812dzl.b()));
    }

    @Override // o.VD
    public boolean c() {
        return C8153dex.P();
    }

    private final void b() {
        C1294Wd c;
        Window window = this.c.getWindow();
        Integer e2 = this.a.b().e();
        if (e2 != null) {
            window.setSoftInputMode(e2.intValue());
        }
        InterfaceC8812dzl<C1294Wd> interfaceC8812dzl = this.a;
        c = r3.c((r28 & 1) != 0 ? r3.c : false, (r28 & 2) != 0 ? r3.l : null, (r28 & 4) != 0 ? r3.d : false, (r28 & 8) != 0 ? r3.a : false, (r28 & 16) != 0 ? r3.g : false, (r28 & 32) != 0 ? r3.h : false, (r28 & 64) != 0 ? r3.e : null, (r28 & 128) != 0 ? r3.b : false, (r28 & JSONzip.end) != 0 ? r3.j : false, (r28 & 512) != 0 ? r3.i : false, (r28 & 1024) != 0 ? r3.n : false, (r28 & 2048) != 0 ? r3.m : false, (r28 & 4096) != 0 ? interfaceC8812dzl.b().f : false);
        interfaceC8812dzl.d(c);
        e.getLogTag();
    }

    private final void g() {
        C1294Wd c;
        Window window = this.c.getWindow();
        InterfaceC8812dzl<C1294Wd> interfaceC8812dzl = this.a;
        c = r4.c((r28 & 1) != 0 ? r4.c : false, (r28 & 2) != 0 ? r4.l : null, (r28 & 4) != 0 ? r4.d : false, (r28 & 8) != 0 ? r4.a : false, (r28 & 16) != 0 ? r4.g : false, (r28 & 32) != 0 ? r4.h : false, (r28 & 64) != 0 ? r4.e : Integer.valueOf(window.getAttributes().softInputMode), (r28 & 128) != 0 ? r4.b : false, (r28 & JSONzip.end) != 0 ? r4.j : false, (r28 & 512) != 0 ? r4.i : false, (r28 & 1024) != 0 ? r4.n : false, (r28 & 2048) != 0 ? r4.m : false, (r28 & 4096) != 0 ? interfaceC8812dzl.b().f : false);
        interfaceC8812dzl.d(c);
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        this.c.getWindow().setSoftInputMode(48);
        e.getLogTag();
    }

    @Override // o.VD
    public void a(CommanderState commanderState) {
        C1294Wd c;
        C8632dsu.c((Object) commanderState, "");
        e.getLogTag();
        c = r1.c((r28 & 1) != 0 ? r1.c : false, (r28 & 2) != 0 ? r1.l : commanderState, (r28 & 4) != 0 ? r1.d : false, (r28 & 8) != 0 ? r1.a : false, (r28 & 16) != 0 ? r1.g : false, (r28 & 32) != 0 ? r1.h : false, (r28 & 64) != 0 ? r1.e : null, (r28 & 128) != 0 ? r1.b : false, (r28 & JSONzip.end) != 0 ? r1.j : false, (r28 & 512) != 0 ? r1.i : false, (r28 & 1024) != 0 ? r1.n : false, (r28 & 2048) != 0 ? r1.m : false, (r28 & 4096) != 0 ? this.a.b().f : false);
        if (commanderState != this.a.b().m()) {
            b(c);
        }
        this.a.d(c);
    }

    @Override // o.VD
    public void e() {
        e.getLogTag();
        if (this.a.b().m() == CommanderState.a) {
            Lifecycle lifecycle = this.c.getLifecycle();
            C8632dsu.a(lifecycle, "");
            C8737dwr.c(LifecycleKt.getCoroutineScope(lifecycle), this.b, null, new UiInfraImpl$onActivityResume$2(this, null), 2, null);
        }
    }

    private final void b(C1294Wd c1294Wd) {
        e.getLogTag();
        if (c1294Wd.m() == CommanderState.a) {
            g();
        } else {
            b();
        }
    }
}
