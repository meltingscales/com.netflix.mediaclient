package o;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import java.util.List;

/* renamed from: o.aE  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1511aE extends RecyclerView.ViewHolder {
    private ViewParent a;
    private AbstractC3179au b;
    private AbstractC3073as c;
    private List<Object> d;
    ViewHolderState.ViewState e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object c() {
        AbstractC3179au abstractC3179au = this.b;
        return abstractC3179au != null ? abstractC3179au : this.itemView;
    }

    public C1511aE(ViewParent viewParent, View view, boolean z) {
        super(view);
        this.a = viewParent;
        if (z) {
            ViewHolderState.ViewState viewState = new ViewHolderState.ViewState();
            this.e = viewState;
            viewState.d(this.itemView);
        }
    }

    public void d() {
        ViewHolderState.ViewState viewState = this.e;
        if (viewState != null) {
            viewState.b(this.itemView);
        }
    }

    public void b(AbstractC3073as abstractC3073as, AbstractC3073as<?> abstractC3073as2, List<Object> list, int i) {
        this.d = list;
        if (this.b == null && (abstractC3073as instanceof AbstractC3336ax)) {
            AbstractC3179au b = ((AbstractC3336ax) abstractC3073as).b(this.a);
            this.b = b;
            b.e(this.itemView);
        }
        this.a = null;
        boolean z = abstractC3073as instanceof InterfaceC1673aK;
        if (z) {
            ((InterfaceC1673aK) abstractC3073as).e(this, c(), i);
        }
        abstractC3073as.e((AbstractC3073as) c(), abstractC3073as2);
        if (abstractC3073as2 != null) {
            abstractC3073as.c((AbstractC3073as) c(), abstractC3073as2);
        } else if (list.isEmpty()) {
            abstractC3073as.c((AbstractC3073as) c());
        } else {
            abstractC3073as.d(c(), list);
        }
        if (z) {
            ((InterfaceC1673aK) abstractC3073as).a(c(), i);
        }
        this.c = abstractC3073as;
    }

    public void e() {
        h();
        this.c.e((AbstractC3073as) c());
        this.c = null;
        this.d = null;
    }

    public void d(int i) {
        h();
        this.c.c(i, (int) c());
    }

    public void a(float f, float f2, int i, int i2) {
        h();
        this.c.b(f, f2, i, i2, c());
    }

    public AbstractC3073as<?> a() {
        h();
        return this.c;
    }

    public AbstractC3179au b() {
        h();
        return this.b;
    }

    private void h() {
        if (this.c == null) {
            throw new IllegalStateException("This holder is not currently bound.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ViewHolder
    public String toString() {
        return "EpoxyViewHolder{epoxyModel=" + this.c + ", view=" + this.itemView + ", super=" + super.toString() + '}';
    }
}
