package o;

import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesView;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewBinding;
import com.netflix.mediaclient.acquisition.components.koreaLegal.KoreaCheckBoxesViewModel;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C6597cgM;

/* renamed from: o.cgS  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6603cgS extends AbstractC3336ax<b> {
    public KoreaCheckBoxesViewModel b;
    private boolean d;

    @Override // o.AbstractC3073as
    public int a() {
        return C6597cgM.a.c;
    }

    public final void b(boolean z) {
        this.d = z;
    }

    public final boolean n() {
        return this.d;
    }

    public final KoreaCheckBoxesViewModel i() {
        KoreaCheckBoxesViewModel koreaCheckBoxesViewModel = this.b;
        if (koreaCheckBoxesViewModel != null) {
            return koreaCheckBoxesViewModel;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    public void e(b bVar) {
        C8632dsu.c((Object) bVar, "");
        bVar.a().setVisibility(i().getShowKoreaCheckBoxes() ? 0 : 8);
        new KoreaCheckBoxesViewBinding(bVar.a()).bind(i());
        if (this.d) {
            bVar.a().hasAcceptedRequiredCheckBoxes();
        }
    }

    /* renamed from: o.cgS$b */
    /* loaded from: classes4.dex */
    public static final class b extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(b.class, "koreaCheckboxes", "getKoreaCheckboxes()Lcom/netflix/mediaclient/acquisition/components/koreaLegal/KoreaCheckBoxesView;", 0))};
        private final dsZ e = bIF.d(this, C6597cgM.e.a, false, 2, null);

        public final KoreaCheckBoxesView a() {
            return (KoreaCheckBoxesView) this.e.getValue(this, b[0]);
        }
    }
}
