package androidx.compose.ui.semantics;

import o.drO;

/* loaded from: classes.dex */
public final class SemanticsConfigurationKt {
    public static final <T> T getOrNull(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey<T> semanticsPropertyKey) {
        return (T) semanticsConfiguration.getOrElseNullable(semanticsPropertyKey, new drO<T>() { // from class: androidx.compose.ui.semantics.SemanticsConfigurationKt$getOrNull$1
            @Override // o.drO
            public final T invoke() {
                return null;
            }
        });
    }
}
