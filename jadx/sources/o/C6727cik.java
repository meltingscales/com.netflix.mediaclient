package o;

import com.netflix.mediaclient.ui.miniplayer.api.MiniPlayerVideoGroupViewModel_HiltModules;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* renamed from: o.cik  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6727cik implements Factory<String> {
    @Override // javax.inject.Provider
    /* renamed from: e */
    public String get() {
        return d();
    }

    public static String d() {
        return (String) Preconditions.checkNotNullFromProvides(MiniPlayerVideoGroupViewModel_HiltModules.KeyModule.e());
    }
}
