package o;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.LruCache;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.TrackGroup;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.CacheSpan;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.C4632biF;
import o.C4636biJ;
import o.InterfaceC4663bik;

/* renamed from: o.biq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC4669biq implements InterfaceC4665bim {
    private final InterfaceC4663bik a;
    private int b;
    private final e<List<String>, List<C4658bif>> c = new e<>();
    private final e<TrackGroup, List<String>> d = new e<>();
    protected final C4677biy e;
    private final C4636biJ f;

    public AbstractC4669biq(C4677biy c4677biy, InterfaceC4663bik interfaceC4663bik, InterfaceC4793bmb interfaceC4793bmb, PriorityTaskManager priorityTaskManager) {
        this.e = c4677biy;
        this.f = new C4636biJ(c4677biy, interfaceC4793bmb, priorityTaskManager);
        this.a = interfaceC4663bik;
    }

    @Override // o.InterfaceC4665bim
    public void e(InterfaceC4662bij interfaceC4662bij, List<Representation> list, List<Representation> list2, long j, long j2, boolean z, C4636biJ.d dVar) {
        b bVar = new b(list.size() + list2.size(), dVar);
        Iterator<Representation> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Representation next = it.next();
            C4632biF.c a2 = C4632biF.a(next.getCacheKey());
            this.a.d(next.format.id, new a(Uri.parse(interfaceC4662bij.c(next.format.id, C4632biF.d(next.getCacheKey()), new C4664bil(false, j * 1000, (j + j2) * 1000, -9223372036854775807L, -9223372036854775807L, 0, a2 != null ? a2.a : -1L, null)).m()), next.getCacheKey(), j, j2, z, bVar));
            it = it;
        }
        for (Representation representation : list2) {
            RangedUri initializationUri = representation.getInitializationUri();
            if (initializationUri == null) {
                bVar.c();
            } else {
                long j3 = initializationUri.start;
                long j4 = initializationUri.length;
                if (representation instanceof C4684bjE) {
                    long j5 = j3 + j4;
                    j4 = Math.min(j5, Math.max(4096L, j5 >>> 8));
                    j3 = j5 - j4;
                }
                long j6 = j3;
                C4632biF.c a3 = C4632biF.a(representation.getCacheKey());
                DataSpec dataSpec = new DataSpec(Uri.parse(interfaceC4662bij.c(representation.format.id, C4632biF.d(representation.getCacheKey()), new C4664bil(false, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0, a3 == null ? -1L : a3.a, null)).m()), j6, j4, representation.getCacheKey());
                C1044Mm.a("nf_cache", "prefetching %s KB for subtitle %s", Long.valueOf(j4 / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID), representation.format.language);
                this.f.e(dataSpec, z, bVar);
            }
        }
    }

    public List<C4658bif> d(List<String> list) {
        C4658bif e2;
        CacheSpan cacheSpan;
        synchronized (this) {
            int c = this.e.c();
            if (c != this.b) {
                this.c.a();
                this.b = c;
            } else {
                List<C4658bif> e3 = this.c.e(list);
                if (e3 != null) {
                    return e3;
                }
            }
            ArrayList arrayList = new ArrayList();
            for (String str : this.e.b(list)) {
                C4632biF.c a2 = C4632biF.a(str);
                if (a2 != null) {
                    String str2 = a2.b;
                    List<C4656bid> b2 = this.a.b(str2, -9223372036854775807L, -9223372036854775807L);
                    if (b2 != null) {
                        NavigableSet<CacheSpan> cachedSpans = this.e.getCachedSpans(str);
                        if (cachedSpans != null && !cachedSpans.isEmpty()) {
                            long j = -1;
                            long j2 = -1;
                            long j3 = -1;
                            for (CacheSpan cacheSpan2 : cachedSpans) {
                                if (j2 != j) {
                                    long j4 = cacheSpan2.position;
                                    if (j4 > j2 && j4 <= j2 + j3 + 1) {
                                        j3 = (j4 + cacheSpan2.length) - j2;
                                    } else {
                                        cacheSpan = cacheSpan2;
                                        C4658bif e4 = C4658bif.e(str2, b2, j2, j3, a2.e);
                                        if (e4 != null) {
                                            arrayList.add(e4);
                                        }
                                    }
                                } else {
                                    cacheSpan = cacheSpan2;
                                }
                                j3 = cacheSpan.length;
                                j2 = cacheSpan.position;
                                j = -1;
                            }
                            if (j2 != j && (e2 = C4658bif.e(str2, b2, j2, j3, a2.e)) != null) {
                                arrayList.add(e2);
                            }
                        }
                    } else {
                        C1044Mm.j("nf_cache", "abandoned fragment (missing header): %s", str2);
                    }
                }
            }
            this.c.c(list, arrayList);
            return arrayList;
        }
    }

    @Override // o.InterfaceC4665bim
    public List<C4658bif> e(TrackGroup trackGroup, long j) {
        List<C4658bif> e2;
        synchronized (this) {
            List<String> e3 = this.d.e(trackGroup);
            if (e3 == null) {
                e3 = new ArrayList<>(trackGroup.length);
                for (int i = 0; i < trackGroup.length; i++) {
                    e3.add(trackGroup.getFormat(i).id);
                }
                this.d.c(trackGroup, e3);
            }
            e2 = e(d(e3), j);
        }
        return e2;
    }

    @Override // o.InterfaceC4665bim
    public List<C4658bif> d(long j, long j2) {
        return e(d(this.e.c(j)), j2);
    }

    @Override // o.InterfaceC4665bim
    public List<C4677biy> c() {
        return Arrays.asList(this.e);
    }

    private static List<C4658bif> e(List<C4658bif> list, long j) {
        ArrayList arrayList = null;
        for (C4658bif c4658bif : list) {
            if (c4658bif.f() <= j && c4658bif.g() >= j) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c4658bif);
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* renamed from: o.biq$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC4663bik.c {
        private final String a;
        private final boolean b;
        private final long c;
        private final C4636biJ.d d;
        private final Uri f;
        private final long j;

        public a(Uri uri, String str, long j, long j2, boolean z, C4636biJ.d dVar) {
            this.f = uri;
            this.c = j;
            this.a = str;
            this.d = dVar;
            this.j = j2;
            this.b = z;
        }

        @Override // o.InterfaceC4663bik.c
        @SuppressLint({"WrongConstant"})
        public void a(String str, List<C4656bid> list) {
            if (AbstractC4669biq.this.e.d() <= 0) {
                C1044Mm.j("nf_cache", "cache size too low - disabling prefetch");
                return;
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(this.c);
            long micros2 = timeUnit.toMicros(this.j);
            if (micros2 <= 0) {
                C1044Mm.e("nf_cache", "invalid fetch duration %s", Long.valueOf(micros2));
                this.d.c();
                return;
            }
            List<C4656bid> a = C4674biv.a(list, micros, micros2);
            if (!a.isEmpty()) {
                C4656bid c4656bid = a.get(0);
                C4656bid c4656bid2 = a.get(a.size() - 1);
                long c = c4656bid.c();
                long c2 = c4656bid2.c() + c4656bid2.a();
                long j = c2 - c;
                C1044Mm.a("nf_cache", "prefetching %s KB (%s-%s) for %s - %s (bookmark=%s)", Long.valueOf(j / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID), Long.valueOf(c), Long.valueOf(c2), Long.valueOf(c4656bid.f()), Long.valueOf(c4656bid2.g()), Long.valueOf(this.c));
                AbstractC4669biq.this.f.e(new DataSpec(this.f, c, j, this.a, 262144), this.b, this.d);
                return;
            }
            this.d.c();
            C1044Mm.e("nf_cache", "could not find chunk info for %s", Long.valueOf(this.c));
        }

        @Override // o.InterfaceC4663bik.c
        public void a(String str) {
            this.d.c();
        }
    }

    /* renamed from: o.biq$b */
    /* loaded from: classes3.dex */
    static final class b implements C4636biJ.d<Void> {
        private final C4636biJ.d a;
        private final AtomicBoolean c = new AtomicBoolean(false);
        private final AtomicInteger e;

        public b(int i, C4636biJ.d dVar) {
            this.a = dVar;
            this.e = new AtomicInteger(i);
            if (i != 0 || dVar == null) {
                return;
            }
            dVar.c(null);
        }

        @Override // o.C4636biJ.d
        /* renamed from: a */
        public void c(Void r1) {
            d();
        }

        @Override // o.C4636biJ.d
        public void c() {
            this.c.set(true);
            d();
        }

        private void d() {
            if (this.e.decrementAndGet() != 0 || this.a == null) {
                return;
            }
            if (this.c.get()) {
                this.a.c();
            } else {
                this.a.c(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.biq$e */
    /* loaded from: classes3.dex */
    public static final class e<I, O> {
        private LruCache<I, O> a;

        private e() {
            this.a = new LruCache<>(4);
        }

        public O e(I i) {
            if (i == null) {
                return null;
            }
            return this.a.get(i);
        }

        public void c(I i, O o2) {
            this.a.put(i, o2);
        }

        public void a() {
            this.a.evictAll();
        }
    }
}
