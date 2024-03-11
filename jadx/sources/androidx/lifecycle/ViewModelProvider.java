package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import java.lang.reflect.InvocationTargetException;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes2.dex */
public class ViewModelProvider {
    private final CreationExtras defaultCreationExtras;
    private final Factory factory;
    private final ViewModelStore store;

    /* loaded from: classes.dex */
    public static class OnRequeryFactory {
        public void onRequery(ViewModel viewModel) {
            C8632dsu.c((Object) viewModel, "");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory) {
        this(viewModelStore, factory, null, 4, null);
        C8632dsu.c((Object) viewModelStore, "");
        C8632dsu.c((Object) factory, "");
    }

    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
        C8632dsu.c((Object) viewModelStore, "");
        C8632dsu.c((Object) factory, "");
        C8632dsu.c((Object) creationExtras, "");
        this.store = viewModelStore;
        this.factory = factory;
        this.defaultCreationExtras = creationExtras;
    }

    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i, C8627dsp c8627dsp) {
        this(viewModelStore, factory, (i & 4) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }

    /* loaded from: classes.dex */
    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;

        default <T extends ViewModel> T create(Class<T> cls) {
            C8632dsu.c((Object) cls, "");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
            C8632dsu.c((Object) cls, "");
            C8632dsu.c((Object) creationExtras, "");
            return (T) create(cls);
        }

        /* loaded from: classes2.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner) {
        this(viewModelStoreOwner.getViewModelStore(), AndroidViewModelFactory.Companion.defaultFactory$lifecycle_viewmodel_release(viewModelStoreOwner), ViewModelProviderGetKt.defaultCreationExtras(viewModelStoreOwner));
        C8632dsu.c((Object) viewModelStoreOwner, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner, Factory factory) {
        this(viewModelStoreOwner.getViewModelStore(), factory, ViewModelProviderGetKt.defaultCreationExtras(viewModelStoreOwner));
        C8632dsu.c((Object) viewModelStoreOwner, "");
        C8632dsu.c((Object) factory, "");
    }

    public <T extends ViewModel> T get(Class<T> cls) {
        C8632dsu.c((Object) cls, "");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public <T extends ViewModel> T get(String str, Class<T> cls) {
        T t;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) cls, "");
        T t2 = (T) this.store.get(str);
        if (cls.isInstance(t2)) {
            Factory factory = this.factory;
            OnRequeryFactory onRequeryFactory = factory instanceof OnRequeryFactory ? (OnRequeryFactory) factory : null;
            if (onRequeryFactory != null) {
                C8632dsu.d(t2);
                onRequeryFactory.onRequery(t2);
            }
            C8632dsu.d(t2);
            return t2;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.defaultCreationExtras);
        mutableCreationExtras.set(NewInstanceFactory.VIEW_MODEL_KEY, str);
        try {
            t = (T) this.factory.create(cls, mutableCreationExtras);
        } catch (AbstractMethodError unused) {
            t = (T) this.factory.create(cls);
        }
        this.store.put(str, t);
        return t;
    }

    /* loaded from: classes.dex */
    public static class NewInstanceFactory implements Factory {
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<String> VIEW_MODEL_KEY = Companion.ViewModelKeyImpl.INSTANCE;
        private static NewInstanceFactory sInstance;

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            C8632dsu.c((Object) cls, "");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                C8632dsu.a(newInstance, "");
                return newInstance;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            }
        }

        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory.sInstance == null) {
                    NewInstanceFactory.sInstance = new NewInstanceFactory();
                }
                NewInstanceFactory newInstanceFactory = NewInstanceFactory.sInstance;
                C8632dsu.d(newInstanceFactory);
                return newInstanceFactory;
            }

            /* loaded from: classes2.dex */
            static final class ViewModelKeyImpl implements CreationExtras.Key<String> {
                public static final ViewModelKeyImpl INSTANCE = new ViewModelKeyImpl();

                private ViewModelKeyImpl() {
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class AndroidViewModelFactory extends NewInstanceFactory {
        private static AndroidViewModelFactory sInstance;
        private final Application application;
        public static final Companion Companion = new Companion(null);
        public static final CreationExtras.Key<Application> APPLICATION_KEY = Companion.ApplicationKeyImpl.INSTANCE;

        private AndroidViewModelFactory(Application application, int i) {
            this.application = application;
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(Application application) {
            this(application, 0);
            C8632dsu.c((Object) application, "");
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
            C8632dsu.c((Object) cls, "");
            C8632dsu.c((Object) creationExtras, "");
            if (this.application != null) {
                return (T) create(cls);
            }
            Application application = (Application) creationExtras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) create(cls, application);
            }
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            C8632dsu.c((Object) cls, "");
            Application application = this.application;
            if (application == null) {
                throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            }
            return (T) create(cls, application);
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application) {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    C8632dsu.a(newInstance, "");
                    return newInstance;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e);
                } catch (InstantiationException e2) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e2);
                } catch (NoSuchMethodException e3) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e4);
                }
            }
            return (T) super.create(cls);
        }

        /* loaded from: classes2.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final Factory defaultFactory$lifecycle_viewmodel_release(ViewModelStoreOwner viewModelStoreOwner) {
                C8632dsu.c((Object) viewModelStoreOwner, "");
                return viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory() : NewInstanceFactory.Companion.getInstance();
            }

            public final AndroidViewModelFactory getInstance(Application application) {
                C8632dsu.c((Object) application, "");
                if (AndroidViewModelFactory.sInstance == null) {
                    AndroidViewModelFactory.sInstance = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory androidViewModelFactory = AndroidViewModelFactory.sInstance;
                C8632dsu.d(androidViewModelFactory);
                return androidViewModelFactory;
            }

            /* loaded from: classes2.dex */
            static final class ApplicationKeyImpl implements CreationExtras.Key<Application> {
                public static final ApplicationKeyImpl INSTANCE = new ApplicationKeyImpl();

                private ApplicationKeyImpl() {
                }
            }
        }
    }
}
