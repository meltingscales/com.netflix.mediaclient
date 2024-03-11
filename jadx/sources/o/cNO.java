package o;

import androidx.lifecycle.LifecycleOwnerKt;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivity;
import com.netflix.mediaclient.ui.profiles.ProfileSelectionActivityKt$fetchUxConfigId$1;

/* loaded from: classes4.dex */
public final class cNO {
    public static final void d(ProfileSelectionActivity profileSelectionActivity, C1567aGb c1567aGb) {
        C8632dsu.c((Object) profileSelectionActivity, "");
        C8632dsu.c((Object) c1567aGb, "");
        C8737dwr.c(LifecycleOwnerKt.getLifecycleScope(profileSelectionActivity), null, null, new ProfileSelectionActivityKt$fetchUxConfigId$1(profileSelectionActivity, c1567aGb, null), 3, null);
    }
}
