package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import java.util.Set;
import kotlin.coroutines.EmptyCoroutineContext;
import o.InterfaceC8822dzv;
import o.dqZ;
import o.drO;
import o.dyR;
import o.dyS;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    public static final <T> State<T> collectAsState(InterfaceC8822dzv<? extends T> interfaceC8822dzv, dqZ dqz, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1439883919);
        if ((i2 & 1) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        dqZ dqz2 = dqz;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:46)");
        }
        State<T> collectAsState = SnapshotStateKt.collectAsState(interfaceC8822dzv, interfaceC8822dzv.b(), dqz2, composer, 520, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return collectAsState;
    }

    public static final <T extends R, R> State<R> collectAsState(dyS<? extends T> dys, R r, dqZ dqz, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-606625098);
        if ((i2 & 2) != 0) {
            dqz = EmptyCoroutineContext.e;
        }
        dqZ dqz2 = dqz;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:61)");
        }
        int i3 = i >> 3;
        State<R> produceState = SnapshotStateKt.produceState(r, dys, dqz2, new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(dqz2, dys, null), composer, (i3 & 8) | 4672 | (i3 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return produceState;
    }

    public static final <T> dyS<T> snapshotFlow(drO<? extends T> dro) {
        return dyR.d(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(dro, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean intersects$SnapshotStateKt__SnapshotFlowKt(MutableScatterSet<Object> mutableScatterSet, Set<? extends Object> set) {
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && set.contains(objArr[(i << 3) + i3])) {
                        return true;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return false;
                }
            }
            if (i == length) {
                return false;
            }
            i++;
        }
    }
}
