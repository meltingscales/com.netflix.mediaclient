package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.home.api.Home_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bSl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3998bSl implements Factory<InterfaceC3993bSg> {
    private final Home_ActivityComponent_HiltModule b;
    private final Provider<Activity> c;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public InterfaceC3993bSg get() {
        return d(this.b, this.c.get());
    }

    public static InterfaceC3993bSg d(Home_ActivityComponent_HiltModule home_ActivityComponent_HiltModule, Activity activity) {
        return (InterfaceC3993bSg) Preconditions.checkNotNullFromProvides(home_ActivityComponent_HiltModule.d(activity));
    }
}
