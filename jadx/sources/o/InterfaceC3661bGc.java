package o;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.ui.detailspage.api.DetailsPageParams;
import dagger.hilt.EntryPoint;
import dagger.hilt.InstallIn;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityComponent;

/* renamed from: o.bGc  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3661bGc {
    public static final d d = d.c;

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* renamed from: o.bGc$e */
    /* loaded from: classes4.dex */
    public interface e {
        InterfaceC3661bGc h();
    }

    static InterfaceC3661bGc d(Activity activity) {
        return d.c(activity);
    }

    Fragment c(DetailsPageParams.FullDp fullDp);

    /* renamed from: o.bGc$d */
    /* loaded from: classes4.dex */
    public static final class d {
        static final /* synthetic */ d c = new d();

        private d() {
        }

        public final InterfaceC3661bGc c(Activity activity) {
            C8632dsu.c((Object) activity, "");
            return ((e) EntryPointAccessors.fromActivity(activity, e.class)).h();
        }
    }
}
