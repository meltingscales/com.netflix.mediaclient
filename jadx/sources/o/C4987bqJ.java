package o;

import com.netflix.mediaclient.StatusCode;
import io.reactivex.subjects.PublishSubject;

/* renamed from: o.bqJ  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4987bqJ {
    private static final PublishSubject<dpR> a;
    public static final C4987bqJ b = new C4987bqJ();
    private static final PublishSubject<Boolean> c;
    private static final PublishSubject<StatusCode> d;
    private static final PublishSubject<dpR> e;
    private static final PublishSubject<dpR> f;
    private static final PublishSubject<dpR> g;
    private static final PublishSubject<dpR> h;
    private static final PublishSubject<InterfaceC5283bvo> i;
    private static final PublishSubject<dpR> j;

    public static final PublishSubject<dpR> a() {
        return a;
    }

    public static final PublishSubject<dpR> b() {
        return e;
    }

    public static final PublishSubject<dpR> c() {
        return g;
    }

    public static final PublishSubject<Boolean> d() {
        return c;
    }

    public static final PublishSubject<StatusCode> e() {
        return d;
    }

    public static final PublishSubject<dpR> f() {
        return h;
    }

    public static final PublishSubject<dpR> g() {
        return j;
    }

    public static final PublishSubject<InterfaceC5283bvo> h() {
        return i;
    }

    public static final PublishSubject<dpR> i() {
        return f;
    }

    private C4987bqJ() {
    }

    static {
        PublishSubject<dpR> create = PublishSubject.create();
        C8632dsu.a(create, "");
        g = create;
        PublishSubject<dpR> create2 = PublishSubject.create();
        C8632dsu.a(create2, "");
        j = create2;
        PublishSubject<InterfaceC5283bvo> create3 = PublishSubject.create();
        C8632dsu.a(create3, "");
        i = create3;
        PublishSubject<dpR> create4 = PublishSubject.create();
        C8632dsu.a(create4, "");
        h = create4;
        PublishSubject<dpR> create5 = PublishSubject.create();
        C8632dsu.a(create5, "");
        f = create5;
        PublishSubject<dpR> create6 = PublishSubject.create();
        C8632dsu.a(create6, "");
        e = create6;
        PublishSubject<StatusCode> create7 = PublishSubject.create();
        C8632dsu.a(create7, "");
        d = create7;
        PublishSubject<Boolean> create8 = PublishSubject.create();
        C8632dsu.a(create8, "");
        c = create8;
        PublishSubject<dpR> create9 = PublishSubject.create();
        C8632dsu.a(create9, "");
        a = create9;
    }
}
