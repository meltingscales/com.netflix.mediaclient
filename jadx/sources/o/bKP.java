package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import o.C3796bKz;
import o.C8632dsu;
import o.bKJ;
import o.bKP;

/* loaded from: classes4.dex */
public abstract class bKP extends AbstractC3336ax<d> {
    private bKJ.c b;
    private int c;
    private List<bKJ.e> d;
    private int g;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.y;
    }

    public final void b(bKJ.c cVar) {
        this.b = cVar;
    }

    public final void c(List<bKJ.e> list) {
        C8632dsu.c((Object) list, "");
        this.d = list;
    }

    public final List<bKJ.e> i() {
        return this.d;
    }

    public final bKJ.c k() {
        return this.b;
    }

    public final int l() {
        return this.g;
    }

    public final int n() {
        return this.c;
    }

    public bKP() {
        List<bKJ.e> i;
        i = C8569dql.i();
        this.d = i;
        this.g = C3796bKz.g.L;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(final d dVar) {
        C8632dsu.c((Object) dVar, "");
        drM<ViewGroup, TextView> drm = new drM<ViewGroup, TextView>() { // from class: com.netflix.mediaclient.ui.epoxymodels.api.ScrollableTabBarModel$bind$textViewProvider$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: b */
            public final TextView invoke(ViewGroup viewGroup) {
                C8632dsu.c((Object) viewGroup, "");
                View inflate = LayoutInflater.from(bKP.d.this.a().getContext()).inflate(this.l(), viewGroup, false);
                C8632dsu.d(inflate);
                return (TextView) inflate;
            }
        };
        bKJ a = dVar.a();
        C1332Xp c1332Xp = C1332Xp.b;
        a.setItemDividerWidth((int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics()));
        dVar.a().setSectionIconsAndTitles(this.d, drm, this.c);
        dVar.a().setTabSelectedListener(this.b);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        super.b((bKP) dVar);
        dVar.a().setTabSelectedListener(null);
    }

    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        public bKJ e;

        public final void c(bKJ bkj) {
            C8632dsu.c((Object) bkj, "");
            this.e = bkj;
        }

        public final bKJ a() {
            bKJ bkj = this.e;
            if (bkj != null) {
                return bkj;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            super.a(view);
            c((bKJ) view);
        }
    }
}
