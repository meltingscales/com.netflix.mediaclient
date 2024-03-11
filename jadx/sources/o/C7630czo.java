package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.netflix.model.leafs.PostPlayItem;
import java.nio.charset.StandardCharsets;
import o.C8175dfS;
import o.cIE;

/* renamed from: o.czo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7630czo extends LinearLayout {
    private static int b = 0;
    private static byte e$ss2$105 = 24;
    private static int g = 1;
    private TextView a;
    PostPlayItem c;
    private C8175dfS.d d;
    private final Runnable e;

    public C7630czo(Context context) {
        super(context);
        this.e = new Runnable() { // from class: o.czo.1
            @Override // java.lang.Runnable
            public void run() {
                C7630czo.this.e();
            }
        };
    }

    public C7630czo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new Runnable() { // from class: o.czo.1
            @Override // java.lang.Runnable
            public void run() {
                C7630czo.this.e();
            }
        };
    }

    public C7630czo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new Runnable() { // from class: o.czo.1
            @Override // java.lang.Runnable
            public void run() {
                C7630czo.this.e();
            }
        };
    }

    public void b(PostPlayItem postPlayItem, C8175dfS.d dVar) {
        this.c = postPlayItem;
        this.d = dVar;
        dVar.c(this.e);
        e();
    }

    public void a() {
        C8175dfS.d dVar = this.d;
        if (dVar != null) {
            dVar.d();
        }
    }

    public void b() {
        C8175dfS.d dVar = this.d;
        if (dVar != null) {
            dVar.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r8.startsWith("'!#+") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (r8.startsWith("'!#+") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
        r3 = new java.lang.Object[1];
        f(r8.substring(4), r3);
        r8 = ((java.lang.String) r3[0]).intern();
        r2 = r7.getText(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        if ((r2 instanceof android.text.Spanned) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        r3 = new android.text.SpannableString(r8);
        android.text.TextUtils.copySpansFrom((android.text.SpannedString) r2, 0, r8.length(), java.lang.Object.class, r3, 0);
        r2 = o.C7630czo.b + 85;
        o.C7630czo.g = r2 % 128;
        r2 = r2 % 2;
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0094, code lost:
        r1.setText(r8);
        r1 = o.C7630czo.b + 105;
        o.C7630czo.g = r1 % 128;
        r1 = r1 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C7630czo.e():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C8175dfS.d dVar = this.d;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(cIE.b.bk);
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$105);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
