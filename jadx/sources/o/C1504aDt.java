package o;

import com.netflix.mediaclient.graphqlrepo.impl.client.streaming.StreamingGraphQLRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.graphqlrepo.impl.client.streaming.AccountInstance"})
/* renamed from: o.aDt  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1504aDt implements Factory<aCG> {
    private final Provider<StreamingGraphQLRepositoryImpl.d> a;
    private final Provider<aCW> c;

    @Override // javax.inject.Provider
    /* renamed from: c */
    public aCG get() {
        return c(this.a.get(), this.c.get());
    }

    public static aCG c(StreamingGraphQLRepositoryImpl.d dVar, aCW acw) {
        return (aCG) Preconditions.checkNotNullFromProvides(StreamingGraphQLRepositoryImpl.GraphQLRepositoryAccountScopeModule.d.b(dVar, acw));
    }
}
