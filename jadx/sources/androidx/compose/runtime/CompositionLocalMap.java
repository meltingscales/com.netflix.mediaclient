package androidx.compose.runtime;

import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;

/* loaded from: classes.dex */
public interface CompositionLocalMap {
    public static final Companion Companion = Companion.$$INSTANCE;

    <T> T get(CompositionLocal<T> compositionLocal);

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CompositionLocalMap Empty = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();

        public final CompositionLocalMap getEmpty() {
            return Empty;
        }

        private Companion() {
        }
    }
}
