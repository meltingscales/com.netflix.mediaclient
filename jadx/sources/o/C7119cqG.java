package o;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.model.leafs.social.multititle.NotificationGridTitleAction;
import java.util.Iterator;
import java.util.List;
import o.AbstractC7118cqF;
import o.C7119cqG;
import o.C7124cqL;
import o.C7142cqd;
import o.C7149cqk;
import o.C7150cql;
import o.C7152cqn;
import o.C7155cqq;
import o.C7158cqt;

/* renamed from: o.cqG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7119cqG extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final c a = new c(null);
    private List<? extends AbstractC7118cqF> b;
    private boolean c;
    private final int d;
    private RecyclerView e;
    private final int j;

    public float b() {
        return 0.71f;
    }

    public C7119cqG(int i, int i2) {
        this.d = i;
        this.j = i2;
    }

    /* renamed from: o.cqG$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final void b(final NetflixActivity netflixActivity, View view, final String str) {
            C8632dsu.c((Object) netflixActivity, "");
            C8632dsu.c((Object) view, "");
            C8632dsu.c((Object) str, "");
            view.setOnClickListener(new View.OnClickListener() { // from class: o.cqI
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7119cqG.c.e(NetflixActivity.this, str, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(NetflixActivity netflixActivity, String str, View view) {
            C8632dsu.c((Object) netflixActivity, "");
            C8632dsu.c((Object) str, "");
            C1588aGw.e(netflixActivity).c(bEX.b.e(new Intent("android.intent.action.VIEW", Uri.parse(str))));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C8632dsu.c((Object) recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.e = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        AbstractC7118cqF abstractC7118cqF;
        List<? extends AbstractC7118cqF> list = this.b;
        if (list == null || (abstractC7118cqF = list.get(i)) == null) {
            throw new IndexOutOfBoundsException("MultiTitleNotificationsAdapter - position " + i + " is not valid");
        }
        return abstractC7118cqF.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C8632dsu.a(from, "");
        if (i == 0) {
            C7146cqh b = C7146cqh.b(from, viewGroup, false);
            C8632dsu.a(b, "");
            return new C7158cqt.b(b);
        } else if (i == 1) {
            C7148cqj d = C7148cqj.d(from, viewGroup, false);
            C8632dsu.a(d, "");
            return new C7155cqq.a(d);
        } else if (i == 2) {
            View inflate = from.inflate(this.c ? C7142cqd.a.d : C7142cqd.a.e, viewGroup, false);
            C8632dsu.a(inflate, "");
            return new C7150cql.e(inflate);
        } else if (i == 4) {
            View inflate2 = from.inflate(this.c ? C7142cqd.a.b : C7142cqd.a.c, viewGroup, false);
            C8632dsu.a(inflate2, "");
            return new C7152cqn.d(inflate2);
        } else if (i == 5) {
            C7144cqf d2 = C7144cqf.d(from, viewGroup, false);
            C8632dsu.a(d2, "");
            return new C7124cqL.a(d2);
        } else {
            C7143cqe a2 = C7143cqe.a(from, viewGroup, false);
            C8632dsu.a(a2, "");
            return new C7149cqk.c(a2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        List<? extends AbstractC7118cqF> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C8632dsu.c((Object) viewHolder, "");
        List<? extends AbstractC7118cqF> list = this.b;
        AbstractC7118cqF abstractC7118cqF = list != null ? list.get(i) : null;
        RecyclerView recyclerView = this.e;
        Integer valueOf = recyclerView != null ? Integer.valueOf(recyclerView.getMeasuredWidth()) : null;
        if (viewHolder instanceof C7158cqt.b) {
            C8632dsu.d(abstractC7118cqF);
            ((C7158cqt.b) viewHolder).b((C7158cqt) abstractC7118cqF);
        } else if (viewHolder instanceof C7155cqq.a) {
            C8632dsu.d(abstractC7118cqF);
            ((C7155cqq.a) viewHolder).d((C7155cqq) abstractC7118cqF, valueOf, 1.778f);
        } else if (viewHolder instanceof C7150cql.e) {
            C8632dsu.d(abstractC7118cqF);
            ((C7150cql.e) viewHolder).c((C7150cql) abstractC7118cqF);
        } else if (viewHolder instanceof C7149cqk.c) {
            C8632dsu.d(abstractC7118cqF);
            C7149cqk c7149cqk = (C7149cqk) abstractC7118cqF;
            ((C7149cqk.c) viewHolder).d(c7149cqk, b(c7149cqk.a()), valueOf, b(), this.d, this.j);
        } else if (viewHolder instanceof C7152cqn.d) {
            C8632dsu.d(abstractC7118cqF);
            ((C7152cqn.d) viewHolder).e((C7152cqn) abstractC7118cqF);
        } else if (viewHolder instanceof C7124cqL.a) {
            C8632dsu.d(abstractC7118cqF);
            ((C7124cqL.a) viewHolder).a((C7124cqL) abstractC7118cqF);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C8632dsu.c((Object) viewHolder, "");
        super.onViewRecycled(viewHolder);
        AbstractC7118cqF.a aVar = viewHolder instanceof AbstractC7118cqF.a ? (AbstractC7118cqF.a) viewHolder : null;
        if (aVar != null) {
            aVar.a();
        }
    }

    public String b(NotificationGridTitleAction notificationGridTitleAction) {
        C8632dsu.c((Object) notificationGridTitleAction, "");
        String boxshotWebp = notificationGridTitleAction.boxshotWebp();
        C8632dsu.a(boxshotWebp, "");
        return boxshotWebp;
    }

    public final boolean e(int i) {
        AbstractC7118cqF abstractC7118cqF;
        List<? extends AbstractC7118cqF> list = this.b;
        if (list == null || (abstractC7118cqF = list.get(i)) == null) {
            return false;
        }
        return abstractC7118cqF.h();
    }

    public final boolean b(int i) {
        List<? extends AbstractC7118cqF> list = this.b;
        AbstractC7118cqF abstractC7118cqF = list != null ? list.get(i) : null;
        if (abstractC7118cqF instanceof C7149cqk) {
            return ((C7149cqk) abstractC7118cqF).b();
        }
        return false;
    }

    public final void a(List<? extends AbstractC7118cqF> list) {
        this.b = list;
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((AbstractC7118cqF) it.next()).d() == 5) {
                    z = true;
                    break;
                }
            }
        }
        this.c = z;
        notifyDataSetChanged();
    }
}
