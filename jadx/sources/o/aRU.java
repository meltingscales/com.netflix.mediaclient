package o;

import com.netflix.mediaclient.service.configuration.sampling.GraphQLSamplingModule;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class aRU implements Factory<InterfaceC1468aCk> {
    private final GraphQLSamplingModule d;

    @Override // javax.inject.Provider
    /* renamed from: b */
    public InterfaceC1468aCk get() {
        return a(this.d);
    }

    public static InterfaceC1468aCk a(GraphQLSamplingModule graphQLSamplingModule) {
        return (InterfaceC1468aCk) Preconditions.checkNotNullFromProvides(graphQLSamplingModule.a());
    }
}
