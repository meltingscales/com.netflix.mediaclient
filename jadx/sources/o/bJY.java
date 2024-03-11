package o;

import android.view.View;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;

/* loaded from: classes4.dex */
public abstract class bJY extends AbstractC3336ax<c> {
    private CharSequence b;
    private Integer c;
    private boolean d;
    private View.OnClickListener f;
    private String g;

    @Override // o.AbstractC3073as
    public int Z_() {
        return 0;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.F;
    }

    public final Integer i() {
        return this.c;
    }

    public final CharSequence k() {
        return this.b;
    }

    public final void k_(String str) {
        this.g = str;
    }

    public final String m() {
        return this.g;
    }

    public final boolean n() {
        return this.d;
    }

    public final View.OnClickListener o() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // o.AbstractC3336ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.bJY.c r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r7, r0)
            super.e(r7)
            java.lang.String r0 = r6.g
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L5a
            boolean r0 = o.C8684dus.a(r0)
            if (r0 == 0) goto L16
            goto L5a
        L16:
            com.netflix.android.imageloader.api.ShowImageRequest r0 = new com.netflix.android.imageloader.api.ShowImageRequest
            r0.<init>()
            java.lang.String r4 = r6.g
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r0.a(r4)
            boolean r4 = r6.d
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r0.c(r4)
            com.netflix.android.imageloader.api.ShowImageRequest$Priority r4 = com.netflix.android.imageloader.api.ShowImageRequest.Priority.a
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r0.c(r4)
            java.lang.Integer r4 = r6.c
            if (r4 == 0) goto L33
            r4 = r1
            goto L34
        L33:
            r4 = r3
        L34:
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r0.a(r4)
            com.netflix.android.imageloader.api.ShowImageRequest r0 = r0.d()
            com.netflix.mediaclient.android.widget.NetflixImageView r4 = r7.d()
            r4.showImage(r0)
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r7.d()
            java.lang.Integer r4 = r6.c
            if (r4 == 0) goto L55
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            int r4 = r4.intValue()
            r5.<init>(r4)
            goto L56
        L55:
            r5 = r2
        L56:
            r0.setBackground(r5)
            goto L61
        L5a:
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r7.d()
            r0.clearImage()
        L61:
            java.lang.CharSequence r0 = r6.b
            if (r0 == 0) goto L86
            com.netflix.mediaclient.android.widget.NetflixImageView r4 = r7.d()
            r4.setContentDescription(r0)
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r7.d()
            r0.setImportantForAccessibility(r1)
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r7.d()
            android.view.View$OnClickListener r4 = r6.f
            r0.setOnClickListener(r4)
            if (r4 == 0) goto L7f
            goto L80
        L7f:
            r1 = r3
        L80:
            r0.setClickable(r1)
            o.dpR r0 = o.dpR.c
            goto L87
        L86:
            r0 = r2
        L87:
            if (r0 != 0) goto L98
            com.netflix.mediaclient.android.widget.NetflixImageView r0 = r7.d()
            r0.setContentDescription(r2)
            com.netflix.mediaclient.android.widget.NetflixImageView r7 = r7.d()
            r0 = 2
            r7.setImportantForAccessibility(r0)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bJY.e(o.bJY$c):void");
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: a */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        NetflixImageView d = cVar.d();
        d.setOnClickListener(null);
        d.setClickable(false);
        cVar.d().setBackground(null);
        cVar.d().onViewRecycled();
        super.b((bJY) cVar);
    }

    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(c.class, "imageView", "getImageView()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0))};
        public static final int c = 8;
        private final dsZ a = bIF.c(this, C3796bKz.a.b, true);

        public final NetflixImageView d() {
            return (NetflixImageView) this.a.getValue(this, b[0]);
        }
    }
}
