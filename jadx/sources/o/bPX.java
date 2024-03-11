package o;

import android.app.Activity;
import com.netflix.mediaclient.util.gfx.ImageLoader;

/* loaded from: classes4.dex */
public final class bPX extends bDE {
    private final ImageLoader d;

    @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
    public String a() {
        return "gdp-imagelatencyTracker";
    }

    @Override // o.bDE
    public boolean a(Activity activity) {
        return true;
    }

    @Override // o.bDE
    public boolean c() {
        return true;
    }

    public bPX(ImageLoader imageLoader) {
        C8632dsu.c((Object) imageLoader, "");
        this.d = imageLoader;
        imageLoader.b(this);
    }

    public final void d() {
        this.d.e(this);
    }
}
