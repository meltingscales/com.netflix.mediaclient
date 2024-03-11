package com.netflix.mediaclient.ui.error;

import android.content.Context;
import android.os.Handler;
import android.util.Base64;
import com.netflix.android.org.json.JSONObject;
import com.netflix.cl.model.SignOutReason;
import com.netflix.mediaclient.StatusCode;
import com.netflix.mediaclient.service.user.UserAgent;
import com.netflix.mediaclient.ui.R;
import com.netflix.mediaclient.ui.error.ErrorDescriptorFactoryImpl;
import java.nio.charset.StandardCharsets;
import o.C1044Mm;
import o.C1163Rc;
import o.C3836bMl;
import o.C3844bMt;
import o.C3845bMu;
import o.C3848bMx;
import o.C7597czH;
import o.InterfaceC1903aSn;
import o.InterfaceC1905aSp;
import o.aMH;
import o.bMJ;
import o.bMK;

/* loaded from: classes4.dex */
public enum ErrorDescriptorFactoryImpl implements InterfaceC1903aSn {
    INSTANCE;
    
    private static int b = 0;
    private static int c = 1;
    private static byte e$ss2$193;

    static void a() {
        e$ss2$193 = (byte) 24;
    }

    static {
        a();
    }

    @Override // o.InterfaceC1903aSn
    public InterfaceC1905aSp c(Context context, StatusCode statusCode) {
        return C7597czH.b(context, statusCode);
    }

    @Override // o.InterfaceC1903aSn
    public InterfaceC1905aSp b(Context context, StatusCode statusCode, Runnable runnable, int i) {
        return new bMJ(context, statusCode, runnable, i);
    }

    @Override // o.InterfaceC1903aSn
    public InterfaceC1905aSp a(Context context, UserAgent userAgent, JSONObject jSONObject) {
        String optString;
        JSONObject optJSONObject = jSONObject.optJSONObject("usertextgroup");
        if (optJSONObject == null) {
            C1044Mm.j("ErrorDescriptorFactory", "Action ID %d, but missing error text, use default...", 13);
            optString = null;
        } else {
            String optString2 = optJSONObject.optString("bcp47");
            optString = optJSONObject.optString("text");
            C1044Mm.a("ErrorDescriptorFactory", "Action ID %d found message '%s' for language %s", 13, optString, optString2);
        }
        return C3836bMl.a(context, userAgent, optString);
    }

    @Override // o.InterfaceC1903aSn
    public InterfaceC1905aSp e(Context context, StatusCode statusCode) {
        return new bMK(statusCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Context context, Handler handler, UserAgent userAgent, Runnable runnable) {
        aMH.c().a(context, handler, userAgent, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(UserAgent userAgent) {
        userAgent.e(SignOutReason.mobileOnlyNotAllowed, true);
    }

    @Override // o.InterfaceC1903aSn
    public InterfaceC1905aSp a(final Context context, final Handler handler, final UserAgent userAgent) {
        int i = 2 % 2;
        C1044Mm.j("ErrorDescriptorFactory", "Blacklisted device for mobile only plan, not supported");
        String string = context.getString(R.o.hw);
        if (!(!string.startsWith("'!#+"))) {
            int i2 = c + 55;
            b = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        String str = string;
        final Runnable runnable = new Runnable() { // from class: o.bMp
            @Override // java.lang.Runnable
            public final void run() {
                C8054ddD.e(context);
            }
        };
        Runnable runnable2 = new Runnable() { // from class: o.bMn
            @Override // java.lang.Runnable
            public final void run() {
                ErrorDescriptorFactoryImpl.b(context, handler, userAgent, runnable);
            }
        };
        Runnable runnable3 = new Runnable() { // from class: o.bMv
            @Override // java.lang.Runnable
            public final void run() {
                ErrorDescriptorFactoryImpl.a(UserAgent.this);
            }
        };
        String string2 = context.getString(R.o.hu);
        if (string2.startsWith("'!#+")) {
            int i4 = b + 61;
            c = i4 % 128;
            if (i4 % 2 == 0) {
                Object[] objArr2 = new Object[1];
                f(string2.substring(4), objArr2);
                string2 = ((String) objArr2[0]).intern();
                int i5 = 67 / 0;
            } else {
                Object[] objArr3 = new Object[1];
                f(string2.substring(4), objArr3);
                string2 = ((String) objArr3[0]).intern();
            }
        }
        String str2 = string2;
        String string3 = context.getString(R.o.go);
        if (string3.startsWith("'!#+")) {
            Object[] objArr4 = new Object[1];
            f(string3.substring(4), objArr4);
            string3 = ((String) objArr4[0]).intern();
        }
        return new C3848bMx(new C1163Rc.e("", str, str2, runnable2, string3, runnable3));
    }

    @Override // o.InterfaceC1903aSn
    public InterfaceC1905aSp b(Context context, StatusCode statusCode) {
        return new C3845bMu(context, statusCode, false);
    }

    @Override // o.InterfaceC1903aSn
    public InterfaceC1905aSp a(Context context, StatusCode statusCode) {
        return new C3844bMt(context, statusCode, true);
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$193);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
