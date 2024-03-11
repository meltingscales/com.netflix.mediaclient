package o;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.recyclerview.widget.PagerSnapHelper;
import com.airbnb.epoxy.Carousel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C1219Tg;
import o.C3796bKz;

/* renamed from: o.bJl  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3755bJl extends AbstractC3336ax<e> implements InterfaceC2023aX {
    private final List<AbstractC3073as<?>> b;
    private int c = -1;
    private int d;
    private float i;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.c;
    }

    public final void c(int i) {
        this.c = i;
    }

    public final void e(int i) {
        this.d = i;
    }

    public final int i() {
        return this.c;
    }

    public final int k() {
        return this.d;
    }

    public final float l() {
        return this.i;
    }

    public AbstractC3755bJl() {
        C1332Xp c1332Xp = C1332Xp.b;
        this.d = (int) TypedValue.applyDimension(1, -20, ((Context) C1332Xp.b(Context.class)).getResources().getDisplayMetrics());
        this.i = 1.0f;
        this.b = new ArrayList();
    }

    @Override // o.InterfaceC2023aX
    public void add(AbstractC3073as<?> abstractC3073as) {
        C8632dsu.c((Object) abstractC3073as, "");
        this.b.add(abstractC3073as);
    }

    @Override // o.AbstractC3336ax
    /* renamed from: c */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        eVar.c().setModels(this.b);
        eVar.c().setOverScrollMode(2);
        eVar.c().setNumViewsToShowOnScreen(this.i);
        eVar.b().c(this.c);
        eVar.b().d(this.d);
    }

    /* renamed from: o.bJl$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        private final dsZ a = bIF.d(this, C3796bKz.a.f, false, 2, null);
        public C1219Tg c;
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(e.class, "carousel", "getCarousel()Lcom/airbnb/epoxy/Carousel;", 0))};
        public static final int d = 8;

        public final void b(C1219Tg c1219Tg) {
            C8632dsu.c((Object) c1219Tg, "");
            this.c = c1219Tg;
        }

        public final Carousel c() {
            return (Carousel) this.a.getValue(this, e[0]);
        }

        public final C1219Tg b() {
            C1219Tg c1219Tg = this.c;
            if (c1219Tg != null) {
                return c1219Tg;
            }
            C8632dsu.d("");
            return null;
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            Carousel c = c();
            c.setPadding(0, 0, 0, 0);
            c.setItemSpacingDp(0);
            c.setOnFlingListener(null);
            new PagerSnapHelper().attachToRecyclerView(c);
            b(C1219Tg.e.a(C1219Tg.a, c, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 4094, null));
            new C1619aI().d(c);
        }
    }
}
