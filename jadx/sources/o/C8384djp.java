package o;

import com.netflix.msl.MslConstants;
import com.netflix.msl.util.MslContext;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* renamed from: o.djp  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C8384djp extends MslContext {
    private final b a;
    private final InterfaceC8385djq b;
    private final djG c;
    Set<C8404dki> d;
    private final Map<djI, djK> e;
    private final Random f;
    private final AbstractC8393djy g;
    private final Map<C8415dkt, AbstractC8411dkp> h;
    private final AbstractC8399dkd i;
    private final InterfaceC8429dlg j;
    private final InterfaceC8381djm m;

    /* renamed from: o  reason: collision with root package name */
    private final dkS f13850o;

    /* renamed from: o.djp$b */
    /* loaded from: classes5.dex */
    public interface b {
        long d();
    }

    @Override // com.netflix.msl.util.MslContext
    public djG a(MslContext.ReauthCode reauthCode) {
        return this.c;
    }

    @Override // com.netflix.msl.util.MslContext
    public AbstractC8393djy b() {
        return this.g;
    }

    public void b(Set<C8404dki> set) {
        this.d = set;
    }

    @Override // com.netflix.msl.util.MslContext
    public AbstractC8399dkd e() {
        return this.i;
    }

    @Override // com.netflix.msl.util.MslContext
    public AbstractC8425dlc e(dkZ dkz) {
        return null;
    }

    @Override // com.netflix.msl.util.MslContext
    public boolean g() {
        return false;
    }

    @Override // com.netflix.msl.util.MslContext
    public InterfaceC8429dlg h() {
        return this.j;
    }

    @Override // com.netflix.msl.util.MslContext
    public dkS i() {
        return this.f13850o;
    }

    @Override // com.netflix.msl.util.MslContext
    public Random j() {
        return this.f;
    }

    /* renamed from: o.djp$a */
    /* loaded from: classes5.dex */
    public static class a {
        private djG a;
        private InterfaceC8385djq b;
        private ArrayList<djI> c;
        private Set<C8404dki> d;
        private b e;
        private AbstractC8393djy f;
        private ArrayList<djK> g;
        private AbstractC8399dkd h;
        private ArrayList<AbstractC8411dkp> i;
        private ArrayList<C8415dkt> j;
        private Random l;
        private InterfaceC8429dlg m;
        private InterfaceC8381djm n;

        /* renamed from: o  reason: collision with root package name */
        private dkS f13851o;

        public a b(djG djg) {
            this.a = djg;
            return this;
        }

        public a b(AbstractC8399dkd abstractC8399dkd) {
            this.h = abstractC8399dkd;
            return this;
        }

        public a c(InterfaceC8429dlg interfaceC8429dlg) {
            this.m = interfaceC8429dlg;
            return this;
        }

        public a d(Set<C8404dki> set) {
            this.d = set;
            return this;
        }

        a() {
        }

        public a c(Map<? extends djI, ? extends djK> map) {
            if (map != null) {
                if (this.c == null) {
                    this.c = new ArrayList<>();
                    this.g = new ArrayList<>();
                }
                for (Map.Entry<? extends djI, ? extends djK> entry : map.entrySet()) {
                    this.c.add(entry.getKey());
                    this.g.add(entry.getValue());
                }
                return this;
            }
            throw new NullPointerException("entityAuthFactories cannot be null");
        }

        public a d(Map<? extends C8415dkt, ? extends AbstractC8411dkp> map) {
            if (map != null) {
                if (this.j == null) {
                    this.j = new ArrayList<>();
                    this.i = new ArrayList<>();
                }
                for (Map.Entry<? extends C8415dkt, ? extends AbstractC8411dkp> entry : map.entrySet()) {
                    this.j.add(entry.getKey());
                    this.i.add(entry.getValue());
                }
                return this;
            }
            throw new NullPointerException("keyxFactories cannot be null");
        }

        public C8384djp d() {
            Map emptyMap;
            Map emptyMap2;
            ArrayList<djI> arrayList = this.c;
            int size = arrayList == null ? 0 : arrayList.size();
            if (size == 0) {
                emptyMap = Collections.emptyMap();
            } else if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(this.c.size() < 1073741824 ? this.c.size() + 1 + ((this.c.size() - 3) / 3) : Integer.MAX_VALUE);
                for (int i = 0; i < this.c.size(); i++) {
                    linkedHashMap.put(this.c.get(i), this.g.get(i));
                }
                emptyMap = Collections.unmodifiableMap(linkedHashMap);
            } else {
                emptyMap = Collections.singletonMap(this.c.get(0), this.g.get(0));
            }
            Map map = emptyMap;
            ArrayList<C8415dkt> arrayList2 = this.j;
            int size2 = arrayList2 == null ? 0 : arrayList2.size();
            if (size2 == 0) {
                emptyMap2 = Collections.emptyMap();
            } else if (size2 != 1) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(this.j.size() < 1073741824 ? this.j.size() + 1 + ((this.j.size() - 3) / 3) : Integer.MAX_VALUE);
                for (int i2 = 0; i2 < this.j.size(); i2++) {
                    linkedHashMap2.put(this.j.get(i2), this.i.get(i2));
                }
                emptyMap2 = Collections.unmodifiableMap(linkedHashMap2);
            } else {
                emptyMap2 = Collections.singletonMap(this.j.get(0), this.i.get(0));
            }
            return new C8384djp(this.e, this.l, this.f, this.f13851o, this.a, map, emptyMap2, this.m, this.n, this.b, this.h, this.d);
        }

        public String toString() {
            return "ClientMslContext.ClientMslContextBuilder(clock=" + this.e + ", random=" + this.l + ", mslCryptoContext=" + this.f + ", tokenFactory=" + this.f13851o + ", entityAuthData=" + this.a + ", entityAuthFactories$key=" + this.c + ", entityAuthFactories$value=" + this.g + ", keyxFactories$key=" + this.j + ", keyxFactories$value=" + this.i + ", mslStore=" + this.m + ", rsaStore=" + this.n + ", eccStore=" + this.b + ", mslEncoderFactory=" + this.h + ", encoderFormats=" + this.d + ")";
        }
    }

    public static a a() {
        return new a();
    }

    public C8384djp(b bVar, Random random, AbstractC8393djy abstractC8393djy, dkS dks, djG djg, Map<djI, djK> map, Map<C8415dkt, AbstractC8411dkp> map2, InterfaceC8429dlg interfaceC8429dlg, InterfaceC8381djm interfaceC8381djm, InterfaceC8385djq interfaceC8385djq, AbstractC8399dkd abstractC8399dkd, Set<C8404dki> set) {
        this.a = bVar == null ? new e() : bVar;
        this.f = random == null ? new SecureRandom() : random;
        this.g = abstractC8393djy == null ? new C8391djw() : abstractC8393djy;
        this.f13850o = dks == null ? new dkN() : dks;
        this.c = djg;
        this.e = map;
        this.h = map2;
        this.j = interfaceC8429dlg;
        this.m = interfaceC8381djm;
        this.b = interfaceC8385djq;
        this.i = abstractC8399dkd == null ? new djY() : abstractC8399dkd;
        HashSet hashSet = new HashSet();
        hashSet.add(C8404dki.b);
        this.d = set == null ? hashSet : set;
    }

    /* renamed from: o.djp$e */
    /* loaded from: classes5.dex */
    public static class e implements b {
        @Override // o.C8384djp.b
        public long d() {
            return System.currentTimeMillis();
        }
    }

    @Override // com.netflix.msl.util.MslContext
    public long f() {
        return this.a.d();
    }

    @Override // com.netflix.msl.util.MslContext
    public C8421dkz c() {
        HashSet hashSet = new HashSet();
        hashSet.add(MslConstants.CompressionAlgorithm.GZIP);
        hashSet.add(MslConstants.CompressionAlgorithm.LZW);
        return new C8421dkz(hashSet, null, this.d);
    }

    @Override // com.netflix.msl.util.MslContext
    public djI a(String str) {
        return djI.a(str);
    }

    @Override // com.netflix.msl.util.MslContext
    public djK d(djI dji) {
        return this.e.get(dji);
    }

    @Override // com.netflix.msl.util.MslContext
    public dkZ e(String str) {
        return dkZ.d(str);
    }

    @Override // com.netflix.msl.util.MslContext
    public C8415dkt b(String str) {
        return C8415dkt.e(str);
    }

    @Override // com.netflix.msl.util.MslContext
    public AbstractC8411dkp c(C8415dkt c8415dkt) {
        return this.h.get(c8415dkt);
    }

    @Override // com.netflix.msl.util.MslContext
    public SortedSet<AbstractC8411dkp> d() {
        return new TreeSet(this.h.values());
    }
}
