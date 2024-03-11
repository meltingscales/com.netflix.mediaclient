package com.netflix.android.widgetry.lolomo;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter.d;
import com.netflix.android.widgetry.widget.TrackedLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import o.AbstractC9900yh;
import o.C1044Mm;
import o.C1729aMb;
import o.C8141del;
import o.C9906yn;
import o.C9909yq;

/* loaded from: classes2.dex */
public abstract class BaseVerticalRecyclerViewAdapter<T extends d> extends RecyclerView.Adapter<T> {
    public final LayoutInflater d;
    private SparseArray<Object> f;
    private final ArrayList<AbstractC9900yh> i = new ArrayList<>();
    protected SparseArray<C1729aMb> c = new SparseArray<>();
    public final ArrayList<View> e = new ArrayList<>(1);
    protected View a = null;
    private final RecyclerView.OnScrollListener h = new RecyclerView.OnScrollListener() { // from class: com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter.1
        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Iterator it = BaseVerticalRecyclerViewAdapter.this.i.iterator();
            while (it.hasNext()) {
                AbstractC9900yh abstractC9900yh = (AbstractC9900yh) it.next();
                RecyclerView b = abstractC9900yh.b();
                if (b != null) {
                    abstractC9900yh.d(recyclerView, b, i);
                }
            }
        }
    };
    private int g = 0;
    private boolean b = false;
    private boolean j = false;

    protected abstract int a(boolean z);

    protected abstract T a(ViewGroup viewGroup, C1729aMb c1729aMb);

    protected AbstractC9900yh a(Context context, C1729aMb c1729aMb, int i) {
        return null;
    }

    protected void a() {
    }

    public final boolean b() {
        return this.a != null;
    }

    public View c() {
        return this.a;
    }

    protected abstract AbstractC9900yh c(Context context, C1729aMb c1729aMb, int i);

    public abstract int d(int i);

    protected abstract void d(T t, int i, AbstractC9900yh abstractC9900yh, Parcelable parcelable);

    protected abstract int e();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        c((BaseVerticalRecyclerViewAdapter<T>) ((d) viewHolder), i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        a((BaseVerticalRecyclerViewAdapter<T>) ((d) viewHolder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        d((BaseVerticalRecyclerViewAdapter<T>) ((d) viewHolder));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        e((BaseVerticalRecyclerViewAdapter<T>) ((d) viewHolder));
    }

    public BaseVerticalRecyclerViewAdapter(Context context, C1729aMb... c1729aMbArr) {
        this.d = LayoutInflater.from(context);
        for (C1729aMb c1729aMb : c1729aMbArr) {
            this.c.put(c1729aMb.p(), c1729aMb);
        }
        h();
    }

    public void h() {
        if (this.g != d()) {
            a();
            this.g = d();
        }
        int a = a(false) + d();
        if (this.f == null) {
            this.f = new SparseArray<>(a);
        }
        ArrayList<AbstractC9900yh> arrayList = new ArrayList(this.i);
        this.i.clear();
        for (int i = 0; i < a; i++) {
            AbstractC9900yh a2 = a(this.d.getContext(), b(i), i);
            if (a2 == null) {
                a2 = c(this.d.getContext(), b(i), i);
                a2.d(this.d.getContext());
            } else {
                arrayList.remove(a2);
            }
            this.i.add(a2);
        }
        for (AbstractC9900yh abstractC9900yh : arrayList) {
            abstractC9900yh.c(this.d.getContext());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        recyclerView.addOnScrollListener(this.h);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        recyclerView.removeOnScrollListener(this.h);
    }

    public final int d() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return d(this.i.get(i).e());
    }

    public C1729aMb a(int i) {
        C1729aMb c1729aMb = this.c.get(i);
        if (c1729aMb != null) {
            return c1729aMb;
        }
        throw new IllegalArgumentException("No configuration for viewType = " + i);
    }

    public C1729aMb b(int i) {
        int d2 = d(i);
        C1729aMb c1729aMb = this.c.get(d2);
        if (c1729aMb != null) {
            return c1729aMb;
        }
        throw new IllegalArgumentException("No configuration for viewType = " + d2);
    }

    public final void c(T t, int i) {
        AbstractC9900yh abstractC9900yh = this.i.get(i);
        d(t, i, abstractC9900yh, (Parcelable) this.f.get(abstractC9900yh.e()));
    }

    public final void f() {
        h();
        super.notifyDataSetChanged();
    }

    public final void c(int i, int i2) {
        h();
        super.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a */
    public T onCreateViewHolder(ViewGroup viewGroup, int i) {
        return a(viewGroup, this.c.get(i));
    }

    public void d(T t) {
        d((RecyclerView.ViewHolder) t);
        t.d();
        super.onViewDetachedFromWindow(t);
    }

    public void a(T t) {
        t.a();
        super.onViewAttachedToWindow(t);
    }

    public void e(T t) {
        d((RecyclerView.ViewHolder) t);
        t.e();
        super.onViewRecycled(t);
    }

    private void d(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof e) {
            e eVar = (e) viewHolder;
            int adapterPosition = eVar.getAdapterPosition();
            if (adapterPosition != -1) {
                this.f.put(adapterPosition, eVar.b.getLayoutManager().onSaveInstanceState());
            } else {
                C1044Mm.j("BaseVerticalRecyclerViewAdapter", "Unable to save state, holder position == NO_POSITION");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable a(LolomoRecyclerView lolomoRecyclerView) {
        SavedState savedState = new SavedState();
        for (int i = 0; i < lolomoRecyclerView.getChildCount(); i++) {
            d(lolomoRecyclerView.getChildViewHolder(lolomoRecyclerView.getChildAt(i)));
        }
        savedState.a = this.f;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Parcelable parcelable) {
        this.f = ((SavedState) parcelable).a;
    }

    public View e(int i) {
        return this.e.get(i);
    }

    /* loaded from: classes2.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: e */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: d */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        private SparseArray<Object> a;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        SavedState(Parcel parcel) {
            this.a = parcel.readSparseArray(getClass().getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeSparseArray(this.a);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class d extends RecyclerView.ViewHolder {
        public void a() {
        }

        public void d() {
        }

        public void d(boolean z) {
        }

        public void e() {
        }

        public d(View view) {
            super(view);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class e<T> extends d {
        public final LinearLayoutManager a;
        public final C9909yq b;
        private AbstractC9900yh d;

        public abstract void a(T t);

        public e(View view, C1729aMb c1729aMb, int i) {
            super(view);
            this.d = null;
            if (c1729aMb.o() < 2) {
                this.a = new RowLinearLayoutManager(view.getContext(), c1729aMb.k(), false);
            } else {
                this.a = new MultiRowLinearLayoutManager(view.getContext(), c1729aMb.o(), c1729aMb.k(), false);
            }
            C9909yq c9909yq = (C9909yq) view.findViewById(i);
            this.b = c9909yq;
            if (c9909yq == null) {
                throw new IllegalArgumentException("lomoId not found in itemView");
            }
            c9909yq.setLayoutManager(this.a);
            c9909yq.setScrollingTouchSlop(1);
            c9909yq.setHasFixedSize(true);
            this.a.setInitialPrefetchItemCount(c1729aMb.m() + 1);
            c9909yq.setPadding(c1729aMb.a(), 0, c1729aMb.a(), 0);
            c9909yq.setNestedScrollingEnabled(false);
            C1729aMb.b f = c1729aMb.f();
            if (f != null) {
                c9909yq.addItemDecoration(f.d((AppCompatActivity) C8141del.e(c9909yq.getContext(), AppCompatActivity.class)));
            }
            if (c1729aMb.e()) {
                return;
            }
            if (c1729aMb.m() == 1) {
                new PagerSnapHelper().attachToRecyclerView(c9909yq);
            } else {
                new C9906yn().d(c9909yq, c1729aMb);
            }
        }

        public final void a(T t, AbstractC9900yh abstractC9900yh, Parcelable parcelable) {
            this.d = abstractC9900yh;
            this.b.swapAdapter(abstractC9900yh, false);
            if (parcelable != null) {
                this.a.onRestoreInstanceState(parcelable);
            }
            a(t);
            abstractC9900yh.e(this.b, this);
        }

        @Override // com.netflix.android.widgetry.lolomo.BaseVerticalRecyclerViewAdapter.d
        public final void e() {
            AbstractC9900yh abstractC9900yh = this.d;
            if (abstractC9900yh != null) {
                abstractC9900yh.c(this.b, this);
            }
        }

        public final void b(String str) {
            LinearLayoutManager linearLayoutManager = this.a;
            if (linearLayoutManager instanceof TrackedLayoutManager) {
                ((TrackedLayoutManager) linearLayoutManager).a(str);
            }
        }
    }
}
