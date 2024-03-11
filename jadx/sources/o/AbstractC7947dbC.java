package o;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C7939dav;
import o.C9959zn;

/* renamed from: o.dbC  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7947dbC extends AbstractC3336ax<c> {
    private C9959zn.e b;
    private List<String> c;
    private View.OnClickListener d;

    @Override // o.AbstractC3073as
    public int a() {
        return C7939dav.a.R;
    }

    public final void b(View.OnClickListener onClickListener) {
        this.d = onClickListener;
    }

    public final void c(List<String> list) {
        this.c = list;
    }

    public final View.OnClickListener i() {
        return this.d;
    }

    public final C9959zn.e k() {
        return this.b;
    }

    public final List<String> m() {
        return this.c;
    }

    /* renamed from: o.dbC$b */
    /* loaded from: classes5.dex */
    public static final class b implements C9959zn.d {
        private final List<String> a;
        final /* synthetic */ AbstractC7947dbC e;

        @Override // o.C9959zn.d
        public void e(List<Integer> list) {
            C8632dsu.c((Object) list, "");
        }

        b(List<String> list, AbstractC7947dbC abstractC7947dbC) {
            this.e = abstractC7947dbC;
            this.a = list;
        }

        @Override // o.C9959zn.d
        public void d(int i) {
            C9959zn.d.e.c(this, i);
        }

        @Override // o.C9959zn.d
        /* renamed from: c */
        public String a(int i) {
            return this.a.get(i);
        }

        @Override // o.C9959zn.d
        public int c() {
            return this.a.size();
        }

        @Override // o.C9959zn.d
        public boolean e(int i) {
            return this.e.k() != null;
        }
    }

    @Override // o.AbstractC3336ax
    public void e(c cVar) {
        dpR dpr;
        C8632dsu.c((Object) cVar, "");
        List<String> list = this.c;
        if (list != null) {
            cVar.a().setVisibility(0);
            cVar.a().setAdapter(new b(list, this));
            dpr = dpR.c;
        } else {
            dpr = null;
        }
        if (dpr == null) {
            cVar.a().setAdapter(null);
            cVar.a().setVisibility(8);
        }
        cVar.a().setOnClickListener(this.d);
        cVar.a().setOnTagClickListener(this.b);
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.a().setOnClickListener(null);
        cVar.a().setOnTagClickListener(null);
        cVar.a().setAdapter(null);
        super.b((AbstractC7947dbC) cVar);
    }

    /* renamed from: o.dbC$c */
    /* loaded from: classes5.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] e = {dsA.c(new PropertyReference1Impl(c.class, "tagLayout", "getTagLayout()Lcom/netflix/android/widgetry/widget/TagsLayout;", 0))};
        private final dsZ b = bIF.c(this, C7939dav.d.z, true);

        public final C9959zn a() {
            return (C9959zn) this.b.getValue(this, e[0]);
        }
    }
}
