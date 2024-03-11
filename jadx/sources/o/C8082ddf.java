package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.verifyplay.PlayVerifierVault;
import io.reactivex.functions.Consumer;
import o.AbstractC7431cwA;

/* renamed from: o.ddf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8082ddf extends C1076Nu {
    private static long a;
    private static long b;
    private static boolean c;
    @SuppressLint({"StaticFieldLeak"})
    private static C8019dcV d;
    private static C8082ddf e = new C8082ddf();

    public static C8082ddf a() {
        return e;
    }

    public static void e() {
        a = 0L;
    }

    private C8082ddf() {
    }

    @SuppressLint({"CheckResult"})
    public void b(final NetflixActivity netflixActivity, boolean z, final PlayVerifierVault playVerifierVault, final InterfaceC8018dcU interfaceC8018dcU) {
        InterfaceC5131bsv q;
        if (C8054ddD.l(netflixActivity)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SPY-17071: verify called while activity is destroyed: ");
            sb.append(netflixActivity == null ? "null" : netflixActivity.getClass());
            InterfaceC1598aHf.a(sb.toString());
            return;
        }
        boolean z2 = false;
        if (netflixActivity.getSupportFragmentManager().isStateSaved()) {
            InterfaceC1598aHf.a(new C1596aHd("SPY-17071: verify called after state saved: " + netflixActivity.getClass()).b(false));
            return;
        }
        InterfaceC5283bvo d2 = (playVerifierVault.f() || playVerifierVault.d() == null) ? null : InterfaceC7303ctf.c((Context) netflixActivity).d(netflixActivity, playVerifierVault.d());
        if (C8151dev.h()) {
            UserAgent k = AbstractApplicationC1040Mh.getInstance().i().k();
            InterfaceC5283bvo j = k != null ? k.j() : null;
            if (j != null && j.isProfileLocked()) {
                d2 = j;
            }
        }
        boolean z3 = playVerifierVault.h() && ((!playVerifierVault.f() || (q = netflixActivity.getServiceManager().q()) == null) ? false : q.s() ^ true);
        if (z || playVerifierVault.i()) {
            z2 = true;
        }
        if (!e(z2, z3) && d2 == null) {
            C8019dcV.d(netflixActivity, playVerifierVault, interfaceC8018dcU);
        } else if (d == null || a(playVerifierVault)) {
            NetflixApplication netflixApplication = (NetflixApplication) netflixActivity.getApplication();
            if (netflixApplication.K()) {
                C1044Mm.e("nf_pin", "skip pin dialog - was in background");
                return;
            }
            netflixApplication.D().c(this);
            if (d2 != null) {
                final C7432cwB e2 = C7432cwB.e(netflixActivity, d2);
                d = e2;
                e2.e().takeUntil(netflixActivity.getActivityDestroy()).subscribe(new Consumer() { // from class: o.dde
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        C8082ddf.this.c(netflixActivity, playVerifierVault, interfaceC8018dcU, e2, (AbstractC7431cwA) obj);
                    }
                }, new Consumer() { // from class: o.ddi
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        InterfaceC1598aHf.e("Error checking profile pin for playback", (Throwable) obj);
                    }
                });
            } else {
                C8019dcV d3 = C8019dcV.d(playVerifierVault);
                d = d3;
                d3.c(interfaceC8018dcU);
            }
            d.show(netflixActivity.getSupportFragmentManager(), NetflixActivity.FRAG_DIALOG_TAG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(NetflixActivity netflixActivity, PlayVerifierVault playVerifierVault, InterfaceC8018dcU interfaceC8018dcU, C7432cwB c7432cwB, AbstractC7431cwA abstractC7431cwA) {
        if (abstractC7431cwA == AbstractC7431cwA.c.a) {
            C8019dcV.d(netflixActivity, playVerifierVault, interfaceC8018dcU);
            d();
        } else if (abstractC7431cwA == AbstractC7431cwA.b.c) {
            c7432cwB.f();
            d();
        }
    }

    private boolean a(PlayVerifierVault playVerifierVault) {
        C1044Mm.j("nf_pin", String.format("pinDialog!=null loc:%s, visible:%b, hidden:%b", playVerifierVault.b(), Boolean.valueOf(d.isVisible()), Boolean.valueOf(d.isHidden())));
        if (!d.isVisible() && !d.isHidden()) {
            C1044Mm.j("nf_pin", String.format("Error.. pinDialog!=null but not visible - killing.. loc:%s, visible:%b, hidden:%b", playVerifierVault.b(), Boolean.valueOf(d.isVisible()), Boolean.valueOf(d.isHidden())));
            c();
        } else if (PlayVerifierVault.RequestedBy.e.c().equals(playVerifierVault.b())) {
            return false;
        } else {
            c();
        }
        return true;
    }

    public static boolean b() {
        return a > System.currentTimeMillis();
    }

    public static void d(long j) {
        e(j);
    }

    private boolean e(boolean z, boolean z2) {
        C1044Mm.e("nf_pin_session", String.format("Active:%b isPinProtected:%b isPreviewProtected: %b - shouldVerifyPin", Boolean.valueOf(b()), Boolean.valueOf(z), Boolean.valueOf(z2)));
        if (z2) {
            return true;
        }
        if (z) {
            return !b();
        }
        return false;
    }

    public void b(boolean z, boolean z2) {
        boolean z3;
        boolean b2 = b();
        if (z2 || !b2) {
            z3 = false;
        } else {
            b(System.currentTimeMillis() + 1800000);
            z3 = true;
        }
        C1044Mm.e("nf_pin_session", "isActive: " + b2 + ", wasPinProtectedPlayback: " + z + ", wasPreviewProtectedPlayback: " + z2 + ", extendSession ? " + z3 + "- registerPlayStopEvent");
    }

    public void h() {
        C1044Mm.e("nf_pin_session", "isActive: " + b() + " to: true - registerPinVerifyEvent");
        b(System.currentTimeMillis() + 1800000);
    }

    private static void e(long j) {
        if (b()) {
            C1044Mm.e("nf_pin_session", String.format("isActive: %b lastInteractionTime:%d - registerUserInteractionEvent", Boolean.valueOf(b()), Long.valueOf(j)));
            b((System.currentTimeMillis() - j) + 1800000);
        }
    }

    private static void b(long j) {
        if (j > a) {
            C1044Mm.e("nf_pin_session", String.format("isActive: %b, current:%d, newExpiry:%d - updatePinSessionExpiryTime", Boolean.valueOf(b()), Long.valueOf(System.currentTimeMillis()), Long.valueOf(j)));
            a = j;
        }
    }

    public void c() {
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(c);
        objArr[1] = Boolean.valueOf(d != null);
        C1044Mm.e("nf_pin", String.format("dismissPinVerification appInBackground:%b, pinDialogValid:%b", objArr));
        C8019dcV c8019dcV = d;
        if (c8019dcV != null) {
            c8019dcV.h();
            d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d() {
        C1044Mm.e("nf_pin", "pinDialogDismissed mPinDialog=null");
        d = null;
    }

    @Override // o.C1076Nu, o.InterfaceC1072Nq
    public void a(NC nc, boolean z) {
        C1044Mm.e("nf_pin", "app in background");
        b = System.currentTimeMillis();
        c = true;
    }

    @Override // o.C1076Nu, o.InterfaceC1072Nq
    public void c(NC nc, Intent intent) {
        c = false;
        C1044Mm.e("nf_pin", "app in foreground ");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean g() {
        return c && System.currentTimeMillis() - b > 180000;
    }
}
