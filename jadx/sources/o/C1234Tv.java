package o;

import io.reactivex.Observable;
import java.util.List;

/* renamed from: o.Tv  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1234Tv extends AbstractC1224Tl<InterfaceC5195buF> {
    private final List<InterfaceC5195buF> d;

    /* JADX WARN: Multi-variable type inference failed */
    public C1234Tv(List<? extends InterfaceC5195buF> list) {
        C8632dsu.c((Object) list, "");
        this.d = list;
    }

    @Override // o.AbstractC1224Tl
    public int a() {
        return this.d.size();
    }

    @Override // o.AbstractC1224Tl
    public String e(int i) {
        String id = b(i).getId();
        C8632dsu.a(id, "");
        return id;
    }

    @Override // o.AbstractC1224Tl
    public String a(int i) {
        String title = b(i).getTitle();
        if (title == null || title.length() == 0) {
            String a = C8168dfL.a(com.netflix.mediaclient.ui.R.o.ak, Integer.valueOf(i + 1));
            C8632dsu.a(a, "");
            return a;
        }
        String title2 = b(i).getTitle();
        C8632dsu.a(title2, "");
        return title2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC1224Tl
    /* renamed from: g */
    public InterfaceC5195buF b(int i) {
        return this.d.get(i);
    }

    @Override // o.AbstractC1224Tl
    public Observable<List<InterfaceC5195buF>> d(boolean z) {
        Observable<List<InterfaceC5195buF>> just = Observable.just(this.d);
        C8632dsu.a(just, "");
        return just;
    }
}
