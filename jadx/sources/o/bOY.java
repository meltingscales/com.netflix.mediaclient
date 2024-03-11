package o;

import androidx.fragment.app.Fragment;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.ui.games.impl.gdp.GdpFragment;
import com.netflix.mediaclient.ui.lolomo.FragmentHelper;

/* loaded from: classes4.dex */
public final class bOY implements bNH {
    @Override // o.bNH
    public Fragment e(String str, TrackingInfoHolder trackingInfoHolder) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) trackingInfoHolder, "");
        return GdpFragment.b.e(str, trackingInfoHolder);
    }

    @Override // o.bNH
    public InterfaceC5345bwx b(Object obj) {
        C8632dsu.c(obj, "");
        FragmentHelper fragmentHelper = obj instanceof FragmentHelper ? (FragmentHelper) obj : null;
        if (fragmentHelper != null) {
            return new bPH(fragmentHelper);
        }
        return null;
    }
}
