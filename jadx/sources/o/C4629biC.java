package o;

import android.content.Context;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.Representation;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyInitialRequestSize;
import com.netflix.mediaclient.service.player.PlayerPrepareListener;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history.ThroughputHistoryPredictorHandler;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.predictors.INetflixThroughputPredictor$NetflixThroughputPredictionMediaType;
import com.netflix.mediaclient.servicemgr.PlayerPrefetchSource;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import o.C4629biC;
import o.C4636biJ;
import o.InterfaceC4522bgB;

/* renamed from: o.biC  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4629biC {
    private final C4619bht a;
    private final Context b;
    private final aHJ c;
    private final C4572bgz d;
    private final InterfaceC4793bmb e;
    private final PriorityTaskManager h;
    private final AtomicBoolean i = new AtomicBoolean(false);
    private final Queue<c> g = new LinkedList();

    public void b() {
    }

    public C4629biC(Context context, C4619bht c4619bht, C4572bgz c4572bgz, PriorityTaskManager priorityTaskManager, aHJ ahj) {
        this.b = context;
        this.a = c4619bht;
        this.d = c4572bgz;
        this.h = priorityTaskManager;
        this.c = ahj;
        this.e = new C4798bmg(context);
    }

    public void b(List<C5102bsS> list, List<PlayerPrepareListener> list2) {
        synchronized (this) {
            synchronized (this.g) {
                for (int i = 0; i < list.size(); i++) {
                    this.g.add(new c(list.get(i), list2 == null ? null : list2.get(i)));
                }
            }
            if (!this.i.getAndSet(true)) {
                a();
            }
        }
    }

    private boolean e(PlayerPrefetchSource playerPrefetchSource) {
        return !playerPrefetchSource.e(TN.a.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        final c poll;
        synchronized (this.g) {
            poll = this.g.poll();
        }
        if (poll != null) {
            C1044Mm.a("nf_cache", "processing prefetch for %s", poll);
            if (!e(poll.a.b())) {
                poll.a(PlayerPrepareListener.PrepareResult.c);
                a();
                return;
            }
            this.d.c(Long.valueOf(poll.a.e()), C4877boF.e(poll.a), new InterfaceC4522bgB.c() { // from class: o.biC.2
                @Override // o.InterfaceC4522bgB.c
                public String d() {
                    return "NfPrefetchManager";
                }

                @Override // o.InterfaceC4522bgB.c
                public void d(InterfaceC4525bgE interfaceC4525bgE, boolean z) {
                    C4629biC.this.e(poll, interfaceC4525bgE);
                }

                @Override // o.InterfaceC4522bgB.c
                public void d(Long l, Status status) {
                    poll.a(PlayerPrepareListener.PrepareResult.d);
                    C4629biC.this.a();
                }
            });
            return;
        }
        this.i.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(c cVar, InterfaceC4525bgE interfaceC4525bgE) {
        if (interfaceC4525bgE.n() != null) {
            a(cVar, true);
            return;
        }
        try {
            c(cVar, new C4725bjt(interfaceC4525bgE, this.b, null).c());
        } catch (ParserException e) {
            C1044Mm.b("nf_cache", e, "unable to parse manifest", new Object[0]);
            a(cVar, true);
        }
    }

    private void c(final c cVar, C4726bju c4726bju) {
        long d = cVar.a.d();
        AseConfig b2 = this.a.b(c4726bju.n(), cVar.a.b().e());
        InterfaceC4662bij bVar = new b(c4726bju.h());
        C4628biB c4628biB = new C4628biB(this.b, this.e, c4726bju.d());
        c4628biB.c(bVar);
        c4628biB.b(ConfigFastPropertyInitialRequestSize.useAseConfig() ? b2.bh() : ConfigFastPropertyInitialRequestSize.requestSize());
        long d2 = d(b2, bVar, c4726bju, d);
        cVar.a(1);
        InterfaceC4665bim c4627biA = new C4627biA(AbstractApplicationC1040Mh.d(), c4628biB, this.e, this.h);
        c4627biA.e(bVar, c(b2, c4726bju, c4627biA.d(c4726bju.j().longValue(), androidx.media3.common.C.msToUs(d)), d2), d(c4726bju), d, b2.bi(), cVar.a.b().c(), new C4636biJ.d() { // from class: o.biC.1
            @Override // o.C4636biJ.d
            public void c(Object obj) {
                C4629biC.this.a(cVar, false);
            }

            @Override // o.C4636biJ.d
            public void c() {
                C4629biC.this.a(cVar, true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(c cVar, boolean z) {
        if (cVar.d(z) == 0) {
            cVar.a(cVar.d() ? PlayerPrepareListener.PrepareResult.d : PlayerPrepareListener.PrepareResult.b);
            a();
        }
    }

    private List<Representation> d(C4726bju c4726bju) {
        ArrayList arrayList = new ArrayList();
        for (AdaptationSet adaptationSet : c4726bju.getPeriod(0).adaptationSets) {
            if (adaptationSet.type == 3) {
                arrayList.addAll(e(adaptationSet));
            }
        }
        return arrayList;
    }

    private List<Representation> c(AseConfig aseConfig, C4726bju c4726bju, List<C4658bif> list, long j) {
        ArrayList arrayList = new ArrayList();
        for (AdaptationSet adaptationSet : c4726bju.getPeriod(0).adaptationSets) {
            int i = adaptationSet.type;
            if (i == 2) {
                List<Representation> a2 = a(aseConfig, adaptationSet, j);
                d(adaptationSet, list, 2, a2);
                arrayList.addAll(a2);
            } else if (i == 1) {
                List<Representation> b2 = b(adaptationSet);
                d(adaptationSet, list, 1, b2);
                arrayList.addAll(b2);
            }
        }
        return arrayList;
    }

    private List<Representation> a(AseConfig aseConfig, AdaptationSet adaptationSet, long j) {
        ArrayList arrayList = new ArrayList();
        List<Representation> list = adaptationSet.representations;
        int size = list.size();
        if (size > 0) {
            Object[] objArr = (Object[]) Array.newInstance((Class) C4755bkv.b((char) 0, 117, 2358), size);
            for (int i = 0; i < size; i++) {
                int i2 = (size - i) - 1;
                try {
                    Object[] objArr2 = {list.get(i).format, Integer.valueOf(i)};
                    Object obj = C4755bkv.q.get(-93749372);
                    if (obj == null) {
                        obj = ((Class) C4755bkv.b((char) 0, 5, 797)).getDeclaredConstructor(Format.class, Integer.TYPE);
                        C4755bkv.q.put(-93749372, obj);
                    }
                    objArr[i2] = ((Constructor) obj).newInstance(objArr2);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            try {
                Object[] objArr3 = {this.a.e(aseConfig, false), objArr, Boolean.valueOf(aseConfig.bx())};
                Object obj2 = C4755bkv.q.get(-654284005);
                if (obj2 == null) {
                    obj2 = ((Class) C4755bkv.b((char) 31478, 5, 2552)).getMethod("b", StreamRange.class, Array.newInstance((Class) C4755bkv.b((char) 0, 117, 2358), 0).getClass(), Boolean.TYPE);
                    C4755bkv.q.put(-654284005, obj2);
                }
                Object[] objArr4 = (Object[]) ((Method) obj2).invoke(null, objArr3);
                Representation representation = list.get(((Class) C4755bkv.b((char) 0, 117, 2358)).getField("a").getInt(objArr4[this.a.a$1a64f078((int) j, aseConfig, objArr4, true)]));
                C1044Mm.a("nf_cache", "prefetching %s kbps video bitrate based on estimated throughput %s kbps", Integer.valueOf(representation.format.bitrate / 1000), Long.valueOf(j));
                arrayList.add(representation);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        }
        return arrayList;
    }

    private List<Representation> e(AdaptationSet adaptationSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<Representation> it = adaptationSet.representations.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Representation next = it.next();
            if ((next.format.selectionFlags & 1) != 0) {
                arrayList.add(next);
                break;
            }
        }
        return arrayList;
    }

    private List<Representation> b(AdaptationSet adaptationSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<Representation> it = adaptationSet.representations.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Representation next = it.next();
            Format format = next.format;
            if ((format.selectionFlags & 1) != 0 && format.bitrate >= 64000) {
                arrayList.add(next);
                break;
            }
        }
        return arrayList;
    }

    private long d(AseConfig aseConfig, InterfaceC4662bij interfaceC4662bij, C4726bju c4726bju, long j) {
        long j2 = (long) new ThroughputHistoryPredictorHandler(new a(c4726bju, j, this.b), this.a, interfaceC4662bij, aseConfig, null).getHistoryEstimate().d;
        if (j2 <= 0) {
            j2 = aseConfig.bj();
        }
        try {
            Object[] objArr = {aseConfig};
            Object obj = C4755bkv.q.get(-1008585859);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 56619, 5, 2233)).getDeclaredConstructor(AseConfig.class);
                C4755bkv.q.put(-1008585859, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            try {
                Object[] objArr2 = {INetflixThroughputPredictor$NetflixThroughputPredictionMediaType.Video, 0L, 64000L, Long.valueOf(j2)};
                Object obj2 = C4755bkv.q.get(-1998135820);
                if (obj2 == null) {
                    obj2 = ((Class) C4755bkv.b((char) 56619, 5, 2233)).getMethod("d", INetflixThroughputPredictor$NetflixThroughputPredictionMediaType.class, Long.TYPE, Long.TYPE, Long.TYPE);
                    C4755bkv.q.put(-1998135820, obj2);
                }
                long intValue = ((Integer) ((Method) obj2).invoke(newInstance, objArr2)).intValue();
                C1044Mm.a("nf_cache", "aseBandwidthMeterThroughput %s, Discounted: %s", Long.valueOf(j2), Long.valueOf(intValue));
                return intValue;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    private static void d(AdaptationSet adaptationSet, List<C4658bif> list, int i, List<Representation> list2) {
        Format b2;
        if (list2.isEmpty()) {
            return;
        }
        for (C4658bif c4658bif : list) {
            if (c4658bif.b() == i && (b2 = b(adaptationSet, c4658bif.d())) != null) {
                Iterator<Representation> it = list2.iterator();
                while (it.hasNext()) {
                    int i2 = it.next().format.bitrate;
                    if (i2 < b2.bitrate) {
                        C1044Mm.c("nf_cache", "skipping prefetch (already cached): wanted=%s , cached=%s", Integer.valueOf(i2), Integer.valueOf(b2.bitrate));
                        it.remove();
                    }
                }
            }
        }
    }

    private static Format b(AdaptationSet adaptationSet, String str) {
        for (Representation representation : adaptationSet.representations) {
            if (representation.format.id.equals(str)) {
                return representation.format;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.biC$a */
    /* loaded from: classes3.dex */
    public static class a implements IAsePlayerState {
        private final long c;
        private final Context d;
        private final C4726bju e;

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public long a(int i) {
            return 0L;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public long b(int i) {
            return 0L;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public float c() {
            return 1.0f;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public List<IAsePlayerState.a> c(int i) {
            return null;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public long d(int i) {
            return 0L;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public IAsePlayerState.a e(int i) {
            return null;
        }

        a(C4726bju c4726bju, long j, Context context) {
            this.e = c4726bju;
            this.c = j;
            this.d = context;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public IAsePlayerState.AsePlayerState b() {
            return IAsePlayerState.AsePlayerState.ASE_PLAYER_BUFFERING;
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public long d() {
            return androidx.media3.common.C.msToUs(this.c);
        }

        @Override // com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState
        public IAsePlayerState.d e() {
            return new IAsePlayerState.d(this.e.n(), InterfaceC5038brH.c.b(this.d).c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.biC$c */
    /* loaded from: classes3.dex */
    public static class c {
        final C5102bsS a;
        final PlayerPrepareListener e;
        final AtomicInteger c = new AtomicInteger(1);
        final AtomicBoolean b = new AtomicBoolean(false);

        public String toString() {
            return "PrefetchRequest{request=" + this.a + ", listener=" + this.e + ", numRemainingOperations=" + this.c + ", error=" + this.b + '}';
        }

        c(C5102bsS c5102bsS, PlayerPrepareListener playerPrepareListener) {
            this.a = c5102bsS;
            this.e = playerPrepareListener;
        }

        void a(int i) {
            this.c.set(i);
        }

        int d(boolean z) {
            this.b.set(z);
            return this.c.decrementAndGet();
        }

        public boolean d() {
            return this.b.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(PlayerPrepareListener.PrepareResult prepareResult) {
            this.e.c(this.a, prepareResult);
        }

        void a(final PlayerPrepareListener.PrepareResult prepareResult) {
            if (this.e != null) {
                AndroidSchedulers.mainThread().scheduleDirect(new Runnable() { // from class: o.biE
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4629biC.c.this.b(prepareResult);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.biC$b */
    /* loaded from: classes3.dex */
    public static final class b extends AbstractC4599bhZ {
        private final C4666bin d;

        b(C4666bin c4666bin) {
            this.d = c4666bin;
        }

        @Override // o.InterfaceC4662bij
        public C4668bip c(String str, int i, C4664bil c4664bil) {
            return this.d.a(str)[0];
        }

        @Override // o.InterfaceC4662bij
        public String d() {
            return this.d.c();
        }
    }
}
