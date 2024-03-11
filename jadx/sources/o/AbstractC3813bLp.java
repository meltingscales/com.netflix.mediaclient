package o;

import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.Base64;
import android.view.View;
import java.nio.charset.StandardCharsets;
import o.C3796bKz;

/* renamed from: o.bLp  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3813bLp extends AbstractC3336ax<c> {
    private static byte e$ss2$186 = 24;
    private static int h = 1;
    private static int i;
    private boolean b;
    private boolean c;
    private View.OnClickListener d;
    private int f = -1;
    private CharSequence g;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.z;
    }

    public final void c(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final void e(boolean z) {
        this.c = z;
    }

    public final void h(CharSequence charSequence) {
        this.g = charSequence;
    }

    public boolean o() {
        return this.b;
    }

    public final int p() {
        return this.f;
    }

    public final CharSequence q() {
        return this.g;
    }

    public void q_(boolean z) {
        this.b = z;
    }

    public final View.OnClickListener s() {
        return this.d;
    }

    public final boolean t() {
        return this.c;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3336ax
    public void e(c cVar) {
        String str;
        int i2 = 2 % 2;
        C8632dsu.c((Object) cVar, "");
        C1204Sr b = cVar.b();
        boolean z = false;
        MovementMethod movementMethod = null;
        if (this.f > 0) {
            int i3 = h + 37;
            i = i3 % 128;
            if (i3 % 2 != 0) {
                cVar.b().getResources().getString(this.f).startsWith("'!#+");
                throw null;
            }
            String string = cVar.b().getResources().getString(this.f);
            boolean z2 = !string.startsWith("'!#+");
            String str2 = string;
            if (!z2) {
                Object[] objArr = new Object[1];
                r(string.substring(4), objArr);
                str2 = ((String) objArr[0]).intern();
            }
            int i4 = h + 7;
            i = i4 % 128;
            int i5 = i4 % 2;
            str = str2;
        } else {
            CharSequence charSequence = this.g;
            int i6 = i + 53;
            h = i6 % 128;
            int i7 = i6 % 2;
            str = charSequence;
        }
        b.setText(str);
        C1204Sr b2 = cVar.b();
        View.OnClickListener onClickListener = this.d;
        b2.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            int i8 = i + 57;
            h = i8 % 128;
            int i9 = i8 % 2;
            z = true;
        }
        b2.setClickable(z);
        cVar.b().setFocusable(true);
        C1204Sr b3 = cVar.b();
        if (this.c) {
            int i10 = h + 47;
            i = i10 % 128;
            if (i10 % 2 != 0) {
                LinkMovementMethod.getInstance();
                movementMethod.hashCode();
                throw null;
            }
            movementMethod = LinkMovementMethod.getInstance();
        }
        b3.setMovementMethod(movementMethod);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        C1204Sr b = cVar.b();
        b.setOnClickListener(null);
        b.setClickable(false);
        super.b((AbstractC3813bLp) cVar);
    }

    /* renamed from: o.bLp$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        private C1204Sr a;

        public final C1204Sr b() {
            C1204Sr c1204Sr = this.a;
            if (c1204Sr != null) {
                return c1204Sr;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            C1204Sr c1204Sr = (C1204Sr) view.findViewById(C3796bKz.a.w);
            if (c1204Sr == null) {
                c1204Sr = (C1204Sr) view;
            }
            this.a = c1204Sr;
        }
    }

    private void r(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$186);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
