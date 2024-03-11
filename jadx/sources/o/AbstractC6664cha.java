package o;

import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6597cgM;

/* renamed from: o.cha  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6664cha extends AbstractC3336ax<b> {
    private CharSequence b;
    private CharSequence c;
    private CharSequence d;

    public final void K_(CharSequence charSequence) {
        this.b = charSequence;
    }

    public final void L_(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void M_(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C6597cgM.a.g;
    }

    public final CharSequence i() {
        return this.b;
    }

    public final CharSequence k() {
        return this.d;
    }

    public final CharSequence m() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    @Override // o.AbstractC3336ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC6664cha.b r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            o.Sr r0 = r5.a()
            java.lang.CharSequence r1 = r4.c
            r0.setText(r1)
            o.Sr r0 = r5.a()
            java.lang.CharSequence r1 = r4.c
            r2 = 8
            r3 = 0
            if (r1 == 0) goto L22
            boolean r1 = o.C8684dus.a(r1)
            if (r1 == 0) goto L20
            goto L22
        L20:
            r1 = r3
            goto L23
        L22:
            r1 = r2
        L23:
            r0.setVisibility(r1)
            o.Sr r0 = r5.e()
            java.lang.CharSequence r1 = r4.d
            r0.setText(r1)
            o.Sr r0 = r5.e()
            java.lang.CharSequence r1 = r4.d
            if (r1 == 0) goto L40
            boolean r1 = o.C8684dus.a(r1)
            if (r1 == 0) goto L3e
            goto L40
        L3e:
            r1 = r3
            goto L41
        L40:
            r1 = r2
        L41:
            r0.setVisibility(r1)
            o.Sr r0 = r5.d()
            java.lang.CharSequence r1 = r4.b
            r0.setText(r1)
            o.Sr r5 = r5.d()
            java.lang.CharSequence r0 = r4.b
            if (r0 == 0) goto L5d
            boolean r0 = o.C8684dus.a(r0)
            if (r0 == 0) goto L5c
            goto L5d
        L5c:
            r2 = r3
        L5d:
            r5.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC6664cha.e(o.cha$b):void");
    }

    /* renamed from: o.cha$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(b.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "price", "getPrice()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(b.class, "description", "getDescription()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        private final dsZ d = bIF.d(this, C6597cgM.e.h, false, 2, null);
        private final dsZ b = bIF.d(this, C6597cgM.e.f, false, 2, null);
        private final dsZ c = bIF.d(this, C6597cgM.e.j, false, 2, null);

        public final C1204Sr a() {
            return (C1204Sr) this.d.getValue(this, e[0]);
        }

        public final C1204Sr e() {
            return (C1204Sr) this.b.getValue(this, e[1]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.c.getValue(this, e[2]);
        }
    }
}
