package o;

import android.os.Bundle;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.NetflixImmutableStatus;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.android.widget.NetflixActionBar;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.ResourceObserver;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import o.cUI;
import o.cUO;

/* loaded from: classes4.dex */
public final class cUI extends NetflixFrag {
    private final e e = new e();

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        RecyclerView recyclerView = new RecyclerView(requireActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new e());
        return recyclerView;
    }

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return this.e.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.ViewHolder {
        private final TextView b;
        private final TextView c;
        private final TextView d;
        private final TextView e;

        public final TextView a() {
            return this.c;
        }

        public final TextView c() {
            return this.b;
        }

        public final TextView d() {
            return this.e;
        }

        public final TextView e() {
            return this.d;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            C8632dsu.c((Object) view, "");
            View findViewById = view.findViewById(com.netflix.mediaclient.ui.R.g.dZ);
            C8632dsu.a(findViewById, "");
            this.d = (TextView) findViewById;
            View findViewById2 = view.findViewById(com.netflix.mediaclient.ui.R.g.dX);
            C8632dsu.a(findViewById2, "");
            this.c = (TextView) findViewById2;
            View findViewById3 = view.findViewById(com.netflix.mediaclient.ui.R.g.dW);
            C8632dsu.a(findViewById3, "");
            this.b = (TextView) findViewById3;
            View findViewById4 = view.findViewById(com.netflix.mediaclient.ui.R.g.dY);
            C8632dsu.a(findViewById4, "");
            this.e = (TextView) findViewById4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class e extends RecyclerView.Adapter<b> {
        private final ArrayList<cUO.c> c = new ArrayList<>();

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        public e() {
            Observable.fromCallable(new Callable() { // from class: o.cUK
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    List b;
                    b = cUI.e.b();
                    return b;
                }
            }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new ResourceObserver<List<? extends cUO.c>>() { // from class: o.cUI.e.2
                @Override // io.reactivex.Observer
                public void onComplete() {
                }

                @Override // io.reactivex.Observer
                /* renamed from: e */
                public void onNext(List<cUO.c> list) {
                    C8632dsu.c((Object) list, "");
                    e.this.c.clear();
                    e.this.c.addAll(list);
                    e.this.notifyDataSetChanged();
                    cUI cui = r2;
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.aJ;
                    C8632dsu.a(netflixImmutableStatus, "");
                    cui.d(netflixImmutableStatus);
                }

                @Override // io.reactivex.Observer
                public void onError(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    cUI cui = r2;
                    NetflixImmutableStatus netflixImmutableStatus = InterfaceC1078Nw.ad;
                    C8632dsu.a(netflixImmutableStatus, "");
                    cui.d(netflixImmutableStatus);
                    throw new RuntimeException("Couldn't load licenses", th);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List b() {
            return new cUO().c(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: b */
        public b onCreateViewHolder(ViewGroup viewGroup, int i) {
            C8632dsu.c((Object) viewGroup, "");
            View inflate = cUI.this.getLayoutInflater().inflate(com.netflix.mediaclient.ui.R.i.aO, viewGroup, false);
            C8632dsu.a(inflate, "");
            return new b(inflate);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.c.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: d */
        public void onBindViewHolder(b bVar, int i) {
            C8632dsu.c((Object) bVar, "");
            cUO.c cVar = this.c.get(i);
            C8632dsu.a(cVar, "");
            cUO.c cVar2 = cVar;
            bVar.e().setText(cVar2.b());
            bVar.a().setText(cVar2.e());
            if (cVar2.d().length() == 0) {
                bVar.c().setVisibility(8);
            } else {
                bVar.c().setText(cVar2.d());
                bVar.c().setVisibility(0);
            }
            bVar.d().setText(cVar2.c());
            Linkify.addLinks(bVar.d(), 1);
        }

        public final boolean c() {
            return this.c.isEmpty();
        }
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public boolean bD_() {
        String string = getString(com.netflix.mediaclient.ui.R.o.fq);
        C8632dsu.a(string, "");
        NetflixActivity bj_ = bj_();
        if (bj_ != null) {
            bj_.setTitle(string);
            NetflixActionBar netflixActionBar = bj_.getNetflixActionBar();
            if (netflixActionBar != null) {
                netflixActionBar.c(bj_.getActionBarStateBuilder().e((CharSequence) string).l(true).b(false).c());
                return true;
            }
        }
        return false;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag
    public void e(View view) {
        C8632dsu.c((Object) view, "");
        view.setPadding(0, ((NetflixFrag) this).d, 0, this.h);
    }
}
