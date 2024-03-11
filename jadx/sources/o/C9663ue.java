package o;

import android.widget.SearchView;
import io.reactivex.Observer;
import io.reactivex.android.MainThreadDisposable;

/* renamed from: o.ue  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C9663ue extends AbstractC9616tJ<C9665ug> {
    private final SearchView a;

    public C9663ue(SearchView searchView) {
        C8632dsu.d(searchView, "");
        this.a = searchView;
    }

    @Override // o.AbstractC9616tJ
    public void a(Observer<? super C9665ug> observer) {
        C8632dsu.d(observer, "");
        if (C9617tL.c(observer)) {
            d dVar = new d(this.a, observer);
            this.a.setOnQueryTextListener(dVar);
            observer.onSubscribe(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC9616tJ
    /* renamed from: d */
    public C9665ug a() {
        SearchView searchView = this.a;
        CharSequence query = searchView.getQuery();
        C8632dsu.b(query, "");
        return new C9665ug(searchView, query, false);
    }

    /* renamed from: o.ue$d */
    /* loaded from: classes2.dex */
    static final class d extends MainThreadDisposable implements SearchView.OnQueryTextListener {
        private final Observer<? super C9665ug> a;
        private final SearchView e;

        public d(SearchView searchView, Observer<? super C9665ug> observer) {
            C8632dsu.d(searchView, "");
            C8632dsu.d(observer, "");
            this.e = searchView;
            this.a = observer;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextChange(String str) {
            C8632dsu.d((Object) str, "");
            if (isDisposed()) {
                return false;
            }
            this.a.onNext(new C9665ug(this.e, str, false));
            return true;
        }

        @Override // android.widget.SearchView.OnQueryTextListener
        public boolean onQueryTextSubmit(String str) {
            C8632dsu.d((Object) str, "");
            if (isDisposed()) {
                return false;
            }
            this.a.onNext(new C9665ug(this.e, str, true));
            return true;
        }

        @Override // io.reactivex.android.MainThreadDisposable
        public void onDispose() {
            this.e.setOnQueryTextListener(null);
        }
    }
}
