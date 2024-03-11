package o;

import android.app.Activity;
import android.content.Intent;
import com.netflix.cl.model.AppView;
import com.netflix.cl.model.CommandValue;
import io.reactivex.Observable;
import io.reactivex.Single;

/* renamed from: o.zO  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC9934zO {
    CommandValue a();

    Single<Boolean> a(Activity activity);

    Intent b(AppView appView);

    Observable<AbstractC9927zH> b(Activity activity);

    C9936zQ b();

    Class<? extends Activity> c();

    boolean c(Activity activity);

    AppView d();

    boolean d(Activity activity);

    b e();

    boolean e(Activity activity);

    Observable<String> f();

    Observable<Boolean> g();

    /* renamed from: o.zO$b */
    /* loaded from: classes2.dex */
    public static abstract class b {
        private final int e;

        public /* synthetic */ b(int i, C8627dsp c8627dsp) {
            this(i);
        }

        public final int b() {
            return this.e;
        }

        /* renamed from: o.zO$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends b {
            public static final a c = new a();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1488275043;
            }

            public String toString() {
                return "Home";
            }

            private a() {
                super(0, null);
            }
        }

        private b(int i) {
            this.e = i;
        }

        /* renamed from: o.zO$b$d */
        /* loaded from: classes2.dex */
        public static final class d extends b {
            public static final d c = new d();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1106773443;
            }

            public String toString() {
                return "Games";
            }

            private d() {
                super(1, null);
            }
        }

        /* renamed from: o.zO$b$c */
        /* loaded from: classes2.dex */
        public static final class c extends b {
            public static final c b = new c();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 363976044;
            }

            public String toString() {
                return "UpNext";
            }

            private c() {
                super(2, null);
            }
        }

        /* renamed from: o.zO$b$b  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0127b extends b {
            public static final C0127b b = new C0127b();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0127b) {
                    C0127b c0127b = (C0127b) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -388510995;
            }

            public String toString() {
                return "Downloads";
            }

            private C0127b() {
                super(3, null);
            }
        }

        /* renamed from: o.zO$b$e */
        /* loaded from: classes2.dex */
        public static final class e extends b {
            public static final e b = new e();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1505941944;
            }

            public String toString() {
                return "MyNetflix";
            }

            private e() {
                super(4, null);
            }
        }
    }

    /* renamed from: o.zO$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static boolean b(InterfaceC9934zO interfaceC9934zO, Activity activity) {
            C8632dsu.c((Object) activity, "");
            return true;
        }

        public static Observable<AbstractC9927zH> d(InterfaceC9934zO interfaceC9934zO, Activity activity) {
            C8632dsu.c((Object) activity, "");
            Observable<AbstractC9927zH> never = Observable.never();
            C8632dsu.a(never, "");
            return never;
        }

        public static Observable<Boolean> d(InterfaceC9934zO interfaceC9934zO) {
            Observable<Boolean> never = Observable.never();
            C8632dsu.a(never, "");
            return never;
        }

        public static Observable<String> c(InterfaceC9934zO interfaceC9934zO) {
            Observable<String> never = Observable.never();
            C8632dsu.a(never, "");
            return never;
        }

        public static Single<Boolean> c(InterfaceC9934zO interfaceC9934zO, Activity activity) {
            C8632dsu.c((Object) activity, "");
            Single<Boolean> never = Single.never();
            C8632dsu.a(never, "");
            return never;
        }

        public static boolean a(InterfaceC9934zO interfaceC9934zO, Activity activity) {
            C8632dsu.c((Object) activity, "");
            return interfaceC9934zO.c().isAssignableFrom(activity.getClass());
        }
    }
}
