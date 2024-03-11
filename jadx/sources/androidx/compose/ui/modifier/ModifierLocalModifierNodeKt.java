package androidx.compose.ui.modifier;

import kotlin.Pair;

/* loaded from: classes.dex */
public final class ModifierLocalModifierNodeKt {
    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    public static final <T> ModifierLocalMap modifierLocalMapOf(Pair<? extends ModifierLocal<T>, ? extends T> pair) {
        SingleLocalMap singleLocalMap = new SingleLocalMap(pair.d());
        singleLocalMap.set$ui_release(pair.d(), pair.a());
        return singleLocalMap;
    }
}
