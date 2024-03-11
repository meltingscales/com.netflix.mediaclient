package o;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.CacheMissException;
import o.InterfaceC9032ht;

/* renamed from: o.im  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9078im implements InterfaceC9032ht.e {
    public static final a e = new a(null);
    private final long a;
    private final long b;
    private final boolean c;
    private final CacheMissException d;
    private final long f;
    private final ApolloException g;
    private final long i;

    public /* synthetic */ C9078im(long j, long j2, long j3, long j4, boolean z, CacheMissException cacheMissException, ApolloException apolloException, C8627dsp c8627dsp) {
        this(j, j2, j3, j4, z, cacheMissException, apolloException);
    }

    @Override // o.InterfaceC9032ht.e
    public InterfaceC9032ht.b<?> a() {
        return e;
    }

    public final boolean e() {
        return this.c;
    }

    private C9078im(long j, long j2, long j3, long j4, boolean z, CacheMissException cacheMissException, ApolloException apolloException) {
        this.a = j;
        this.b = j2;
        this.f = j3;
        this.i = j4;
        this.c = z;
        this.d = cacheMissException;
        this.g = apolloException;
    }

    /* renamed from: o.im$a */
    /* loaded from: classes2.dex */
    public static final class a implements InterfaceC9032ht.b<C9078im> {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }
    }

    public final b d() {
        return new b().c(this.a).e(this.b).b(this.f).d(this.i).e(this.c).c(this.g);
    }

    /* renamed from: o.im$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private long a;
        private CacheMissException b;
        private boolean c;
        private long d;
        private long e;
        private ApolloException f;
        private long g;

        public final b b(long j) {
            this.g = j;
            return this;
        }

        public final b c(long j) {
            this.e = j;
            return this;
        }

        public final b c(ApolloException apolloException) {
            this.f = apolloException;
            return this;
        }

        public final b d(long j) {
            this.d = j;
            return this;
        }

        public final b e(long j) {
            this.a = j;
            return this;
        }

        public final b e(CacheMissException cacheMissException) {
            this.b = cacheMissException;
            return this;
        }

        public final b e(boolean z) {
            this.c = z;
            return this;
        }

        public final C9078im b() {
            return new C9078im(this.e, this.a, this.g, this.d, this.c, this.b, this.f, null);
        }
    }
}
