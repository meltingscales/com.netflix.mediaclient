package o;

import com.netflix.mediaclient.ui.profilelock.impl.ProfileLockRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityScoped")
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.cLf  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5865cLf implements Factory<cKA> {
    private final ProfileLockRepositoryImpl.ProfileLockRepositoryModule a;
    private final Provider<ProfileLockRepositoryImpl> c;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public cKA get() {
        return c(this.a, this.c.get());
    }

    public static cKA c(ProfileLockRepositoryImpl.ProfileLockRepositoryModule profileLockRepositoryModule, ProfileLockRepositoryImpl profileLockRepositoryImpl) {
        return (cKA) Preconditions.checkNotNullFromProvides(profileLockRepositoryModule.c(profileLockRepositoryImpl));
    }
}
