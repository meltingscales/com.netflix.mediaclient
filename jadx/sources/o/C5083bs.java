package o;

import android.content.Context;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.airbnb.epoxy.preload.EpoxyPreloadException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: o.bs  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5083bs {
    private final Map<e, List<C5454bz<?>>> a;
    private final drX<Context, RuntimeException, dpR> b;
    private final Z e;

    /* JADX WARN: Multi-variable type inference failed */
    public C5083bs(Z z, drX<? super Context, ? super RuntimeException, dpR> drx) {
        C8632dsu.c((Object) z, "");
        C8632dsu.c((Object) drx, "");
        this.e = z;
        this.b = drx;
        this.a = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bs$e */
    /* loaded from: classes2.dex */
    public static final class e {
        private final Class<? extends AbstractC3073as<?>> a;
        private final int b;
        private final Object d;
        private final int e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return C8632dsu.c(this.a, eVar.a) && this.e == eVar.e && this.b == eVar.b && C8632dsu.c(this.d, eVar.d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.a.hashCode();
            int hashCode2 = Integer.hashCode(this.e);
            int hashCode3 = Integer.hashCode(this.b);
            Object obj = this.d;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "CacheKey(epoxyModelClass=" + this.a + ", spanSize=" + this.e + ", viewType=" + this.b + ", signature=" + this.d + ')';
        }

        public e(Class<? extends AbstractC3073as<?>> cls, int i, int i2, Object obj) {
            C8632dsu.c((Object) cls, "");
            this.a = cls;
            this.e = i;
            this.b = i2;
            this.d = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends AbstractC3073as<?>, U extends InterfaceC5295bw, P extends InterfaceC5136bt> List<C5454bz<U>> a(AbstractC4765bm<T, U, P> abstractC4765bm, T t, int i) {
        List<C5454bz<U>> i2;
        C8632dsu.c((Object) abstractC4765bm, "");
        C8632dsu.c((Object) t, "");
        e b = b((AbstractC4765bm<AbstractC4765bm<T, U, P>, ?, ?>) abstractC4765bm, (AbstractC4765bm<T, U, P>) t, i);
        Map<e, List<C5454bz<?>>> map = this.a;
        Object obj = map.get(b);
        if (obj == null) {
            obj = c(abstractC4765bm, t, b);
            map.put(b, obj);
        }
        List<C5454bz<U>> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            i2 = C8569dql.i();
            return i2;
        }
        return list;
    }

    private final <T extends AbstractC3073as<?>> e b(AbstractC4765bm<T, ?, ?> abstractC4765bm, T t, int i) {
        return new e(t.getClass(), this.e.g() ? t.e(this.e.b(), i, this.e.getItemCount()) : 1, C1969aV.c(t), abstractC4765bm.a(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends AbstractC3073as<?>, U extends InterfaceC5295bw, P extends InterfaceC5136bt> List<C5454bz<U>> c(AbstractC4765bm<T, U, P> abstractC4765bm, T t, e eVar) {
        C1511aE c1511aE;
        View view;
        List<View> e2;
        C2375af a = C1969aV.a(this.e);
        C8632dsu.a(a, "");
        Iterator<C1511aE> it = a.iterator();
        while (true) {
            if (!it.hasNext()) {
                c1511aE = null;
                break;
            }
            c1511aE = it.next();
            C1511aE c1511aE2 = c1511aE;
            AbstractC3073as<?> a2 = c1511aE2.a();
            if (a2.getClass() == t.getClass() && ViewCompat.isAttachedToWindow(c1511aE2.itemView) && ViewCompat.isLaidOut(c1511aE2.itemView)) {
                C8632dsu.d(a2);
                if (C8632dsu.c(b((AbstractC4765bm<AbstractC4765bm<T, U, P>, ?, ?>) abstractC4765bm, (AbstractC4765bm<T, U, P>) a2, c1511aE2.getAdapterPosition()), eVar)) {
                    break;
                }
            }
        }
        C1511aE c1511aE3 = c1511aE;
        if (c1511aE3 == null || (view = c1511aE3.itemView) == null) {
            return null;
        }
        Object b = C1969aV.b(c1511aE3);
        if (!abstractC4765bm.a().isEmpty()) {
            e2 = b(view, abstractC4765bm.a(), (List<Integer>) t);
        } else if (view instanceof InterfaceC4977bq) {
            e2 = ((InterfaceC4977bq) view).e();
        } else {
            e2 = b instanceof InterfaceC4977bq ? ((InterfaceC4977bq) b).e() : C8569dql.i();
        }
        if (e2.isEmpty()) {
            drX<Context, RuntimeException, dpR> drx = this.b;
            Context context = view.getContext();
            C8632dsu.a(context, "");
            drx.invoke(context, new EpoxyPreloadException("No preloadable views were found in " + t.getClass().getSimpleName()));
        }
        ArrayList<View> arrayList = new ArrayList();
        for (View view2 : e2) {
            C8571dqn.b(arrayList, e(view2));
        }
        ArrayList arrayList2 = new ArrayList();
        for (View view3 : arrayList) {
            C5454bz b2 = b(view3, (AbstractC4765bm<AbstractC4765bm<T, U, P>, U, P>) abstractC4765bm, (AbstractC4765bm<T, U, P>) t);
            if (b2 != null) {
                arrayList2.add(b2);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends View> List<View> e(T t) {
        List<View> e2;
        if (t instanceof InterfaceC4977bq) {
            List<View> e3 = ((InterfaceC4977bq) t).e();
            ArrayList arrayList = new ArrayList();
            for (View view : e3) {
                C8571dqn.b(arrayList, e(view));
            }
            return arrayList;
        }
        e2 = C8566dqi.e(t);
        return e2;
    }

    private final <T extends AbstractC3073as<?>, U extends InterfaceC5295bw, P extends InterfaceC5136bt> C5454bz<U> b(View view, AbstractC4765bm<T, U, P> abstractC4765bm, T t) {
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        if (width <= 0 || height <= 0) {
            drX<Context, RuntimeException, dpR> drx = this.b;
            Context context = view.getContext();
            C8632dsu.a(context, "");
            drx.invoke(context, new EpoxyPreloadException(view.getClass().getSimpleName() + " in " + t.getClass().getSimpleName() + " has zero size. A size must be set to allow preloading."));
            return null;
        }
        return new C5454bz<>(view.getId(), width, height, abstractC4765bm.c(view));
    }

    private final <T extends AbstractC3073as<?>> List<View> b(View view, List<Integer> list, T t) {
        ArrayList arrayList = new ArrayList();
        for (Number number : list) {
            int intValue = number.intValue();
            View findViewById = view.findViewById(intValue);
            if (findViewById == null) {
                drX<Context, RuntimeException, dpR> drx = this.b;
                Context context = view.getContext();
                C8632dsu.a(context, "");
                drx.invoke(context, new EpoxyPreloadException("View with id " + intValue + " in " + t.getClass().getSimpleName() + " could not be found."));
            }
            if (findViewById != null) {
                arrayList.add(findViewById);
            }
        }
        return arrayList;
    }
}
