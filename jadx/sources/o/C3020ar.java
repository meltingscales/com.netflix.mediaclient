package o;

import android.os.Handler;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ControllerModelList;
import java.util.ArrayList;
import java.util.List;
import o.C2216ac;

/* renamed from: o.ar  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3020ar extends Z implements C2216ac.d {
    private static final DiffUtil.ItemCallback<AbstractC3073as<?>> e = new DiffUtil.ItemCallback<AbstractC3073as<?>>() { // from class: o.ar.3
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a */
        public boolean areItemsTheSame(AbstractC3073as<?> abstractC3073as, AbstractC3073as<?> abstractC3073as2) {
            return abstractC3073as.b() == abstractC3073as2.b();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b */
        public boolean areContentsTheSame(AbstractC3073as<?> abstractC3073as, AbstractC3073as<?> abstractC3073as2) {
            return abstractC3073as.equals(abstractC3073as2);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: d */
        public Object getChangePayload(AbstractC3073as<?> abstractC3073as, AbstractC3073as<?> abstractC3073as2) {
            return new C2649ak(abstractC3073as);
        }
    };
    private final C2216ac a;
    private int b;
    private final AbstractC2914ap c;
    private final List<InterfaceC4255bb> d;
    private final C1996aW f;

    @Override // o.Z
    boolean a() {
        return true;
    }

    @Override // o.Z, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3020ar(AbstractC2914ap abstractC2914ap, Handler handler) {
        C1996aW c1996aW = new C1996aW();
        this.f = c1996aW;
        this.d = new ArrayList();
        this.c = abstractC2914ap;
        this.a = new C2216ac(handler, this, e);
        registerAdapterDataObserver(c1996aW);
    }

    @Override // o.Z
    protected void d(RuntimeException runtimeException) {
        this.c.onExceptionSwallowed(runtimeException);
    }

    @Override // o.Z
    List<? extends AbstractC3073as<?>> d() {
        return this.a.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(ControllerModelList controllerModelList) {
        List<? extends AbstractC3073as<?>> d = d();
        if (!d.isEmpty()) {
            if (d.get(0).g()) {
                for (int i = 0; i < d.size(); i++) {
                    d.get(i).c("The model was changed between being bound and when models were rebuilt", i);
                }
            }
        }
        this.a.e(controllerModelList);
    }

    public boolean f() {
        return this.a.e();
    }

    @Override // o.C2216ac.d
    public void d(C2755am c2755am) {
        this.b = c2755am.b.size();
        this.f.d();
        c2755am.e(this);
        this.f.a();
        for (int size = this.d.size() - 1; size >= 0; size--) {
            this.d.get(size).b(c2755am);
        }
    }

    public void c(InterfaceC4255bb interfaceC4255bb) {
        this.d.add(interfaceC4255bb);
    }

    public void e(InterfaceC4255bb interfaceC4255bb) {
        this.d.remove(interfaceC4255bb);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.c.onAttachedToRecyclerViewInternal(recyclerView);
    }

    @Override // o.Z, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.c.onDetachedFromRecyclerViewInternal(recyclerView);
    }

    @Override // o.Z, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c */
    public void onViewAttachedToWindow(C1511aE c1511aE) {
        super.onViewAttachedToWindow(c1511aE);
        this.c.onViewAttachedToWindow(c1511aE, c1511aE.a());
    }

    @Override // o.Z, androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public void onViewDetachedFromWindow(C1511aE c1511aE) {
        super.onViewDetachedFromWindow(c1511aE);
        this.c.onViewDetachedFromWindow(c1511aE, c1511aE.a());
    }

    @Override // o.Z
    protected void d(C1511aE c1511aE, AbstractC3073as<?> abstractC3073as, int i, AbstractC3073as<?> abstractC3073as2) {
        this.c.onModelBound(c1511aE, abstractC3073as, i, abstractC3073as2);
    }

    @Override // o.Z
    protected void e(C1511aE c1511aE, AbstractC3073as<?> abstractC3073as) {
        this.c.onModelUnbound(c1511aE, abstractC3073as);
    }

    public List<AbstractC3073as<?>> h() {
        return d();
    }

    public AbstractC3073as<?> c(long j) {
        for (AbstractC3073as<?> abstractC3073as : d()) {
            if (abstractC3073as.b() == j) {
                return abstractC3073as;
            }
        }
        return null;
    }

    @Override // o.Z
    public int c(AbstractC3073as<?> abstractC3073as) {
        int size = d().size();
        for (int i = 0; i < size; i++) {
            if (d().get(i).b() == abstractC3073as.b()) {
                return i;
            }
        }
        return -1;
    }

    @Override // o.Z
    public C2375af c() {
        return super.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        ArrayList arrayList = new ArrayList(d());
        arrayList.add(i2, (AbstractC3073as) arrayList.remove(i));
        this.f.d();
        notifyItemMoved(i, i2);
        this.f.a();
        if (this.a.a(arrayList)) {
            this.c.requestModelBuild();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        ArrayList arrayList = new ArrayList(d());
        this.f.d();
        notifyItemChanged(i);
        this.f.a();
        if (this.a.a(arrayList)) {
            this.c.requestModelBuild();
        }
    }

    @Override // o.Z
    public boolean c(int i) {
        return this.c.isStickyHeader(i);
    }

    @Override // o.Z
    public void d(View view) {
        this.c.setupStickyHeaderView(view);
    }

    @Override // o.Z
    public void a(View view) {
        this.c.teardownStickyHeaderView(view);
    }
}
