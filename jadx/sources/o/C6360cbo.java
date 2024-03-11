package o;

import android.content.Context;
import android.text.Spannable;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import java.nio.charset.StandardCharsets;
import o.C6361cbp;

/* renamed from: o.cbo  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6360cbo extends LinearLayout {
    private static int e = 0;
    private static byte e$ss2$105 = 24;
    private static int h = 1;
    private final C1203Sq a;
    private final C1204Sr b;
    private final C6364cbs c;
    private drO<dpR> d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6360cbo(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6360cbo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6360cbo(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public final void setOnExpandListener(drO<dpR> dro) {
        this.d = dro;
    }

    public /* synthetic */ C6360cbo(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6360cbo(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        C6364cbs b = C6364cbs.b(LayoutInflater.from(context), this);
        C8632dsu.a(b, "");
        this.c = b;
        C1203Sq c1203Sq = b.d;
        C8632dsu.a(c1203Sq, "");
        this.a = c1203Sq;
        C1204Sr c1204Sr = b.e;
        C8632dsu.a(c1204Sr, "");
        this.b = c1204Sr;
        setOrientation(1);
        if (isInEditMode()) {
            return;
        }
        b();
        String string = context.getString(C6361cbp.b.p);
        if (!(!string.startsWith("'!#+"))) {
            int i3 = e + 23;
            h = i3 % 128;
            int i4 = i3 % 2;
            String substring = string.substring(4);
            if (i4 == 0) {
                Object[] objArr = new Object[1];
                f(substring, objArr);
                ((String) objArr[0]).intern();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Object[] objArr2 = new Object[1];
            f(substring, objArr2);
            string = ((String) objArr2[0]).intern();
            int i5 = 2 % 2;
        }
        Spanned c = C8168dfL.c(string);
        C8632dsu.d(c);
        C9696vK.c(c1204Sr, (Spannable) c);
        c1204Sr.setMovementMethod(LinkMovementMethod.getInstance());
        int i6 = e + 63;
        h = i6 % 128;
        int i7 = i6 % 2;
        int i8 = 2 % 2;
    }

    private final void b() {
        final String string = getResources().getString(C6361cbp.b.v);
        C8632dsu.a(string, "");
        String string2 = getContext().getString(C6361cbp.b.y);
        C8632dsu.a(string2, "");
        this.a.setText(C8168dfL.c(string + " " + string2));
        C1203Sq c1203Sq = this.a;
        c1203Sq.setOnClickListener(new View.OnClickListener() { // from class: o.cbn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6360cbo.d(C6360cbo.this, string, view);
            }
        });
        c1203Sq.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C6360cbo c6360cbo, String str, View view) {
        C8632dsu.c((Object) c6360cbo, "");
        C8632dsu.c((Object) str, "");
        c6360cbo.b.setVisibility(0);
        c6360cbo.a.setText(str);
        drO<dpR> dro = c6360cbo.d;
        if (dro != null) {
            dro.invoke();
        }
        C1203Sq c1203Sq = c6360cbo.a;
        c1203Sq.setOnClickListener(null);
        c1203Sq.setClickable(false);
    }

    private static void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$105);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
