package com.netflix.mediaclient.acquisition.lib.services;

import android.content.Context;
import android.content.res.Resources;
import android.util.Base64;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.acquisition.lib.services.logging.SignupErrorReporter;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import o.C1332Xp;
import o.C1333Xq;
import o.C8632dsu;
import o.C8691duz;

/* loaded from: classes3.dex */
public final class StringProvider {
    private static int d = 0;
    private static int e = 1;
    private static byte e$ss2$73 = 24;
    private final SignupErrorReporter signupErrorReporter;
    private final Map<String, Integer> stringKeyMapping;

    @Inject
    public StringProvider(@Named("MultiModuleStringMapping") Map<String, Integer> map, SignupErrorReporter signupErrorReporter) {
        C8632dsu.c((Object) map, "");
        C8632dsu.c((Object) signupErrorReporter, "");
        this.stringKeyMapping = map;
        this.signupErrorReporter = signupErrorReporter;
    }

    public final String getString(String str) {
        C8632dsu.c((Object) str, "");
        Integer stringId = getStringId(str);
        if (stringId != null) {
            try {
                return getString(stringId.intValue());
            } catch (Resources.NotFoundException unused) {
            }
        }
        return null;
    }

    public final String getString(int i) {
        int i2 = 2 % 2;
        int i3 = e + 43;
        d = i3 % 128;
        int i4 = i3 % 2;
        C1332Xp c1332Xp = C1332Xp.b;
        String string = ((Context) C1332Xp.b(Context.class)).getString(i);
        if (!(!string.startsWith("'!#+"))) {
            int i5 = e + 79;
            d = i5 % 128;
            if (i5 % 2 != 0) {
                Object[] objArr = new Object[1];
                b(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                int i6 = 7 / 0;
            } else {
                Object[] objArr2 = new Object[1];
                b(string.substring(4), objArr2);
                string = ((String) objArr2[0]).intern();
            }
        }
        C8632dsu.a(string, "");
        return string;
    }

    public final C1333Xq getFormatter(String str) {
        C8632dsu.c((Object) str, "");
        Integer stringId = getStringId(str);
        if (stringId != null) {
            return getFormatter(stringId.intValue());
        }
        return null;
    }

    public final C1333Xq getFormatter(int i) {
        C1333Xq d2 = C1333Xq.d(i);
        C8632dsu.a(d2, "");
        return d2;
    }

    private final Integer getStringId(String str) {
        boolean g;
        g = C8691duz.g(str);
        if (g) {
            return null;
        }
        Integer num = this.stringKeyMapping.get(str);
        if (num == null) {
            SignupErrorReporter signupErrorReporter = this.signupErrorReporter;
            if (signupErrorReporter != null) {
                SignupErrorReporter.onDataError$default(signupErrorReporter, SignupConstants.Error.UNRECOGNIZED_STRING_KEY_ERROR, str, null, 4, null);
                return null;
            }
            return null;
        }
        return num;
    }

    private void b(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$73);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
