package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.Base64;
import android.view.LayoutInflater;
import android.widget.Toast;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;

/* loaded from: classes4.dex */
public final class bBB {
    private static int b = 1;
    private static final InterfaceC5337bwp c;
    public static final bBB d;
    private static int e;
    private static byte e$ss2$53;

    static void a() {
        e$ss2$53 = (byte) 24;
    }

    private bBB() {
    }

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC5337bwp {
        a() {
        }

        @Override // o.InterfaceC5337bwp
        public void c(Exception exc) {
            Map d;
            Map k;
            Throwable th;
            C8632dsu.c((Object) exc, "");
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("SPY-18205 BadTokenException in AndroidUtils.showToast", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    static {
        a();
        d = new bBB();
        c = new a();
    }

    @SuppressLint({"netflix.ToastUiUtilsShow"})
    public final Toast a(Context context, int i) {
        int i2 = 2 % 2;
        int i3 = b + 59;
        e = i3 % 128;
        if (i3 % 2 == 0) {
            C8632dsu.c((Object) context, "");
            String string = context.getString(i);
            if (string.startsWith("'!#+")) {
                int i4 = e + 5;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    f(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                    int i5 = 46 / 0;
                } else {
                    Object[] objArr2 = new Object[1];
                    f(string.substring(4), objArr2);
                    string = ((String) objArr2[0]).intern();
                }
            }
            C8632dsu.a(string, "");
            Toast b2 = b(context, string);
            b2.show();
            return b2;
        }
        C8632dsu.c((Object) context, "");
        context.getString(i).startsWith("'!#+");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final Toast b(Context context, String str) {
        Context c5343bwv = Build.VERSION.SDK_INT == 25 ? new C5343bwv(context, c) : context;
        Object systemService = context.getSystemService("layout_inflater");
        C8632dsu.d(systemService);
        bAI e2 = bAI.e((LayoutInflater) systemService);
        C8632dsu.a(e2, "");
        e2.b.setText(str);
        Toast toast = new Toast(c5343bwv);
        toast.setView(e2.a());
        toast.setDuration(0);
        return toast;
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$53);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
