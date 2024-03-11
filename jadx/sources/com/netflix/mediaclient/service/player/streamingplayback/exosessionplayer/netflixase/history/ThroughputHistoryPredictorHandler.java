package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history;

import android.os.Handler;
import androidx.annotation.Keep;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AseConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import o.C1044Mm;
import o.C4736bkM;
import o.C4755bkv;
import o.C4758blF;
import o.C4762blt;
import o.InterfaceC4657bie;
import o.InterfaceC4661bii;
import o.InterfaceC4662bij;
import o.InterfaceC4734bkH;
import o.InterfaceC4763bly;
import o.InterfaceC4764blz;

@Keep
/* loaded from: classes3.dex */
public class ThroughputHistoryPredictorHandler implements InterfaceC4763bly {
    public static final String CronetThroughputEstimator = "CronetThroughputEstimator";
    public static final String DNNThroughputHistoryEstimator = "DNNThroughputHistoryEstimator";
    public static final String LocationHistoryEstimator = "LocationHistory";
    private static final long NO_ESTIMATE = -1;
    private static String TAG = "ThroughputHistoryPredictorHandler";
    public static final String ThroughputTraceHistory = "ThroughputTraceHistory";
    private boolean VERBOSE_HISTORY_LOGGING;
    private final AseConfig aseConfig;
    private C4736bkM aseReporter;
    private Handler historyHandler;
    private boolean historyMsgQueued;
    private Runnable historyRunnable;
    private boolean historyStarted;
    private InterfaceC4734bkH mBandwithMeter$2d87dc6;
    private final String primaryThroughputHistoryPredictor;
    private final String secondaryThroughputHistoryPredictor;
    private final Map<String, InterfaceC4764blz> throughputHistoryPredictorMap = new LinkedHashMap();

    @Override // o.InterfaceC4763bly
    public void stopRecordHistory() {
        this.historyStarted = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Keep
    public ThroughputHistoryPredictorHandler(IAsePlayerState iAsePlayerState, InterfaceC4657bie interfaceC4657bie, InterfaceC4662bij interfaceC4662bij, AseConfig aseConfig, C4736bkM c4736bkM) {
        char c;
        this.aseConfig = aseConfig;
        this.aseReporter = c4736bkM;
        String bm = aseConfig.bm();
        this.primaryThroughputHistoryPredictor = bm;
        String bw = aseConfig.bw();
        this.secondaryThroughputHistoryPredictor = bw;
        this.VERBOSE_HISTORY_LOGGING = aseConfig.F();
        for (String str : Arrays.asList(bm, bw)) {
            str.hashCode();
            int hashCode = str.hashCode();
            if (hashCode == -202412289) {
                if (str.equals(LocationHistoryEstimator)) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 227912537) {
                if (hashCode == 1907624697 && str.equals(ThroughputTraceHistory)) {
                    c = 2;
                }
                c = 65535;
            } else {
                if (str.equals(CronetThroughputEstimator)) {
                    c = 1;
                }
                c = 65535;
            }
            if (c == 0) {
                Map<String, InterfaceC4764blz> map = this.throughputHistoryPredictorMap;
                try {
                    Object[] objArr = {iAsePlayerState, interfaceC4657bie, interfaceC4662bij, aseConfig};
                    Object obj = C4755bkv.q.get(1960483725);
                    if (obj == null) {
                        obj = ((Class) C4755bkv.b((char) 0, 5, 1341)).getDeclaredConstructor(IAsePlayerState.class, InterfaceC4657bie.class, InterfaceC4662bij.class, AseConfig.class);
                        C4755bkv.q.put(1960483725, obj);
                    }
                    map.put(LocationHistoryEstimator, ((Constructor) obj).newInstance(objArr));
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else if (c == 1) {
                Map<String, InterfaceC4764blz> map2 = this.throughputHistoryPredictorMap;
                try {
                    Object[] objArr2 = {iAsePlayerState, interfaceC4657bie, interfaceC4662bij, aseConfig};
                    Object obj2 = C4755bkv.q.get(547455491);
                    if (obj2 == null) {
                        obj2 = ((Class) C4755bkv.b((char) 12024, 5, 1336)).getDeclaredConstructor(IAsePlayerState.class, InterfaceC4657bie.class, InterfaceC4662bij.class, AseConfig.class);
                        C4755bkv.q.put(547455491, obj2);
                    }
                    map2.put(CronetThroughputEstimator, ((Constructor) obj2).newInstance(objArr2));
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else if (c != 2) {
                continue;
            } else {
                Map<String, InterfaceC4764blz> map3 = this.throughputHistoryPredictorMap;
                try {
                    Object[] objArr3 = {iAsePlayerState, interfaceC4657bie, interfaceC4662bij, aseConfig};
                    Object obj3 = C4755bkv.q.get(-143240065);
                    if (obj3 == null) {
                        obj3 = ((Class) C4755bkv.b((char) 57695, 5, 1479)).getDeclaredConstructor(IAsePlayerState.class, InterfaceC4657bie.class, InterfaceC4662bij.class, AseConfig.class);
                        C4755bkv.q.put(-143240065, obj3);
                    }
                    map3.put(ThroughputTraceHistory, ((Constructor) obj3).newInstance(objArr3));
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
        }
        initRecordHistory();
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0010  */
    @Override // o.InterfaceC4764blz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.HashMap<java.lang.String, java.lang.String> getMatchedCriteria() {
        /*
            r5 = this;
            java.util.Map<java.lang.String, o.blz> r0 = r5.throughputHistoryPredictorMap
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.next()
            o.blz r1 = (o.InterfaceC4764blz) r1
            r2 = 0
            r3 = 1341(0x53d, float:1.879E-42)
            r4 = 5
            java.lang.Object r2 = o.C4755bkv.b(r2, r4, r3)
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = r2.isInstance(r1)
            if (r2 != 0) goto L37
            r2 = 57695(0xe15f, float:8.0848E-41)
            r3 = 1479(0x5c7, float:2.073E-42)
            java.lang.Object r2 = o.C4755bkv.b(r2, r4, r3)
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = r2.isInstance(r1)
            if (r2 == 0) goto La
        L37:
            java.util.HashMap r0 = r1.getMatchedCriteria()
            return r0
        L3c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.history.ThroughputHistoryPredictorHandler.getMatchedCriteria():java.util.HashMap");
    }

    @Override // o.InterfaceC4764blz
    public C4762blt getHistoryEstimate() {
        InterfaceC4661bii.e eVar = new InterfaceC4661bii.e();
        InterfaceC4764blz interfaceC4764blz = null;
        C4762blt c4762blt = null;
        for (Map.Entry<String, InterfaceC4764blz> entry : this.throughputHistoryPredictorMap.entrySet()) {
            C4762blt historyEstimate = entry.getValue().getHistoryEstimate();
            if (this.VERBOSE_HISTORY_LOGGING) {
                eVar.e(entry.getValue().getThroughputHistoryFeatures(), historyEstimate, entry.getKey());
            }
            if ((c4762blt != null && c4762blt.d < this.aseConfig.Z()) || c4762blt == null) {
                interfaceC4764blz = entry.getValue();
                c4762blt = historyEstimate;
            }
        }
        eVar.b(interfaceC4764blz.getThroughputHistoryFeatures(), c4762blt);
        C1044Mm.e(TAG, eVar.toString());
        C4736bkM c4736bkM = this.aseReporter;
        if (c4736bkM != null) {
            c4736bkM.b(eVar);
        }
        return c4762blt;
    }

    @Override // o.InterfaceC4764blz
    public void setPlayableId(long j) {
        for (InterfaceC4764blz interfaceC4764blz : this.throughputHistoryPredictorMap.values()) {
            if (((Class) C4755bkv.b((char) 57695, 5, 1479)).isInstance(interfaceC4764blz)) {
                interfaceC4764blz.setPlayableId(j);
            }
        }
    }

    public void addThroughput(long j) {
        for (InterfaceC4764blz interfaceC4764blz : this.throughputHistoryPredictorMap.values()) {
            if (((Class) C4755bkv.b((char) 0, 5, 1341)).isInstance(interfaceC4764blz)) {
                try {
                    Object[] objArr = {Long.valueOf(j)};
                    Object obj = C4755bkv.q.get(-1805598662);
                    if (obj == null) {
                        obj = ((Class) C4755bkv.b((char) 0, 5, 1341)).getMethod("d", Long.TYPE);
                        C4755bkv.q.put(-1805598662, obj);
                    }
                    ((Method) obj).invoke(interfaceC4764blz, objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
    }

    @Override // o.InterfaceC4763bly
    public void startRecordHistory$5a7f64d1(InterfaceC4734bkH interfaceC4734bkH) {
        this.mBandwithMeter$2d87dc6 = interfaceC4734bkH;
        if (this.historyStarted) {
            return;
        }
        this.historyStarted = true;
        if (this.historyMsgQueued) {
            return;
        }
        this.historyHandler.postDelayed(this.historyRunnable, 2000L);
        this.historyMsgQueued = true;
    }

    @Override // o.InterfaceC4764blz
    public C4758blF getThroughputHistoryFeatures() {
        for (InterfaceC4764blz interfaceC4764blz : this.throughputHistoryPredictorMap.values()) {
            if (((Class) C4755bkv.b((char) 0, 5, 1341)).isInstance(interfaceC4764blz)) {
                return interfaceC4764blz.getThroughputHistoryFeatures();
            }
        }
        return null;
    }

    private void initRecordHistory() {
        this.historyHandler = new Handler();
        try {
            Object[] objArr = {this};
            Object obj = C4755bkv.q.get(-381828019);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 0, 128, 1351)).getDeclaredConstructor(ThroughputHistoryPredictorHandler.class);
                C4755bkv.q.put(-381828019, obj);
            }
            this.historyRunnable = (Runnable) ((Constructor) obj).newInstance(objArr);
            this.historyStarted = false;
            this.historyMsgQueued = false;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener
    public void onBandwidthSample(int i, long j, long j2) {
        if (i <= -1 || j <= -1) {
            return;
        }
        for (InterfaceC4764blz interfaceC4764blz : this.throughputHistoryPredictorMap.values()) {
            if (((Class) C4755bkv.b((char) 57695, 5, 1479)).isInstance(interfaceC4764blz)) {
                try {
                    Object[] objArr = {Integer.valueOf(i), Long.valueOf(j), Long.valueOf(j2)};
                    Object obj = C4755bkv.q.get(-902076048);
                    if (obj == null) {
                        obj = ((Class) C4755bkv.b((char) 57695, 5, 1479)).getMethod("a", Integer.TYPE, Long.TYPE, Long.TYPE);
                        C4755bkv.q.put(-902076048, obj);
                    }
                    ((Method) obj).invoke(interfaceC4764blz, objArr);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
    }
}
