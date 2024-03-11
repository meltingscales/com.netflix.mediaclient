package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
class NullableInputConnectionWrapperApi25 extends NullableInputConnectionWrapperApi24 {
    public NullableInputConnectionWrapperApi25(InputConnection inputConnection, drO<dpR> dro) {
        super(inputConnection, dro);
    }

    @Override // androidx.compose.ui.text.input.NullableInputConnectionWrapperApi21, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        boolean commitContent;
        InputConnection delegate = getDelegate();
        if (delegate != null) {
            commitContent = delegate.commitContent(inputContentInfo, i, bundle);
            return commitContent;
        }
        return false;
    }
}
