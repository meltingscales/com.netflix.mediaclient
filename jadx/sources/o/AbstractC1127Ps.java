package o;

import io.reactivex.subjects.BehaviorSubject;

/* renamed from: o.Ps  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1127Ps<T> {
    private final BehaviorSubject<T> a;
    private final T b;

    /* JADX INFO: Access modifiers changed from: protected */
    public final BehaviorSubject<T> e() {
        return this.a;
    }

    public AbstractC1127Ps(T t) {
        C8632dsu.c((Object) t, "");
        this.b = t;
        BehaviorSubject<T> createDefault = BehaviorSubject.createDefault(t);
        C8632dsu.a(createDefault, "");
        this.a = createDefault;
    }

    public final T a() {
        T value = this.a.getValue();
        return value == null ? this.b : value;
    }

    public final void d(T t) {
        C8632dsu.c((Object) t, "");
        this.a.onNext(t);
    }
}
