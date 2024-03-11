package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.TrackingInfo;
import com.netflix.mediaclient.clutils.TrackingInfoHolder;
import com.netflix.mediaclient.servicemgr.PlayLocationType;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.InterfaceC6434cdI;
import org.json.JSONObject;

/* renamed from: o.Sz  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1212Sz extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private View a;
    protected InterfaceC5194buE c;
    private InterfaceC5281bvm i;
    private c k;
    private final List<View> e = new ArrayList();
    protected final List<InterfaceC5223buh> d = new ArrayList();
    private int j = 2;
    private boolean f = true;

    /* renamed from: o  reason: collision with root package name */
    private int f13401o = -1;
    private boolean h = false;
    private int g = -1;
    private int m = -1;
    protected TrackingInfoHolder b = new TrackingInfoHolder(PlayLocationType.LOLOMO_ROW);

    /* renamed from: o.Sz$c */
    /* loaded from: classes3.dex */
    public interface c {
        View d(View view);
    }

    protected void a(int i) {
    }

    public void a(boolean z) {
        this.h = z;
    }

    public void d(c cVar) {
        this.k = cVar;
    }

    public AbstractC1212Sz(c cVar, AppView appView) {
        this.k = cVar;
    }

    public InterfaceC5223buh b(int i) {
        if (i < this.d.size()) {
            return this.d.get(i);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            this.h = layoutManager.canScrollHorizontally();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == this.j) {
            return new a(this.k.d(viewGroup), viewGroup.getContext());
        }
        if (i == 0) {
            return new a(null, viewGroup.getContext());
        }
        if (i == 3) {
            return new a(null, viewGroup.getContext());
        }
        throw new IllegalArgumentException("No matching type " + i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 0) {
            d(viewHolder, i);
        } else if (itemViewType == 3) {
            c(viewHolder);
        } else if (itemViewType == this.j) {
            c(viewHolder, i - a());
        }
        a(i);
    }

    private void d(RecyclerView.ViewHolder viewHolder, int i) {
        a(viewHolder, i);
        ((ViewGroup) viewHolder.itemView).addView(this.e.get(i));
    }

    private void c(RecyclerView.ViewHolder viewHolder) {
        if (this.a == null) {
            return;
        }
        a(viewHolder);
        ((ViewGroup) viewHolder.itemView).addView(this.a);
    }

    private void a(RecyclerView.ViewHolder viewHolder, int i) {
        ((ViewGroup) viewHolder.itemView).removeAllViews();
        ViewParent parent = this.e.get(i).getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.e.get(i));
        }
    }

    private void a(RecyclerView.ViewHolder viewHolder) {
        if (this.a == null) {
            return;
        }
        ((ViewGroup) viewHolder.itemView).removeAllViews();
        ViewParent parent = this.a.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.a);
        }
    }

    private void c(RecyclerView.ViewHolder viewHolder, int i) {
        InterfaceC5223buh b = b(i);
        if (b == null) {
            return;
        }
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            aVar.c(b);
            TrackingInfoHolder trackingInfoHolder = this.b;
            if (b.getId() == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("SPY-17693: Missing id from video summary for trackId ");
                InterfaceC5281bvm interfaceC5281bvm = this.i;
                sb.append(interfaceC5281bvm == null ? "unknown" : Integer.valueOf(interfaceC5281bvm.getTrackId()));
                InterfaceC1598aHf.a(sb.toString());
            }
            aVar.d(trackingInfoHolder.e(b, i));
            aVar.b.a(false);
        }
        View childAt = ((ViewGroup) viewHolder.itemView).getChildAt(0);
        if (childAt instanceof bFJ) {
            ((bFJ) childAt).c(b, this.c, -1);
        } else if (childAt instanceof InterfaceC6434cdI.c) {
            ((InterfaceC6434cdI.c) childAt).c(b, null, this.b.e(b, i), i, false);
        }
        e(i, childAt);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            if (aVar.c() != null) {
                View view = viewHolder.itemView;
                if ((view instanceof ViewGroup) && (((ViewGroup) view).getChildAt(0) instanceof bFG)) {
                    bFG bfg = (bFG) ((ViewGroup) viewHolder.itemView).getChildAt(0);
                    final InterfaceC5223buh c2 = aVar.c();
                    if (c2 != null) {
                        bfg.a(new InterfaceC5176btn() { // from class: o.Sz.5
                            @Override // o.InterfaceC5176btn
                            public String aH_() {
                                return c2.getId();
                            }

                            @Override // o.InterfaceC5176btn
                            public boolean aY_() {
                                return c2.getType() == VideoType.EPISODE;
                            }

                            @Override // o.InterfaceC5176btn
                            public boolean d() {
                                return c2.isAvailableForDownload();
                            }

                            @Override // o.InterfaceC5176btn
                            public boolean isPlayable() {
                                return c2.isPlayable();
                            }
                        });
                    }
                }
            }
        }
        b(viewHolder);
    }

    public final void b(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            aVar.b.a(false);
            C5838cKf.c(aVar.b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            aVar.c((InterfaceC5223buh) null);
            C5838cKf.d(aVar.b);
        }
    }

    private void e(int i, View view) {
        if (view instanceof Checkable) {
            if (i == this.f13401o) {
                ((Checkable) view).setChecked(true);
            } else {
                ((Checkable) view).setChecked(false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.d.size() + a() + (this.a == null ? 0 : 1);
    }

    public int a() {
        return this.e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (e(i)) {
            return 0;
        }
        if (c(i)) {
            return 3;
        }
        return this.j;
    }

    public void b(Collection<? extends InterfaceC5223buh> collection, int i) {
        if (i == 0) {
            this.d.clear();
        }
        this.d.addAll(collection);
        notifyDataSetChanged();
    }

    public boolean e(int i) {
        return i < a();
    }

    public boolean c(int i) {
        return this.a != null && i >= getItemCount() - 1;
    }

    public void d(int i) {
        if (!this.f) {
            C1044Mm.b("RecyclerViewHeaderAdapter", "Not in single choice mode - skipping setItemChecked()");
        } else if (i < 0) {
            C1044Mm.b("RecyclerViewHeaderAdapter", "Skipping setItemChecked() - invalid position: " + i);
        } else {
            int i2 = this.f13401o;
            int a2 = a();
            this.f13401o = i - a();
            notifyItemChanged(i2 + a2);
            notifyItemChanged(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View b(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        if (this.h) {
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
        } else {
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.Sz$a */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final AbstractC5833cKa b;
        private InterfaceC5223buh c;
        private TrackingInfoHolder d;

        public InterfaceC5223buh c() {
            return this.c;
        }

        public void c(InterfaceC5223buh interfaceC5223buh) {
            this.c = interfaceC5223buh;
        }

        public void d(TrackingInfoHolder trackingInfoHolder) {
            this.d = trackingInfoHolder;
        }

        public a(View view, Context context) {
            super(AbstractC1212Sz.this.b(context));
            this.b = new AbstractC5833cKa() { // from class: o.Sz.a.5
                @Override // o.AbstractC5833cKa
                public View i() {
                    return a.this.itemView;
                }

                @Override // o.AbstractC5833cKa
                public TrackingInfo a(JSONObject jSONObject) {
                    if (a.this.d != null) {
                        return a.this.d.c(jSONObject);
                    }
                    InterfaceC1598aHf.a("getTrackinInfo(): trackingInfoHolder shouldn't be null");
                    return null;
                }

                @Override // o.AbstractC5833cKa
                public InterfaceC5177bto j() {
                    return a.this.c();
                }

                @Override // o.AbstractC5833cKa
                public String c() {
                    if (a.this.c() == null) {
                        return null;
                    }
                    return a.this.c().getBoxartId();
                }

                @Override // o.AbstractC5833cKa
                public Integer b() {
                    if (a.this.getAdapterPosition() == -1) {
                        return null;
                    }
                    return Integer.valueOf(a.this.getAdapterPosition() - AbstractC1212Sz.this.a());
                }

                @Override // o.AbstractC5833cKa
                public Integer d() {
                    return 0;
                }

                @Override // o.AbstractC5833cKa
                public InterfaceC5281bvm a() {
                    return AbstractC1212Sz.this.i;
                }

                @Override // o.AbstractC5833cKa
                public boolean e() {
                    View childAt = ((ViewGroup) a.this.itemView).getChildAt(0);
                    if (childAt instanceof bFJ) {
                        return ((bFJ) childAt).c();
                    }
                    if (childAt instanceof InterfaceC6434cdI.c) {
                        return ((InterfaceC6434cdI.c) childAt).c();
                    }
                    return false;
                }
            };
            this.d = null;
            if (view != null) {
                ((ViewGroup) this.itemView).addView(view);
                view.setOnClickListener(this);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!(view instanceof bFJ) || ((bFJ) view).b()) {
                AbstractC1212Sz.this.d(getAdapterPosition());
            }
        }
    }
}
