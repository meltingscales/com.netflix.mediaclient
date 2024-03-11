package o;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netflix.mediaclient.ui.epoxy.models.HorizontalGravity;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes4.dex */
public abstract class bIL extends AbstractC3336ax<d> {
    public CharSequence b;
    private HorizontalGravity c = HorizontalGravity.a;
    private Integer d;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.ab;
    }

    public final Integer i() {
        return this.d;
    }

    public final HorizontalGravity o() {
        return this.c;
    }

    public final CharSequence m() {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            return charSequence;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: a */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        dVar.e().setText(m());
        ViewGroup.LayoutParams layoutParams = dVar.e().getLayoutParams();
        C8632dsu.d(layoutParams);
        ((FrameLayout.LayoutParams) layoutParams).gravity = this.c.b();
    }

    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        static final /* synthetic */ dtC<Object>[] b = {dsA.c(new PropertyReference1Impl(d.class, "text", "getText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0))};
        public static final int c = 8;
        private final dsZ a = bIF.d(this, com.netflix.mediaclient.ui.R.g.gn, false, 2, null);

        public final C1204Sr e() {
            return (C1204Sr) this.a.getValue(this, b[0]);
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            if (BrowseExperience.e()) {
                e().setTextColor(e().getResources().getColor(com.netflix.mediaclient.ui.R.c.a));
                e().setTypeface(C1336Xt.e((Activity) C9737vz.b(e().getContext(), Activity.class)));
            }
        }
    }
}
