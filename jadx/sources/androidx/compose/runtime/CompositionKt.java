package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import o.dpR;

/* loaded from: classes.dex */
public final class CompositionKt {
    private static final Object PendingApplyNoModifications = new Object();
    private static final CompositionServiceKey<CompositionImpl> CompositionImplServiceKey = new CompositionServiceKey<CompositionImpl>() { // from class: androidx.compose.runtime.CompositionKt$CompositionImplServiceKey$1
    };

    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final ReusableComposition ReusableComposition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> void addValue(IdentityArrayMap<K, IdentityArraySet<V>> identityArrayMap, K k, V v) {
        if (identityArrayMap.contains(k)) {
            IdentityArraySet<V> identityArraySet = identityArrayMap.get(k);
            if (identityArraySet != null) {
                identityArraySet.add(v);
                return;
            }
            return;
        }
        IdentityArraySet<V> identityArraySet2 = new IdentityArraySet<>();
        identityArraySet2.add(v);
        dpR dpr = dpR.c;
        identityArrayMap.set(k, identityArraySet2);
    }
}
