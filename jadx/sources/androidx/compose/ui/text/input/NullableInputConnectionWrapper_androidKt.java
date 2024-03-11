package androidx.compose.ui.text.input;

import android.os.Build;
import android.view.inputmethod.InputConnection;
import o.dpR;
import o.drO;

/* loaded from: classes.dex */
public final class NullableInputConnectionWrapper_androidKt {
    public static final NullableInputConnectionWrapper NullableInputConnectionWrapper(InputConnection inputConnection, drO<dpR> dro) {
        if (Build.VERSION.SDK_INT >= 25) {
            return new NullableInputConnectionWrapperApi25(inputConnection, dro);
        }
        return new NullableInputConnectionWrapperApi24(inputConnection, dro);
    }
}
