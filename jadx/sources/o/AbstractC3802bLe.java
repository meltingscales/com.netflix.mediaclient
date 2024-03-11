package o;

import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import o.C3796bKz;

/* renamed from: o.bLe  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3802bLe extends AbstractC3336ax<c> {
    private Integer b;
    private TabLayout.OnTabSelectedListener c;
    private a d;

    @Override // o.AbstractC3073as
    public int a() {
        return C3796bKz.g.x;
    }

    public final void a_(TabLayout.OnTabSelectedListener onTabSelectedListener) {
        this.c = onTabSelectedListener;
    }

    public final void a_(a aVar) {
        this.d = aVar;
    }

    public final void d(Integer num) {
        this.b = num;
    }

    public final Integer i() {
        return this.b;
    }

    public final a k() {
        return this.d;
    }

    public final TabLayout.OnTabSelectedListener l() {
        return this.c;
    }

    @Override // o.AbstractC3336ax
    /* renamed from: b  reason: avoid collision after fix types in other method */
    public void e(c cVar) {
        List<d> b;
        C8632dsu.c((Object) cVar, "");
        Integer num = this.b;
        C1044Mm.e("TabLayoutModel", "bind active tab " + num);
        TabLayout c2 = cVar.c();
        if (c2.getTabCount() == 0) {
            a aVar = this.d;
            TabLayout.Tab tab = null;
            if (aVar != null && (b = aVar.b()) != null) {
                for (d dVar : b) {
                    TabLayout.Tab tag = c2.newTab().setText(dVar.e()).setTag(Integer.valueOf(dVar.b()));
                    C8632dsu.a(tag, "");
                    c2.addTab(tag);
                    if (this.b != null) {
                        int b2 = dVar.b();
                        Integer num2 = this.b;
                        if (num2 != null && b2 == num2.intValue()) {
                            tab = tag;
                        }
                    }
                }
            }
            if (tab != null) {
                c2.selectTab(tab);
            }
        }
        c2.clearOnTabSelectedListeners();
        TabLayout.OnTabSelectedListener onTabSelectedListener = this.c;
        if (onTabSelectedListener != null) {
            c2.addOnTabSelectedListener(onTabSelectedListener);
        }
    }

    @Override // o.AbstractC3336ax, o.AbstractC3073as
    /* renamed from: d */
    public void e(c cVar) {
        C8632dsu.c((Object) cVar, "");
        cVar.c().clearOnTabSelectedListeners();
        cVar.c().removeAllTabs();
    }

    /* renamed from: o.bLe$c */
    /* loaded from: classes4.dex */
    public static final class c extends bIG {
        static final /* synthetic */ dtC<Object>[] a = {dsA.c(new PropertyReference1Impl(c.class, "tabLayout", "getTabLayout()Lcom/google/android/material/tabs/TabLayout;", 0))};
        public static final int c = 8;
        private final dsZ d = bIF.d(this, C3796bKz.a.y, false, 2, null);

        public final TabLayout c() {
            return (TabLayout) this.d.getValue(this, a[0]);
        }
    }

    /* renamed from: o.bLe$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private final int a;
        private final CharSequence c;

        public final int b() {
            return this.a;
        }

        public final CharSequence e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.c, dVar.c) && this.a == dVar.a;
            }
            return false;
        }

        public int hashCode() {
            return (this.c.hashCode() * 31) + Integer.hashCode(this.a);
        }

        public String toString() {
            CharSequence charSequence = this.c;
            int i = this.a;
            return "TabItem(label=" + ((Object) charSequence) + ", tabType=" + i + ")";
        }

        public d(CharSequence charSequence, int i) {
            C8632dsu.c((Object) charSequence, "");
            this.c = charSequence;
            this.a = i;
        }
    }

    /* renamed from: o.bLe$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private final List<d> e;

        public final List<d> b() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C8632dsu.c(this.e, ((a) obj).e);
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            List<d> list = this.e;
            return "TabList(values=" + list + ")";
        }

        public a(List<d> list) {
            C8632dsu.c((Object) list, "");
            this.e = list;
        }
    }
}
