package o;

import android.text.TextWatcher;
import android.view.View;
import com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel;
import com.netflix.mediaclient.acquisition.components.form2.edittext.IconFormViewEditText;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6597cgM;

/* renamed from: o.cgW  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6607cgW extends AbstractC3336ax<a> {
    private View.OnClickListener b;
    private TextWatcher c;
    private CharSequence d;
    private boolean f;
    private CharSequence g;
    private FormViewEditTextViewModel h;
    private boolean i;
    private CharSequence j;

    public final void I_(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void J_(CharSequence charSequence) {
        this.g = charSequence;
    }

    @Override // o.AbstractC3073as
    public int a() {
        return C6597cgM.a.a;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.b = onClickListener;
    }

    public final void b(boolean z) {
        this.f = z;
    }

    public final void c(FormViewEditTextViewModel formViewEditTextViewModel) {
        this.h = formViewEditTextViewModel;
    }

    public final void c(boolean z) {
        this.i = z;
    }

    public final CharSequence i() {
        return this.d;
    }

    public final FormViewEditTextViewModel k() {
        return this.h;
    }

    public final CharSequence l() {
        return this.j;
    }

    public final TextWatcher m() {
        return this.c;
    }

    public final boolean n() {
        return this.f;
    }

    public final View.OnClickListener o() {
        return this.b;
    }

    public final CharSequence q() {
        return this.g;
    }

    public final boolean s() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    @Override // o.AbstractC3336ax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(o.AbstractC6607cgW.a r5) {
        /*
            r4 = this;
            java.lang.String r0 = ""
            o.C8632dsu.c(r5, r0)
            o.Sr r0 = r5.c()
            java.lang.CharSequence r1 = r4.g
            r0.setText(r1)
            o.Sr r0 = r5.c()
            java.lang.CharSequence r1 = r4.g
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
            o.Sr r0 = r5.d()
            java.lang.CharSequence r1 = r4.j
            r0.setText(r1)
            o.Sr r0 = r5.d()
            java.lang.CharSequence r1 = r4.j
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
            o.Sr r0 = r5.b()
            java.lang.CharSequence r1 = r4.d
            r0.setText(r1)
            o.Sr r0 = r5.b()
            java.lang.CharSequence r1 = r4.d
            if (r1 == 0) goto L5e
            boolean r1 = o.C8684dus.a(r1)
            if (r1 == 0) goto L5c
            goto L5e
        L5c:
            r1 = r3
            goto L5f
        L5e:
            r1 = r2
        L5f:
            r0.setVisibility(r1)
            boolean r0 = r4.i
            if (r0 == 0) goto L90
            com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel r0 = r4.h
            if (r0 == 0) goto L90
            com.netflix.mediaclient.acquisition.components.form2.edittext.IconFormViewEditText r0 = r5.e()
            r0.setVisibility(r3)
            com.netflix.mediaclient.acquisition.components.form2.edittext.IconFormViewEditText r0 = r5.e()
            com.netflix.mediaclient.acquisition.components.form2.edittext.FormViewEditTextViewModel r1 = r4.h
            r0.bind(r1)
            com.netflix.mediaclient.acquisition.components.form2.edittext.IconFormViewEditText r0 = r5.e()
            android.widget.EditText r0 = r0.getEditText()
            r1 = 6
            r0.setImeOptions(r1)
            com.netflix.mediaclient.acquisition.components.form2.edittext.IconFormViewEditText r0 = r5.e()
            android.view.View$OnClickListener r1 = r4.b
            r0.setOnIconClickListener(r1)
            goto L97
        L90:
            com.netflix.mediaclient.acquisition.components.form2.edittext.IconFormViewEditText r0 = r5.e()
            r0.setVisibility(r2)
        L97:
            com.netflix.mediaclient.acquisition.components.form2.edittext.IconFormViewEditText r5 = r5.e()
            boolean r0 = r4.f
            r5.setShowValidationState(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC6607cgW.e(o.cgW$a):void");
    }

    /* renamed from: o.cgW$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(a.class, SignupConstants.Field.VIDEO_TITLE, "getTitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "subtitle", "getSubtitle()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "description", "getDescription()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(a.class, "securityCodeEditText", "getSecurityCodeEditText()Lcom/netflix/mediaclient/acquisition/components/form2/edittext/IconFormViewEditText;", 0))};
        private final dsZ a = bIF.d(this, C6597cgM.e.b, false, 2, null);
        private final dsZ e = bIF.d(this, C6597cgM.e.d, false, 2, null);
        private final dsZ c = bIF.d(this, C6597cgM.e.c, false, 2, null);
        private final dsZ b = bIF.d(this, C6597cgM.e.e, false, 2, null);

        public final C1204Sr c() {
            return (C1204Sr) this.a.getValue(this, d[0]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.e.getValue(this, d[1]);
        }

        public final C1204Sr b() {
            return (C1204Sr) this.c.getValue(this, d[2]);
        }

        public final IconFormViewEditText e() {
            return (IconFormViewEditText) this.b.getValue(this, d[3]);
        }
    }
}
