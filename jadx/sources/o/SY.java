package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import androidx.appcompat.app.AlertDialog;
import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
public class SY extends AlertDialog {
    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean onSearchRequested() {
        return false;
    }

    public SY(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.app.AlertDialog, android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        C1044Mm.a("Update", "Key " + i);
        if (i == 84) {
            C1044Mm.a("Update", "Ignore search key");
            return true;
        } else if (i == 4) {
            C1044Mm.a("Update", "Ignore back key");
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class d {
        public int a;
        public Drawable b;
        public final Context c;
        public boolean d;
        public CharSequence e;
        public DialogInterface.OnClickListener f;
        public CharSequence g;
        public DialogInterface.OnClickListener h;
        public DialogInterface.OnCancelListener i;
        public CharSequence j;
        public DialogInterface.OnKeyListener k;
        public DialogInterface.OnClickListener l;
        public CharSequence m;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f13398o;

        private d(Context context) {
            this.a = -1;
            this.c = context;
        }
    }

    /* loaded from: classes.dex */
    public static class e {
        private static int a = 0;
        private static int b = 1;
        private static byte e$ss2$152 = 24;
        private d e;

        public e(Context context) {
            this.e = new d(context);
        }

        public e c(CharSequence charSequence) {
            this.e.f13398o = charSequence;
            return this;
        }

        public e d(int i) {
            int i2 = 2 % 2;
            int i3 = a + 59;
            b = i3 % 128;
            if (i3 % 2 != 0) {
                d dVar = this.e;
                Context context = dVar.c;
                String string = context.getString(i);
                if (string.startsWith("'!#+")) {
                    String substring = string.substring(4);
                    Object[] objArr = new Object[1];
                    f(substring, objArr);
                    string = ((String) objArr[0]).intern();
                    CharSequence text = context.getText(i);
                    if (text instanceof Spanned) {
                        SpannableString spannableString = new SpannableString(string);
                        TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                        string = spannableString;
                    }
                }
                dVar.e = string;
                int i4 = a + 49;
                b = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 34 / 0;
                }
                return this;
            }
            this.e.c.getString(i).startsWith("'!#+");
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        public e e(CharSequence charSequence) {
            this.e.e = charSequence;
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004a, code lost:
            if ((r13 instanceof android.text.Spanned) == false) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
            r2 = new android.text.SpannableString(r5);
            android.text.TextUtils.copySpansFrom((android.text.SpannedString) r13, 0, r5.length(), java.lang.Object.class, r2, 0);
            r5 = r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
            if (r5.startsWith("'!#+") != false) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
            if (r5.startsWith("'!#+") != false) goto L8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
            r3 = r5.substring(4);
            r5 = new java.lang.Object[1];
            f(r3, r5);
            r5 = ((java.lang.String) r5[0]).intern();
            r13 = r4.getText(r13);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public o.SY.e c(int r13, android.content.DialogInterface.OnClickListener r14) {
            /*
                r12 = this;
                r0 = 2
                int r1 = r0 % r0
                int r1 = o.SY.e.b
                int r1 = r1 + 53
                int r2 = r1 % 128
                o.SY.e.a = r2
                int r1 = r1 % r0
                r2 = 0
                java.lang.String r3 = "'!#+"
                if (r1 == 0) goto L23
                o.SY$d r1 = r12.e
                android.content.Context r4 = r1.c
                java.lang.String r5 = r4.getString(r13)
                boolean r3 = r5.startsWith(r3)
                r6 = 69
                int r6 = r6 / r2
                if (r3 == 0) goto L64
                goto L31
            L23:
                o.SY$d r1 = r12.e
                android.content.Context r4 = r1.c
                java.lang.String r5 = r4.getString(r13)
                boolean r3 = r5.startsWith(r3)
                if (r3 == 0) goto L64
            L31:
                r3 = 4
                java.lang.String r3 = r5.substring(r3)
                r5 = 1
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r12.f(r3, r5)
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r5 = r2.intern()
                java.lang.CharSequence r13 = r4.getText(r13)
                boolean r2 = r13 instanceof android.text.Spanned
                if (r2 == 0) goto L64
                android.text.SpannableString r2 = new android.text.SpannableString
                r2.<init>(r5)
                r6 = r13
                android.text.SpannedString r6 = (android.text.SpannedString) r6
                r7 = 0
                int r8 = r5.length()
                java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
                r13 = r2
                android.text.SpannableString r13 = (android.text.SpannableString) r13
                r11 = 0
                r10 = r2
                android.text.TextUtils.copySpansFrom(r6, r7, r8, r9, r10, r11)
                r5 = r2
            L64:
                r1.m = r5
                o.SY$d r13 = r12.e
                r13.l = r14
                int r13 = o.SY.e.b
                int r13 = r13 + 97
                int r14 = r13 % 128
                o.SY.e.a = r14
                int r13 = r13 % r0
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: o.SY.e.c(int, android.content.DialogInterface$OnClickListener):o.SY$e");
        }

        public e c(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            d dVar = this.e;
            dVar.m = charSequence;
            dVar.l = onClickListener;
            return this;
        }

        public e e(int i, DialogInterface.OnClickListener onClickListener) {
            int i2 = 2 % 2;
            int i3 = b + 91;
            a = i3 % 128;
            int i4 = i3 % 2;
            d dVar = this.e;
            Context context = dVar.c;
            String string = context.getString(i);
            if (string.startsWith("'!#+")) {
                Object[] objArr = new Object[1];
                f(string.substring(4), objArr);
                string = ((String) objArr[0]).intern();
                CharSequence text = context.getText(i);
                if (text instanceof Spanned) {
                    SpannableString spannableString = new SpannableString(string);
                    TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                    string = spannableString;
                }
            }
            dVar.g = string;
            this.e.h = onClickListener;
            int i5 = b + 23;
            a = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public e b(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            d dVar = this.e;
            dVar.j = charSequence;
            dVar.f = onClickListener;
            return this;
        }

        public e e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            d dVar = this.e;
            dVar.g = charSequence;
            dVar.h = onClickListener;
            return this;
        }

        public e d(boolean z) {
            this.e.d = z;
            return this;
        }

        public e a(DialogInterface.OnCancelListener onCancelListener) {
            this.e.i = onCancelListener;
            return this;
        }

        public e b(DialogInterface.OnKeyListener onKeyListener) {
            this.e.k = onKeyListener;
            return this;
        }

        public SY d() {
            SY sy = new SY(this.e.c);
            sy.setCancelable(this.e.d);
            sy.setOnCancelListener(this.e.i);
            sy.setOnKeyListener(this.e.k);
            CharSequence charSequence = this.e.f13398o;
            if (charSequence != null) {
                sy.setTitle(charSequence);
            }
            Drawable drawable = this.e.b;
            if (drawable != null) {
                sy.setIcon(drawable);
            }
            int i = this.e.a;
            if (i >= 0) {
                sy.setIcon(i);
            }
            CharSequence charSequence2 = this.e.e;
            if (charSequence2 != null) {
                sy.setMessage(charSequence2);
            }
            d dVar = this.e;
            CharSequence charSequence3 = dVar.m;
            if (charSequence3 != null) {
                sy.setButton(-1, charSequence3, dVar.l);
            }
            d dVar2 = this.e;
            CharSequence charSequence4 = dVar2.g;
            if (charSequence4 != null) {
                sy.setButton(-2, charSequence4, dVar2.h);
            }
            d dVar3 = this.e;
            CharSequence charSequence5 = dVar3.j;
            if (charSequence5 != null) {
                sy.setButton(-3, charSequence5, dVar3.f);
            }
            return sy;
        }

        public AlertDialog c() {
            SY d = d();
            d.show();
            return d;
        }

        private void f(String str, Object[] objArr) {
            byte[] decode = Base64.decode(str, 0);
            byte[] bArr = new byte[decode.length];
            for (int i = 0; i < decode.length; i++) {
                bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$152);
            }
            objArr[0] = new String(bArr, StandardCharsets.UTF_8);
        }
    }
}
