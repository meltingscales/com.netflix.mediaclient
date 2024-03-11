package o;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.kA  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9146kA implements InterfaceC9147kB {
    private final ConnectivityManager a;
    private final c b;

    public C9146kA(ConnectivityManager connectivityManager, drX<? super Boolean, ? super String, dpR> drx) {
        this.a = connectivityManager;
        this.b = new c(drx);
    }

    @Override // o.InterfaceC9147kB
    public void e() {
        this.a.registerDefaultNetworkCallback(this.b);
    }

    @Override // o.InterfaceC9147kB
    public boolean c() {
        return this.a.getActiveNetwork() != null;
    }

    @Override // o.InterfaceC9147kB
    public String b() {
        Network activeNetwork = this.a.getActiveNetwork();
        NetworkCapabilities networkCapabilities = activeNetwork != null ? this.a.getNetworkCapabilities(activeNetwork) : null;
        return networkCapabilities == null ? "none" : networkCapabilities.hasTransport(1) ? "wifi" : networkCapabilities.hasTransport(3) ? "ethernet" : networkCapabilities.hasTransport(0) ? "cellular" : "unknown";
    }

    /* renamed from: o.kA$c */
    /* loaded from: classes2.dex */
    public static final class c extends ConnectivityManager.NetworkCallback {
        private final drX<Boolean, String, dpR> b;
        private final AtomicBoolean c = new AtomicBoolean(false);

        /* JADX WARN: Multi-variable type inference failed */
        public c(drX<? super Boolean, ? super String, dpR> drx) {
            this.b = drx;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            e(false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            e(true);
        }

        private final void e(boolean z) {
            drX<Boolean, String, dpR> drx;
            if (!this.c.getAndSet(true) || (drx = this.b) == null) {
                return;
            }
            drx.invoke(Boolean.valueOf(z), C9290mm.e.b());
        }
    }
}
