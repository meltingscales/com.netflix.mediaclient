package o;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.aA  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1403aA {

    /* renamed from: o.aA$b */
    /* loaded from: classes2.dex */
    public static abstract class b<T extends AbstractC3073as> implements InterfaceC2967aq<T> {
        public void a(T t, View view, int i) {
        }

        public boolean a(T t) {
            return true;
        }

        public void c(T t, View view) {
        }

        @Override // o.InterfaceC2490ah
        public final int d(T t, int i) {
            return 0;
        }

        public void d(T t, View view) {
        }

        public abstract void e(int i, int i2, T t, View view);
    }

    /* renamed from: o.aA$j */
    /* loaded from: classes2.dex */
    public static abstract class j<T extends AbstractC3073as> implements InterfaceC1430aB<T> {
        public void a(T t, View view, int i) {
        }

        public void b(T t, View view) {
        }

        public void c(T t, View view, float f, Canvas canvas) {
        }

        public abstract void c(T t, View view, int i, int i2);

        @Override // o.InterfaceC2490ah
        public final int d(T t, int i) {
            return 0;
        }

        public boolean d(T t) {
            return true;
        }

        public void e(T t, View view) {
        }
    }

    public static e a(AbstractC2914ap abstractC2914ap) {
        return new e(abstractC2914ap);
    }

    /* renamed from: o.aA$e */
    /* loaded from: classes2.dex */
    public static class e {
        private final AbstractC2914ap b;

        private e(AbstractC2914ap abstractC2914ap) {
            this.b = abstractC2914ap;
        }

        public c d(RecyclerView recyclerView) {
            return new c(this.b, recyclerView);
        }
    }

    /* renamed from: o.aA$c */
    /* loaded from: classes2.dex */
    public static class c {
        private final RecyclerView a;
        private final AbstractC2914ap d;

        private c(AbstractC2914ap abstractC2914ap, RecyclerView recyclerView) {
            this.d = abstractC2914ap;
            this.a = recyclerView;
        }

        public d a() {
            return d(3);
        }

        public d d(int i) {
            return new d(this.d, this.a, ItemTouchHelper.Callback.makeMovementFlags(i, 0));
        }
    }

    /* renamed from: o.aA$d */
    /* loaded from: classes2.dex */
    public static class d {
        private final AbstractC2914ap b;
        private final RecyclerView c;
        private final int e;

        private d(AbstractC2914ap abstractC2914ap, RecyclerView recyclerView, int i) {
            this.b = abstractC2914ap;
            this.c = recyclerView;
            this.e = i;
        }

        public <U extends AbstractC3073as> a<U> b(Class<U> cls) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(cls);
            return new a<>(this.b, this.c, this.e, cls, arrayList);
        }
    }

    /* renamed from: o.aA$a */
    /* loaded from: classes2.dex */
    public static class a<U extends AbstractC3073as> {
        private final AbstractC2914ap a;
        private final Class<U> b;
        private final List<Class<? extends AbstractC3073as>> c;
        private final RecyclerView d;
        private final int e;

        private a(AbstractC2914ap abstractC2914ap, RecyclerView recyclerView, int i, Class<U> cls, List<Class<? extends AbstractC3073as>> list) {
            this.a = abstractC2914ap;
            this.d = recyclerView;
            this.e = i;
            this.b = cls;
            this.c = list;
        }

        public ItemTouchHelper c(final b<U> bVar) {
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new AbstractC3230av<U>(this.a, this.b) { // from class: o.aA.a.4
                @Override // o.InterfaceC2490ah
                public int d(U u, int i) {
                    return a.this.e;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.AbstractC3230av
                public boolean b(AbstractC3073as<?> abstractC3073as) {
                    boolean contains;
                    if (a.this.c.size() != 1) {
                        contains = a.this.c.contains(abstractC3073as.getClass());
                    } else {
                        contains = super.b(abstractC3073as);
                    }
                    return contains && bVar.a(abstractC3073as);
                }

                @Override // o.AbstractC3230av
                public void b(U u, View view, int i) {
                    bVar.a(u, view, i);
                }

                @Override // o.AbstractC3230av
                public void c(U u, View view) {
                    bVar.d((b) u, view);
                }

                @Override // o.AbstractC3230av
                public void a(int i, int i2, U u, View view) {
                    bVar.e(i, i2, u, view);
                }

                @Override // o.AbstractC3230av
                public void a(U u, View view) {
                    bVar.c(u, view);
                }
            });
            itemTouchHelper.attachToRecyclerView(this.d);
            return itemTouchHelper;
        }
    }

    public static g d(RecyclerView recyclerView) {
        return new g(recyclerView);
    }

    /* renamed from: o.aA$g */
    /* loaded from: classes2.dex */
    public static class g {
        private final RecyclerView c;

        private g(RecyclerView recyclerView) {
            this.c = recyclerView;
        }

        public f d(int i) {
            return new f(this.c, ItemTouchHelper.Callback.makeMovementFlags(0, i));
        }
    }

    /* renamed from: o.aA$f */
    /* loaded from: classes2.dex */
    public static class f {
        private final RecyclerView a;
        private final int e;

        private f(RecyclerView recyclerView, int i) {
            this.a = recyclerView;
            this.e = i;
        }

        public <U extends AbstractC3073as> i<U> d(Class<U> cls) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(cls);
            return new i<>(this.a, this.e, cls, arrayList);
        }
    }

    /* renamed from: o.aA$i */
    /* loaded from: classes2.dex */
    public static class i<U extends AbstractC3073as> {
        private final List<Class<? extends AbstractC3073as>> b;
        private final int c;
        private final RecyclerView d;
        private final Class<U> e;

        private i(RecyclerView recyclerView, int i, Class<U> cls, List<Class<? extends AbstractC3073as>> list) {
            this.d = recyclerView;
            this.c = i;
            this.e = cls;
            this.b = list;
        }

        public ItemTouchHelper b(final j<U> jVar) {
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new AbstractC3230av<U>(null, this.e) { // from class: o.aA.i.4
                @Override // o.InterfaceC2490ah
                public int d(U u, int i) {
                    return i.this.c;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // o.AbstractC3230av
                public boolean b(AbstractC3073as<?> abstractC3073as) {
                    boolean contains;
                    if (i.this.b.size() != 1) {
                        contains = i.this.b.contains(abstractC3073as.getClass());
                    } else {
                        contains = super.b(abstractC3073as);
                    }
                    return contains && jVar.d(abstractC3073as);
                }

                @Override // o.AbstractC3230av
                public void a(U u, View view, int i) {
                    jVar.a(u, view, i);
                }

                @Override // o.AbstractC3230av
                public void a(U u, View view, float f, Canvas canvas) {
                    jVar.c((j) u, view, f, canvas);
                }

                @Override // o.AbstractC3230av
                public void e(U u, View view, int i, int i2) {
                    jVar.c((j) u, view, i, i2);
                }

                @Override // o.AbstractC3230av
                public void b(U u, View view) {
                    jVar.e(u, view);
                }

                @Override // o.AbstractC3230av
                public void a(U u, View view) {
                    jVar.b(u, view);
                }
            });
            itemTouchHelper.attachToRecyclerView(this.d);
            return itemTouchHelper;
        }
    }
}
