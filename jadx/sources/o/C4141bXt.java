package o;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.ui.home.HomeActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Supplier;
import o.AbstractC4140bXs;
import o.InterfaceC7343cuS;

/* renamed from: o.bXt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4141bXt implements AbstractC4140bXs.d {
    private static C4141bXt b;
    private final Deque<AbstractC4140bXs> a;
    private WeakReference<NetflixActivity> c;
    private boolean d;

    public static C4141bXt a(NetflixActivity netflixActivity, Supplier<InterfaceC7088cpc> supplier, InterfaceC7343cuS.d dVar) {
        if (b == null) {
            b = new C4141bXt(supplier, dVar);
        }
        b.a(netflixActivity);
        return b;
    }

    @Override // o.AbstractC4140bXs.d
    /* renamed from: b */
    public NetflixActivity c() {
        NetflixActivity netflixActivity = this.c.get();
        if (C8054ddD.l(netflixActivity)) {
            return null;
        }
        return netflixActivity;
    }

    private void a(NetflixActivity netflixActivity) {
        this.c = new WeakReference<>(netflixActivity);
    }

    private C4141bXt(Supplier<InterfaceC7088cpc> supplier, InterfaceC7343cuS.d dVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.a = arrayDeque;
        C1044Mm.e("DialogManager", "DialogManager initialized");
        if (ConfigFastPropertyFeatureControlConfig.Companion.i()) {
            arrayDeque.add(supplier.get().b(this));
        }
        if (C8153dex.x()) {
            arrayDeque.add(new C4146bXy(this));
        }
        if (C8153dex.B()) {
            arrayDeque.add(new C4144bXw(this, dVar));
        }
        arrayDeque.add(new C4143bXv(this));
    }

    public void a() {
        if (C8153dex.x()) {
            this.a.addFirst(new C4146bXy(this));
        }
    }

    private boolean e(NetflixActivity netflixActivity) {
        if (netflixActivity.isDialogFragmentVisible()) {
            C1044Mm.e("DialogManager", "a DialogFragment is already visible - can't display dialog");
            return false;
        } else if (netflixActivity.getSupportFragmentManager().isStateSaved()) {
            C1044Mm.e("DialogManager", "Activity has saved instance state - can't display dialog");
            return false;
        } else if (C8054ddD.l(netflixActivity)) {
            C1044Mm.e("DialogManager", "Activity is destroyed - can't display dialog");
            return false;
        } else {
            C1044Mm.e("DialogManager", "Dialog can be safely shown.");
            return true;
        }
    }

    public boolean d() {
        C1044Mm.e("DialogManager", "displayDialogsIfNeeded;");
        NetflixActivity c = c();
        if (c == null) {
            C1044Mm.e("DialogManager", "Owner is null!");
            return false;
        } else if (!((c instanceof HomeActivity) && ((HomeActivity) c).r()) && c.getServiceManager().x() == null) {
            if (this.d || !e(c)) {
                C1044Mm.e("DialogManager", "..could display dialog... isLocked: " + this.d);
                return false;
            }
            while (!this.a.isEmpty()) {
                AbstractC4140bXs remove = this.a.remove();
                if (remove.a()) {
                    C1044Mm.e("DialogManager", "showing something! -> " + remove.getClass().getSimpleName());
                    return remove.b();
                }
            }
            return false;
        } else {
            return false;
        }
    }
}
