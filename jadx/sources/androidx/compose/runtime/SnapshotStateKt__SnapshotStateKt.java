package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.List;
import o.C8563dqf;

/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__SnapshotStateKt {
    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i, Object obj2) {
        if ((i & 2) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return SnapshotStateKt.mutableStateOf(obj, snapshotMutationPolicy);
    }

    public static final <T> MutableState<T> mutableStateOf(T t, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return ActualAndroid_androidKt.createSnapshotMutableState(t, snapshotMutationPolicy);
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return new SnapshotStateList<>();
    }

    public static final <T> SnapshotStateList<T> mutableStateListOf(T... tArr) {
        List D;
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        D = C8563dqf.D(tArr);
        snapshotStateList.addAll(D);
        return snapshotStateList;
    }

    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return new SnapshotStateMap<>();
    }

    public static final <T> State<T> rememberUpdatedState(T t, Composer composer, int i) {
        composer.startReplaceableGroup(-1058319986);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1058319986, i, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:303)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = mutableStateOf$default(t, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        mutableState.setValue(t);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
