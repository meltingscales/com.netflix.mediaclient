package o;

import com.netflix.mediaclient.graphqlrepo.impl.client.streaming.StreamingGraphQLRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import o.aCW;

@ScopeMetadata("com.netflix.mediaclient.accountcomponent.AccountScoped")
@DaggerGenerated
@QualifierMetadata({"com.netflix.mediaclient.graphqlrepo.impl.client.streaming.AccountInstance", "com.netflix.mediaclient.graphqlrepo.impl.client.streaming.AccountScopedApolloClientConfig.AccountScopedGraphQLEndpoint"})
/* renamed from: o.aDu  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1505aDu implements Factory<aCW> {
    private final Provider<aCW.d> b;
    private final Provider<aCJ> c;

    @Override // javax.inject.Provider
    /* renamed from: d */
    public aCW get() {
        return b(this.b.get(), this.c.get());
    }

    public static aCW b(aCW.d dVar, aCJ acj) {
        return (aCW) Preconditions.checkNotNullFromProvides(StreamingGraphQLRepositoryImpl.GraphQLRepositoryAccountScopeModule.d.b(dVar, acj));
    }
}
