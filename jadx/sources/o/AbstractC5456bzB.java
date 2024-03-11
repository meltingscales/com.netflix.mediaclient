package o;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C5503bzw;

/* renamed from: o.bzB  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5456bzB extends AbstractC3336ax<a> {
    private String b;
    private View.OnClickListener c;
    private String d;

    @Override // o.AbstractC3073as
    public int a() {
        return C5503bzw.d.d;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void d(String str) {
        this.d = str;
    }

    public final void e(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }

    public final String i() {
        return this.d;
    }

    public final View.OnClickListener k() {
        return this.c;
    }

    public final String o() {
        return this.b;
    }

    @Override // o.AbstractC3336ax
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        aVar.d().setText(this.d);
        aVar.d().setMovementMethod(null);
        aVar.d().setKeyListener(null);
        aVar.b().setHint(this.b);
        View a2 = aVar.a();
        View.OnClickListener onClickListener = this.c;
        a2.setOnClickListener(onClickListener);
        a2.setClickable(onClickListener != null);
    }

    /* renamed from: o.bzB$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(a.class, "entryContainer", "getEntryContainer()Landroid/view/View;", 0)), dsA.c(new PropertyReference1Impl(a.class, "textInputLayout", "getTextInputLayout()Lcom/google/android/material/textfield/TextInputLayout;", 0)), dsA.c(new PropertyReference1Impl(a.class, "editText", "getEditText()Landroid/widget/EditText;", 0))};
        private final dsZ d = bIF.d(this, C5503bzw.c.b, false, 2, null);
        private final dsZ a = bIF.d(this, C5503bzw.c.c, false, 2, null);
        private final dsZ e = bIF.d(this, C5503bzw.c.e, false, 2, null);

        public final View a() {
            return (View) this.d.getValue(this, c[0]);
        }

        public final TextInputLayout b() {
            return (TextInputLayout) this.a.getValue(this, c[1]);
        }

        public final EditText d() {
            return (EditText) this.e.getValue(this, c[2]);
        }
    }
}
