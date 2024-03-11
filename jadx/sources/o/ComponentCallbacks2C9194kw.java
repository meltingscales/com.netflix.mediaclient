package o;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: o.kw  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ComponentCallbacks2C9194kw implements ComponentCallbacks2 {
    private final drX<Boolean, Integer, dpR> b;
    private final drX<String, String, dpR> c;
    private final C9160kO d;

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentCallbacks2C9194kw(C9160kO c9160kO, drX<? super String, ? super String, dpR> drx, drX<? super Boolean, ? super Integer, dpR> drx2) {
        this.d = c9160kO;
        this.c = drx;
        this.b = drx2;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        String i = this.d.i();
        if (this.d.e(configuration.orientation)) {
            this.c.invoke(i, this.d.i());
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        this.b.invoke(Boolean.valueOf(i >= 80), Integer.valueOf(i));
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.b.invoke(Boolean.TRUE, null);
    }
}
