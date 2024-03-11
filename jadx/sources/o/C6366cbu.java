package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.ui.login.countrySelector.PhoneCodeListWrapper;
import java.util.Comparator;
import java.util.List;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import o.C6321cbB;
import o.C6363cbr;
import o.C8632dsu;

/* renamed from: o.cbu  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6366cbu extends RecyclerView.Adapter<d> {
    private C6321cbB.e a;
    private List<PhoneCodeListWrapper> e;

    public C6366cbu(C6321cbB.e eVar, List<PhoneCodeListWrapper> list) {
        this.a = eVar;
        this.e = list;
        this.e = b(list);
    }

    public final List<PhoneCodeListWrapper> b(List<PhoneCodeListWrapper> list) {
        Comparator compareBy;
        List<PhoneCodeListWrapper> c;
        if (list != null) {
            compareBy = ComparisonsKt__ComparisonsKt.compareBy(new drM<PhoneCodeListWrapper, Comparable<?>>() { // from class: com.netflix.mediaclient.ui.login.countrySelector.CountryAdapter$sortData$1
                @Override // o.drM
                /* renamed from: b */
                public final Comparable<?> invoke(PhoneCodeListWrapper phoneCodeListWrapper) {
                    C8632dsu.c((Object) phoneCodeListWrapper, "");
                    return Boolean.valueOf(!phoneCodeListWrapper.e());
                }
            }, new drM<PhoneCodeListWrapper, Comparable<?>>() { // from class: com.netflix.mediaclient.ui.login.countrySelector.CountryAdapter$sortData$2
                @Override // o.drM
                /* renamed from: c */
                public final Comparable<?> invoke(PhoneCodeListWrapper phoneCodeListWrapper) {
                    C8632dsu.c((Object) phoneCodeListWrapper, "");
                    return phoneCodeListWrapper.b().getName();
                }
            });
            c = C8576dqs.c((Iterable) list, compareBy);
            return c;
        }
        return null;
    }

    public final void d(List<PhoneCodeListWrapper> list) {
        this.e = b(list);
        notifyDataSetChanged();
    }

    /* renamed from: o.cbu$d */
    /* loaded from: classes4.dex */
    public final class d extends RecyclerView.ViewHolder {
        private final C6326cbG a;
        private final TextView b;
        private final TextView c;
        final /* synthetic */ C6366cbu e;

        public final TextView c() {
            return this.c;
        }

        public final TextView d() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C6366cbu c6366cbu, View view) {
            super(view);
            C8632dsu.c((Object) view, "");
            this.e = c6366cbu;
            C6326cbG e = C6326cbG.e(view);
            C8632dsu.a(e, "");
            this.a = e;
            TextView textView = e.b;
            C8632dsu.a(textView, "");
            this.b = textView;
            TextView textView2 = e.a;
            C8632dsu.a(textView2, "");
            this.c = textView2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d */
    public d onCreateViewHolder(ViewGroup viewGroup, int i) {
        C8632dsu.c((Object) viewGroup, "");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C6363cbr.d.b, viewGroup, false);
        C8632dsu.d(inflate);
        return new d(this, inflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e */
    public void onBindViewHolder(d dVar, int i) {
        Context context;
        C8632dsu.c((Object) dVar, "");
        List<PhoneCodeListWrapper> list = this.e;
        final PhoneCodeListWrapper phoneCodeListWrapper = list != null ? list.get(i) : null;
        if ((phoneCodeListWrapper != null ? phoneCodeListWrapper.b() : null) != null) {
            String name = phoneCodeListWrapper.b().getName();
            String code = phoneCodeListWrapper.b().getCode();
            TextView d2 = dVar.d();
            View view = dVar.itemView;
            d2.setText((view == null || (context = view.getContext()) == null) ? null : context.getString(com.netflix.mediaclient.ui.R.o.aB, name, code));
            dVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: o.cbv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C6366cbu.c(C6366cbu.this, phoneCodeListWrapper, view2);
                }
            });
            if (phoneCodeListWrapper.e()) {
                dVar.c().setVisibility(0);
                dVar.itemView.setBackgroundResource(com.netflix.mediaclient.ui.R.e.aQ);
                return;
            }
            dVar.c().setVisibility(8);
            dVar.itemView.setBackground(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C6366cbu c6366cbu, PhoneCodeListWrapper phoneCodeListWrapper, View view) {
        C8632dsu.c((Object) c6366cbu, "");
        C6321cbB.e eVar = c6366cbu.a;
        if (eVar != null) {
            eVar.b(phoneCodeListWrapper.b());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<PhoneCodeListWrapper> list = this.e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
