package o;

import android.os.Parcelable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.netflix.mediaclient.android.sharing.impl.types.ShareableInternal;
import java.util.List;

/* loaded from: classes3.dex */
public final class PZ {
    /* JADX WARN: Removed duplicated region for block: B:122:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final o.C1135Qa r35, final boolean r36, final o.drO<o.dpR> r37, final o.drM<? super o.PN, o.dpR> r38, androidx.compose.runtime.Composer r39, final int r40) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PZ.e(o.Qa, boolean, o.drO, o.drM, androidx.compose.runtime.Composer, int):void");
    }

    private static final AbstractC8918fl<List<QI<Parcelable>>> d(State<? extends AbstractC8918fl<? extends List<? extends QI<Parcelable>>>> state) {
        return (AbstractC8918fl) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShareableInternal<Parcelable> a(State<? extends ShareableInternal<Parcelable>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e(State<String> state) {
        return state.getValue();
    }

    private static final boolean c(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }
}
