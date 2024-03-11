package o;

import android.content.Context;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.media.PreferredLanguageData;
import com.netflix.mediaclient.servicemgr.IPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.InterfaceC4348bcn;
import o.InterfaceC4522bgB;
import o.InterfaceC4873boB;

/* renamed from: o.bco  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4349bco implements InterfaceC4873boB {
    private final Context a;
    private final InterfaceC4208baF b;
    private final InterfaceC4348bcn d;
    private final C4572bgz e;

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(InterfaceC4525bgE interfaceC4525bgE, IPlayer.PlaybackType playbackType) {
    }

    public C4349bco(Context context, C4572bgz c4572bgz, InterfaceC4208baF interfaceC4208baF, InterfaceC4348bcn interfaceC4348bcn) {
        this.a = context;
        this.e = c4572bgz;
        this.b = interfaceC4208baF;
        this.d = interfaceC4348bcn;
    }

    @Override // o.InterfaceC4873boB
    public void b(List<Long> list, InterfaceC4873boB.a aVar, C4877boF c4877boF, boolean z, aHT aht) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Long l : list) {
            if (!z) {
                InterfaceC4208baF interfaceC4208baF = this.b;
                if (C4351bcq.a(interfaceC4208baF, "" + l)) {
                    this.d.c(l.longValue(), new d(aVar));
                }
            }
            arrayList.add(l);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.e.c(arrayList, new c(aVar), c4877boF, aht);
    }

    @Override // o.InterfaceC4873boB
    public void d(long j, PreferredLanguageData preferredLanguageData) {
        this.e.d(Long.valueOf(j), preferredLanguageData);
    }

    @Override // o.InterfaceC4873boB
    public IPlayer.PlaybackType e(List<Long> list) {
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC4208baF interfaceC4208baF = this.b;
            if (!C4351bcq.a(interfaceC4208baF, "" + it.next())) {
                return IPlayer.PlaybackType.StreamingPlayback;
            }
        }
        return IPlayer.PlaybackType.OfflinePlayback;
    }

    @Override // o.InterfaceC4873boB
    public void d() {
        this.e.i();
    }

    @Override // o.InterfaceC4873boB
    public InterfaceC4900boc a() {
        return this.e.b();
    }

    /* renamed from: o.bco$c */
    /* loaded from: classes3.dex */
    static final class c implements InterfaceC4522bgB.c {
        private final InterfaceC4873boB.a b;

        @Override // o.InterfaceC4522bgB.c
        public String d() {
            return "NetflixManifestProvider";
        }

        public c(InterfaceC4873boB.a aVar) {
            this.b = aVar;
        }

        @Override // o.InterfaceC4522bgB.c
        public void d(InterfaceC4525bgE interfaceC4525bgE, boolean z) {
            C4349bco.b(interfaceC4525bgE, IPlayer.PlaybackType.StreamingPlayback);
            this.b.d(interfaceC4525bgE.aa().longValue(), interfaceC4525bgE, z);
        }

        @Override // o.InterfaceC4522bgB.c
        public void d(Long l, Status status) {
            this.b.a(l.longValue(), status);
        }
    }

    /* renamed from: o.bco$d */
    /* loaded from: classes3.dex */
    static final class d implements InterfaceC4348bcn.a {
        private final InterfaceC4873boB.a e;

        public d(InterfaceC4873boB.a aVar) {
            this.e = aVar;
        }

        @Override // o.InterfaceC4348bcn.a
        public void c(long j, InterfaceC4348bcn.c cVar, String str, Status status) {
            if (status.j()) {
                C4349bco.b(cVar.d(), IPlayer.PlaybackType.OfflinePlayback);
                this.e.d(j, cVar.d(), true);
                return;
            }
            this.e.a(j, status);
        }
    }
}
