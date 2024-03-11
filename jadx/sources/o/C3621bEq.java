package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.common.episodes.list.EpisodesListSelectorRepositoryFactory_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bEq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3621bEq implements Factory<InterfaceC3619bEo> {
    private final Provider<Activity> c;
    private final EpisodesListSelectorRepositoryFactory_ActivityComponent_HiltModule d;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public InterfaceC3619bEo get() {
        return d(this.d, this.c.get());
    }

    public static InterfaceC3619bEo d(EpisodesListSelectorRepositoryFactory_ActivityComponent_HiltModule episodesListSelectorRepositoryFactory_ActivityComponent_HiltModule, Activity activity) {
        return (InterfaceC3619bEo) Preconditions.checkNotNullFromProvides(episodesListSelectorRepositoryFactory_ActivityComponent_HiltModule.a(activity));
    }
}
