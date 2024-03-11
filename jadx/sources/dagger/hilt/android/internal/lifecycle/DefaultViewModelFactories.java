package dagger.hilt.android.internal.lifecycle;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.lifecycle.HiltViewModelMap;
import dagger.hilt.internal.Preconditions;
import dagger.multibindings.Multibinds;
import java.util.Set;
import javax.inject.Inject;

/* loaded from: classes.dex */
public final class DefaultViewModelFactories {

    @EntryPoint
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes5.dex */
    public interface ActivityEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    @Module
    @InstallIn({ActivityComponent.class})
    /* loaded from: classes6.dex */
    interface ActivityModule {
        @HiltViewModelMap.KeySet
        @Multibinds
        Set<String> viewModelKeys();
    }

    @EntryPoint
    @InstallIn({FragmentComponent.class})
    /* loaded from: classes5.dex */
    public interface FragmentEntryPoint {
        InternalFactoryFactory getHiltInternalFactoryFactory();
    }

    public static ViewModelProvider.Factory getActivityFactory(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        return ((ActivityEntryPoint) EntryPoints.get(componentActivity, ActivityEntryPoint.class)).getHiltInternalFactoryFactory().fromActivity(componentActivity, factory);
    }

    public static ViewModelProvider.Factory getFragmentFactory(Fragment fragment, ViewModelProvider.Factory factory) {
        return ((FragmentEntryPoint) EntryPoints.get(fragment, FragmentEntryPoint.class)).getHiltInternalFactoryFactory().fromFragment(fragment, factory);
    }

    /* loaded from: classes5.dex */
    public static final class InternalFactoryFactory {
        private final Set<String> keySet;
        private final ViewModelComponentBuilder viewModelComponentBuilder;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Inject
        public InternalFactoryFactory(@HiltViewModelMap.KeySet Set<String> set, ViewModelComponentBuilder viewModelComponentBuilder) {
            this.keySet = set;
            this.viewModelComponentBuilder = viewModelComponentBuilder;
        }

        ViewModelProvider.Factory fromActivity(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
            return getHiltViewModelFactory(factory);
        }

        ViewModelProvider.Factory fromFragment(Fragment fragment, ViewModelProvider.Factory factory) {
            return getHiltViewModelFactory(factory);
        }

        private ViewModelProvider.Factory getHiltViewModelFactory(ViewModelProvider.Factory factory) {
            return new HiltViewModelFactory(this.keySet, (ViewModelProvider.Factory) Preconditions.checkNotNull(factory), this.viewModelComponentBuilder);
        }
    }

    private DefaultViewModelFactories() {
    }
}
