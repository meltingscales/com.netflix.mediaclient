package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.netflix.mediaclient.ui.epoxy.models.HorizontalGravity;
import com.netflix.mediaclient.ui.experience.BrowseExperience;
import com.netflix.mediaclient.util.ViewUtils;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C9834xU;

/* loaded from: classes4.dex */
public abstract class bIR extends AbstractC3336ax<e> {
    public View.OnClickListener b;
    private HorizontalGravity c = HorizontalGravity.a;

    @Override // o.AbstractC3073as
    public int a() {
        return com.netflix.mediaclient.ui.R.i.bp;
    }

    public final HorizontalGravity l() {
        return this.c;
    }

    public final View.OnClickListener i() {
        View.OnClickListener onClickListener = this.b;
        if (onClickListener != null) {
            return onClickListener;
        }
        C8632dsu.d("");
        return null;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        ViewGroup.LayoutParams layoutParams = eVar.e().getLayoutParams();
        C8632dsu.d(layoutParams);
        ((FrameLayout.LayoutParams) layoutParams).gravity = this.c.b();
        eVar.e().setOnClickListener(i());
    }

    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        private final dsZ b = bIF.d(this, com.netflix.mediaclient.ui.R.g.fn, false, 2, null);
        static final /* synthetic */ dtC<Object>[] c = {dsA.c(new PropertyReference1Impl(e.class, "button", "getButton()Lcom/netflix/mediaclient/android/widget/NetflixTextButton;", 0))};
        public static final int a = 8;

        public final C1203Sq e() {
            return (C1203Sq) this.b.getValue(this, c[0]);
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            if (BrowseExperience.a()) {
                e(e());
            }
        }

        private final void e(C1203Sq c1203Sq) {
            c1203Sq.e(C9834xU.o.e);
            ViewGroup.LayoutParams layoutParams = c1203Sq.getLayoutParams();
            layoutParams.height = c1203Sq.getResources().getDimensionPixelOffset(C9834xU.a.p);
            c1203Sq.setLayoutParams(layoutParams);
            ViewUtils.b(c1203Sq, C9834xU.a.ab);
            Drawable drawable = c1203Sq.getResources().getDrawable(com.netflix.mediaclient.ui.R.e.L);
            C1332Xp c1332Xp = C1332Xp.b;
            int applyDimension = (int) TypedValue.applyDimension(1, 32, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            int applyDimension2 = (int) TypedValue.applyDimension(1, 8, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
            drawable.setBounds(applyDimension2, 0, applyDimension + applyDimension2, applyDimension);
            c1203Sq.setCompoundDrawables(null, null, drawable, null);
            c1203Sq.setCompoundDrawablePadding(applyDimension2);
        }
    }
}
