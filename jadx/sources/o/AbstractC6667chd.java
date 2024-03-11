package o;

import com.netflix.mediaclient.acquisition.components.tou.TermsOfUseView;
import com.netflix.mediaclient.acquisition.components.tou.TouPaymentViewBinding;
import com.netflix.mediaclient.acquisition.components.tou.TouPaymentViewModel;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6597cgM;

/* renamed from: o.chd  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6667chd extends AbstractC3336ax<b> {
    private boolean b;
    public TouPaymentViewModel d;

    @Override // o.AbstractC3073as
    public int a() {
        return C6597cgM.a.h;
    }

    public final void b(boolean z) {
        this.b = z;
    }

    public final boolean i() {
        return this.b;
    }

    public final TouPaymentViewModel n() {
        TouPaymentViewModel touPaymentViewModel = this.d;
        if (touPaymentViewModel != null) {
            return touPaymentViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: d */
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.d().setVisibility(0);
        new TouPaymentViewBinding(bVar.d()).bind(n());
        if (this.b) {
            bVar.d().updateErrorVisibility();
        }
    }

    /* renamed from: o.chd$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(b.class, "touView", "getTouView()Lcom/netflix/mediaclient/acquisition/components/tou/TermsOfUseView;", 0))};
        private final dsZ a = bIF.d(this, C6597cgM.e.i, false, 2, null);

        public final TermsOfUseView d() {
            return (TermsOfUseView) this.a.getValue(this, c[0]);
        }
    }
}
