package o;

import android.app.Activity;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.mylist.impl.MyListFragment;
import com.netflix.mediaclient.util.gfx.ImageLoader;

/* renamed from: o.cnw  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7004cnw extends bDE {
    private final String a;
    private final ImageLoader b;

    @Override // com.netflix.mediaclient.servicemgr.InteractiveTrackerInterface
    public String a() {
        return this.a;
    }

    public C7004cnw(ImageLoader imageLoader, String str) {
        C8632dsu.c((Object) imageLoader, "");
        C8632dsu.c((Object) str, "");
        this.b = imageLoader;
        this.a = str;
        imageLoader.b(this);
    }

    public final void d() {
        this.b.e(this);
    }

    @Override // o.bDE
    public boolean a(Activity activity) {
        if (activity instanceof NetflixActivity) {
            return ((NetflixActivity) activity).getFragmentHelper().c() instanceof MyListFragment;
        }
        return false;
    }
}
