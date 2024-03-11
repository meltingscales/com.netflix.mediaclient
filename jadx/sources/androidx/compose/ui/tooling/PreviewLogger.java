package androidx.compose.ui.tooling;

import android.util.Log;
import o.C8627dsp;

/* loaded from: classes5.dex */
public final class PreviewLogger {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes5.dex */
    public static final class Companion {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void logWarning$ui_tooling_release$default(Companion companion, String str, Throwable th, int i, Object obj) {
            if ((i & 2) != 0) {
                th = null;
            }
            companion.logWarning$ui_tooling_release(str, th);
        }

        public final void logWarning$ui_tooling_release(String str, Throwable th) {
            Log.w("PreviewLogger", str, th);
        }

        public final void logError$ui_tooling_release(String str, Throwable th) {
            Log.e("PreviewLogger", str, th);
        }
    }
}
