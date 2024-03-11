package o;

import com.netflix.mediaclient.ui.profilelock.impl.ProfileLockImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cLa  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5860cLa implements Factory<cKD> {
    private final Provider<ProfileLockImpl> b;
    private final ProfileLockImpl.ProfileLockModule e;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public cKD get() {
        return d(this.e, this.b.get());
    }

    public static cKD d(ProfileLockImpl.ProfileLockModule profileLockModule, ProfileLockImpl profileLockImpl) {
        return (cKD) Preconditions.checkNotNullFromProvides(profileLockModule.b(profileLockImpl));
    }
}
