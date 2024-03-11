package o;

import com.netflix.mediaclient.graphqlrepo.impl.client.streaming.StreamingGraphQLRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import o.aCW;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.graphqlrepo.impl.client.streaming.ProfileScopedApolloClientConfig.ProfileScopedGraphQLEndpoint"})
/* renamed from: o.aDw  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1507aDw implements Factory<aCG> {
    private final Provider<aCJ> a;
    private final Provider<StreamingGraphQLRepositoryImpl.d> b;
    private final Provider<aCW.a> e;

    @Override // javax.inject.Provider
    /* renamed from: d */
    public aCG get() {
        return e(this.b.get(), this.e.get(), this.a.get());
    }

    public static aCG e(StreamingGraphQLRepositoryImpl.d dVar, aCW.a aVar, aCJ acj) {
        return (aCG) Preconditions.checkNotNullFromProvides(StreamingGraphQLRepositoryImpl.GraphQLRepositoryProfileScopeModule.c.a(dVar, aVar, acj));
    }
}
