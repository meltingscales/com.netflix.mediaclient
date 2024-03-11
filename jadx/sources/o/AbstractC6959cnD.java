package o;

import android.util.Base64;
import android.view.View;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6956cnA;

/* renamed from: o.cnD  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6959cnD extends AbstractC3336ax<c> {
    private static byte e$ss2$175 = 24;
    private static int f = 1;
    private static int j;
    private Integer b;
    private Integer c;
    private View.OnClickListener d;
    private Integer i;

    @Override // o.AbstractC3073as
    public int a() {
        return C6956cnA.b.a;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final void d(Integer num) {
        this.i = num;
    }

    public final View.OnClickListener i() {
        return this.d;
    }

    public final Integer l() {
        return this.i;
    }

    public final Integer m() {
        return this.b;
    }

    public final Integer o() {
        return this.c;
    }

    public final void o_(Integer num) {
        this.b = num;
    }

    public final void p_(Integer num) {
        this.c = num;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
        if (r3.startsWith("'!#+") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
        r10 = new java.lang.Object[1];
        k(r3.substring(4), r10);
        r3 = ((java.lang.String) r10[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005e, code lost:
        r9.setText(r3);
        r3 = o.dpR.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (r3.startsWith("'!#+") != false) goto L41;
     */
    @Override // o.AbstractC3336ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC6959cnD.c r13) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC6959cnD.e(o.cnD$c):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        C1203Sq d = cVar.d();
        d.setOnClickListener(null);
        d.setClickable(false);
    }

    /* renamed from: o.cnD$c */
    /* loaded from: classes4.dex */
    public static class c extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(c.class, "titleView", "getTitleView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "subtitleView", "getSubtitleView()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(c.class, "buttonView", "getButtonView()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        public static final int a = 8;
        private final dsZ e = bIF.d(this, C6956cnA.e.g, false, 2, null);
        private final dsZ b = bIF.d(this, C6956cnA.e.i, false, 2, null);
        private final dsZ c = bIF.d(this, C6956cnA.e.f, false, 2, null);

        public final C1204Sr a() {
            return (C1204Sr) this.e.getValue(this, d[0]);
        }

        public final C1204Sr c() {
            return (C1204Sr) this.b.getValue(this, d[1]);
        }

        public final C1203Sq d() {
            return (C1203Sq) this.c.getValue(this, d[2]);
        }
    }

    private void k(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$175);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
