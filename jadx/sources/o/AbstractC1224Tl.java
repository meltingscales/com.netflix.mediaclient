package o;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.util.List;

/* renamed from: o.Tl  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1224Tl<T> {
    private PublishSubject<Integer> a;
    private PublishSubject<T> c;
    private int d;
    private int e = -1;

    public abstract int a();

    public abstract String a(int i);

    protected abstract T b(int i);

    public final int c() {
        return this.d;
    }

    public final void c(int i) {
        this.d = i;
    }

    public final Observable<? extends T> d() {
        return this.c;
    }

    public abstract Observable<List<T>> d(boolean z);

    public final Observable<Integer> e() {
        return this.a;
    }

    public abstract String e(int i);

    public final int j() {
        return this.e;
    }

    public AbstractC1224Tl() {
        PublishSubject<T> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.c = create;
        PublishSubject<Integer> create2 = PublishSubject.create();
        C8632dsu.a(create2, "");
        this.a = create2;
        this.d = -1;
    }

    public final void d(int i) {
        if (this.e == i) {
            return;
        }
        this.e = i;
        this.c.onNext(b(i));
        this.a.onNext(Integer.valueOf(i));
    }

    public final T b() {
        int i = this.e;
        if (i == -1) {
            i = 0;
        }
        return b(i);
    }

    public void h() {
        this.c.onComplete();
        PublishSubject<T> create = PublishSubject.create();
        C8632dsu.a(create, "");
        this.c = create;
        this.a.onComplete();
        PublishSubject<Integer> create2 = PublishSubject.create();
        C8632dsu.a(create2, "");
        this.a = create2;
    }
}
