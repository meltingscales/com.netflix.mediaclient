package o;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.media3.common.Format;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Tracks;
import androidx.media3.exoplayer.source.MediaLoadData;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.servicemgr.PlaybackExperience;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o.C4768bmC;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import org.json.JSONException;

/* renamed from: o.bmF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4771bmF {
    public static final e e = new e(null);
    private long A;
    private final C4320bcL B;
    private boolean C;
    private final Runnable D;
    private final String H;
    private final C4810bms a;
    private C4809bmr b;
    private final List<Long> c;
    private long d;
    private final C4911bon f;
    private final InterfaceC4652biZ g;
    private final Handler h;
    private final Context i;
    private final InterfaceC4766bmA j;
    private String k;
    private C4817bmz l;
    private long m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f13617o;
    private String p;
    private String q;
    private String r;
    private String s;
    private C4817bmz t;
    private final C4582bhI u;
    private final C4726bju v;
    private long w;
    private final PlaybackExperience x;
    private final C4770bmE y;
    private int z;

    private final boolean d() {
        return this.A != -9223372036854775807L;
    }

    private final boolean e() {
        return this.l != null;
    }

    public final void c() {
        this.f13617o = true;
    }

    public final void c(int i) {
        this.z = i;
    }

    public C4771bmF(Context context, C4582bhI c4582bhI, InterfaceC4766bmA interfaceC4766bmA, C4726bju c4726bju, String str, C4320bcL c4320bcL, boolean z, PlaybackExperience playbackExperience, C4911bon c4911bon, InterfaceC4808bmq interfaceC4808bmq, InterfaceC4652biZ interfaceC4652biZ) {
        Format d;
        Format d2;
        Format d3;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) c4582bhI, "");
        C8632dsu.c((Object) interfaceC4766bmA, "");
        C8632dsu.c((Object) c4726bju, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) playbackExperience, "");
        C8632dsu.c((Object) interfaceC4808bmq, "");
        this.i = context;
        this.u = c4582bhI;
        this.j = interfaceC4766bmA;
        this.v = c4726bju;
        this.H = str;
        this.B = c4320bcL;
        this.x = playbackExperience;
        this.f = c4911bon;
        this.g = interfaceC4652biZ;
        this.h = new Handler();
        this.y = new C4770bmE();
        this.w = -9223372036854775807L;
        this.f13617o = z;
        this.A = -9223372036854775807L;
        this.d = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.c = new ArrayList();
        C4898boa b = C4898boa.b(context);
        C8632dsu.a(b, "");
        Gson a = C8118deO.a();
        C8632dsu.a(a, "");
        Context d4 = AbstractApplicationC1040Mh.d();
        C8632dsu.a(d4, "");
        this.b = new C4809bmr(b, interfaceC4808bmq, a, d4);
        this.a = new C4810bms();
        this.D = new Runnable() { // from class: o.bmI
            @Override // java.lang.Runnable
            public final void run() {
                C4771bmF.d(C4771bmF.this);
            }
        };
        d = C4778bmM.d(c4726bju, 2);
        this.s = d != null ? C4778bmM.d(d) : null;
        d2 = C4778bmM.d(c4726bju, 1);
        this.k = d2 != null ? C4778bmM.d(d2) : null;
        d3 = C4778bmM.d(c4726bju, 3);
        String d5 = d3 != null ? C4778bmM.d(d3) : null;
        this.p = d5;
        if (d5 == null) {
            this.p = c4726bju.f;
        }
    }

    public final void c(C4817bmz c4817bmz, boolean z) {
        SegmentType e2;
        C8632dsu.c((Object) c4817bmz, "");
        c4817bmz.e();
        SegmentType segmentType = SegmentType.c;
        boolean z2 = e() != z;
        if (z && !d()) {
            this.A = System.currentTimeMillis();
            d(c4817bmz, C4768bmC.c.c.e());
            j(c4817bmz);
        } else if (z && z2) {
            d(c4817bmz, C4768bmC.c.c.b());
        }
        C4817bmz c4817bmz2 = this.l;
        if (c4817bmz2 != null) {
            if (b(c4817bmz2)) {
                e2 = SegmentType.b;
            } else {
                e2 = c4817bmz2.e();
            }
            this.y.e(e2, c4817bmz2.i(), this.n, this.q, this.r, c4817bmz2, c4817bmz);
            this.b.c(c4817bmz2.e(), c4817bmz2.i(), c4817bmz2, c4817bmz);
        }
        this.b.e(c4817bmz, z);
        if (!z) {
            c4817bmz = null;
        }
        i(c4817bmz);
    }

    private final boolean b(C4817bmz c4817bmz) {
        return c4817bmz.f() && (this.w == -9223372036854775807L || c4817bmz.d() < this.w);
    }

    private final void i(C4817bmz c4817bmz) {
        this.l = c4817bmz;
        if (c4817bmz != null) {
            d(this.t, c4817bmz);
            SegmentType e2 = c4817bmz.e();
            SegmentType segmentType = SegmentType.c;
            if (e2 == segmentType) {
                C4817bmz c4817bmz2 = this.t;
                if ((c4817bmz2 != null ? c4817bmz2.e() : null) != segmentType) {
                    j(c4817bmz);
                }
            }
            this.t = c4817bmz;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(o.C4817bmz r21, o.C4817bmz r22) {
        /*
            Method dump skipped, instructions count: 661
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4771bmF.d(o.bmz, o.bmz):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(o.C4817bmz r10) {
        /*
            r9 = this;
            boolean r0 = r9.C
            if (r0 == 0) goto L5
            return
        L5:
            long r0 = r9.c(r10)
            boolean r2 = r10.f()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L2a
            long r5 = r9.w
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L2a
            long r5 = r10.d()
            long r7 = r9.w
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L2a
            long r5 = r10.d()
            long r7 = r7 - r5
            goto L2b
        L2a:
            r7 = r3
        L2b:
            com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType r10 = r10.e()
            com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType r2 = com.netflix.mediaclient.servicemgr.interface_.player.playlist.SegmentType.c
            if (r10 != r2) goto L36
            r0 = 100
            goto L55
        L36:
            int r10 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            r2 = 60000(0xea60, double:2.9644E-319)
            if (r10 == 0) goto L46
            int r10 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r10 >= 0) goto L46
            r10 = 500(0x1f4, float:7.0E-43)
            long r0 = (long) r10
            long r0 = r0 + r7
            goto L55
        L46:
            r4 = 0
            int r10 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r10 < 0) goto L54
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 <= 0) goto L51
            goto L54
        L51:
            long r0 = r2 - r0
            goto L55
        L54:
            r0 = r2
        L55:
            android.os.Handler r10 = r9.h
            java.lang.Runnable r2 = r9.D
            r10.postDelayed(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C4771bmF.j(o.bmz):void");
    }

    private final void b() {
        this.h.removeCallbacks(this.D);
    }

    public final void e(C4817bmz c4817bmz) {
        C8632dsu.c((Object) c4817bmz, "");
        c(c4817bmz, false);
        if (this.A != -9223372036854775807L) {
            d(c4817bmz, C4768bmC.c.c.d());
            if (c4817bmz.e() == SegmentType.c) {
                InterfaceC4652biZ interfaceC4652biZ = this.g;
                c(interfaceC4652biZ != null ? interfaceC4652biZ.a(c4817bmz.c(), c4817bmz.i()) : null, c4817bmz);
            }
        }
        this.C = true;
        b();
    }

    private final void c(C4816bmy c4816bmy, C4817bmz c4817bmz) {
        Map<String, AbstractC4518bfy> b;
        AbstractC4518bfy abstractC4518bfy;
        if (c4816bmy == null || (b = c4816bmy.b()) == null || (abstractC4518bfy = b.get("stop")) == null || !this.c.remove(Long.valueOf(c4817bmz.i()))) {
            return;
        }
        C4768bmC.c c = C4768bmC.c.c.c();
        String c2 = abstractC4518bfy.c();
        C8632dsu.a(c2, "");
        d(c4817bmz, c, c2, false, c4816bmy.a());
    }

    public final void a(C4817bmz c4817bmz) {
        C8632dsu.c((Object) c4817bmz, "");
        c(c4817bmz, false);
    }

    public final void b(C4817bmz c4817bmz, C4817bmz c4817bmz2) {
        C8632dsu.c((Object) c4817bmz, "");
        C8632dsu.c((Object) c4817bmz2, "");
        c(c4817bmz, e());
        if (this.l != null) {
            i(c4817bmz2);
        }
    }

    public final void d(C4817bmz c4817bmz, MediaLoadData mediaLoadData) {
        C8632dsu.c((Object) c4817bmz, "");
        C8632dsu.c((Object) mediaLoadData, "");
        e(c4817bmz, mediaLoadData.trackType, mediaLoadData.trackFormat);
    }

    public final void e(C4817bmz c4817bmz, int i, Format format) {
        C8632dsu.c((Object) c4817bmz, "");
        c(c4817bmz, e());
        String str = null;
        String c = format != null ? C4778bmM.c(format) : null;
        String d = format != null ? C4778bmM.d(format) : null;
        if (i == 3 && c == null) {
            d = this.v.f;
        }
        if (d == null) {
            return;
        }
        boolean z = false;
        boolean z2 = c4817bmz.e() == SegmentType.a;
        if (i == 1) {
            str = this.k;
            this.n = c;
            if (z2) {
                this.k = d;
            }
        } else if (i == 2) {
            str = this.s;
            this.q = c;
            if (z2) {
                this.s = d;
            }
        } else if (i == 3) {
            str = this.p;
            this.r = c;
            if (z2) {
                this.p = d;
            }
        }
        boolean z3 = (i == 1 || i == 3) && (i != 3 || this.z != 10002) && d();
        if (z2 && !TextUtils.equals(str, d)) {
            z = true;
        }
        if (z3 && z) {
            d(c4817bmz, C4768bmC.c.c.a());
            Intent intent = new Intent("com.netflix.mediaclient.intent.action.PLAYER_AUDIO_SUBTITLE_CHANGED");
            intent.addCategory("com.netflix.mediaclient.intent.category.PLAYER");
            LocalBroadcastManager.getInstance(this.i).sendBroadcast(intent);
        }
    }

    public final void d(C4817bmz c4817bmz, Tracks tracks) {
        Tracks.Group group;
        C8632dsu.c((Object) c4817bmz, "");
        C8632dsu.c((Object) tracks, "");
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        C8632dsu.a(groups, "");
        Iterator<Tracks.Group> it = groups.iterator();
        while (true) {
            if (!it.hasNext()) {
                group = null;
                break;
            }
            group = it.next();
            Tracks.Group group2 = group;
            if (group2.isSelected() && group2.getType() == 3) {
                break;
            }
        }
        Tracks.Group group3 = group;
        e(c4817bmz, 3, group3 != null ? group3.getTrackFormat(0) : null);
    }

    public final void d(C4817bmz c4817bmz) {
        C8632dsu.c((Object) c4817bmz, "");
        c4817bmz.e();
        SegmentType segmentType = SegmentType.c;
        c(c4817bmz, e());
        if (c(c4817bmz) >= 30000) {
            d(c4817bmz, C4768bmC.c.c.b());
        }
        this.h.removeCallbacks(this.D);
        j(c4817bmz);
    }

    public final void b(C4817bmz c4817bmz, long j) {
        C8632dsu.c((Object) c4817bmz, "");
        this.w = j;
        c(c4817bmz, e());
        j(c4817bmz);
    }

    private final void d(C4817bmz c4817bmz, C4768bmC.c cVar, String str, boolean z, C4805bmn c4805bmn) {
        C4726bju a;
        Map d;
        Map k;
        Throwable th;
        if (z) {
            a = this.v;
        } else {
            a = c4817bmz.a();
            if (a == null) {
                return;
            }
        }
        try {
            this.j.a(new C4768bmC(cVar, this.H, a, this.d, c4817bmz, null, null, null, C4770bmE.e(this.y, false, Long.valueOf(c4817bmz.i()), this.f, 1, null), null, str, c4817bmz.c(), this.v.i(), this.b, c4805bmn), false);
        } catch (JSONException e2) {
            InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
            d = dqE.d();
            k = dqE.k(d);
            C1596aHd c1596aHd = new C1596aHd("unable to generate PDS message", e2, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b = c1596aHd.b();
                if (b != null) {
                    String c = errorType.c();
                    c1596aHd.a(c + " " + b);
                }
            }
            if (c1596aHd.b() != null && c1596aHd.i != null) {
                th = new Throwable(c1596aHd.b(), c1596aHd.i);
            } else if (c1596aHd.b() != null) {
                th = new Throwable(c1596aHd.b());
            } else {
                th = c1596aHd.i;
                if (th == null) {
                    th = new Throwable("Handled exception with no message");
                } else if (th == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
        }
    }

    private final void d(C4817bmz c4817bmz, C4768bmC.c cVar) {
        Map d;
        Map k;
        Throwable th;
        C4817bmz c4817bmz2 = c4817bmz;
        if (e(c4817bmz, cVar)) {
            C4768bmC.c.C0108c c0108c = C4768bmC.c.c;
            if (cVar == c0108c.b() || cVar == c0108c.e()) {
                h(c4817bmz);
            }
            try {
                long j = this.A;
                if (j == -9223372036854775807L) {
                    j = System.currentTimeMillis();
                }
                long j2 = j;
                if (c4817bmz.e() != SegmentType.a && c4817bmz.c() != null) {
                    c4817bmz2 = c4817bmz2.e(c4817bmz.c().longValue());
                } else if (c4817bmz.f() && this.w == -9223372036854775807L) {
                    c4817bmz2 = c4817bmz2.e(0L);
                } else if (c4817bmz.f() && this.w > c4817bmz.d()) {
                    c4817bmz2 = c4817bmz2.e(0L);
                } else if (c4817bmz.f()) {
                    c4817bmz2 = c4817bmz2.e(c4817bmz.d() - this.w);
                }
                this.j.a(new C4768bmC(cVar, this.H, this.v, j2, c4817bmz2, this.k, this.s, this.p, C4770bmE.e(this.y, this.f13617o, null, null, 6, null), this.B, null, null, null, null, null, 7168, null), cVar == c0108c.b());
                return;
            } catch (JSONException e2) {
                InterfaceC1598aHf.c cVar2 = InterfaceC1598aHf.a;
                d = dqE.d();
                k = dqE.k(d);
                C1596aHd c1596aHd = new C1596aHd("unable to generate PDS message", e2, null, true, k, false, false, 96, null);
                ErrorType errorType = c1596aHd.a;
                if (errorType != null) {
                    c1596aHd.e.put("errorType", errorType.c());
                    String b = c1596aHd.b();
                    if (b != null) {
                        String c = errorType.c();
                        c1596aHd.a(c + " " + b);
                    }
                }
                if (c1596aHd.b() != null && c1596aHd.i != null) {
                    th = new Throwable(c1596aHd.b(), c1596aHd.i);
                } else if (c1596aHd.b() != null) {
                    th = new Throwable(c1596aHd.b());
                } else {
                    th = c1596aHd.i;
                    if (th == null) {
                        th = new Throwable("Handled exception with no message");
                    } else if (th == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
                InterfaceC1598aHf a = dVar.a();
                if (a != null) {
                    a.e(c1596aHd, th);
                    return;
                } else {
                    dVar.e().b(c1596aHd, th);
                    return;
                }
            }
        }
        e.getLogTag();
    }

    private final boolean e(C4817bmz c4817bmz, C4768bmC.c cVar) {
        return !C8632dsu.c(cVar, C4768bmC.c.c.b()) || c(c4817bmz) > 30000;
    }

    private final long c(C4817bmz c4817bmz) {
        long e2;
        if (this.m == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        e2 = C8657dts.e(c4817bmz.b() - this.m, 0L);
        return e2;
    }

    private final void h(C4817bmz c4817bmz) {
        this.m = c4817bmz.b();
    }

    public final void d(C4817bmz c4817bmz, int i, int i2) {
        C8632dsu.c((Object) c4817bmz, "");
        this.b.a(c4817bmz, i, i2);
    }

    public final void a(C4817bmz c4817bmz, PlaybackException playbackException) {
        C8632dsu.c((Object) c4817bmz, "");
        C8632dsu.c((Object) playbackException, "");
        if (c4817bmz.e() == SegmentType.c) {
            this.b.b(c4817bmz, playbackException);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(C4771bmF c4771bmF) {
        C8632dsu.c((Object) c4771bmF, "");
        if (c4771bmF.C) {
            return;
        }
        c4771bmF.u.b();
    }

    /* renamed from: o.bmF$e */
    /* loaded from: classes3.dex */
    public static final class e extends C1045Mp {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
            super("nf_pds");
        }
    }
}
