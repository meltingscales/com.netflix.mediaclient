package o;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.netflix.cl.model.AppView;
import com.netflix.mediaclient.acquisition.api.SignupNativeActivity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.util.gfx.ImageLoader;

/* renamed from: o.aGo  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1580aGo extends bDE {
    private final AppView a;
    private final ImageLoader b;
    private final String e;

    @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
    public String a() {
        return this.e;
    }

    public C1580aGo(AppView appView, ImageLoader imageLoader) {
        C8632dsu.c((Object) appView, "");
        C8632dsu.c((Object) imageLoader, "");
        this.a = appView;
        this.b = imageLoader;
        this.e = appView + "-latencyTracker";
        imageLoader.b(this);
    }

    @Override // o.bDE
    public boolean a(Activity activity) {
        if (!(activity instanceof MO)) {
            return activity instanceof SignupNativeActivity ? ((SignupNativeActivity) activity).getAppView() == this.a : (activity instanceof NetflixActivity) && ((NetflixActivity) activity).getUiScreen() == this.a;
        }
        Fragment h = ((MO) activity).h();
        return (h instanceof NetflixFrag) && ((NetflixFrag) h).bh_() == this.a;
    }

    public final void d() {
        this.b.e(this);
    }
}
