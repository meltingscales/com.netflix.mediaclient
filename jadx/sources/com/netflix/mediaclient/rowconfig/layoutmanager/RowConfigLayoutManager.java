package com.netflix.mediaclient.rowconfig.layoutmanager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import o.C1045Mp;
import o.C1596aHd;
import o.C1729aMb;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.aLX;
import o.dqE;
import o.dtQ;

/* loaded from: classes3.dex */
public abstract class RowConfigLayoutManager extends FillerGridLayoutManager {
    public static final d d = new d(null);
    private C1729aMb b;
    private final boolean c;
    private final boolean e;
    private Integer f;
    private Pair<Integer, Integer> j;

    protected abstract void b(View view);

    public final void c(C1729aMb c1729aMb) {
        C8632dsu.c((Object) c1729aMb, "");
        this.b = c1729aMb;
    }

    public /* synthetic */ RowConfigLayoutManager(Context context, int i, C1729aMb c1729aMb, boolean z, boolean z2, int i2, C8627dsp c8627dsp) {
        this(context, i, c1729aMb, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? true : z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RowConfigLayoutManager(Context context, int i, C1729aMb c1729aMb, boolean z, boolean z2) {
        super(context, 1, i, false, false, 16, null);
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c1729aMb, "");
        this.b = c1729aMb;
        this.c = z;
        this.e = z2;
    }

    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("RowConfigLayoutManager");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Pair<Integer, Integer> c(int i) {
        int width;
        Map d2;
        Map k;
        Throwable th;
        if (getWidth() == 0) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("RowConfigLayoutManager.width is 0, please report", null, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    c1596aHd.a(errorType.c() + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a = dVar.a();
            if (a != null) {
                a.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
        Pair<Integer, Integer> pair = this.j;
        if (pair != null) {
            int width2 = getWidth();
            Integer num = this.f;
            if (num != null && width2 == num.intValue()) {
                return pair;
            }
        }
        int a2 = this.e ? this.b.a() : 0;
        int i2 = this.b.i() * 2;
        if (this.c && this.b.l() > 0.0f) {
            int width3 = (((getWidth() - a2) - ((int) (this.b.l() * ((width / this.b.m()) - i2)))) / this.b.m()) - i2;
            float f = i;
            return new Pair<>(Integer.valueOf((width3 * i) + (this.b.i() * 2 * (i - 1))), Integer.valueOf((int) ((width3 / (this.b.d() * f)) * f)));
        }
        float width4 = ((getWidth() - (a2 * 2)) - (i2 * (this.b.m() + 1))) / this.b.m();
        return new Pair<>(Integer.valueOf((int) width4), Integer.valueOf((int) (width4 / this.b.d())));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void addView(View view, int i) {
        dtQ<View> children;
        C8632dsu.c((Object) view, "");
        if (this.b.d() > 0.0f) {
            Object tag = view.getTag(aLX.a.e);
            Boolean bool = Boolean.TRUE;
            if (C8632dsu.c(tag, bool)) {
                b(view);
            } else if (C8632dsu.c(view.getTag(aLX.a.a), bool)) {
                View view2 = null;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup != null && (children = ViewGroupKt.getChildren(viewGroup)) != null) {
                    Iterator<View> it = children.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        View next = it.next();
                        if (C8632dsu.c(next.getTag(aLX.a.e), Boolean.TRUE)) {
                            view2 = next;
                            break;
                        }
                    }
                    View view3 = view2;
                    if (view3 != null) {
                        b(view3);
                        ((ViewGroup) view).getLayoutParams().width = view3.getLayoutParams().width;
                    }
                }
            }
        }
        super.addView(view, i);
    }
}
