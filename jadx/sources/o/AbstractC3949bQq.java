package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.ResourcesCompat;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.AbstractC3949bQq;
import o.C1026Lt;
import o.C3895bOq;
import o.C9834xU;
import o.dpR;

/* renamed from: o.bQq  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3949bQq extends AbstractC3336ax<d> {
    private List<String> b;
    private boolean c;
    private String d;
    private String f;
    private String g;
    private String h;
    private Drawable i;
    private boolean j;

    @Override // o.AbstractC3073as
    public int a() {
        return C3895bOq.c.ai;
    }

    @Override // o.AbstractC3073as
    public int b(int i, int i2, int i3) {
        return i;
    }

    public final void b(List<String> list) {
        this.b = list;
    }

    public final void b(boolean z) {
        this.j = z;
    }

    public final void b_(Drawable drawable) {
        this.i = drawable;
    }

    public final void d(String str) {
        this.f = str;
    }

    public final List<String> i() {
        return this.b;
    }

    public final String k() {
        return this.d;
    }

    public final boolean l() {
        return this.j;
    }

    public final String m() {
        return this.h;
    }

    public final String n() {
        return this.g;
    }

    public final Drawable o() {
        return this.i;
    }

    public final String q() {
        return this.f;
    }

    public final void x_(String str) {
        this.d = str;
    }

    public final void y_(String str) {
        this.h = str;
    }

    public final void z_(String str) {
        this.g = str;
    }

    public AbstractC3949bQq() {
        List<String> i;
        i = C8569dql.i();
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
    @Override // o.AbstractC3336ax
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(final o.AbstractC3949bQq.d r19) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC3949bQq.e(o.bQq$d):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(final d dVar, final AbstractC3949bQq abstractC3949bQq, final List list, View view) {
        C8632dsu.c((Object) dVar, "");
        C8632dsu.c((Object) abstractC3949bQq, "");
        C8632dsu.c((Object) list, "");
        dVar.a().setClickable(false);
        if (abstractC3949bQq.c) {
            C1193Sg e = dVar.e();
            Context context = dVar.e().getContext();
            C8632dsu.a(context, "");
            e.setImageDrawable(abstractC3949bQq.a(context, C1026Lt.a.gl, C9834xU.c.k));
            C9702vQ.d(dVar.b(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.models.MoreDataRowModel$bind$5$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // o.drO
                public /* synthetic */ dpR invoke() {
                    a();
                    return dpR.c;
                }

                public final void a() {
                    AbstractC3949bQq.this.c = false;
                    dVar.a().setClickable(true);
                    AbstractC3949bQq.this.b(dVar, (List<String>) list);
                    dVar.r().sendAccessibilityEvent(8);
                }
            });
            return;
        }
        C1193Sg e2 = dVar.e();
        Context context2 = dVar.e().getContext();
        C8632dsu.a(context2, "");
        e2.setImageDrawable(abstractC3949bQq.a(context2, C1026Lt.a.gG, C9834xU.c.k));
        C9702vQ.e(dVar.b(), new drO<dpR>() { // from class: com.netflix.mediaclient.ui.games.impl.gdp.models.MoreDataRowModel$bind$5$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            public /* synthetic */ dpR invoke() {
                d();
                return dpR.c;
            }

            public final void d() {
                AbstractC3949bQq.this.c = true;
                dVar.a().setClickable(true);
                AbstractC3949bQq.this.b(dVar, (List<String>) list);
                dVar.r().sendAccessibilityEvent(8);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(d dVar, List<String> list) {
        String d2;
        List b;
        View r = dVar.r();
        List<String> list2 = this.b;
        if (list2 != null && !list2.isEmpty()) {
            if (this.c) {
                b = C8576dqs.b((Collection<? extends CharSequence>) ((Collection<? extends Object>) list), dVar.b().getText());
                list = C8576dqs.b((Collection<? extends String>) ((Collection<? extends Object>) b), dVar.r().getResources().getString(com.netflix.mediaclient.ui.R.o.v));
            } else {
                String string = dVar.r().getResources().getString(com.netflix.mediaclient.ui.R.o.y);
                C8632dsu.a(string, "");
                list = C8576dqs.b((Collection<? extends String>) ((Collection<? extends Object>) list), string);
            }
        }
        d2 = C8576dqs.d(list, null, null, null, 0, null, null, 63, null);
        r.setContentDescription(d2);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(d dVar) {
        C8632dsu.c((Object) dVar, "");
        ViewGroup a = dVar.a();
        a.setOnClickListener(null);
        a.setClickable(false);
        dVar.b().setText((CharSequence) null);
        this.c = false;
        dVar.b().setVisibility(8);
        dVar.e().setVisibility(8);
        C1193Sg e = dVar.e();
        Context context = dVar.e().getContext();
        C8632dsu.a(context, "");
        e.setImageDrawable(a(context, C1026Lt.a.gl, C9834xU.c.k));
        dVar.e().setContentDescription(null);
        super.b((AbstractC3949bQq) dVar);
    }

    private final Drawable a(Context context, int i, int i2) {
        Drawable mutate;
        Drawable drawable = ResourcesCompat.getDrawable(context.getResources(), i, context.getTheme());
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            return null;
        }
        mutate.setTint(context.getResources().getColor(i2, context.getTheme()));
        return mutate;
    }

    /* renamed from: o.bQq$d */
    /* loaded from: classes4.dex */
    public static final class d extends bIG {
        static final /* synthetic */ dtC<Object>[] d = {dsA.c(new PropertyReference1Impl(d.class, "parent", "getParent()Landroid/view/ViewGroup;", 0)), dsA.c(new PropertyReference1Impl(d.class, "keyText", "getKeyText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "valueText", "getValueText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "valueIcon", "getValueIcon()Lcom/netflix/mediaclient/android/widget/NetflixImageView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "expandButton", "getExpandButton()Lcom/netflix/mediaclient/android/widget/NetflixImageButton;", 0)), dsA.c(new PropertyReference1Impl(d.class, "moreDetailsText", "getMoreDetailsText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "descriptionText", "getDescriptionText()Lcom/netflix/mediaclient/android/widget/NetflixTextView;", 0)), dsA.c(new PropertyReference1Impl(d.class, "separator", "getSeparator()Landroid/view/View;", 0))};
        private final dsZ h = bIF.d(this, C3895bOq.b.R, false, 2, null);
        private final dsZ e = bIF.d(this, C3895bOq.b.F, false, 2, null);
        private final dsZ f = bIF.d(this, C3895bOq.b.aj, false, 2, null);
        private final dsZ g = bIF.d(this, C3895bOq.b.ak, false, 2, null);
        private final dsZ a = bIF.d(this, C3895bOq.b.l, false, 2, null);
        private final dsZ c = bIF.d(this, C3895bOq.b.Q, false, 2, null);
        private final dsZ b = bIF.d(this, C3895bOq.b.f, false, 2, null);
        private final dsZ j = bIF.d(this, C3895bOq.b.ac, false, 2, null);

        public final ViewGroup a() {
            return (ViewGroup) this.h.getValue(this, d[0]);
        }

        public final C1204Sr d() {
            return (C1204Sr) this.e.getValue(this, d[1]);
        }

        public final C1204Sr g() {
            return (C1204Sr) this.f.getValue(this, d[2]);
        }

        public final NetflixImageView j() {
            return (NetflixImageView) this.g.getValue(this, d[3]);
        }

        public final C1193Sg e() {
            return (C1193Sg) this.a.getValue(this, d[4]);
        }

        public final C1204Sr b() {
            return (C1204Sr) this.c.getValue(this, d[5]);
        }

        public final C1204Sr c() {
            return (C1204Sr) this.b.getValue(this, d[6]);
        }

        public final View f() {
            return (View) this.j.getValue(this, d[7]);
        }
    }
}
