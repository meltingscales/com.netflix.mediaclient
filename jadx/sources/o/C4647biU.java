package o;

import android.os.Handler;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyC4PlayerControls;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.AdInterstitialType;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import com.netflix.mediaclient.util.PlayContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C4592bhS;
import o.C4642biP;
import o.C4651biY;
import o.C5273bve;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;

/* renamed from: o.biU  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4647biU extends C4592bhS implements InterfaceC4639biM {
    public static final d c = new d(null);
    private InterfaceC5210buU b;
    private final List<String> f;
    private final b g;
    private final C4649biW h;
    private final Handler i;
    private C4710bje j;

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public void setAdsListener(InterfaceC5210buU interfaceC5210buU) {
        C8632dsu.c((Object) interfaceC5210buU, "");
        this.b = interfaceC5210buU;
    }

    /* renamed from: o.biU$d */
    /* loaded from: classes3.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("AdsPlaygraphBroker");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4647biU(C4588bhO c4588bhO, C4886boO c4886boO, Handler handler, C4649biW c4649biW) {
        super(c4588bhO, c4886boO);
        C8632dsu.c((Object) c4588bhO, "");
        C8632dsu.c((Object) c4886boO, "");
        C8632dsu.c((Object) handler, "");
        C8632dsu.c((Object) c4649biW, "");
        this.i = handler;
        this.h = c4649biW;
        this.f = new ArrayList();
        this.g = new b(c4588bhO);
        c4649biW.e(this);
    }

    public final void e(long j, long j2, AbstractC4558bgl abstractC4558bgl, PlayContext playContext) {
        Map k;
        Throwable th;
        C5273bve d2;
        C4642biP.d dVar;
        C5273bve c5273bve;
        long j3;
        long j4;
        boolean z;
        Map<String, C5273bve> linkedHashMap;
        Long l;
        Map k2;
        Throwable th2;
        InterfaceC4652biZ c2 = this.h.c(j);
        List<C4642biP.d> e2 = c2 != null ? c2.e() : null;
        PlaylistMap c3 = c();
        C8632dsu.a(c3, "");
        List<String> d3 = C4706bja.d(j, c3);
        d3.size();
        if (d3.size() != 1) {
            InterfaceC1597aHe.d dVar2 = InterfaceC1597aHe.b;
            k2 = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd = new C1596aHd("ADS - " + j + " does not have one segment " + d3, null, null, true, k2, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th2 = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th2 = new Throwable(c1596aHd.b());
            } else {
                th2 = c1596aHd.i;
                if (th2 == null) {
                    th2 = new Throwable("Handled exception with no message");
                } else if (th2 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar3 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c4 = dVar3.c();
            if (c4 != null) {
                c4.d(c1596aHd, th2);
                return;
            } else {
                dVar3.e().b(c1596aHd, th2);
                return;
            }
        }
        String str = d3.get(0);
        C5209buT a = c().a(str);
        long j5 = a.c;
        C8632dsu.d(a);
        e(a);
        if (a.c != 0 || !e(a)) {
            InterfaceC1597aHe.d dVar4 = InterfaceC1597aHe.b;
            k = dqE.k(new LinkedHashMap());
            C1596aHd c1596aHd2 = new C1596aHd("ADS - " + str + " incorrect time [" + a.c + ", " + a.b, null, null, true, k, false, false, 96, null);
            ErrorType errorType2 = c1596aHd2.a;
            if (errorType2 != null) {
                c1596aHd2.e.put("errorType", errorType2.c());
                String b3 = c1596aHd2.b();
                if (b3 != null) {
                    c1596aHd2.a(errorType2.c() + " " + b3);
                }
            }
            if (c1596aHd2.b() != null && c1596aHd2.i != null) {
                th = new Throwable(c1596aHd2.b(), c1596aHd2.i);
            } else if (c1596aHd2.b() != null) {
                th = new Throwable(c1596aHd2.b());
            } else {
                th = c1596aHd2.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar5 = InterfaceC1601aHi.c;
            InterfaceC1597aHe c5 = dVar5.c();
            if (c5 != null) {
                c5.d(c1596aHd2, th);
                return;
            } else {
                dVar5.e().b(c1596aHd2, th);
                return;
            }
        }
        C5208buS d4 = abstractC4558bgl != null ? C4527bgG.d(abstractC4558bgl.b(), "contentPlaygraph", j) : null;
        this.j = new C4710bje(j, str);
        C4642biP.d b4 = b(e2, 0);
        if (d4 == null || (d2 = d4.a()) == null) {
            d2 = new C5273bve.b(j).b(0L).e(j2).d();
        }
        if (b4 == null || b4.f() != 0) {
            dVar = b4;
            c5273bve = d2;
        } else {
            dVar = b4;
            c5273bve = new C4651biY.e(j, d2.i).b(0L).c(d2.b).b(d2.a()).a(0L).b((Long) 0L).a();
        }
        C4642biP.d dVar6 = dVar;
        int i = 0;
        while (true) {
            long f = dVar6 != null ? dVar6.f() : -1L;
            if (c5273bve != null) {
                j3 = f;
                j4 = c5273bve.c;
            } else {
                j3 = f;
                j4 = -1;
            }
            int i2 = (j4 > (-1L) ? 1 : (j4 == (-1L) ? 0 : -1));
            if ((i2 != 0 && j3 > j4) || j3 == -1) {
                if (i2 != 0) {
                    C8632dsu.d(c5273bve);
                    z = true;
                    long j6 = e(c5273bve) ? j2 : c5273bve.b;
                    if (dVar6 == null || dVar6.f() >= j6) {
                        C4651biY.e a2 = new C4651biY.e(j, c5273bve.i).b(c5273bve.c).c(j6).a(c5273bve.c);
                        if (c5273bve instanceof C4651biY) {
                            a2.b(((C4651biY) c5273bve).e());
                        }
                        C4710bje c4710bje = this.j;
                        if (c4710bje != null) {
                            c4710bje.c(a2);
                        }
                        String a3 = c5273bve.a();
                        c5273bve = (a3 == null || d4 == null) ? null : d4.a(a3);
                    } else {
                        C4651biY.e a4 = new C4651biY.e(j, c5273bve.i).b(c5273bve.c).c(dVar6.f()).a(c5273bve.c);
                        if (c5273bve instanceof C4651biY) {
                            a4.b(((C4651biY) c5273bve).e());
                        }
                        C4710bje c4710bje2 = this.j;
                        if (c4710bje2 != null) {
                            c4710bje2.c(a4);
                        }
                        c5273bve = new C4651biY.e(j, c5273bve.i).b(dVar6.f()).c(j6).b(c5273bve.a()).a(dVar6.f()).b(Long.valueOf(dVar6.f())).a();
                    }
                    if (dVar6 != null && c5273bve == null) {
                        break;
                    }
                }
            } else {
                C4710bje c4710bje3 = this.j;
                if (c4710bje3 != null) {
                    C8632dsu.d(dVar6);
                    c4710bje3.b(j, dVar6);
                }
                i++;
                dVar6 = b(e2, i);
            }
            z = true;
            if (dVar6 != null) {
            }
        }
        C4710bje c4710bje4 = this.j;
        if (c4710bje4 == null || (linkedHashMap = c4710bje4.c()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        Map<String, Map<String, C4592bhS.a>> map = this.e;
        C8632dsu.a(map, "");
        C4710bje c4710bje5 = this.j;
        map.put(str, c4710bje5 != null ? c4710bje5.a() : null);
        Map<? extends String, ? extends C5273bve> h = c().h();
        C8632dsu.d(h);
        linkedHashMap.putAll(h);
        PlaylistMap c5208buS = new C5208buS(linkedHashMap, c().e(), c().b());
        final PlaylistTimestamp l2 = l();
        PlaylistMap H = H();
        if (H != null) {
            l = Long.valueOf(H.e(l2 != null ? l2.a : null));
        } else {
            l = null;
        }
        e(c5208buS);
        if (l != null && l.longValue() == j) {
            if (playContext == null || playContext.getTrackId() != 13747225 || !ConfigFastPropertyC4PlayerControls.Companion.b()) {
                C8632dsu.d(l2);
                e(c(l2, false));
            } else {
                this.i.postDelayed(new Runnable() { // from class: o.biS
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4647biU.e(C4647biU.this, l2);
                    }
                }, 500L);
            }
        }
        if (e2 == null || e2.size() <= 0) {
            return;
        }
        InterfaceC5210buU interfaceC5210buU = this.b;
        if (interfaceC5210buU != null) {
            interfaceC5210buU.e(j, C4642biP.b.b());
        }
        InterfaceC5210buU interfaceC5210buU2 = this.b;
        if (interfaceC5210buU2 != null) {
            C8632dsu.d(e2);
            interfaceC5210buU2.d(j, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C4647biU c4647biU, PlaylistTimestamp playlistTimestamp) {
        C8632dsu.c((Object) c4647biU, "");
        C8632dsu.d(playlistTimestamp);
        c4647biU.d(playlistTimestamp);
    }

    @Override // o.C4592bhS, com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public void d(PlaylistTimestamp playlistTimestamp) {
        C4642biP.d b2;
        C8632dsu.c((Object) playlistTimestamp, "");
        PlaylistTimestamp l = l();
        long e2 = l != null ? l.e(this.d) : 0L;
        long e3 = playlistTimestamp.e(this.d);
        C4710bje c4710bje = this.j;
        Long valueOf = c4710bje != null ? Long.valueOf(c4710bje.b()) : null;
        c.getLogTag();
        C4710bje c4710bje2 = this.j;
        Pair<String, Long> e4 = c4710bje2 != null ? c4710bje2.e(e2, e3) : null;
        if (e4 != null && valueOf != null) {
            String d2 = e4.d();
            long longValue = e4.a().longValue();
            InterfaceC4652biZ c2 = this.h.c(valueOf.longValue());
            if (c2 != null && (b2 = c2.b(longValue)) != null && b2.d()) {
                e eVar = new e(playlistTimestamp, valueOf, longValue);
                C4588bhO c4588bhO = this.a;
                PlaylistMap H = H();
                C8632dsu.d(H);
                c4588bhO.c(new PlaylistTimestamp(H.b(), d2, 0L));
                this.h.d(valueOf.longValue(), longValue, eVar);
                return;
            }
        }
        c(playlistTimestamp);
    }

    /* renamed from: o.biU$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC4643biQ {
        final /* synthetic */ PlaylistTimestamp b;
        final /* synthetic */ long c;
        final /* synthetic */ Long e;

        e(PlaylistTimestamp playlistTimestamp, Long l, long j) {
            this.b = playlistTimestamp;
            this.e = l;
            this.c = j;
        }

        @Override // o.InterfaceC4643biQ
        public void d(Status status) {
            C8632dsu.c((Object) status, "");
            C4647biU.c.getLogTag();
            if (status.j()) {
                C4647biU.this.c(this.b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(PlaylistTimestamp playlistTimestamp) {
        PlaylistTimestamp b2 = b();
        PlaylistTimestamp a = a(this, playlistTimestamp, false, 2, null);
        long e2 = playlistTimestamp.e(this.d);
        c.getLogTag();
        Map<String, C4592bhS.a> map = this.e.get(playlistTimestamp.a);
        if (map != null && (!map.isEmpty())) {
            boolean z = !map.keySet().contains(b2 != null ? b2.a : null);
            String str = null;
            C4651biY c4651biY = null;
            Long l = null;
            boolean z2 = true;
            for (Map.Entry<String, C4592bhS.a> entry : map.entrySet()) {
                String key = entry.getKey();
                C5273bve c5273bve = entry.getValue().c;
                C8632dsu.a(c5273bve, "");
                boolean z3 = c5273bve instanceof C4651biY;
                C4642biP.e c2 = z3 ? ((C4651biY) c5273bve).c() : null;
                if (c2 != null && c2.n() && ((z && c2.o().a()) || e2 == c2.a())) {
                    if (c2.c().j() || c2.i()) {
                        str = null;
                    } else {
                        l = Long.valueOf(c2.a());
                        z2 = c2.o().d();
                        str = key;
                    }
                }
                if (z3) {
                    C4651biY c4651biY2 = (C4651biY) c5273bve;
                    long d2 = c4651biY2.d();
                    if (l != null && d2 == l.longValue() && c5273bve.g != SegmentType.a) {
                        c4651biY = c4651biY2;
                    }
                }
                if (C8632dsu.c((Object) key, (Object) (b2 != null ? b2.a : null))) {
                    if (c2 != null && !c2.o().e()) {
                        c.getLogTag();
                        C8632dsu.d(b2);
                        break;
                    }
                    z = true;
                }
                if (C8632dsu.c((Object) key, (Object) a.a)) {
                    break;
                }
            }
            b2 = a;
            if (str != null) {
                if (z2) {
                    e(b2, c4651biY);
                }
                a = new PlaylistTimestamp(playlistTimestamp.c, str, 0L);
            } else {
                a = b2;
            }
        }
        c.getLogTag();
        e(a);
    }

    @Override // o.C4592bhS, o.InterfaceC5274bvf
    public void e(String str, PlaylistTimestamp playlistTimestamp) {
        InterfaceC5210buU interfaceC5210buU;
        C4642biP.e c2;
        InterfaceC5210buU interfaceC5210buU2;
        List<C4642biP.d> e2;
        InterfaceC5210buU interfaceC5210buU3;
        super.e(str, playlistTimestamp);
        C5209buT a = c().a(playlistTimestamp);
        if (a instanceof C4651biY) {
            List<String> list = this.f;
            C8632dsu.d(playlistTimestamp);
            if (list.contains(playlistTimestamp.a)) {
                String str2 = playlistTimestamp.a;
                C8632dsu.a(str2, "");
                b(str2);
                this.f.remove(playlistTimestamp.a);
                this.f.isEmpty();
            }
            C4651biY c4651biY = (C4651biY) a;
            if (c4651biY.c() != null) {
                if (c4651biY.c().n()) {
                    InterfaceC5210buU interfaceC5210buU4 = this.b;
                    if (interfaceC5210buU4 != null) {
                        interfaceC5210buU4.e(c4651biY.c().a());
                    }
                    this.h.c(((C5273bve) c4651biY).f, c4651biY.c().a());
                    this.g.d();
                }
                InterfaceC5210buU interfaceC5210buU5 = this.b;
                if (interfaceC5210buU5 != null) {
                    interfaceC5210buU5.a(c4651biY.c().a(), c4651biY.c().h());
                }
                C4642biP.e c3 = c4651biY.c();
                c3.e(c3.g() + 1);
                return;
            }
            if (str != null) {
                C5209buT a2 = c().a(str);
                if (!(a2 instanceof C4651biY)) {
                    return;
                }
                C4651biY c4651biY2 = (C4651biY) a2;
                SegmentType segmentType = ((C5273bve) c4651biY2).g;
                SegmentType segmentType2 = SegmentType.a;
                if (segmentType == segmentType2 && ((C5273bve) c4651biY).g == segmentType2 && C8632dsu.c((Object) c4651biY2.a(), (Object) playlistTimestamp.a) && !C8632dsu.c(c4651biY2.e(), c4651biY.e()) && c4651biY.e() != null) {
                    InterfaceC4652biZ c4 = this.h.c(((C5273bve) c4651biY).f);
                    C4642biP.d b2 = c4 != null ? c4.b(c4651biY.e().longValue()) : null;
                    if (b2 != null) {
                        b2.d(true);
                    }
                    if (c4 != null && (e2 = c4.e()) != null && (interfaceC5210buU3 = this.b) != null) {
                        interfaceC5210buU3.d(((C5273bve) c4651biY).f, e2);
                    }
                }
                boolean z = (C8632dsu.c((Object) c4651biY2.a(), (Object) playlistTimestamp.a) || ((C5273bve) c4651biY).g == SegmentType.c) ? false : true;
                if (c4651biY2.c() != null && (((c2 = c4651biY2.c()) != null && c2.b()) || z)) {
                    InterfaceC5210buU interfaceC5210buU6 = this.b;
                    if (interfaceC5210buU6 != null) {
                        interfaceC5210buU6.b(c4651biY2.c().a());
                    }
                    this.g.e();
                    if (z) {
                        return;
                    }
                    c4651biY2.c().c().d(c4651biY2.c().o().i());
                    if (c4651biY2.c().c().j()) {
                        String h = c4651biY2.h();
                        while (true) {
                            if (h == null) {
                                break;
                            }
                            C5209buT a3 = c().a(h);
                            C8632dsu.d(a3);
                            C4651biY c4651biY3 = (C4651biY) a3;
                            if ((c4651biY3 != null ? c4651biY3.c() : null) == null) {
                                if ((c4651biY3 != null ? ((C5273bve) c4651biY3).g : null) != SegmentType.e) {
                                    if (((C5273bve) c4651biY).g == SegmentType.d) {
                                        if (c4651biY3 != null) {
                                            c4651biY3.e(c4651biY.a());
                                        }
                                        C5209buT a4 = c().a(c4651biY.a());
                                        C4651biY c4651biY4 = a4 instanceof C4651biY ? (C4651biY) a4 : null;
                                        if (c4651biY4 != null) {
                                            c4651biY4.c(h);
                                        }
                                    } else {
                                        if (c4651biY3 != null) {
                                            c4651biY3.e(playlistTimestamp.a);
                                        }
                                        c4651biY.c(h);
                                    }
                                }
                            }
                            h = c4651biY3.h();
                        }
                    }
                    for (InterfaceC4652biZ interfaceC4652biZ : this.h.c()) {
                        if (interfaceC4652biZ.e().contains(c4651biY2.c().c()) && (interfaceC5210buU2 = this.b) != null) {
                            interfaceC5210buU2.d(interfaceC4652biZ.d(), interfaceC4652biZ.e());
                        }
                    }
                }
            }
            if (((C5273bve) c4651biY).g != SegmentType.e || c4651biY.b()) {
                if (((C5273bve) c4651biY).g != SegmentType.d || (interfaceC5210buU = this.b) == null) {
                    return;
                }
                interfaceC5210buU.c(c4651biY.d(), AdInterstitialType.c, a.b);
                return;
            }
            InterfaceC5210buU interfaceC5210buU7 = this.b;
            if (interfaceC5210buU7 != null) {
                interfaceC5210buU7.c(c4651biY.d(), AdInterstitialType.d, a.b);
            }
        }
    }

    @Override // com.netflix.mediaclient.servicemgr.interface_.player.playlist.IPlaylistControl
    public C5212buW E_() {
        PlaylistTimestamp b2 = b();
        if (b2 != null) {
            C5209buT a = c().a(b2);
            if (a instanceof C4651biY) {
                C4651biY c4651biY = (C4651biY) a;
                if (c4651biY.c() != null) {
                    return new C5212buW(c4651biY.c().a(), c4651biY.c().h(), b2.e);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private final void e(PlaylistTimestamp playlistTimestamp, C4651biY c4651biY) {
        Iterator<T> it = this.e.values().iterator();
        while (it.hasNext()) {
            C4592bhS.a aVar = (C4592bhS.a) ((Map) it.next()).get(playlistTimestamp.a);
            if (aVar != null) {
                long j = aVar.c.c + playlistTimestamp.e;
                aVar.a(j);
                this.a.a(playlistTimestamp.a, j);
                List<String> list = this.f;
                String str = playlistTimestamp.a;
                C8632dsu.a(str, "");
                list.add(str);
                c.getLogTag();
            }
        }
        if (c4651biY == null || C8632dsu.c((Object) c4651biY.a(), (Object) playlistTimestamp.a)) {
            return;
        }
        c.getLogTag();
        c4651biY.e(playlistTimestamp.a);
    }

    private final void b(String str) {
        Iterator<T> it = this.e.values().iterator();
        while (it.hasNext()) {
            C4592bhS.a aVar = (C4592bhS.a) ((Map) it.next()).get(str);
            if (aVar != null) {
                aVar.a(aVar.c.c);
                this.a.a(str, aVar.c.c);
                c.getLogTag();
                return;
            }
        }
    }

    static /* synthetic */ PlaylistTimestamp a(C4647biU c4647biU, PlaylistTimestamp playlistTimestamp, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c4647biU.c(playlistTimestamp, z);
    }

    private final PlaylistTimestamp c(PlaylistTimestamp playlistTimestamp, boolean z) {
        Map<String, C4592bhS.a> map = this.e.get(playlistTimestamp.a);
        if (map != null && (!map.isEmpty())) {
            long j = playlistTimestamp.e;
            for (Map.Entry<String, C4592bhS.a> entry : map.entrySet()) {
                String key = entry.getKey();
                C4592bhS.a value = entry.getValue();
                C5273bve c5273bve = value.c;
                C8632dsu.a(c5273bve, "");
                if (!(c5273bve instanceof C4651biY) || c5273bve.g == SegmentType.a || !z) {
                    C4592bhS.e eVar = value.a;
                    if (eVar != null) {
                        C8632dsu.d(eVar);
                        long a = eVar.a(j);
                        if (a >= 0) {
                            return new PlaylistTimestamp(playlistTimestamp.c, key, a);
                        }
                    } else if (j >= c5273bve.c && j <= c5273bve.b) {
                        return new PlaylistTimestamp(playlistTimestamp.c, key, j - c5273bve.c);
                    }
                }
            }
        }
        return playlistTimestamp;
    }

    private final boolean e(C5209buT c5209buT) {
        long j = c5209buT.b;
        return j == -2147483648L || j == -1;
    }

    private final C4642biP.d b(List<C4642biP.d> list, int i) {
        if (list == null || list.size() <= i) {
            return null;
        }
        return list.get(i);
    }

    public final void b(final C4651biY c4651biY) {
        C8632dsu.c((Object) c4651biY, "");
        this.i.post(new Runnable() { // from class: o.biR
            @Override // java.lang.Runnable
            public final void run() {
                C4647biU.d(C4647biU.this, c4651biY);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4647biU c4647biU, C4651biY c4651biY) {
        List<C4642biP.d> e2;
        InterfaceC5210buU interfaceC5210buU;
        C8632dsu.c((Object) c4647biU, "");
        C8632dsu.c((Object) c4651biY, "");
        InterfaceC4652biZ c2 = c4647biU.h.c(((C5273bve) c4651biY).f);
        if (c2 == null || (e2 = c2.e()) == null || (interfaceC5210buU = c4647biU.b) == null) {
            return;
        }
        interfaceC5210buU.d(((C5273bve) c4651biY).f, e2);
    }

    public final void d(float f) {
        this.g.c(f);
    }

    @Override // o.InterfaceC4639biM
    public void a(long j, List<C4642biP.d> list) {
        List<C4642biP.d> i;
        C8632dsu.c((Object) list, "");
        i = C8569dql.i();
        e(j, list, i);
    }

    @Override // o.InterfaceC4639biM
    public void c(long j, List<C4642biP.d> list) {
        List<C4642biP.d> i;
        C8632dsu.c((Object) list, "");
        i = C8569dql.i();
        e(j, i, list);
    }

    private final void e(long j, List<C4642biP.d> list, List<C4642biP.d> list2) {
        Map<String, C5273bve> linkedHashMap;
        List<C4642biP.d> e2;
        InterfaceC5210buU interfaceC5210buU;
        C4710bje c4710bje = this.j;
        if (c4710bje == null || (linkedHashMap = c4710bje.e(j, list, list2)) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        Map<String, Map<String, C4592bhS.a>> map = this.e;
        C8632dsu.a(map, "");
        C4710bje c4710bje2 = this.j;
        String e3 = c4710bje2 != null ? c4710bje2.e() : null;
        C4710bje c4710bje3 = this.j;
        map.put(e3, c4710bje3 != null ? c4710bje3.a() : null);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Map h = c().h();
        C8632dsu.d(h);
        linkedHashMap2.putAll(h);
        linkedHashMap2.putAll(linkedHashMap);
        e(new C5208buS(linkedHashMap2, c().e(), c().b()));
        InterfaceC4652biZ c2 = this.h.c(j);
        if (c2 == null || (e2 = c2.e()) == null || (interfaceC5210buU = this.b) == null) {
            return;
        }
        interfaceC5210buU.d(j, e2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.biU$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final C4588bhO a;
        private Float d;

        public b(C4588bhO c4588bhO) {
            C8632dsu.c((Object) c4588bhO, "");
            this.a = c4588bhO;
        }

        public final void d() {
            if (1.0f == this.a.c()) {
                return;
            }
            this.d = Float.valueOf(this.a.c());
            this.a.d(1.0f);
        }

        public final void e() {
            Float f = this.d;
            if (f != null) {
                float floatValue = f.floatValue();
                if (floatValue == this.a.c()) {
                    return;
                }
                this.a.d(floatValue);
                this.d = null;
            }
        }

        public final void c(float f) {
            C5209buT a;
            PlaylistMap o2 = this.a.o();
            if (o2 == null || (a = o2.a(this.a.j())) == null) {
                return;
            }
            if ((a instanceof C4651biY) && ((C5273bve) ((C4651biY) a)).g != SegmentType.a) {
                this.d = Float.valueOf(f);
            } else if (this.a.c() == f) {
            } else {
                this.a.d(f);
            }
        }
    }
}
