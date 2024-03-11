package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.search.v2.SearchRepositoryFactory_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cTn  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6091cTn implements Factory<InterfaceC6083cTf> {
    private final SearchRepositoryFactory_ActivityComponent_HiltModule b;
    private final Provider<Activity> d;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public InterfaceC6083cTf get() {
        return e(this.b, this.d.get());
    }

    public static InterfaceC6083cTf e(SearchRepositoryFactory_ActivityComponent_HiltModule searchRepositoryFactory_ActivityComponent_HiltModule, Activity activity) {
        return (InterfaceC6083cTf) Preconditions.checkNotNullFromProvides(searchRepositoryFactory_ActivityComponent_HiltModule.d(activity));
    }
}
