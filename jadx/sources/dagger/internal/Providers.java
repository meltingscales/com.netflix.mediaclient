package dagger.internal;

/* loaded from: classes5.dex */
public final class Providers {
    public static <T> Provider<T> asDaggerProvider(final javax.inject.Provider<T> provider) {
        Preconditions.checkNotNull(provider);
        return new Provider<T>() { // from class: dagger.internal.Providers.1
            @Override // javax.inject.Provider
            public T get() {
                return (T) javax.inject.Provider.this.get();
            }
        };
    }

    private Providers() {
    }
}
