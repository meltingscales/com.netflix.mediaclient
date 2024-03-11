package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* renamed from: o.dc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7997dc {
    private static final Object b = new Object();
    private static int i = 0;
    private static int j = 1;
    private InterfaceC5348bx a;
    private final Map<String, C6478ce> c;
    private final Context d;
    private final String e;

    public void a(InterfaceC5348bx interfaceC5348bx) {
        this.a = interfaceC5348bx;
    }

    public C7997dc(Drawable.Callback callback, String str, InterfaceC5348bx interfaceC5348bx, Map<String, C6478ce> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            str = str + '/';
        }
        this.e = str;
        this.c = map;
        a(interfaceC5348bx);
        if (callback instanceof View) {
            this.d = ((View) callback).getContext().getApplicationContext();
        } else {
            this.d = null;
        }
    }

    public Bitmap b(String str, Bitmap bitmap) {
        if (bitmap == null) {
            C6478ce c6478ce = this.c.get(str);
            Bitmap b2 = c6478ce.b();
            c6478ce.b(null);
            return b2;
        }
        Bitmap b3 = this.c.get(str).b();
        c(str, bitmap);
        return b3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
        if (((java.lang.Integer) java.lang.String.class.getMethod("indexOf", java.lang.String.class).invoke(r4, "base64,")).intValue() > 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Bitmap d(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7997dc.d(java.lang.String):android.graphics.Bitmap");
    }

    public boolean c(Context context) {
        return (context == null && this.d == null) || this.d.equals(context);
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (b) {
            this.c.get(str).b(bitmap);
        }
        return bitmap;
    }
}
