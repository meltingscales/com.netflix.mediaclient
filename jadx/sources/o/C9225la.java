package o;

import com.bugsnag.android.ErrorType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.C9246lv;

/* renamed from: o.la  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9225la implements C9246lv.a {
    public static final e e = new e(null);
    private ErrorType a;
    private String b;
    private final List<C9279mb> c;
    private String d;

    public final ErrorType a() {
        return this.a;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final String b() {
        return this.d;
    }

    public final void b(String str) {
        this.d = str;
    }

    public final String c() {
        return this.b;
    }

    public final List<C9279mb> d() {
        return this.c;
    }

    public final void d(ErrorType errorType) {
        this.a = errorType;
    }

    public C9225la(String str, String str2, C9278ma c9278ma, ErrorType errorType) {
        this.d = str;
        this.b = str2;
        this.a = errorType;
        this.c = c9278ma.e();
    }

    public /* synthetic */ C9225la(String str, String str2, C9278ma c9278ma, ErrorType errorType, int i, C8627dsp c8627dsp) {
        this(str, str2, c9278ma, (i & 8) != 0 ? ErrorType.ANDROID : errorType);
    }

    /* renamed from: o.la$e */
    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final List<C9170kY> d(Throwable th, Collection<String> collection, InterfaceC9200lB interfaceC9200lB) {
            List<Throwable> b = C9287mj.b(th);
            ArrayList arrayList = new ArrayList();
            for (Throwable th2 : b) {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                if (stackTrace == null) {
                    stackTrace = new StackTraceElement[0];
                }
                arrayList.add(new C9170kY(new C9225la(th2.getClass().getName(), th2.getLocalizedMessage(), new C9278ma(stackTrace, collection, interfaceC9200lB), null, 8, null), interfaceC9200lB));
            }
            return arrayList;
        }
    }

    @Override // o.C9246lv.a
    public void toStream(C9246lv c9246lv) {
        c9246lv.e();
        c9246lv.c("errorClass").e(this.d);
        c9246lv.c("message").e(this.b);
        c9246lv.c("type").e(this.a.getDesc$bugsnag_android_core_release());
        c9246lv.c("stacktrace").c(this.c);
        c9246lv.d();
    }
}
