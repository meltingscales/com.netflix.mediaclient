package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.profileviewingrestrictions.api.ViewingRestrictionsRepository_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cPs  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5985cPs implements Factory<InterfaceC5984cPr> {
    private final Provider<Activity> d;
    private final ViewingRestrictionsRepository_ActivityComponent_HiltModule e;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public InterfaceC5984cPr get() {
        return a(this.e, this.d.get());
    }

    public static InterfaceC5984cPr a(ViewingRestrictionsRepository_ActivityComponent_HiltModule viewingRestrictionsRepository_ActivityComponent_HiltModule, Activity activity) {
        return (InterfaceC5984cPr) Preconditions.checkNotNullFromProvides(viewingRestrictionsRepository_ActivityComponent_HiltModule.c(activity));
    }
}
