package o;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o.AbstractC3073as;
import o.C8938gE;

/* renamed from: o.av  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3230av<T extends AbstractC3073as> extends AbstractC1457aC implements InterfaceC2967aq<T>, InterfaceC1430aB<T> {
    private C1511aE a;
    private final AbstractC2914ap b;
    private final Class<T> d;
    private C1511aE e;

    public void a(int i, int i2, T t, View view) {
    }

    public void a(T t, View view) {
    }

    public void a(T t, View view, float f, Canvas canvas) {
    }

    public void a(T t, View view, int i) {
    }

    public void b(T t, View view) {
    }

    public void b(T t, View view, int i) {
    }

    public void c(T t, View view) {
    }

    public void e(T t, View view, int i, int i2) {
    }

    public AbstractC3230av(AbstractC2914ap abstractC2914ap, Class<T> cls) {
        this.b = abstractC2914ap;
        this.d = cls;
    }

    @Override // o.AbstractC1457aC
    protected int e(RecyclerView recyclerView, C1511aE c1511aE) {
        AbstractC3073as<?> a = c1511aE.a();
        if (!(this.e == null && this.a == null && d(recyclerView)) && b(a)) {
            return d((AbstractC3230av<T>) a, c1511aE.getAdapterPosition());
        }
        return 0;
    }

    @Override // o.AbstractC1457aC
    protected boolean d(RecyclerView recyclerView, C1511aE c1511aE, C1511aE c1511aE2) {
        return b(c1511aE2.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean b(AbstractC3073as<?> abstractC3073as) {
        return this.d.isInstance(abstractC3073as);
    }

    @Override // o.AbstractC1457aC
    protected boolean b(RecyclerView recyclerView, C1511aE c1511aE, C1511aE c1511aE2) {
        if (this.b == null) {
            throw new IllegalStateException("A controller must be provided in the constructor if dragging is enabled");
        }
        int adapterPosition = c1511aE.getAdapterPosition();
        int adapterPosition2 = c1511aE2.getAdapterPosition();
        this.b.moveModel(adapterPosition, adapterPosition2);
        AbstractC3073as<?> a = c1511aE.a();
        if (!b(a)) {
            throw new IllegalStateException("A model was dragged that is not a valid target: " + a.getClass());
        }
        a(adapterPosition, adapterPosition2, (int) a, c1511aE.itemView);
        return true;
    }

    @Override // o.AbstractC1457aC
    protected void a(C1511aE c1511aE, int i) {
        AbstractC3073as<?> a = c1511aE.a();
        View view = c1511aE.itemView;
        int adapterPosition = c1511aE.getAdapterPosition();
        if (!b(a)) {
            throw new IllegalStateException("A model was swiped that is not a valid target: " + a.getClass());
        }
        e(a, view, adapterPosition, i);
    }

    @Override // o.AbstractC1457aC
    protected void d(C1511aE c1511aE, int i) {
        super.d(c1511aE, i);
        if (c1511aE == null) {
            C1511aE c1511aE2 = this.e;
            if (c1511aE2 != null) {
                c(c1511aE2.a(), this.e.itemView);
                this.e = null;
                return;
            }
            C1511aE c1511aE3 = this.a;
            if (c1511aE3 != null) {
                b(c1511aE3.a(), this.a.itemView);
                this.a = null;
                return;
            }
            return;
        }
        AbstractC3073as<?> a = c1511aE.a();
        if (!b(a)) {
            throw new IllegalStateException("A model was selected that is not a valid target: " + a.getClass());
        }
        b((RecyclerView) c1511aE.itemView.getParent());
        if (i == 1) {
            this.a = c1511aE;
            a(a, c1511aE.itemView, c1511aE.getAdapterPosition());
        } else if (i == 2) {
            this.e = c1511aE;
            b((AbstractC3230av<T>) a, c1511aE.itemView, c1511aE.getAdapterPosition());
        }
    }

    private void b(RecyclerView recyclerView) {
        recyclerView.setTag(C8938gE.d.e, Boolean.TRUE);
    }

    private boolean d(RecyclerView recyclerView) {
        return recyclerView.getTag(C8938gE.d.e) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(RecyclerView recyclerView) {
        recyclerView.setTag(C8938gE.d.e, null);
    }

    @Override // o.AbstractC1457aC
    protected void d(final RecyclerView recyclerView, C1511aE c1511aE) {
        super.d(recyclerView, c1511aE);
        a((AbstractC3230av<T>) c1511aE.a(), c1511aE.itemView);
        recyclerView.postDelayed(new Runnable() { // from class: o.av.2
            @Override // java.lang.Runnable
            public void run() {
                AbstractC3230av.this.a(recyclerView);
            }
        }, 300L);
    }

    @Override // o.AbstractC1457aC
    protected void a(Canvas canvas, RecyclerView recyclerView, C1511aE c1511aE, float f, float f2, int i, boolean z) {
        float height;
        super.a(canvas, recyclerView, c1511aE, f, f2, i, z);
        try {
            AbstractC3073as<?> a = c1511aE.a();
            if (!b(a)) {
                throw new IllegalStateException("A model was selected that is not a valid target: " + a.getClass());
            }
            View view = c1511aE.itemView;
            if (Math.abs(f) > Math.abs(f2)) {
                height = f / view.getWidth();
            } else {
                height = f2 / view.getHeight();
            }
            a((AbstractC3230av<T>) a, view, Math.max(-1.0f, Math.min(1.0f, height)), canvas);
        } catch (IllegalStateException unused) {
        }
    }
}
