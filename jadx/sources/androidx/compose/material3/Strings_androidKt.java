package androidx.compose.material3;

import android.content.Context;
import android.util.Base64;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.nio.charset.StandardCharsets;

/* loaded from: classes.dex */
public final class Strings_androidKt {
    private static int a = 0;
    private static int e = 1;
    private static byte e$ss2$21 = 24;

    /* renamed from: getString-NWtq2-8  reason: not valid java name */
    public static final String m830getStringNWtq28(int i, Composer composer, int i2) {
        int i3 = 2 % 2;
        if (!(!ComposerKt.isTraceInProgress())) {
            int i4 = e + 39;
            a = i4 % 128;
            int i5 = i4 % 2;
            ComposerKt.traceEventStart(-176762646, i2, -1, "androidx.compose.material3.getString (Strings.android.kt:30)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        String string = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getString(i);
        if (string.startsWith("'!#+")) {
            int i6 = e + 117;
            a = i6 % 128;
            int i7 = i6 % 2;
            Object[] objArr = new Object[1];
            b(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    private static void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$21);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
