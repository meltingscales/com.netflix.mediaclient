package o;

import com.netflix.mediaclient.acquisition.lib.MoneyballDataSource;
import com.netflix.mediaclient.ui.memberrejoin.impl.MemberRejoinRetainedModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("dagger.hilt.android.scopes.ActivityRetainedScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.ui.memberrejoin.impl.RejoinTrayMoneyballData"})
/* renamed from: o.cgK  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6595cgK implements Factory<MoneyballDataSource> {
    private final MemberRejoinRetainedModule c;

    @Override // javax.inject.Provider
    /* renamed from: d */
    public MoneyballDataSource get() {
        return c(this.c);
    }

    public static MoneyballDataSource c(MemberRejoinRetainedModule memberRejoinRetainedModule) {
        return (MoneyballDataSource) Preconditions.checkNotNullFromProvides(memberRejoinRetainedModule.a());
    }
}
