package o;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class Z extends RecyclerView.Adapter<C1511aE> {
    private final GridLayoutManager.SpanSizeLookup e;
    private int a = 1;
    private final C4871bo d = new C4871bo();
    private final C2375af c = new C2375af();
    private ViewHolderState b = new ViewHolderState();

    public void a(View view) {
    }

    boolean a() {
        return false;
    }

    public int b() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C2375af c() {
        return this.c;
    }

    protected void c(C1511aE c1511aE, AbstractC3073as<?> abstractC3073as, int i) {
    }

    public boolean c(int i) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract List<? extends AbstractC3073as<?>> d();

    public void d(int i) {
        this.a = i;
    }

    public void d(View view) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(RuntimeException runtimeException) {
    }

    public GridLayoutManager.SpanSizeLookup e() {
        return this.e;
    }

    protected void e(C1511aE c1511aE, AbstractC3073as<?> abstractC3073as) {
    }

    public boolean g() {
        return this.a > 1;
    }

    public Z() {
        GridLayoutManager.SpanSizeLookup spanSizeLookup = new GridLayoutManager.SpanSizeLookup() { // from class: o.Z.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int i) {
                try {
                    return Z.this.a(i).e(Z.this.a, i, Z.this.getItemCount());
                } catch (IndexOutOfBoundsException e) {
                    Z.this.d(e);
                    return 1;
                }
            }
        };
        this.e = spanSizeLookup;
        setHasStableIds(true);
        spanSizeLookup.setSpanIndexCacheEnabled(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return d().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return d().get(i).b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.d.e(a(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b */
    public C1511aE onCreateViewHolder(ViewGroup viewGroup, int i) {
        AbstractC3073as<?> c = this.d.c(this, i);
        return new C1511aE(viewGroup, c.d(viewGroup), c.f());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c */
    public void onBindViewHolder(C1511aE c1511aE, int i) {
        onBindViewHolder(c1511aE, i, Collections.emptyList());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b */
    public void onBindViewHolder(C1511aE c1511aE, int i, List<Object> list) {
        AbstractC3073as<?> a = a(i);
        AbstractC3073as<?> a2 = a() ? C2649ak.a(list, getItemId(i)) : null;
        c1511aE.b(a, a2, list, i);
        if (list.isEmpty()) {
            this.b.c(c1511aE);
        }
        this.c.b(c1511aE);
        if (a()) {
            d(c1511aE, a, i, a2);
        } else {
            d(c1511aE, a, i, list);
        }
    }

    protected void d(C1511aE c1511aE, AbstractC3073as<?> abstractC3073as, int i, List<Object> list) {
        c(c1511aE, abstractC3073as, i);
    }

    void d(C1511aE c1511aE, AbstractC3073as<?> abstractC3073as, int i, AbstractC3073as<?> abstractC3073as2) {
        c(c1511aE, abstractC3073as, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC3073as<?> a(int i) {
        return d().get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e */
    public void onViewRecycled(C1511aE c1511aE) {
        this.b.b(c1511aE);
        this.c.c(c1511aE);
        AbstractC3073as<?> a = c1511aE.a();
        c1511aE.e();
        e(c1511aE, a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.d.e = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b */
    public boolean onFailedToRecycleView(C1511aE c1511aE) {
        return c1511aE.a().b((AbstractC3073as<?>) c1511aE.c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c */
    public void onViewAttachedToWindow(C1511aE c1511aE) {
        c1511aE.a().a((AbstractC3073as<?>) c1511aE.c());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public void onViewDetachedFromWindow(C1511aE c1511aE) {
        c1511aE.a().d((AbstractC3073as<?>) c1511aE.c());
    }

    public void a(Bundle bundle) {
        Iterator<C1511aE> it = this.c.iterator();
        while (it.hasNext()) {
            this.b.b(it.next());
        }
        if (this.b.size() > 0 && !hasStableIds()) {
            throw new IllegalStateException("Must have stable ids when saving view holder state");
        }
        bundle.putParcelable("saved_state_view_holders", this.b);
    }

    public void c(Bundle bundle) {
        if (this.c.b() > 0) {
            throw new IllegalStateException("State cannot be restored once views have been bound. It should be done before adding the adapter to the recycler view.");
        }
        if (bundle != null) {
            ViewHolderState viewHolderState = (ViewHolderState) bundle.getParcelable("saved_state_view_holders");
            this.b = viewHolderState;
            if (viewHolderState == null) {
                throw new IllegalStateException("Tried to restore instance state, but onSaveInstanceState was never called.");
            }
        }
    }

    protected int c(AbstractC3073as<?> abstractC3073as) {
        int size = d().size();
        for (int i = 0; i < size; i++) {
            if (abstractC3073as == d().get(i)) {
                return i;
            }
        }
        return -1;
    }
}
