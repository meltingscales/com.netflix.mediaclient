package o;

import android.content.Context;
import android.util.Base64;
import android.view.View;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7373cuw;

/* renamed from: o.cvz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7429cvz extends AbstractC3336ax<a> {
    public static final int b;
    public static final d d;
    private static byte e$ss2$146 = 0;
    private static int h = 0;
    private static int j = 1;
    private boolean c;
    private int f;
    private String g;

    static {
        k();
        d = new d(null);
        b = 8;
    }

    static void k() {
        e$ss2$146 = (byte) 24;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C7373cuw.b.e;
    }

    public final void c(String str) {
        this.g = str;
    }

    public final void d(int i) {
        this.f = i;
    }

    public final void e(boolean z) {
        this.c = z;
    }

    public final boolean i() {
        return this.c;
    }

    public final String n() {
        return this.g;
    }

    public final int o() {
        return this.f;
    }

    /* renamed from: o.cvz$d */
    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("DownlaodedForYouHeaderView");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0092, code lost:
        if (r2.length() == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
        r0 = o.C1333Xq.d(com.netflix.mediaclient.ui.R.o.bq).d("profile", r8.g).toString();
     */
    @Override // o.AbstractC3336ax
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC7429cvz.a r9) {
        /*
            r8 = this;
            r0 = 2
            int r1 = r0 % r0
            java.lang.String r1 = ""
            o.C8632dsu.c(r9, r1)
            o.Sr r1 = r9.c()
            android.content.Context r1 = r1.getContext()
            android.view.View r2 = r9.b()
            boolean r3 = r8.c
            r4 = 1
            r5 = 8
            r6 = 0
            if (r3 == 0) goto L2b
            int r3 = o.AbstractC7429cvz.j
            int r3 = r3 + 121
            int r7 = r3 % 128
            o.AbstractC7429cvz.h = r7
            int r3 = r3 % r0
            if (r3 == 0) goto L29
            r3 = r4
            goto L2c
        L29:
            r3 = r6
            goto L2c
        L2b:
            r3 = r5
        L2c:
            r2.setVisibility(r3)
            boolean r2 = r8.c
            if (r2 == 0) goto L42
            android.view.View r2 = r9.e()
            r2.setVisibility(r6)
            o.Sr r2 = r9.c()
            r2.setVisibility(r5)
            goto L71
        L42:
            int r2 = o.AbstractC7429cvz.h
            int r2 = r2 + 61
            int r3 = r2 % 128
            o.AbstractC7429cvz.j = r3
            int r2 = r2 % r0
            android.view.View r2 = r9.e()
            r2.setVisibility(r5)
            o.Sr r2 = r9.c()
            r2.setVisibility(r6)
            o.Sr r2 = r9.c()
            o.dgw$a r3 = o.C8258dgw.a
            o.dgw r3 = r3.e()
            int r3 = r3.h()
            o.C8632dsu.d(r1)
            java.lang.String r3 = r8.e(r3, r1)
            r2.setText(r3)
        L71:
            o.Sr r9 = r9.d()
            java.lang.String r2 = r8.g
            if (r2 == 0) goto La8
            int r3 = o.AbstractC7429cvz.h
            int r3 = r3 + 59
            int r5 = r3 % 128
            o.AbstractC7429cvz.j = r5
            int r3 = r3 % r0
            if (r3 != 0) goto L8e
            int r0 = r2.length()
            r2 = 90
            int r2 = r2 / r6
            if (r0 != 0) goto L95
            goto La8
        L8e:
            int r0 = r2.length()
            if (r0 != 0) goto L95
            goto La8
        L95:
            int r0 = com.netflix.mediaclient.ui.R.o.bq
            o.Xq r0 = o.C1333Xq.d(r0)
            java.lang.String r1 = r8.g
            java.lang.String r2 = "profile"
            o.Xq r0 = r0.d(r2, r1)
            java.lang.String r0 = r0.toString()
            goto Lc8
        La8:
            int r0 = com.netflix.mediaclient.ui.R.o.bp
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r1 = "'!#+"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto Lc8
            r1 = 4
            java.lang.String r0 = r0.substring(r1)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r8.l(r0, r1)
            r0 = r1[r6]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
        Lc8:
            r9.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC7429cvz.e(o.cvz$a):void");
    }

    /* renamed from: o.cvz$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        private final dsZ a = bIF.d(this, C7373cuw.c.r, false, 2, null);
        private final dsZ b = bIF.d(this, C7373cuw.c.P, false, 2, null);
        private final dsZ c = bIF.d(this, C7373cuw.c.S, false, 2, null);
        private final dsZ g = bIF.d(this, C7373cuw.c.O, false, 2, null);
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(a.class, "empty", "getEmpty()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(a.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(a.class, "subtitle", "getSubtitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "updated", "getUpdated()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        public static final int d = 8;

        public final View b() {
            return (View) this.a.getValue(this, e[0]);
        }

        public final View e() {
            return (View) this.b.getValue(this, e[1]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.c.getValue(this, e[2]);
        }

        public final C1204Sr c() {
            return (C1204Sr) this.g.getValue(this, e[3]);
        }
    }

    private final String e(int i, Context context) {
        int i2 = 2 % 2;
        int i3 = i / 3600;
        int i4 = i / 60;
        if (i3 > 23) {
            String string = context.getString(com.netflix.mediaclient.ui.R.o.bj);
            if (string.startsWith("'!#+")) {
                int i5 = h + 15;
                j = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    l(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                    int i6 = 8 / 0;
                } else {
                    Object[] objArr2 = new Object[1];
                    l(string.substring(4), objArr2);
                    string = ((String) objArr2[0]).intern();
                }
            }
            C8632dsu.a(string, "");
            return string;
        } else if (i3 > 0) {
            int i7 = j + 65;
            h = i7 % 128;
            if (i7 % 2 != 0) {
                C8632dsu.a(C1333Xq.d(com.netflix.mediaclient.ui.R.o.bi).a(i3).d("size", Integer.valueOf(i3)).c(), "");
                throw null;
            }
            String c = C1333Xq.d(com.netflix.mediaclient.ui.R.o.bi).a(i3).d("size", Integer.valueOf(i3)).c();
            C8632dsu.a(c, "");
            return c;
        } else if (i4 > 0) {
            String c2 = C1333Xq.d(com.netflix.mediaclient.ui.R.o.bg).a(i4).d("size", Integer.valueOf(i4)).c();
            C8632dsu.a(c2, "");
            return c2;
        } else {
            String string2 = context.getString(com.netflix.mediaclient.ui.R.o.bn);
            if (string2.startsWith("'!#+")) {
                Object[] objArr3 = new Object[1];
                l(string2.substring(4), objArr3);
                string2 = ((String) objArr3[0]).intern();
            }
            C8632dsu.a(string2, "");
            return string2;
        }
    }

    private void l(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$146);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
