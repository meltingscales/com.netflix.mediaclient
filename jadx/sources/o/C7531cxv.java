package o;

import android.content.Context;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import o.InterfaceC5297bwB;

/* renamed from: o.cxv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7531cxv implements InterfaceC5297bwB {
    private static int a = 1;
    private static int b = 0;
    private static byte e$ss2$92 = 24;
    private InterfaceC5297bwB.a d;

    @Override // o.InterfaceC5297bwB
    public int a(boolean z) {
        return z ? com.netflix.mediaclient.ui.R.o.iC : com.netflix.mediaclient.ui.R.o.lB;
    }

    @Override // o.InterfaceC5297bwB
    public void a(InterfaceC5297bwB.a aVar) {
        this.d = aVar;
    }

    @Override // o.InterfaceC5297bwB
    public InterfaceC5297bwB.a e() {
        return this.d;
    }

    @Override // o.InterfaceC5297bwB
    public String a(Context context) {
        int i = 2 % 2;
        int i2 = b + 65;
        a = i2 % 128;
        int i3 = i2 % 2;
        C8632dsu.c((Object) context, "");
        String string = context.getString(com.netflix.mediaclient.ui.R.o.gx);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            f(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
        }
        C8632dsu.a(string, "");
        int i4 = b + 21;
        a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 33 / 0;
        }
        return string;
    }

    @Override // o.InterfaceC5297bwB
    public String d(Context context, String str) {
        C8632dsu.c((Object) context, "");
        String string = context.getString(com.netflix.mediaclient.ui.R.o.b, str);
        C8632dsu.a(string, "");
        return string;
    }

    @Override // o.InterfaceC5297bwB
    public String c(Context context, String str) {
        C8632dsu.c((Object) context, "");
        String string = context.getString(com.netflix.mediaclient.ui.R.o.a, str);
        C8632dsu.a(string, "");
        return string;
    }

    @Override // o.InterfaceC5297bwB
    public String b(Context context) {
        int i = 2 % 2;
        int i2 = b + 51;
        a = i2 % 128;
        int i3 = i2 % 2;
        C8632dsu.c((Object) context, "");
        String string = context.getString(com.netflix.mediaclient.ui.R.o.kT);
        if (string.startsWith("'!#+")) {
            int i4 = b + 17;
            a = i4 % 128;
            int i5 = i4 % 2;
            String substring = string.substring(4);
            if (i5 == 0) {
                Object[] objArr = new Object[1];
                f(substring, objArr);
                ((String) objArr[0]).intern();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            f(substring, objArr2);
            string = ((String) objArr2[0]).intern();
        }
        C8632dsu.a(string, "");
        return string;
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$92);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
