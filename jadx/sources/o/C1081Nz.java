package o;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/* renamed from: o.Nz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1081Nz {
    public static final C1081Nz d = new C1081Nz();
    private static final PublishSubject<Long> e;

    private C1081Nz() {
    }

    static {
        PublishSubject<Long> create = PublishSubject.create();
        C8632dsu.a(create, "");
        e = create;
    }

    public final Observable<Long> d() {
        Observable<Long> hide = e.hide();
        C8632dsu.a(hide, "");
        return hide;
    }

    public final void d(long j) {
        e.onNext(Long.valueOf(j));
    }
}
