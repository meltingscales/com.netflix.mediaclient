package androidx.compose.runtime.saveable;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import o.C8632dsu;
import o.C8672dug;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    public static final <T> T rememberSaveable(final Object[] objArr, Saver<T, ? extends Object> saver, String str, drO<? extends T> dro, Composer composer, int i, int i2) {
        int c;
        Object consumeRestored;
        composer.startReplaceableGroup(441892779);
        if ((i2 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        T t = null;
        if ((i2 & 4) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441892779, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        if (str == null || str.length() == 0) {
            c = C8672dug.c(MaxSupportedRadix);
            str = Integer.toString(currentCompositeKeyHash, c);
            C8632dsu.a(str, "");
        }
        C8632dsu.d(saver);
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            if (saveableStateRegistry != null && (consumeRestored = saveableStateRegistry.consumeRestored(str)) != null) {
                t = saver.restore(consumeRestored);
            }
            rememberedValue = new SaveableHolder(saver, saveableStateRegistry, str, t == null ? dro.invoke() : t, objArr);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        final SaveableHolder saveableHolder = (SaveableHolder) rememberedValue;
        T t2 = (T) saveableHolder.getValueIfInputsDidntChange(objArr);
        if (t2 == null) {
            t2 = dro.invoke();
        }
        final Saver<T, ? extends Object> saver2 = saver;
        final String str2 = str;
        final T t3 = t2;
        EffectsKt.SideEffect(new drO<dpR>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* bridge */ /* synthetic */ dpR invoke() {
                invoke2();
                return dpR.c;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                saveableHolder.update(saver2, saveableStateRegistry, str2, t3, objArr);
            }
        }, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String str;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                str = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
