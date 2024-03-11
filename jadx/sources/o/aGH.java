package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;
import dagger.hilt.android.EntryPointAccessors;

/* loaded from: classes3.dex */
public final class aGH {
    public static final PlaybackLauncher a(Activity activity) {
        C8632dsu.c((Object) activity, "");
        return ((aGG) EntryPointAccessors.fromActivity(activity, aGG.class)).r();
    }
}
