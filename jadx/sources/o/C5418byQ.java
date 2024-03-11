package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import io.reactivex.Observable;
import java.util.List;
import o.C5437byj;

/* renamed from: o.byQ  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5418byQ extends RecyclerView.Adapter<C5452byy> {
    public static final a b = new a(null);
    private List<? extends InterfaceC5367bxS> a;
    private final Observable<dpR> c;
    private final C5451byx d;

    public final List<InterfaceC5367bxS> e() {
        return this.a;
    }

    public C5418byQ(Observable<dpR> observable) {
        List<? extends InterfaceC5367bxS> i;
        this.c = observable;
        this.d = new C5451byx(observable);
        i = C8569dql.i();
        this.a = i;
    }

    /* renamed from: o.byQ$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("RaterViewAdapter");
        }
    }

    public final void b(List<? extends InterfaceC5367bxS> list) {
        C8632dsu.c((Object) list, "");
        this.a = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c */
    public C5452byy onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C5437byj.b.c, viewGroup, false);
        C8632dsu.a(inflate, "");
        return new C5452byy(inflate, this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public void onBindViewHolder(C5452byy c5452byy, int i) {
        C8632dsu.c((Object) c5452byy, "");
        c5452byy.c(i, this.a.get(i), this.d);
    }
}
