package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.netflix.mediaclient.ui.collectphone.api.CollectPhone;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC5475bzU;
import o.C5473bzS;

/* renamed from: o.bAm  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3509bAm extends AbstractC3336ax<d> {
    private CollectPhone.d b;
    private C9935zP d;
    private boolean f;
    public boolean c = true;
    private final e h = new e();

    @Override // o.AbstractC3073as
    public int a() {
        return C5473bzS.e.d;
    }

    public final void a_(CollectPhone.d dVar) {
        this.b = dVar;
    }

    public final void c_(boolean z) {
        this.f = z;
    }

    public final void d(C9935zP c9935zP) {
        this.d = c9935zP;
    }

    public final C9935zP i() {
        return this.d;
    }

    public final boolean m() {
        return this.f;
    }

    public final CollectPhone.d n() {
        return this.b;
    }

    /* renamed from: o.bAm$e */
    /* loaded from: classes4.dex */
    public static final class e implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        e() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            C9935zP i = AbstractC3509bAm.this.i();
            if (i != null) {
                i.b(AbstractC5475bzU.class, new AbstractC5475bzU.c((editable == null || (r3 = editable.toString()) == null) ? "" : ""));
            }
        }
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        super.e((AbstractC3509bAm) dVar);
        final C9935zP c9935zP = this.d;
        if (c9935zP == null) {
            return;
        }
        CollectPhone.d dVar2 = this.b;
        if (dVar2 != null) {
            dVar.c().setIconImage(C6325cbF.a.b(dVar2.b()));
            cWU c = dVar.c();
            String string = dVar.c().getContext().getString(com.netflix.mediaclient.acquisition.R.string.label_country_code_prefix, dVar2.e());
            C8632dsu.a(string, "");
            c.setDropDownText(string);
        }
        dVar.c().setErrorText(com.netflix.mediaclient.ui.R.o.he);
        dVar.c().d(!this.c && this.f);
        dVar.d().addTextChangedListener(this.h);
        dVar.d().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.bAn
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean d2;
                d2 = AbstractC3509bAm.d(C9935zP.this, textView, i, keyEvent);
                return d2;
            }
        });
        dVar.b().setOnClickListener(new View.OnClickListener() { // from class: o.bAr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC3509bAm.a(C9935zP.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(C9935zP c9935zP, TextView textView, int i, KeyEvent keyEvent) {
        C8632dsu.c((Object) c9935zP, "");
        if (i == 6 || (keyEvent != null && keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 66)) {
            c9935zP.b(AbstractC5475bzU.class, AbstractC5475bzU.g.d);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C9935zP c9935zP, View view) {
        C8632dsu.c((Object) c9935zP, "");
        c9935zP.b(AbstractC5475bzU.class, AbstractC5475bzU.a.a);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        super.b((AbstractC3509bAm) dVar);
        dVar.c().setIconImage(null);
        dVar.d().removeTextChangedListener(this.h);
        dVar.d().setOnEditorActionListener(null);
        dVar.b().setOnClickListener(null);
    }

    /* renamed from: o.bAm$d */
    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(d.class, "phoneInput", "getPhoneInput()Lcom/netflix/mediaclient/ui/ums/IconDropDownEditText;", 0)), dsA.c(new PropertyReference1Impl(d.class, "editText", "getEditText()Landroid/widget/EditText;", 0)), dsA.c(new PropertyReference1Impl(d.class, "countryPicker", "getCountryPicker()Landroid/view/View;", 0))};
        private final dsZ a = bIF.d(this, C5473bzS.a.c, false, 2, null);
        private final dsZ c = bIF.d(this, com.netflix.mediaclient.acquisition.R.id.editText, false, 2, null);
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.bo, false, 2, null);

        public final cWU c() {
            return (cWU) this.a.getValue(this, d[0]);
        }

        public final EditText d() {
            return (EditText) this.c.getValue(this, d[1]);
        }

        public final View b() {
            return (View) this.b.getValue(this, d[2]);
        }
    }
}
