package o;

import android.net.Uri;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.dash.DashUtil;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.mediasource.TimeSyncException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.bjW  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4702bjW {
    public static final a e = new a(null);
    private final DataSource b;
    private final DashManifest c;
    private final Loader d;

    public C4702bjW(DashManifest dashManifest, DataSource dataSource, Loader loader) {
        C8632dsu.c((Object) dashManifest, "");
        C8632dsu.c((Object) dataSource, "");
        C8632dsu.c((Object) loader, "");
        this.c = dashManifest;
        this.b = dataSource;
        this.d = loader;
    }

    public final void c(InterfaceC4747bki interfaceC4747bki) {
        C8632dsu.c((Object) interfaceC4747bki, "");
        Representation d = d();
        RangedUri initializationUri = d != null ? d.getInitializationUri() : null;
        if (initializationUri == null) {
            interfaceC4747bki.c(new IOException("no audio urls in livestream"));
            return;
        }
        DataSpec buildDataSpec = DashUtil.buildDataSpec(d, initializationUri, 0);
        C8632dsu.a(buildDataSpec, "");
        e.getLogTag();
        this.d.startLoading(new ParsingLoadable(this.b, buildDataSpec, 1, new ParsingLoadable.Parser() { // from class: o.bkb
            @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
            public final Object parse(Uri uri, InputStream inputStream) {
                dpR e2;
                e2 = C4702bjW.e(uri, inputStream);
                return e2;
            }
        }), new b(interfaceC4747bki), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dpR e(Uri uri, InputStream inputStream) {
        C8632dsu.c((Object) uri, "");
        C8632dsu.c((Object) inputStream, "");
        return dpR.c;
    }

    /* renamed from: o.bjW$b */
    /* loaded from: classes3.dex */
    public static final class b implements Loader.Callback<ParsingLoadable<dpR>> {
        final /* synthetic */ InterfaceC4747bki a;

        b(InterfaceC4747bki interfaceC4747bki) {
            this.a = interfaceC4747bki;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        /* renamed from: e */
        public void onLoadCompleted(ParsingLoadable<dpR> parsingLoadable, long j, long j2) {
            C8632dsu.c((Object) parsingLoadable, "");
            C1045Mp c1045Mp = C4761blb.b$729240f0;
            try {
                Object[] objArr = {parsingLoadable.getResponseHeaders()};
                Object obj = C4755bkv.q.get(-1090839984);
                if (obj == null) {
                    obj = ((Class) C4755bkv.b((char) 0, 7, 1130)).getMethod("c", Map.class);
                    C4755bkv.q.put(-1090839984, obj);
                }
                long longValue = ((Long) ((Method) obj).invoke(c1045Mp, objArr)).longValue();
                if (longValue == -9223372036854775807L) {
                    this.a.c(new TimeSyncException("time not found in side channel"));
                } else {
                    this.a.d(longValue);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        /* renamed from: b */
        public void onLoadCanceled(ParsingLoadable<dpR> parsingLoadable, long j, long j2, boolean z) {
            C8632dsu.c((Object) parsingLoadable, "");
            this.a.c(new TimeSyncException("time sync canceled"));
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.Callback
        /* renamed from: b */
        public Loader.LoadErrorAction onLoadError(ParsingLoadable<dpR> parsingLoadable, long j, long j2, IOException iOException, int i) {
            C8632dsu.c((Object) parsingLoadable, "");
            C8632dsu.c((Object) iOException, "");
            this.a.c(new TimeSyncException(iOException.getMessage()));
            Loader.LoadErrorAction loadErrorAction = Loader.DONT_RETRY_FATAL;
            C8632dsu.a(loadErrorAction, "");
            return loadErrorAction;
        }
    }

    private final Representation d() {
        C8654dtp g;
        int d;
        Representation representation;
        Object obj;
        List<Representation> list;
        List<Representation> list2;
        g = C8657dts.g(0, this.c.getPeriodCount());
        d = C8572dqo.d(g, 10);
        ArrayList arrayList = new ArrayList(d);
        Iterator<Integer> it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(this.c.getPeriod(((dqB) it).nextInt()));
        }
        Iterator it2 = arrayList.iterator();
        do {
            representation = null;
            if (!it2.hasNext()) {
                break;
            }
            List<AdaptationSet> list3 = ((Period) it2.next()).adaptationSets;
            C8632dsu.a(list3, "");
            Iterator<T> it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                AdaptationSet adaptationSet = (AdaptationSet) obj;
                if (adaptationSet.type == 1) {
                    C8632dsu.a(adaptationSet.representations, "");
                    if (!list2.isEmpty()) {
                        break;
                    }
                }
            }
            AdaptationSet adaptationSet2 = (AdaptationSet) obj;
            if (adaptationSet2 != null && (list = adaptationSet2.representations) != null) {
                representation = list.get(0);
                continue;
            }
        } while (representation == null);
        return representation;
    }

    /* renamed from: o.bjW$a */
    /* loaded from: classes3.dex */
    public static final class a extends C1045Mp {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
            super("TimeSync");
        }
    }
}
