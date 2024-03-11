package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.api.core.ModuleInstallState;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import io.reactivex.disposables.CompositeDisposable;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import o.aMN;

/* loaded from: classes.dex */
public final class bXB extends bXA implements bXE {
    private NetflixActivity a;
    private boolean b;
    private final String c;
    private List<Locale> g;
    private final CompositeDisposable j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bXB(aMN amn) {
        super(amn);
        C8632dsu.c((Object) amn, "");
        this.c = "LangModuleInstall";
        this.j = new CompositeDisposable();
    }

    @Override // o.bXE
    public void a(int i) {
        C1044Mm.c(this.c, "onActivityResultForModuleInstall resultCode %d", Integer.valueOf(i));
        String d = ModuleInstallState.STATE_USER_CONFIRMATION.d();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        a(d, sb.toString());
    }

    @Override // o.bXE
    public void a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        C1044Mm.a(this.c, "onActivityResume");
        this.a = (NetflixActivity) C8141del.d(activity, NetflixActivity.class);
        g();
    }

    @Override // o.bXE
    public void c(Activity activity) {
        C8632dsu.c((Object) activity, "");
        C1044Mm.a(this.c, "onActivityPause");
        if (C8632dsu.c(this.a, activity)) {
            this.a = null;
        }
    }

    @Override // o.bXE
    public boolean c(Locale locale) {
        C8632dsu.c((Object) locale, "");
        C1044Mm.a(this.c, "installMissingLanguagesForSignup");
        aSN.e(locale);
        return g();
    }

    @Override // o.bXE
    public boolean a(Locale locale) {
        C1044Mm.a(this.c, "installMissingLanguagesOnInitialConfig");
        if (locale != null) {
            aSN.e(locale);
        }
        return g();
    }

    @Override // o.bXA
    protected void c(Throwable th) {
        C8632dsu.c((Object) th, "");
        this.b = false;
        a(ModuleInstallState.STATE_ON_ERROR.d(), b(th));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // o.bXA
    protected void c(aMN.e eVar) {
        String sb;
        C8632dsu.c((Object) eVar, "");
        C1044Mm.a(this.c, "onNextUpdate status= " + eVar.d() + " bytesDownloaded=" + eVar.e() + " totalBytesToDownload=" + eVar.c());
        String a = a(eVar);
        boolean z = true;
        String str = null;
        switch (eVar.d()) {
            case 1:
                this.b = true;
                break;
            case 2:
                this.b = true;
                z = false;
                break;
            case 3:
            case 4:
                break;
            case 5:
                this.b = false;
                C1332Xp c1332Xp = C1332Xp.b;
                LocalBroadcastManager.getInstance((Context) C1332Xp.b(Context.class)).sendBroadcast(new Intent(bXE.e));
                e();
                break;
            case 6:
                this.b = false;
                int a2 = eVar.a();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a2);
                sb = sb2.toString();
                str = sb;
                break;
            case 7:
                this.b = false;
                int d = eVar.d();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(d);
                sb = sb3.toString();
                str = sb;
                break;
            case 8:
                d(this.a, eVar);
                break;
            case 9:
                this.b = false;
                break;
            default:
                z = false;
                break;
        }
        if (z) {
            a(a, str);
        }
    }

    private final void e() {
        List<Locale> list = this.g;
        if (list != null) {
            d(list, this.j);
            this.g = null;
        }
    }

    private final boolean g() {
        C1044Mm.a(this.c, "requestMissingLanguagesForeground");
        List<Locale> b = b();
        if (!b.isEmpty()) {
            if (this.b) {
                C1044Mm.a(this.c, "waiting for previous language request to finish the installation.");
                this.g = b;
                return true;
            }
            this.b = true;
            d(b, this.j);
        }
        return this.b;
    }

    private final List<Locale> b() {
        C1052Mw i = AbstractApplicationC1040Mh.getInstance().i();
        C8632dsu.a(i, "");
        Set<Locale> a = aSN.a(i.k());
        C8632dsu.a(a, "");
        Set<String> a2 = this.d.a();
        C8632dsu.a(a2, "");
        List<Locale> c = aSN.c(a, a2);
        C8632dsu.a(c, "");
        return c;
    }

    private final void d(NetflixActivity netflixActivity, aMN.e eVar) {
        if (C8054ddD.l(netflixActivity)) {
            return;
        }
        try {
            this.d.b(eVar, netflixActivity, MP.h);
        } catch (IntentSender.SendIntentException unused) {
        }
    }

    private final void a(String str, String str2) {
        InterfaceC5090bsG e;
        IClientLogging f = AbstractApplicationC1040Mh.getInstance().i().f();
        if (f == null || (e = f.e()) == null) {
            return;
        }
        aMN.d dVar = aMN.d.d;
        C8632dsu.a(dVar, "");
        e.a(new aSV(dVar, str).d(str2));
    }

    @Override // o.bXE
    public boolean a() {
        C1044Mm.a(this.c, "installingMissingLanguagesForSignedInUser");
        boolean g = g();
        if (g && d()) {
            return false;
        }
        return g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
        r1 = o.C8563dqf.D(r1);
     */
    @Override // o.bXE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r3 = this;
            java.util.List r0 = r3.b()
            com.netflix.mediaclient.NetflixApplication r1 = com.netflix.mediaclient.NetflixApplication.getInstance()
            java.lang.String[] r1 = o.C1821aPm.b(r1)
            if (r1 == 0) goto L14
            java.util.List r1 = o.C8561dqd.o(r1)
            if (r1 != 0) goto L18
        L14:
            java.util.List r1 = o.C8570dqm.c()
        L18:
            o.aSR r2 = new o.aSR
            r2.<init>(r0, r1)
            o.C8159dfC.c(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bXB.c():void");
    }

    private final boolean d() {
        C4984bqG c4984bqG = C4984bqG.b;
        C1332Xp c1332Xp = C1332Xp.b;
        C8313dhy e = c4984bqG.e((Context) C1332Xp.b(Context.class));
        Set<String> a = this.d.a();
        C8632dsu.a(a, "");
        return a.contains(e.b());
    }
}
