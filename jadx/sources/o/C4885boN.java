package o;

import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistMap;
import com.netflix.mediaclient.servicemgr.interface_.player.playlist.PlaylistTimestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.boN  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4885boN {
    private String a;
    private final int b;
    private final InterfaceC4872boA c;
    private final PlaylistMap d;
    private final PriorityQueue<d> e;
    private final Map<String, Void> g;

    public C4885boN(PlaylistMap playlistMap, InterfaceC4872boA interfaceC4872boA) {
        this(playlistMap, interfaceC4872boA, 1);
    }

    public C4885boN(PlaylistMap playlistMap, InterfaceC4872boA interfaceC4872boA, int i) {
        this.g = new HashMap();
        this.e = new PriorityQueue<>();
        this.d = playlistMap;
        this.c = interfaceC4872boA;
        this.b = i;
    }

    public List<Long> c(PlaylistTimestamp playlistTimestamp, PlaylistTimestamp playlistTimestamp2) {
        C5213buX[] f;
        synchronized (this) {
            PlaylistMap playlistMap = this.d;
            if (playlistMap instanceof C5211buV) {
                long c = ((C5211buV) playlistMap).c();
                if (c > 0 && !this.c.d(c)) {
                    return Collections.singletonList(Long.valueOf(c));
                }
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(this.b);
            String str = playlistTimestamp2 == null ? playlistTimestamp.a : playlistTimestamp2.a;
            if (!str.equals(this.a)) {
                this.e.clear();
                this.e.add(new d(str, Integer.MAX_VALUE));
                this.a = str;
            }
            while (true) {
                if (!this.e.isEmpty()) {
                    d poll = this.e.poll();
                    String str2 = poll.e;
                    this.g.put(str2, null);
                    long e = this.d.e(str2);
                    if (e > 0 && e != 2147483647L) {
                        if (!this.c.d(e) && !arrayList.contains(Long.valueOf(e))) {
                            C1044Mm.d("PlaylistManifestHelper", "breadth first search missing manifest %s", Long.valueOf(e));
                            arrayList.add(Long.valueOf(e));
                        }
                        for (C5213buX c5213buX : this.d.a(str2).f()) {
                            if (!this.g.containsKey(c5213buX.d)) {
                                this.e.add(new d(c5213buX.d, (poll.a / 100) * c5213buX.e));
                            }
                        }
                        if (arrayList.size() >= this.b) {
                            return arrayList;
                        }
                    }
                } else {
                    for (String str3 : this.d.h().keySet()) {
                        long e2 = this.d.e(str3);
                        if (!this.c.d(e2) && !arrayList.contains(Long.valueOf(e2)) && e2 != 2147483647L) {
                            C1044Mm.d("PlaylistManifestHelper", "exhaustive search missing manifest %s", Long.valueOf(e2));
                            arrayList.add(Long.valueOf(e2));
                        }
                        if (arrayList.size() >= this.b) {
                            return arrayList;
                        }
                    }
                    return arrayList;
                }
            }
        }
    }

    /* renamed from: o.boN$d */
    /* loaded from: classes4.dex */
    static final class d implements Comparable<d> {
        private final int a;
        private final String e;

        public d(String str, int i) {
            this.e = str;
            this.a = i;
        }

        @Override // java.lang.Comparable
        /* renamed from: e */
        public int compareTo(d dVar) {
            return Integer.compare(dVar.a, this.a);
        }
    }
}
