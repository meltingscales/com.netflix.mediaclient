package o;

import com.netflix.mediaclient.ui.home.impl.repository.graphql.GraphQLHomeLolomoRepositoryImpl;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: o.bWt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4114bWt implements Factory<InterfaceC4005bSs> {
    private final Provider<C4107bWm> b;
    private final Provider<GraphQLHomeLolomoRepositoryImpl> d;

    @Override // javax.inject.Provider
    /* renamed from: e */
    public InterfaceC4005bSs get() {
        return d(this.d.get(), this.b.get());
    }

    public static InterfaceC4005bSs d(GraphQLHomeLolomoRepositoryImpl graphQLHomeLolomoRepositoryImpl, C4107bWm c4107bWm) {
        return (InterfaceC4005bSs) Preconditions.checkNotNullFromProvides(GraphQLHomeLolomoRepositoryImpl.HomeLolomoRepository.c(graphQLHomeLolomoRepositoryImpl, c4107bWm));
    }
}
