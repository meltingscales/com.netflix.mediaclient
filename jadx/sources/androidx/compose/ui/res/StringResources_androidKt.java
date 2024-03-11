package androidx.compose.ui.res;

import android.util.Base64;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class StringResources_androidKt {
    private static int a = 1;
    private static int e = 0;
    private static byte e$ss2$31 = 24;

    public static final String stringResource(int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        int i4 = a + 75;
        e = i4 % 128;
        if (i4 % 2 != 0) {
            ComposerKt.isTraceInProgress();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
            int i5 = e + 43;
            a = i5 % 128;
            int i6 = i5 % 2;
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            b(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        if (ComposerKt.isTraceInProgress()) {
            int i7 = a + 103;
            e = i7 % 128;
            int i8 = i7 % 2;
            ComposerKt.traceEventEnd();
            if (i8 != 0) {
                int i9 = 21 / 0;
            }
        }
        return string;
    }

    public static final String stringResource(int i, Object[] objArr, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2071230100, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i, Arrays.copyOf(objArr, objArr.length));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    private static void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$31);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
