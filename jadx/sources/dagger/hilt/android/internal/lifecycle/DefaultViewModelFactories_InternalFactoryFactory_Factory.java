package dagger.hilt.android.internal.lifecycle;

import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Set;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"dagger.hilt.android.internal.lifecycle.HiltViewModelMap.KeySet"})
/* loaded from: classes5.dex */
public final class DefaultViewModelFactories_InternalFactoryFactory_Factory implements Factory<DefaultViewModelFactories.InternalFactoryFactory> {
    private final Provider<Set<String>> keySetProvider;
    private final Provider<ViewModelComponentBuilder> viewModelComponentBuilderProvider;

    public DefaultViewModelFactories_InternalFactoryFactory_Factory(Provider<Set<String>> provider, Provider<ViewModelComponentBuilder> provider2) {
        this.keySetProvider = provider;
        this.viewModelComponentBuilderProvider = provider2;
    }

    @Override // javax.inject.Provider
    public DefaultViewModelFactories.InternalFactoryFactory get() {
        return newInstance(this.keySetProvider.get(), this.viewModelComponentBuilderProvider.get());
    }

    public static DefaultViewModelFactories_InternalFactoryFactory_Factory create(Provider<Set<String>> provider, Provider<ViewModelComponentBuilder> provider2) {
        return new DefaultViewModelFactories_InternalFactoryFactory_Factory(provider, provider2);
    }

    public static DefaultViewModelFactories.InternalFactoryFactory newInstance(Set<String> set, ViewModelComponentBuilder viewModelComponentBuilder) {
        return new DefaultViewModelFactories.InternalFactoryFactory(set, viewModelComponentBuilder);
    }
}
