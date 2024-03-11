package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.Preferences;
import java.util.Arrays;
import o.C8632dsu;

/* loaded from: classes2.dex */
public final class PreferencesFactory {
    public static final Preferences createEmpty() {
        return new MutablePreferences(null, true, 1, null);
    }

    public static final MutablePreferences createMutable(Preferences.Pair<?>... pairArr) {
        C8632dsu.c((Object) pairArr, "");
        MutablePreferences mutablePreferences = new MutablePreferences(null, false, 1, null);
        mutablePreferences.putAll((Preferences.Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        return mutablePreferences;
    }
}
