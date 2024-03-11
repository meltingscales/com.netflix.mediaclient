package o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Base64;
import androidx.appcompat.app.AlertDialog;
import java.nio.charset.StandardCharsets;

/* renamed from: o.bXx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4145bXx {
    private static int a = 1;
    public static final C4145bXx b;
    public static final int c;
    private static int d;
    private static boolean e;
    private static byte e$ss2$84;

    static {
        e();
        b = new C4145bXx();
        c = 8;
    }

    static void e() {
        e$ss2$84 = (byte) 24;
    }

    public final void a() {
        e = true;
    }

    public final boolean c() {
        return e;
    }

    private C4145bXx() {
    }

    public final void d(final Activity activity) {
        String str;
        int i = 2 % 2;
        int i2 = a + 77;
        d = i2 % 128;
        int i3 = i2 % 2;
        C8632dsu.c((Object) activity, "");
        Object obj = null;
        if (C8151dev.c()) {
            int i4 = a + 37;
            d = i4 % 128;
            if (i4 % 2 != 0) {
                activity.getString(com.netflix.mediaclient.ui.R.o.cC).startsWith("'!#+");
                throw null;
            }
            str = activity.getString(com.netflix.mediaclient.ui.R.o.cC);
            if (str.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                f(str.substring(4), objArr);
                str = ((String) objArr[0]).intern();
            }
        } else {
            String string = activity.getString(com.netflix.mediaclient.ui.R.o.dL);
            if (string.startsWith("'!#+")) {
                int i5 = d + 25;
                a = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr2 = new Object[1];
                    f(string.substring(4), objArr2);
                    ((String) objArr2[0]).intern();
                    obj.hashCode();
                    throw null;
                }
                String substring = string.substring(4);
                Object[] objArr3 = new Object[1];
                f(substring, objArr3);
                str = ((String) objArr3[0]).intern();
            } else {
                str = string;
            }
        }
        C8632dsu.d((Object) str);
        new AlertDialog.Builder(activity).setCancelable(false).setMessage(activity.getString(com.netflix.mediaclient.ui.R.o.lA, str)).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, new DialogInterface.OnClickListener() { // from class: o.bXz
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                C4145bXx.b(activity, dialogInterface, i6);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Activity activity, DialogInterface dialogInterface, int i) {
        C8632dsu.c((Object) activity, "");
        C8054ddD.e((Context) activity);
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$84);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
