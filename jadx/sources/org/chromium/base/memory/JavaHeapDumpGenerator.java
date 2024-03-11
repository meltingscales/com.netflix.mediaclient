package org.chromium.base.memory;

import android.os.Debug;
import java.io.IOException;
import org.chromium.base.Log;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes6.dex */
public final class JavaHeapDumpGenerator {
    private JavaHeapDumpGenerator() {
    }

    @CalledByNative
    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            Log.i("JavaHprofGenerator", "Error writing to file " + str + ". Error: " + message);
            return false;
        }
    }
}
