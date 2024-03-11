package o;

import android.view.View;
import androidx.core.widget.TextViewCompat;
import com.netflix.mediaclient.acquisition.components.signupButton.NetflixSignupButton;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC5475bzU;
import o.C5473bzS;
import o.C9834xU;

/* renamed from: o.bAt  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3516bAt extends AbstractC3336ax<a> {
    private C9935zP b;
    public boolean d;
    private String h = "";
    public boolean c = true;

    @Override // o.AbstractC3073as
    public int a() {
        return C5473bzS.e.c;
    }

    public final void a(String str) {
        C8632dsu.c((Object) str, "");
        this.h = str;
    }

    public final void c(C9935zP c9935zP) {
        this.b = c9935zP;
    }

    public final C9935zP i() {
        return this.b;
    }

    public final String n() {
        return this.h;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(a aVar) {
        C8632dsu.c((Object) aVar, "");
        super.e((AbstractC3516bAt) aVar);
        TextViewCompat.setTextAppearance(aVar.d().getButton(), C5473bzS.b.d);
        aVar.d().updateTextAndButtonColor(C9834xU.c.I, !this.c ? C9834xU.c.f13913o : com.netflix.mediaclient.ui.R.c.p);
        aVar.d().setText(this.h);
        aVar.d().setLoading(this.d);
        aVar.d().setEnabled(this.c && !this.d);
        aVar.d().setOnClickListener(new View.OnClickListener() { // from class: o.bAs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbstractC3516bAt.b(AbstractC3516bAt.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(AbstractC3516bAt abstractC3516bAt, View view) {
        C8632dsu.c((Object) abstractC3516bAt, "");
        C9935zP c9935zP = abstractC3516bAt.b;
        if (c9935zP != null) {
            c9935zP.b(AbstractC5475bzU.class, AbstractC5475bzU.g.d);
        }
    }

    /* renamed from: o.bAt$a */
    /* loaded from: classes4.dex */
    public static final class a extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(a.class, "submitButton", "getSubmitButton()Lcom/netflix/mediaclient/acquisition/components/signupButton/NetflixSignupButton;", 0))};
        private final dsZ b = bIF.d(this, C5473bzS.a.g, false, 2, null);

        public final NetflixSignupButton d() {
            return (NetflixSignupButton) this.b.getValue(this, e[0]);
        }
    }
}
