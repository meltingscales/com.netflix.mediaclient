package o;

import android.view.View;
import com.netflix.mediaclient.android.widget.NetflixTagsTextView;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;

/* renamed from: o.bLb  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3799bLb extends AbstractC3336ax<e> {
    private List<String> b;
    private View.OnClickListener c;
    private Integer d;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.D;
    }

    public final void d(Integer num) {
        this.d = num;
    }

    public final void d(List<String> list) {
        this.b = list;
    }

    public final Integer i() {
        return this.d;
    }

    public final List<String> l() {
        return this.b;
    }

    public final View.OnClickListener m() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    public void e(e eVar) {
        dpR dpr;
        C8632dsu.c((Object) eVar, "");
        List<String> list = this.b;
        if (list != null) {
            eVar.b().setVisibility(0);
            eVar.b().setTags(list);
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            eVar.b().setVisibility(8);
        }
        NetflixTagsTextView b = eVar.b();
        Integer num = this.d;
        b.setSeparatorColor(num != null ? num.intValue() : eVar.d());
        NetflixTagsTextView b2 = eVar.b();
        View.OnClickListener onClickListener = this.c;
        b2.setOnClickListener(onClickListener);
        b2.setClickable(onClickListener != null);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: c */
    public void e(e eVar) {
        C8632dsu.c((Object) eVar, "");
        NetflixTagsTextView b = eVar.b();
        b.setOnClickListener(null);
        b.setClickable(false);
        super.b((AbstractC3799bLb) eVar);
    }

    /* renamed from: o.bLb$e */
    /* loaded from: classes4.dex */
    public static final class e extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(e.class, "tagView", "getTagView()Lcom/netflix/mediaclient/android/widget/NetflixTagsTextView;", 0))};
        public static final int b = 8;
        private int c;
        private final dsZ d = bIF.c(this, C3796bKz.a.i, true);

        public final int d() {
            return this.c;
        }

        public final NetflixTagsTextView b() {
            return (NetflixTagsTextView) this.d.getValue(this, a[0]);
        }

        @Override // o.bIG
        public void a(View view) {
            C8632dsu.c((Object) view, "");
            this.c = b().a();
        }
    }
}
