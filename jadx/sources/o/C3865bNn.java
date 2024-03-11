package o;

import android.content.Context;
import android.content.SharedPreferences;
import com.netflix.mediaclient.ui.gamecontrollermagicpath.impl.GameRepoBeaconDataStoreModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named", "dagger.hilt.android.qualifiers.ApplicationContext"})
/* renamed from: o.bNn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3865bNn implements Factory<SharedPreferences> {
    private final Provider<Context> b;
    private final GameRepoBeaconDataStoreModule e;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public SharedPreferences get() {
        return c(this.e, this.b.get());
    }

    public static SharedPreferences c(GameRepoBeaconDataStoreModule gameRepoBeaconDataStoreModule, Context context) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(gameRepoBeaconDataStoreModule.e(context));
    }
}
