package o;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.ui.profileviewingrestrictions.impl.ProfileViewingRestrictionsFragment;
import javax.inject.Inject;

/* loaded from: classes4.dex */
public final class cPK implements InterfaceC5986cPt {
    public static final a b = new a(null);

    @Inject
    public cPK(Activity activity) {
        C8632dsu.c((Object) activity, "");
    }

    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("ProfileViewingRestrictionsImpl");
        }
    }

    @Override // o.InterfaceC5986cPt
    public Fragment e(Bundle bundle) {
        C8632dsu.c((Object) bundle, "");
        return ProfileViewingRestrictionsFragment.j.a(bundle);
    }
}
