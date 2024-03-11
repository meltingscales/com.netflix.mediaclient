package o;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import o.C8671duf;
import o.C8680duo;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.duo  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C8680duo implements InterfaceC8678dum {
    private final CharSequence a;
    private final InterfaceC8676duk b;
    private List<String> c;
    private final Matcher d;

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult i() {
        return this.d;
    }

    @Override // o.InterfaceC8678dum
    public InterfaceC8676duk e() {
        return this.b;
    }

    public C8680duo(Matcher matcher, CharSequence charSequence) {
        C8632dsu.c((Object) matcher, "");
        C8632dsu.c((Object) charSequence, "");
        this.d = matcher;
        this.a = charSequence;
        this.b = new b();
    }

    @Override // o.InterfaceC8678dum
    public C8654dtp d() {
        C8654dtp e2;
        e2 = C8679dun.e(i());
        return e2;
    }

    @Override // o.InterfaceC8678dum
    public String c() {
        String group = i().group();
        C8632dsu.a(group, "");
        return group;
    }

    /* renamed from: o.duo$b */
    /* loaded from: classes5.dex */
    public static final class b extends dpQ<C8671duf> implements InterfaceC8677dul {
        @Override // o.dpQ, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        b() {
        }

        public boolean b(C8671duf c8671duf) {
            return super.contains(c8671duf);
        }

        @Override // o.dpQ, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj == null || (obj instanceof C8671duf)) {
                return b((C8671duf) obj);
            }
            return false;
        }

        @Override // o.dpQ
        public int getSize() {
            return C8680duo.this.i().groupCount() + 1;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<C8671duf> iterator() {
            C8654dtp f;
            dtQ C;
            dtQ k;
            f = C8569dql.f(this);
            C = C8576dqs.C(f);
            k = C8670due.k(C, new drM<Integer, C8671duf>() { // from class: kotlin.text.MatcherMatchResult$groups$1$iterator$1
                {
                    super(1);
                }

                public final C8671duf c(int i) {
                    return C8680duo.b.this.d(i);
                }

                @Override // o.drM
                public /* synthetic */ C8671duf invoke(Integer num) {
                    return c(num.intValue());
                }
            });
            return k.iterator();
        }

        @Override // o.InterfaceC8676duk
        public C8671duf d(int i) {
            C8654dtp a;
            a = C8679dun.a(C8680duo.this.i(), i);
            if (a.h().intValue() >= 0) {
                String group = C8680duo.this.i().group(i);
                C8632dsu.a(group, "");
                return new C8671duf(group, a);
            }
            return null;
        }

        @Override // o.InterfaceC8677dul
        public C8671duf e(String str) {
            C8632dsu.c((Object) str, "");
            return C8596drl.a.c(C8680duo.this.i(), str);
        }
    }

    /* renamed from: o.duo$e */
    /* loaded from: classes5.dex */
    public static final class e extends dpT<String> {
        e() {
        }

        public int b(String str) {
            return super.lastIndexOf(str);
        }

        public boolean c(String str) {
            return super.contains(str);
        }

        @Override // o.dpQ, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            if (obj instanceof String) {
                return c((String) obj);
            }
            return false;
        }

        public int e(String str) {
            return super.indexOf(str);
        }

        @Override // o.dpT, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof String) {
                return e((String) obj);
            }
            return -1;
        }

        @Override // o.dpT, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return b((String) obj);
            }
            return -1;
        }

        @Override // o.dpQ
        public int getSize() {
            return C8680duo.this.i().groupCount() + 1;
        }

        @Override // o.dpT, java.util.List
        /* renamed from: b */
        public String get(int i) {
            String group = C8680duo.this.i().group(i);
            return group == null ? "" : group;
        }
    }

    @Override // o.InterfaceC8678dum
    public List<String> a() {
        if (this.c == null) {
            this.c = new e();
        }
        List<String> list = this.c;
        C8632dsu.d(list);
        return list;
    }

    @Override // o.InterfaceC8678dum
    public InterfaceC8678dum b() {
        InterfaceC8678dum c;
        int end = i().end() + (i().end() == i().start() ? 1 : 0);
        if (end <= this.a.length()) {
            Matcher matcher = this.d.pattern().matcher(this.a);
            C8632dsu.a(matcher, "");
            c = C8679dun.c(matcher, end, this.a);
            return c;
        }
        return null;
    }
}
