package o;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.PlaceholderDataSource;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.datasource.cache.CacheSpan;
import com.netflix.ale.AleCryptoBouncyCastle;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import o.C4632biF;
import o.C4636biJ;
import o.C4678biz;
import o.InterfaceC4663bik;
import org.chromium.net.PrivateKeyType;

/* renamed from: o.biB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4628biB implements InterfaceC4663bik {
    private final C4677biy a;
    private final C4678biz b;
    private InterfaceC4662bij c;
    private InterfaceC4834bnP f;
    private final C4636biJ j;
    private final Object d = new Object();
    private final Map<String, b> h = new HashMap();
    private final Map<String, List<C4656bid>> i = new HashMap();
    private int e = 0;

    public void b(int i) {
        this.e = i;
    }

    public void d(InterfaceC4834bnP interfaceC4834bnP) {
        this.f = interfaceC4834bnP;
    }

    public static C4677biy d(Context context) {
        return C4677biy.a(context, "header", AleCryptoBouncyCastle.MAX_RANDOM_BYTES, 2097152, null);
    }

    public C4628biB(Context context, InterfaceC4793bmb interfaceC4793bmb, C4678biz c4678biz) {
        C4677biy d2 = d(context);
        this.a = d2;
        this.j = new C4636biJ(d2, interfaceC4793bmb, null);
        this.b = c4678biz;
    }

    public void c(InterfaceC4662bij interfaceC4662bij) {
        C1044Mm.a("nf_cache", "Setting LocationSelector in HeaderCache %s", interfaceC4662bij.getClass().getCanonicalName());
        this.c = interfaceC4662bij;
    }

    @Override // o.InterfaceC4663bik
    public Set<String> e() {
        HashSet hashSet;
        synchronized (this.d) {
            hashSet = new HashSet(this.i.keySet());
        }
        for (String str : this.a.getKeys()) {
            C4632biF.c a = C4632biF.a(str);
            if (a != null) {
                hashSet.add(a.b);
            }
        }
        return hashSet;
    }

    @Override // o.InterfaceC4663bik
    public List<C4656bid> b(String str, long j, long j2) {
        List<C4656bid> list;
        synchronized (this) {
            synchronized (this.d) {
                list = this.i.get(str);
            }
            if (list == null && e(str)) {
                synchronized (this.d) {
                    list = this.i.get(str);
                }
            }
            if (list != null) {
                return C4674biv.a(list, j, j2);
            }
            return null;
        }
    }

    @Override // o.InterfaceC4663bik
    public void e(Set<String> set) {
        for (String str : set) {
            d(str, null);
        }
    }

    @Override // o.InterfaceC4663bik
    public void d(String str, InterfaceC4663bik.c cVar) {
        synchronized (this.d) {
            List<C4656bid> list = this.i.get(str);
            if (list != null) {
                if (cVar != null) {
                    cVar.a(str, list);
                }
                return;
            }
            b bVar = this.h.get(str);
            if (bVar != null) {
                if (cVar != null) {
                    bVar.b(cVar);
                }
                return;
            }
            C4678biz.b a = this.b.a(str);
            if (this.c == null) {
                C1044Mm.e("nf_cache", "No LocationSelector passed to HeaderCache");
                if (cVar != null) {
                    cVar.a(str);
                }
                return;
            }
            C4632biF.c a2 = C4632biF.a(a.b());
            C4668bip c = this.c.c(str, C4632biF.d(a.b()), new C4664bil(false, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, 0, a2 == null ? -1L : a2.a, null));
            if (c == null) {
                C1044Mm.j("nf_cache", "unable to find location info for header %s", str);
                if (cVar != null) {
                    cVar.a(str);
                }
                return;
            }
            this.h.put(str, new b(cVar));
            DataSpec.Builder position = new DataSpec.Builder().setUri(c.m()).setPosition(a.e());
            int i = this.e;
            if (i <= 0) {
                i = a.c();
            }
            DataSpec build = position.setLength(i).setKey(a.b()).build();
            this.j.a(build, this.f, new d(str, build));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.biB$d */
    /* loaded from: classes3.dex */
    public class d implements C4636biJ.d<byte[]> {
        private final String a;
        private int b;
        private final DataSpec c;
        private int d = 2;

        public d(String str, DataSpec dataSpec) {
            this.a = str;
            this.b = (int) dataSpec.position;
            this.c = dataSpec;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00e4 A[ORIG_RETURN, RETURN] */
        @Override // o.C4636biJ.d
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void c(byte[] r5) {
            /*
                r4 = this;
                int r0 = r4.d
                r1 = 1
                int r0 = r0 - r1
                r4.d = r0
                java.nio.ByteBuffer r5 = java.nio.ByteBuffer.wrap(r5)     // Catch: java.lang.Exception -> L99
                android.util.Pair r0 = o.C4628biB.a(r5)     // Catch: java.lang.Exception -> L99
                if (r0 == 0) goto L29
                int r2 = r5.remaining()     // Catch: java.lang.Exception -> L99
                int r2 = r2 + 8
                java.lang.Object r3 = r0.second     // Catch: java.lang.Exception -> L99
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L99
                int r3 = r3.intValue()     // Catch: java.lang.Exception -> L99
                if (r2 < r3) goto L29
                java.lang.String r1 = r4.a     // Catch: java.lang.Exception -> L99
                int r2 = r4.b     // Catch: java.lang.Exception -> L99
                java.util.List r5 = o.C4628biB.d(r1, r2, r5, r0)     // Catch: java.lang.Exception -> L99
                goto La1
            L29:
                if (r0 == 0) goto La0
                o.biB r5 = o.C4628biB.this     // Catch: java.lang.Exception -> L99
                int r5 = o.C4628biB.b(r5)     // Catch: java.lang.Exception -> L99
                if (r5 <= 0) goto La0
                int r5 = r4.d     // Catch: java.lang.Exception -> L99
                if (r5 <= 0) goto La0
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L99
                java.lang.String r2 = r4.a     // Catch: java.lang.Exception -> L99
                r3 = 0
                r5[r3] = r2     // Catch: java.lang.Exception -> L99
                java.lang.Object r2 = r0.first     // Catch: java.lang.Exception -> L99
                r5[r1] = r2     // Catch: java.lang.Exception -> L99
                java.lang.Object r1 = r0.second     // Catch: java.lang.Exception -> L99
                r2 = 2
                r5[r2] = r1     // Catch: java.lang.Exception -> L99
                java.lang.String r1 = "nf_cache"
                java.lang.String r2 = "Fetch header for %s partial sidx, offset=%d, size=%d, attempt for full one."
                o.C1044Mm.a(r1, r2, r5)     // Catch: java.lang.Exception -> L99
                int r5 = r4.b     // Catch: java.lang.Exception -> L99
                java.lang.Object r1 = r0.first     // Catch: java.lang.Exception -> L99
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L99
                int r1 = r1.intValue()     // Catch: java.lang.Exception -> L99
                int r5 = r5 + r1
                r4.b = r5     // Catch: java.lang.Exception -> L99
                androidx.media3.datasource.DataSpec$Builder r5 = new androidx.media3.datasource.DataSpec$Builder     // Catch: java.lang.Exception -> L99
                r5.<init>()     // Catch: java.lang.Exception -> L99
                androidx.media3.datasource.DataSpec r1 = r4.c     // Catch: java.lang.Exception -> L99
                android.net.Uri r1 = r1.uri     // Catch: java.lang.Exception -> L99
                androidx.media3.datasource.DataSpec$Builder r5 = r5.setUri(r1)     // Catch: java.lang.Exception -> L99
                int r1 = r4.b     // Catch: java.lang.Exception -> L99
                long r1 = (long) r1     // Catch: java.lang.Exception -> L99
                androidx.media3.datasource.DataSpec$Builder r5 = r5.setPosition(r1)     // Catch: java.lang.Exception -> L99
                java.lang.Object r0 = r0.second     // Catch: java.lang.Exception -> L99
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L99
                int r0 = r0.intValue()     // Catch: java.lang.Exception -> L99
                long r0 = (long) r0     // Catch: java.lang.Exception -> L99
                androidx.media3.datasource.DataSpec$Builder r5 = r5.setLength(r0)     // Catch: java.lang.Exception -> L99
                androidx.media3.datasource.DataSpec r0 = r4.c     // Catch: java.lang.Exception -> L99
                java.lang.String r0 = r0.key     // Catch: java.lang.Exception -> L99
                androidx.media3.datasource.DataSpec$Builder r5 = r5.setKey(r0)     // Catch: java.lang.Exception -> L99
                androidx.media3.datasource.DataSpec r5 = r5.build()     // Catch: java.lang.Exception -> L99
                o.biB r0 = o.C4628biB.this     // Catch: java.lang.Exception -> L99
                o.biJ r0 = o.C4628biB.e(r0)     // Catch: java.lang.Exception -> L99
                o.biB r1 = o.C4628biB.this     // Catch: java.lang.Exception -> L99
                o.bnP r1 = o.C4628biB.f(r1)     // Catch: java.lang.Exception -> L99
                r0.a(r5, r1, r4)     // Catch: java.lang.Exception -> L99
                return
            L99:
                java.lang.String r5 = "nf_cache"
                java.lang.String r0 = "unable to parse header"
                o.C1044Mm.d(r5, r0)
            La0:
                r5 = 0
            La1:
                if (r5 == 0) goto Le4
                java.lang.String r0 = r4.a
                int r1 = r5.size()
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
                java.lang.String r1 = "nf_cache"
                java.lang.String r2 = "Fetch header for %s, %d ChunkInfo entries"
                o.C1044Mm.a(r1, r2, r0)
                o.biB r0 = o.C4628biB.this
                java.lang.Object r0 = o.C4628biB.a(r0)
                monitor-enter(r0)
                o.biB r1 = o.C4628biB.this     // Catch: java.lang.Throwable -> Le1
                java.util.Map r1 = o.C4628biB.d(r1)     // Catch: java.lang.Throwable -> Le1
                java.lang.String r2 = r4.a     // Catch: java.lang.Throwable -> Le1
                java.lang.Object r1 = r1.remove(r2)     // Catch: java.lang.Throwable -> Le1
                o.biB$b r1 = (o.C4628biB.b) r1     // Catch: java.lang.Throwable -> Le1
                o.biB r2 = o.C4628biB.this     // Catch: java.lang.Throwable -> Le1
                java.util.Map r2 = o.C4628biB.c(r2)     // Catch: java.lang.Throwable -> Le1
                java.lang.String r3 = r4.a     // Catch: java.lang.Throwable -> Le1
                r2.put(r3, r5)     // Catch: java.lang.Throwable -> Le1
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le1
                if (r1 == 0) goto Le4
                java.lang.String r0 = r4.a
                r1.a(r0, r5)
                goto Le4
            Le1:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Le1
                throw r5
            Le4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C4628biB.d.c(byte[]):void");
        }

        @Override // o.C4636biJ.d
        public void c() {
            b bVar;
            this.d++;
            synchronized (C4628biB.this.d) {
                bVar = (b) C4628biB.this.h.remove(this.a);
            }
            if (bVar != null) {
                bVar.a(this.a, null);
            }
        }
    }

    private boolean e(String str) {
        int i;
        C4678biz.b a = this.b.a(str);
        if (a == null) {
            C1044Mm.j("nf_cache", "unable to find header info in HeaderMap for stream %s", str);
            Iterator<String> it = this.a.getKeys().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (C4632biF.d(next, str)) {
                    CacheSpan cacheSpan = null;
                    for (CacheSpan cacheSpan2 : this.a.getCachedSpans(next)) {
                        if (cacheSpan == null || cacheSpan2.position < cacheSpan.position) {
                            cacheSpan = cacheSpan2;
                        }
                    }
                    if (cacheSpan != null) {
                        a = new C4678biz.b((int) cacheSpan.position, (int) cacheSpan.length, cacheSpan.key);
                        C1044Mm.a("nf_cache", "found header entry in the cache");
                        break;
                    }
                }
            }
            if (a == null) {
                return false;
            }
        }
        C4678biz.b b2 = b(a);
        if (this.a.getKeys().contains(b2.b())) {
            DataSpec dataSpec = new DataSpec(Uri.EMPTY, b2.e(), b2.c(), b2.b());
            CacheDataSource cacheDataSource = new CacheDataSource(this.a, PlaceholderDataSource.INSTANCE);
            int c = b2.c();
            byte[] bArr = new byte[c];
            try {
                try {
                    cacheDataSource.open(dataSpec);
                    i = 0;
                    while (i < c) {
                        try {
                            i += cacheDataSource.read(bArr, i, c - i);
                        } catch (IOException unused) {
                        }
                    }
                } catch (IOException unused2) {
                    i = 0;
                }
                if (i > 0) {
                    ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, i);
                    try {
                        Pair<Integer, Integer> c2 = c(wrap);
                        List<C4656bid> e = c2 != null ? e(str, b2.e(), wrap, c2) : null;
                        if (e != null) {
                            synchronized (this.d) {
                                this.i.put(str, e);
                            }
                            C1044Mm.a("nf_cache", "header %s parsed from cache", str);
                            return true;
                        }
                    } catch (Exception unused3) {
                        C1044Mm.d("nf_cache", "unable to parse ChunkInfo.");
                    }
                }
            } finally {
                C4632biF.a(cacheDataSource);
            }
        }
        return false;
    }

    private C4678biz.b b(C4678biz.b bVar) {
        NavigableSet<CacheSpan> cachedSpans = this.a.getCachedSpans(bVar.b());
        if (cachedSpans == null || cachedSpans.size() < 2) {
            return bVar;
        }
        long c = bVar.c();
        for (CacheSpan cacheSpan : cachedSpans) {
            if (cacheSpan.length > 0 && cacheSpan.position == bVar.e() + c) {
                c += cacheSpan.length;
            }
        }
        return new C4678biz.b(bVar.e(), (int) c, bVar.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Pair<Integer, Integer> c(ByteBuffer byteBuffer) {
        int integerCodeForString = Util.getIntegerCodeForString("sidx");
        int i = 0;
        do {
            int i2 = byteBuffer.getInt();
            if (byteBuffer.getInt() == integerCodeForString) {
                return Pair.create(Integer.valueOf(i), Integer.valueOf(i2));
            }
            byteBuffer.position((byteBuffer.position() + i2) - 8);
            i += i2;
        } while (byteBuffer.hasRemaining());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<C4656bid> e(String str, int i, ByteBuffer byteBuffer, Pair<Integer, Integer> pair) {
        long j;
        long j2;
        long j3;
        int intValue = ((Integer) pair.second).intValue();
        int intValue2 = ((Integer) pair.first).intValue();
        int i2 = byteBuffer.getInt();
        byteBuffer.getInt();
        int i3 = byteBuffer.getInt();
        long j4 = intValue2 + i;
        if (((i2 >> 24) & PrivateKeyType.INVALID) == 0) {
            j = byteBuffer.getInt();
            j2 = j4 + intValue;
            j3 = byteBuffer.getInt();
        } else {
            j = byteBuffer.getLong();
            j2 = j4 + intValue;
            j3 = byteBuffer.getLong();
        }
        long j5 = j2 + j3;
        byteBuffer.getShort();
        short s = byteBuffer.getShort();
        ArrayList arrayList = new ArrayList(s);
        C1044Mm.a("nf_cache", "parsing %s header: sidx offset=%d, size=%d, entries=%d", str, Integer.valueOf(intValue2), Integer.valueOf(intValue), Integer.valueOf(s));
        for (int i4 = 0; i4 < s; i4++) {
            int i5 = byteBuffer.getInt();
            int i6 = byteBuffer.getInt();
            byteBuffer.getInt();
            long j6 = i3;
            long scaleLargeTimestamp = Util.scaleLargeTimestamp(j, 1000000L, j6);
            long j7 = i6;
            long j8 = i5 & Integer.MAX_VALUE;
            arrayList.add(new C4656bid(scaleLargeTimestamp, Util.scaleLargeTimestamp(j7, 1000000L, j6), j5, j8));
            j5 += j8;
            j += j7;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.biB$b */
    /* loaded from: classes3.dex */
    public static class b {
        List<InterfaceC4663bik.c> c = new LinkedList();

        public b(InterfaceC4663bik.c cVar) {
            b(cVar);
        }

        public void b(InterfaceC4663bik.c cVar) {
            if (cVar != null) {
                this.c.add(cVar);
            }
        }

        public void a(String str, List<C4656bid> list) {
            if (list != null && !list.isEmpty()) {
                for (InterfaceC4663bik.c cVar : this.c) {
                    cVar.a(str, list);
                }
                return;
            }
            for (InterfaceC4663bik.c cVar2 : this.c) {
                cVar2.a(str);
            }
        }
    }
}
