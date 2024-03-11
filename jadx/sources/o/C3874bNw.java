package o;

import android.view.MenuItem;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.RealDismissedBeaconWatcher$watch$1;
import javax.inject.Inject;

/* renamed from: o.bNw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3874bNw implements InterfaceC3854bNc {
    private final InterfaceC3862bNk d;
    private final InterfaceC3859bNh e;
    public static final a c = new a(null);
    public static final int b = 8;

    @Inject
    public C3874bNw(InterfaceC3862bNk interfaceC3862bNk, InterfaceC3859bNh interfaceC3859bNh) {
        C8632dsu.c((Object) interfaceC3862bNk, "");
        C8632dsu.c((Object) interfaceC3859bNh, "");
        this.d = interfaceC3862bNk;
        this.e = interfaceC3859bNh;
    }

    /* renamed from: o.bNw$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("DismissedBeaconWatcher");
        }
    }

    @Override // o.InterfaceC3854bNc
    public void d(ComponentActivity componentActivity, MenuItem menuItem) {
        C8632dsu.c((Object) componentActivity, "");
        C8632dsu.c((Object) menuItem, "");
        Lifecycle lifecycle = componentActivity.getLifecycle();
        C8632dsu.a(lifecycle, "");
        LifecycleKt.getCoroutineScope(lifecycle).launchWhenStarted(new RealDismissedBeaconWatcher$watch$1(this, menuItem, componentActivity, null));
    }
}
