package o;

import android.annotation.SuppressLint;
import android.util.LruCache;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.AdInterstitialType;
import com.netflix.mediaclient.ui.player.PlayerAdsListenerImpl$onAdsInterstitial$3;
import com.netflix.mediaclient.ui.player.PlayerPictureInPictureManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C7490cxG;
import o.C8632dsu;
import o.C9935zP;
import o.InterfaceC5215buZ;
import o.InterfaceC5270bvb;
import o.cAY;
import o.cBA;
import o.dpR;

/* renamed from: o.cxG  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7490cxG implements InterfaceC5210buU {
    public static final a e = new a(null);
    private final PlayerPictureInPictureManager a;
    private final C9935zP b;
    private long c;
    private final LruCache<Long, d> d;

    /* renamed from: o.cxG$e */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[AdInterstitialType.values().length];
            try {
                iArr[AdInterstitialType.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdInterstitialType.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            c = iArr;
        }
    }

    public C7490cxG(C9935zP c9935zP, PlayerPictureInPictureManager playerPictureInPictureManager) {
        C8632dsu.c((Object) c9935zP, "");
        this.b = c9935zP;
        this.a = playerPictureInPictureManager;
        this.d = new LruCache<>(4);
        this.c = -1L;
    }

    /* renamed from: o.cxG$a */
    /* loaded from: classes4.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("PlayerAdsListenerImpl");
        }
    }

    @Override // o.InterfaceC5210buU
    public void c(long j, InterfaceC5214buY interfaceC5214buY, long j2) {
        C8632dsu.c((Object) interfaceC5214buY, "");
        InterfaceC5270bvb d2 = d(j);
        if (d2 != null) {
            int e2 = e(d2, interfaceC5214buY);
            e.getLogTag();
            this.b.b(cBA.class, new cAY.e(d2, e2, j2));
        }
    }

    private final InterfaceC5270bvb d(long j) {
        List<InterfaceC5270bvb> e2;
        d dVar = this.d.get(Long.valueOf(this.c));
        Object obj = null;
        if (dVar == null || (e2 = dVar.e()) == null) {
            return null;
        }
        Iterator<T> it = e2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((InterfaceC5270bvb) next).f() == j) {
                obj = next;
                break;
            }
        }
        return (InterfaceC5270bvb) obj;
    }

    private final InterfaceC5215buZ b() {
        d dVar = this.d.get(Long.valueOf(this.c));
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    private final int e(InterfaceC5270bvb interfaceC5270bvb, InterfaceC5214buY interfaceC5214buY) {
        int d2;
        List<InterfaceC5269bva> a2 = interfaceC5270bvb.a();
        d2 = C8572dqo.d(a2, 10);
        ArrayList arrayList = new ArrayList(d2);
        for (InterfaceC5269bva interfaceC5269bva : a2) {
            arrayList.add(interfaceC5269bva.h());
        }
        return arrayList.indexOf(interfaceC5214buY);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.cxG$d */
    /* loaded from: classes4.dex */
    public static final class d {
        private final InterfaceC5215buZ b;
        private final List<InterfaceC5270bvb> e;

        public d() {
            this(null, null, 3, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d c(d dVar, InterfaceC5215buZ interfaceC5215buZ, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                interfaceC5215buZ = dVar.b;
            }
            if ((i & 2) != 0) {
                list = dVar.e;
            }
            return dVar.d(interfaceC5215buZ, list);
        }

        public final InterfaceC5215buZ c() {
            return this.b;
        }

        public final d d(InterfaceC5215buZ interfaceC5215buZ, List<? extends InterfaceC5270bvb> list) {
            C8632dsu.c((Object) interfaceC5215buZ, "");
            C8632dsu.c((Object) list, "");
            return new d(interfaceC5215buZ, list);
        }

        public final List<InterfaceC5270bvb> e() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return C8632dsu.c(this.b, dVar.b) && C8632dsu.c(this.e, dVar.e);
            }
            return false;
        }

        public int hashCode() {
            return (this.b.hashCode() * 31) + this.e.hashCode();
        }

        public String toString() {
            InterfaceC5215buZ interfaceC5215buZ = this.b;
            List<InterfaceC5270bvb> list = this.e;
            return "AdBreaksData(adsUIPolicy=" + interfaceC5215buZ + ", validAdBreaks=" + list + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(InterfaceC5215buZ interfaceC5215buZ, List<? extends InterfaceC5270bvb> list) {
            C8632dsu.c((Object) interfaceC5215buZ, "");
            C8632dsu.c((Object) list, "");
            this.b = interfaceC5215buZ;
            this.e = list;
        }

        public /* synthetic */ d(InterfaceC5215buZ interfaceC5215buZ, List list, int i, C8627dsp c8627dsp) {
            this((i & 1) != 0 ? C4642biP.b.b() : interfaceC5215buZ, (i & 2) != 0 ? C8569dql.i() : list);
        }
    }

    @Override // o.InterfaceC5210buU
    public void e(long j, InterfaceC5215buZ interfaceC5215buZ) {
        d dVar;
        C8632dsu.c((Object) interfaceC5215buZ, "");
        e.getLogTag();
        LruCache<Long, d> lruCache = this.d;
        d dVar2 = lruCache.get(Long.valueOf(j));
        if (dVar2 == null || (dVar = d.c(dVar2, interfaceC5215buZ, null, 2, null)) == null) {
            dVar = new d(interfaceC5215buZ, null, 2, null);
        }
        lruCache.put(Long.valueOf(j), dVar);
    }

    @Override // o.InterfaceC5210buU
    public void d(long j, List<? extends InterfaceC5270bvb> list) {
        d dVar;
        int d2;
        C8632dsu.c((Object) list, "");
        e.getLogTag();
        ArrayList<InterfaceC5270bvb> arrayList = new ArrayList();
        for (Object obj : list) {
            if (true ^ ((InterfaceC5270bvb) obj).i()) {
                arrayList.add(obj);
            }
        }
        LruCache<Long, d> lruCache = this.d;
        d dVar2 = lruCache.get(Long.valueOf(j));
        if (dVar2 == null || (dVar = d.c(dVar2, null, arrayList, 1, null)) == null) {
            dVar = new d(null, arrayList, 1, null);
        }
        lruCache.put(Long.valueOf(j), dVar);
        if (j == this.c) {
            d2 = C8572dqo.d(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(d2);
            for (InterfaceC5270bvb interfaceC5270bvb : arrayList) {
                arrayList2.add(Long.valueOf(interfaceC5270bvb.f()));
            }
            this.b.b(cBA.class, new cBA.C5562x(arrayList2));
        }
    }

    @Override // o.InterfaceC5210buU
    @SuppressLint({"NewApi"})
    public void e(long j) {
        e.getLogTag();
        C9726vo.d(d(j), b(), new drX<InterfaceC5270bvb, InterfaceC5215buZ, dpR>() { // from class: com.netflix.mediaclient.ui.player.PlayerAdsListenerImpl$onAdBreakStart$2
            {
                super(2);
            }

            @Override // o.drX
            public /* synthetic */ dpR invoke(InterfaceC5270bvb interfaceC5270bvb, InterfaceC5215buZ interfaceC5215buZ) {
                a(interfaceC5270bvb, interfaceC5215buZ);
                return dpR.c;
            }

            public final void a(InterfaceC5270bvb interfaceC5270bvb, InterfaceC5215buZ interfaceC5215buZ) {
                C9935zP c9935zP;
                C9935zP c9935zP2;
                PlayerPictureInPictureManager playerPictureInPictureManager;
                C8632dsu.c((Object) interfaceC5270bvb, "");
                C8632dsu.c((Object) interfaceC5215buZ, "");
                c9935zP = C7490cxG.this.b;
                c9935zP.b(cBA.class, new cAY.d(interfaceC5270bvb, interfaceC5215buZ));
                c9935zP2 = C7490cxG.this.b;
                c9935zP2.b(cBA.class, new cAY.c(interfaceC5270bvb, interfaceC5215buZ));
                playerPictureInPictureManager = C7490cxG.this.a;
                if (playerPictureInPictureManager == null) {
                    return;
                }
                playerPictureInPictureManager.b(true);
            }
        });
    }

    @Override // o.InterfaceC5210buU
    @SuppressLint({"NewApi"})
    public void b(long j) {
        e.getLogTag();
        InterfaceC5270bvb d2 = d(j);
        if (d2 != null) {
            this.b.b(cBA.class, new cAY.b(d2));
            PlayerPictureInPictureManager playerPictureInPictureManager = this.a;
            if (playerPictureInPictureManager == null) {
                return;
            }
            playerPictureInPictureManager.b(false);
        }
    }

    @Override // o.InterfaceC5210buU
    public void a(long j, InterfaceC5214buY interfaceC5214buY) {
        C8632dsu.c((Object) interfaceC5214buY, "");
        e.getLogTag();
    }

    @Override // o.InterfaceC5210buU
    public void c(long j, AdInterstitialType adInterstitialType, long j2) {
        C8632dsu.c((Object) adInterstitialType, "");
        e.getLogTag();
        int i = e.c[adInterstitialType.ordinal()];
        if (i == 1) {
            dpR dpr = (dpR) C9726vo.d(d(j), b(), new drX<InterfaceC5270bvb, InterfaceC5215buZ, dpR>() { // from class: com.netflix.mediaclient.ui.player.PlayerAdsListenerImpl$onAdsInterstitial$2
                {
                    super(2);
                }

                @Override // o.drX
                public /* synthetic */ dpR invoke(InterfaceC5270bvb interfaceC5270bvb, InterfaceC5215buZ interfaceC5215buZ) {
                    e(interfaceC5270bvb, interfaceC5215buZ);
                    return dpR.c;
                }

                public final void e(InterfaceC5270bvb interfaceC5270bvb, InterfaceC5215buZ interfaceC5215buZ) {
                    C9935zP c9935zP;
                    C8632dsu.c((Object) interfaceC5270bvb, "");
                    C8632dsu.c((Object) interfaceC5215buZ, "");
                    c9935zP = C7490cxG.this.b;
                    c9935zP.b(cBA.class, new cAY.d(interfaceC5270bvb, interfaceC5215buZ));
                }
            });
        } else if (i != 2) {
        } else {
            C8737dwr.c(this.b.a(), null, null, new PlayerAdsListenerImpl$onAdsInterstitial$3(j2, this, null), 3, null);
        }
    }

    public final void a(long j) {
        e.getLogTag();
        this.c = j;
    }
}
