package o;

import android.content.Context;
import android.util.Base64;
import com.netflix.mediaclient.StatusCode;
import java.nio.charset.StandardCharsets;

/* loaded from: classes4.dex */
public class bMJ implements InterfaceC1905aSp {
    private static byte e$ss2$99 = 24;
    private static int h = 0;
    private static int j = 1;
    private Context a;
    private Throwable b;
    private int c;
    private C1907aSr d;
    private Runnable e;
    private StatusCode f;
    private Runnable g;
    private int i;

    @Override // o.InterfaceC1905aSp
    public C1907aSr a() {
        return this.d;
    }

    @Override // o.InterfaceC1905aSp
    public Runnable c() {
        return this.g;
    }

    @Override // o.InterfaceC1905aSp
    public int d() {
        return this.i;
    }

    public bMJ(Context context, StatusCode statusCode, Runnable runnable, int i) {
        this(context, statusCode, null, Integer.MAX_VALUE, null, i, runnable);
    }

    public bMJ(Context context, StatusCode statusCode, Throwable th, int i, Runnable runnable, int i2, Runnable runnable2) {
        this.a = context;
        this.f = statusCode;
        this.b = th;
        this.i = i;
        this.g = runnable;
        this.c = i2;
        this.e = runnable2;
        e();
    }

    private void e() {
        if (this.f == null) {
            C1044Mm.d("ErrorAgent", "Required to display error dialog without status code!");
        }
        String d = d(this.c, this.f);
        Runnable runnable = this.e;
        if (runnable == null) {
            runnable = new Runnable() { // from class: o.bMJ.3
                @Override // java.lang.Runnable
                public void run() {
                    C8054ddD.e(bMJ.this.a);
                }
            };
        }
        Runnable runnable2 = runnable;
        this.d = new C1907aSr("", d, null, runnable2, runnable2);
    }

    private String d(int i, StatusCode statusCode) {
        String string;
        int i2 = 2 % 2;
        if (i == Integer.MAX_VALUE) {
            String string2 = this.a.getString(com.netflix.mediaclient.ui.R.o.dy);
            if (string2.startsWith("'!#+")) {
                int i3 = h + 95;
                j = i3 % 128;
                if (i3 % 2 != 0) {
                    Object[] objArr = new Object[1];
                    k(string2.substring(4), objArr);
                    return ((String) objArr[0]).intern();
                }
                Object[] objArr2 = new Object[1];
                k(string2.substring(4), objArr2);
                ((String) objArr2[0]).intern();
                throw null;
            }
            return string2;
        }
        if (statusCode != null) {
            int i4 = h + 75;
            j = i4 % 128;
            int i5 = i4 % 2;
            string = this.a.getString(i, Integer.valueOf(statusCode.getValue()));
        } else {
            string = this.a.getString(i);
            if (string.startsWith("'!#+")) {
                int i6 = h + 83;
                j = i6 % 128;
                int i7 = i6 % 2;
                Object[] objArr3 = new Object[1];
                k(string.substring(4), objArr3);
                string = ((String) objArr3[0]).intern();
                int i8 = h + 27;
                j = i8 % 128;
                if (i8 % 2 == 0) {
                    int i9 = 4 % 3;
                }
            }
        }
        if (string == null) {
            string = this.a.getString(com.netflix.mediaclient.ui.R.o.dy);
            if (string.startsWith("'!#+")) {
                Object[] objArr4 = new Object[1];
                k(string.substring(4), objArr4);
                string = ((String) objArr4[0]).intern();
            }
            int i10 = h + 69;
            j = i10 % 128;
            int i11 = i10 % 2;
        }
        return string;
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$99);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
