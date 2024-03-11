package o;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.RealCreateBeaconWatcher$watch$1;
import javax.inject.Inject;

/* renamed from: o.bNx  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3875bNx implements InterfaceC3853bNb {
    private final InterfaceC3862bNk b;
    private final InterfaceC3859bNh d;
    public static final c e = new c(null);
    public static final int c = 8;

    @Inject
    public C3875bNx(InterfaceC3862bNk interfaceC3862bNk, InterfaceC3859bNh interfaceC3859bNh) {
        C8632dsu.c((Object) interfaceC3862bNk, "");
        C8632dsu.c((Object) interfaceC3859bNh, "");
        this.b = interfaceC3862bNk;
        this.d = interfaceC3859bNh;
    }

    /* renamed from: o.bNx$c */
    /* loaded from: classes4.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("RealCreateBeaconWatcher");
        }
    }

    @Override // o.InterfaceC3853bNb
    public void a(ComponentActivity componentActivity) {
        C8632dsu.c((Object) componentActivity, "");
        Lifecycle lifecycle = componentActivity.getLifecycle();
        C8632dsu.a(lifecycle, "");
        LifecycleKt.getCoroutineScope(lifecycle).launchWhenStarted(new RealCreateBeaconWatcher$watch$1(this, componentActivity, null));
    }
}
