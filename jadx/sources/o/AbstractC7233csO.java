package o;

import io.reactivex.Observable;
import io.reactivex.subjects.BehaviorSubject;
import o.C7170crE;

/* renamed from: o.csO  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC7233csO {
    public static final AbstractC7233csO b;
    private static BehaviorSubject<AbstractC7233csO> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.csO$e */
    /* loaded from: classes4.dex */
    public static abstract class e {
        public abstract e a(int i);

        public abstract e b(int i);

        public abstract e c(int i);

        public abstract e d(int i);

        public abstract e e(int i);

        public abstract e e(boolean z);

        public abstract AbstractC7233csO e();
    }

    public static Observable<AbstractC7233csO> j() {
        return d;
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract boolean h();

    static {
        AbstractC7233csO e2 = g().c(0).d(0).b(0).e(0).a(0).e(false).e();
        b = e2;
        d = BehaviorSubject.createDefault(e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(AbstractC7233csO abstractC7233csO) {
        d.onNext(abstractC7233csO);
    }

    public boolean i() {
        return ((c() - a()) - b()) - e() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e g() {
        return new C7170crE.b();
    }
}
