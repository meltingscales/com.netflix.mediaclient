package o;

import com.netflix.mediaclient.ui.details.DetailsUtilModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes4.dex */
public final class bFA implements Factory<InterfaceC3656bFy> {
    private final DetailsUtilModule b;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public InterfaceC3656bFy get() {
        return d(this.b);
    }

    public static InterfaceC3656bFy d(DetailsUtilModule detailsUtilModule) {
        return (InterfaceC3656bFy) Preconditions.checkNotNullFromProvides(detailsUtilModule.a());
    }
}
