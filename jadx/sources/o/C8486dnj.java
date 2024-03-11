package o;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import com.slack.circuit.retained.ProduceRetainedStateKt$produceRetainedState$1;

/* renamed from: o.dnj  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8486dnj {
    public static final <T> State<T> a(final T t, drX<? super ProduceStateScope<T>, ? super InterfaceC8585dra<? super dpR>, ? extends Object> drx, Composer composer, int i) {
        C8632dsu.c((Object) drx, "");
        composer.startReplaceableGroup(-932547922);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-932547922, i, -1, "com.slack.circuit.retained.produceRetainedState (ProduceRetainedState.kt:57)");
        }
        MutableState mutableState = (MutableState) C8490dnn.b(new Object[0], null, new drO<MutableState<T>>() { // from class: com.slack.circuit.retained.ProduceRetainedStateKt$produceRetainedState$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public final MutableState<T> a() {
                MutableState<T> mutableStateOf$default;
                mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
                return mutableStateOf$default;
            }

            @Override // o.drO
            public /* synthetic */ Object invoke() {
                return a();
            }
        }, composer, 8, 2);
        EffectsKt.LaunchedEffect(dpR.c, new ProduceRetainedStateKt$produceRetainedState$1(drx, mutableState, null), composer, 70);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }
}
