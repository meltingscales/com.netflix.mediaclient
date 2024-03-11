package o;

import android.app.Activity;
import com.netflix.mediaclient.ui.upnextfeed.impl.UpNextTab_ActivityComponent_HiltModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.daS  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7910daS implements Factory<C7904daM> {
    private final UpNextTab_ActivityComponent_HiltModule b;
    private final Provider<Activity> d;

    @Override // javax.inject.Provider
    /* renamed from: a */
    public C7904daM get() {
        return b(this.b, this.d.get());
    }

    public static C7904daM b(UpNextTab_ActivityComponent_HiltModule upNextTab_ActivityComponent_HiltModule, Activity activity) {
        return (C7904daM) Preconditions.checkNotNullFromProvides(upNextTab_ActivityComponent_HiltModule.e(activity));
    }
}
