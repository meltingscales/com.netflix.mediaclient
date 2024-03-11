package o;

import androidx.media3.common.MediaItem;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.acquisition.screens.onRamp.OnRampFragment;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AutoValue_Sigmoid;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AutoValue_StreamRange;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.Sigmoid;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.StreamRange;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.predictors.INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: o.bkK  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4735bkK {
    @SerializedName("startingFeasibilityFactor")
    public abstract double A();

    @SerializedName("playingStreamRange")
    public abstract StreamRange B();

    @SerializedName("skipSubtitleInBandwidthMeter")
    public abstract boolean C();

    @SerializedName("resyncClockOn404")
    public abstract boolean D();

    @SerializedName("throughputDiscountForLive")
    public abstract float E();

    @SerializedName("startingStreamRange")
    public abstract StreamRange F();

    @SerializedName("targetLiveLatency")
    public abstract int G();

    @SerializedName("throughputDiscountExponentBC")
    public abstract float H();

    @SerializedName("highStreamFeasibilityFactor")
    public abstract double a();

    @SerializedName("bufferSafetyMarginFactor")
    public abstract double b();

    @SerializedName("forceTimeSync")
    public abstract boolean c();

    @SerializedName("bufferLevelDiscountSigmoid")
    public abstract Sigmoid d();

    @SerializedName("endSlateMaxRuntimeMs")
    public abstract long e();

    @SerializedName("liveEdgeDiscountSigmoid")
    public abstract Sigmoid f();

    @SerializedName("live404ServerErrorTemp")
    public abstract boolean g();

    @SerializedName("liveEdgeCushionMs")
    public abstract long h();

    @SerializedName("live404ConsecutiveErrorBlock")
    public abstract int i();

    @SerializedName("liveDvrSwitchLockTimeMs")
    public abstract long j();

    @SerializedName("liveThroughputDiscountFactorConservative")
    public abstract double k();

    @SerializedName("liveThroughputDiscountFactorAggressive")
    public abstract double l();

    @SerializedName("liveReportMeasurementDuration")
    public abstract long m();

    @SerializedName("liveReportFlushDuration")
    public abstract long n();

    @SerializedName("liveEdgeUiThresholdMs")
    public abstract long o();

    @SerializedName("lockPeriodAfterDownswitch")
    public abstract int p();

    @SerializedName("maxOffsetMs")
    public abstract int q();

    @SerializedName("liveThroughputDiscountFactorNormal")
    public abstract double r();

    @SerializedName("maxPlaybackSpeed")
    public abstract double s();

    @SerializedName("liveThroughputPredictor")
    public abstract INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors t();

    @SerializedName("minOffsetMs")
    public abstract int u();

    @SerializedName("missingSegmentCooldownTimeMs")
    public abstract long v();

    @SerializedName("missingSegmentConsecutiveErrors")
    public abstract int w();

    @SerializedName("maxStreamBlockDurationMs")
    public abstract long x();

    @SerializedName("minPlaybackSpeed")
    public abstract double y();

    @SerializedName("resyncClockOn200")
    public abstract boolean z();

    public long K() {
        return u() + (h() > 0 ? h() : 0L);
    }

    public MediaItem.LiveConfiguration I() {
        long h = h() > 0 ? h() : 0L;
        return new MediaItem.LiveConfiguration.Builder().setTargetOffsetMs(G() + h).setMinOffsetMs(u() >= 0 ? u() + h : -9223372036854775807L).setMaxOffsetMs(q() >= 0 ? q() + h : -9223372036854775807L).setMinPlaybackSpeed(y() >= 0.0d ? (float) y() : -3.4028235E38f).setMaxPlaybackSpeed(s() >= 0.0d ? (float) s() : -3.4028235E38f).build();
    }

    public static TypeAdapter<AbstractC4735bkK> c(Gson gson) {
        try {
            Object[] objArr = {gson};
            Object obj = C1043Ml.p.get(2011210928);
            if (obj == null) {
                obj = ((Class) C1043Ml.c((char) 3596, 7, 93)).getDeclaredConstructor(Gson.class);
                C1043Ml.p.put(2011210928, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            try {
                Object[] objArr2 = {Long.valueOf((long) OnRampFragment.ARTIFICIAL_PERSONALIZATION_WAIT_TIME)};
                Object obj2 = C1043Ml.p.get(1145581964);
                if (obj2 == null) {
                    obj2 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("f", Long.TYPE);
                    C1043Ml.p.put(1145581964, obj2);
                }
                Object invoke = ((Method) obj2).invoke(newInstance, objArr2);
                try {
                    Object[] objArr3 = {10000L};
                    Object obj3 = C1043Ml.p.get(1145552173);
                    if (obj3 == null) {
                        obj3 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("e", Long.TYPE);
                        C1043Ml.p.put(1145552173, obj3);
                    }
                    Object invoke2 = ((Method) obj3).invoke(invoke, objArr3);
                    try {
                        Object[] objArr4 = {Double.valueOf(0.9d)};
                        Object obj4 = C1043Ml.p.get(1145432823);
                        if (obj4 == null) {
                            obj4 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("a", Double.TYPE);
                            C1043Ml.p.put(1145432823, obj4);
                        }
                        Object invoke3 = ((Method) obj4).invoke(invoke2, objArr4);
                        try {
                            Object[] objArr5 = {Double.valueOf(0.5d)};
                            Object obj5 = C1043Ml.p.get(1145641360);
                            if (obj5 == null) {
                                obj5 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("h", Double.TYPE);
                                C1043Ml.p.put(1145641360, obj5);
                            }
                            Object invoke4 = ((Method) obj5).invoke(invoke3, objArr5);
                            try {
                                Object[] objArr6 = {10000};
                                Object obj6 = C1043Ml.p.get(1145462769);
                                if (obj6 == null) {
                                    obj6 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("b", Integer.TYPE);
                                    C1043Ml.p.put(1145462769, obj6);
                                }
                                Object invoke5 = ((Method) obj6).invoke(invoke4, objArr6);
                                try {
                                    Object[] objArr7 = {new AutoValue_StreamRange(0, 1000, 1000, 1000, 0, 110, 110, 0, 0)};
                                    Object obj7 = C1043Ml.p.get(-2126593701);
                                    if (obj7 == null) {
                                        obj7 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("d", StreamRange.class);
                                        C1043Ml.p.put(-2126593701, obj7);
                                    }
                                    Object invoke6 = ((Method) obj7).invoke(invoke5, objArr7);
                                    try {
                                        Object[] objArr8 = {new AutoValue_StreamRange(0, 20000, 20000, 20000, 0, 110, 110, 0, 0)};
                                        Object obj8 = C1043Ml.p.get(-819451303);
                                        if (obj8 == null) {
                                            obj8 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("b", StreamRange.class);
                                            C1043Ml.p.put(-819451303, obj8);
                                        }
                                        Object invoke7 = ((Method) obj8).invoke(invoke6, objArr8);
                                        try {
                                            Object[] objArr9 = {Double.valueOf(0.75d)};
                                            Object obj9 = C1043Ml.p.get(1145551987);
                                            if (obj9 == null) {
                                                obj9 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("e", Double.TYPE);
                                                C1043Ml.p.put(1145551987, obj9);
                                            }
                                            Object invoke8 = ((Method) obj9).invoke(invoke7, objArr9);
                                            try {
                                                Object[] objArr10 = {Double.valueOf(0.5d)};
                                                Object obj10 = C1043Ml.p.get(1145462614);
                                                if (obj10 == null) {
                                                    obj10 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("b", Double.TYPE);
                                                    C1043Ml.p.put(1145462614, obj10);
                                                }
                                                Object invoke9 = ((Method) obj10).invoke(invoke8, objArr10);
                                                try {
                                                    Object[] objArr11 = {Double.valueOf(0.25d)};
                                                    Object obj11 = C1043Ml.p.get(1145522196);
                                                    if (obj11 == null) {
                                                        obj11 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("d", Double.TYPE);
                                                        C1043Ml.p.put(1145522196, obj11);
                                                    }
                                                    Object invoke10 = ((Method) obj11).invoke(invoke9, objArr11);
                                                    try {
                                                        Object[] objArr12 = {true};
                                                        Object obj12 = C1043Ml.p.get(1145522878);
                                                        if (obj12 == null) {
                                                            obj12 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("d", Boolean.TYPE);
                                                            C1043Ml.p.put(1145522878, obj12);
                                                        }
                                                        Object invoke11 = ((Method) obj12).invoke(invoke10, objArr12);
                                                        try {
                                                            Object[] objArr13 = {14000};
                                                            Object obj13 = C1043Ml.p.get(1145581933);
                                                            if (obj13 == null) {
                                                                obj13 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("f", Integer.TYPE);
                                                                C1043Ml.p.put(1145581933, obj13);
                                                            }
                                                            Object invoke12 = ((Method) obj13).invoke(invoke11, objArr13);
                                                            try {
                                                                Object[] objArr14 = {14000};
                                                                Object obj14 = C1043Ml.p.get(1145522351);
                                                                if (obj14 == null) {
                                                                    obj14 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("d", Integer.TYPE);
                                                                    C1043Ml.p.put(1145522351, obj14);
                                                                }
                                                                Object invoke13 = ((Method) obj14).invoke(invoke12, objArr14);
                                                                try {
                                                                    Object[] objArr15 = {18000};
                                                                    Object obj15 = C1043Ml.p.get(1145492560);
                                                                    if (obj15 == null) {
                                                                        obj15 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("c", Integer.TYPE);
                                                                        C1043Ml.p.put(1145492560, obj15);
                                                                    }
                                                                    Object invoke14 = ((Method) obj15).invoke(invoke13, objArr15);
                                                                    try {
                                                                        Object[] objArr16 = {Double.valueOf(0.98d)};
                                                                        Object obj16 = C1043Ml.p.get(1145671151);
                                                                        if (obj16 == null) {
                                                                            obj16 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("i", Double.TYPE);
                                                                            C1043Ml.p.put(1145671151, obj16);
                                                                        }
                                                                        Object invoke15 = ((Method) obj16).invoke(invoke14, objArr16);
                                                                        try {
                                                                            Object[] objArr17 = {Double.valueOf(1.02d)};
                                                                            Object obj17 = C1043Ml.p.get(1145700942);
                                                                            if (obj17 == null) {
                                                                                obj17 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("j", Double.TYPE);
                                                                                C1043Ml.p.put(1145700942, obj17);
                                                                            }
                                                                            Object invoke16 = ((Method) obj17).invoke(invoke15, objArr17);
                                                                            try {
                                                                                Object[] objArr18 = {Double.valueOf(2.0d)};
                                                                                Object obj18 = C1043Ml.p.get(1145492405);
                                                                                if (obj18 == null) {
                                                                                    obj18 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("c", Double.TYPE);
                                                                                    C1043Ml.p.put(1145492405, obj18);
                                                                                }
                                                                                Object invoke17 = ((Method) obj18).invoke(invoke16, objArr18);
                                                                                try {
                                                                                    Object[] objArr19 = {5000L};
                                                                                    Object obj19 = C1043Ml.p.get(1145641546);
                                                                                    if (obj19 == null) {
                                                                                        obj19 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("h", Long.TYPE);
                                                                                        C1043Ml.p.put(1145641546, obj19);
                                                                                    }
                                                                                    Object invoke18 = ((Method) obj19).invoke(invoke17, objArr19);
                                                                                    try {
                                                                                        Object[] objArr20 = {60000L};
                                                                                        Object obj20 = C1043Ml.p.get(1145492591);
                                                                                        if (obj20 == null) {
                                                                                            obj20 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("c", Long.TYPE);
                                                                                            C1043Ml.p.put(1145492591, obj20);
                                                                                        }
                                                                                        Object invoke19 = ((Method) obj20).invoke(invoke18, objArr20);
                                                                                        try {
                                                                                            Object[] objArr21 = {30000L};
                                                                                            Object obj21 = C1043Ml.p.get(1145522382);
                                                                                            if (obj21 == null) {
                                                                                                obj21 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("d", Long.TYPE);
                                                                                                C1043Ml.p.put(1145522382, obj21);
                                                                                            }
                                                                                            Object invoke20 = ((Method) obj21).invoke(invoke19, objArr21);
                                                                                            try {
                                                                                                Object[] objArr22 = {2000L};
                                                                                                Object obj22 = C1043Ml.p.get(1145433009);
                                                                                                if (obj22 == null) {
                                                                                                    obj22 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("a", Long.TYPE);
                                                                                                    C1043Ml.p.put(1145433009, obj22);
                                                                                                }
                                                                                                Object invoke21 = ((Method) obj22).invoke(invoke20, objArr22);
                                                                                                try {
                                                                                                    Object[] objArr23 = {false};
                                                                                                    Object obj23 = C1043Ml.p.get(1145493087);
                                                                                                    if (obj23 == null) {
                                                                                                        obj23 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("c", Boolean.TYPE);
                                                                                                        C1043Ml.p.put(1145493087, obj23);
                                                                                                    }
                                                                                                    Object invoke22 = ((Method) obj23).invoke(invoke21, objArr23);
                                                                                                    try {
                                                                                                        Object[] objArr24 = {3};
                                                                                                        Object obj24 = C1043Ml.p.get(1145432978);
                                                                                                        if (obj24 == null) {
                                                                                                            obj24 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("a", Integer.TYPE);
                                                                                                            C1043Ml.p.put(1145432978, obj24);
                                                                                                        }
                                                                                                        Object invoke23 = ((Method) obj24).invoke(invoke22, objArr24);
                                                                                                        try {
                                                                                                            Object[] objArr25 = {INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors.d};
                                                                                                            Object obj25 = C1043Ml.p.get(2143566047);
                                                                                                            if (obj25 == null) {
                                                                                                                obj25 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("c", INetflixThroughputPredictorLive$NetflixLiveThroughputPredictors.class);
                                                                                                                C1043Ml.p.put(2143566047, obj25);
                                                                                                            }
                                                                                                            Object invoke24 = ((Method) obj25).invoke(invoke23, objArr25);
                                                                                                            try {
                                                                                                                Object[] objArr26 = {Float.valueOf(1.5f)};
                                                                                                                Object obj26 = C1043Ml.p.get(1145492467);
                                                                                                                if (obj26 == null) {
                                                                                                                    obj26 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("c", Float.TYPE);
                                                                                                                    C1043Ml.p.put(1145492467, obj26);
                                                                                                                }
                                                                                                                Object invoke25 = ((Method) obj26).invoke(invoke24, objArr26);
                                                                                                                try {
                                                                                                                    Object[] objArr27 = {Float.valueOf(0.8f)};
                                                                                                                    Object obj27 = C1043Ml.p.get(1145432885);
                                                                                                                    if (obj27 == null) {
                                                                                                                        obj27 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("a", Float.TYPE);
                                                                                                                        C1043Ml.p.put(1145432885, obj27);
                                                                                                                    }
                                                                                                                    Object invoke26 = ((Method) obj27).invoke(invoke25, objArr27);
                                                                                                                    try {
                                                                                                                        Object[] objArr28 = {new AutoValue_Sigmoid(0.6145602188925327d, 0.05618103867320081d, 10000.0d, 17000.0d, 1.9773762655702987d)};
                                                                                                                        Object obj28 = C1043Ml.p.get(-986206197);
                                                                                                                        if (obj28 == null) {
                                                                                                                            obj28 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("c", Sigmoid.class);
                                                                                                                            C1043Ml.p.put(-986206197, obj28);
                                                                                                                        }
                                                                                                                        Object invoke27 = ((Method) obj28).invoke(invoke26, objArr28);
                                                                                                                        try {
                                                                                                                            Object[] objArr29 = {new AutoValue_Sigmoid(-0.0014642608175878973d, 0.24804962407747255d, 10000.0d, 17000.0d, 0.7144822478453975d)};
                                                                                                                            Object obj29 = C1043Ml.p.get(614864909);
                                                                                                                            if (obj29 == null) {
                                                                                                                                obj29 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("e", Sigmoid.class);
                                                                                                                                C1043Ml.p.put(614864909, obj29);
                                                                                                                            }
                                                                                                                            Object invoke28 = ((Method) obj29).invoke(invoke27, objArr29);
                                                                                                                            try {
                                                                                                                                Object[] objArr30 = {true};
                                                                                                                                Object obj30 = C1043Ml.p.get(1145463296);
                                                                                                                                if (obj30 == null) {
                                                                                                                                    obj30 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("b", Boolean.TYPE);
                                                                                                                                    C1043Ml.p.put(1145463296, obj30);
                                                                                                                                }
                                                                                                                                Object invoke29 = ((Method) obj30).invoke(invoke28, objArr30);
                                                                                                                                try {
                                                                                                                                    Object[] objArr31 = {60000L};
                                                                                                                                    Object obj31 = C1043Ml.p.get(1145462800);
                                                                                                                                    if (obj31 == null) {
                                                                                                                                        obj31 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("b", Long.TYPE);
                                                                                                                                        C1043Ml.p.put(1145462800, obj31);
                                                                                                                                    }
                                                                                                                                    Object invoke30 = ((Method) obj31).invoke(invoke29, objArr31);
                                                                                                                                    try {
                                                                                                                                        Object[] objArr32 = {true};
                                                                                                                                        Object obj32 = C1043Ml.p.get(1145433505);
                                                                                                                                        if (obj32 == null) {
                                                                                                                                            obj32 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("a", Boolean.TYPE);
                                                                                                                                            C1043Ml.p.put(1145433505, obj32);
                                                                                                                                        }
                                                                                                                                        Object invoke31 = ((Method) obj32).invoke(invoke30, objArr32);
                                                                                                                                        try {
                                                                                                                                            Object[] objArr33 = {false};
                                                                                                                                            Object obj33 = C1043Ml.p.get(1145552669);
                                                                                                                                            if (obj33 == null) {
                                                                                                                                                obj33 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("e", Boolean.TYPE);
                                                                                                                                                C1043Ml.p.put(1145552669, obj33);
                                                                                                                                            }
                                                                                                                                            Object invoke32 = ((Method) obj33).invoke(invoke31, objArr33);
                                                                                                                                            try {
                                                                                                                                                Object[] objArr34 = {10000L};
                                                                                                                                                Object obj34 = C1043Ml.p.get(1145671337);
                                                                                                                                                if (obj34 == null) {
                                                                                                                                                    obj34 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("i", Long.TYPE);
                                                                                                                                                    C1043Ml.p.put(1145671337, obj34);
                                                                                                                                                }
                                                                                                                                                Object invoke33 = ((Method) obj34).invoke(invoke32, objArr34);
                                                                                                                                                try {
                                                                                                                                                    Object[] objArr35 = {6};
                                                                                                                                                    Object obj35 = C1043Ml.p.get(1145552142);
                                                                                                                                                    if (obj35 == null) {
                                                                                                                                                        obj35 = ((Class) C1043Ml.c((char) 3596, 7, 93)).getMethod("e", Integer.TYPE);
                                                                                                                                                        C1043Ml.p.put(1145552142, obj35);
                                                                                                                                                    }
                                                                                                                                                    return (TypeAdapter) ((Method) obj35).invoke(invoke33, objArr35);
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
                                                                                                                                        } catch (Throwable th3) {
                                                                                                                                            Throwable cause3 = th3.getCause();
                                                                                                                                            if (cause3 != null) {
                                                                                                                                                throw cause3;
                                                                                                                                            }
                                                                                                                                            throw th3;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th4) {
                                                                                                                                        Throwable cause4 = th4.getCause();
                                                                                                                                        if (cause4 != null) {
                                                                                                                                            throw cause4;
                                                                                                                                        }
                                                                                                                                        throw th4;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th5) {
                                                                                                                                    Throwable cause5 = th5.getCause();
                                                                                                                                    if (cause5 != null) {
                                                                                                                                        throw cause5;
                                                                                                                                    }
                                                                                                                                    throw th5;
                                                                                                                                }
                                                                                                                            } catch (Throwable th6) {
                                                                                                                                Throwable cause6 = th6.getCause();
                                                                                                                                if (cause6 != null) {
                                                                                                                                    throw cause6;
                                                                                                                                }
                                                                                                                                throw th6;
                                                                                                                            }
                                                                                                                        } catch (Throwable th7) {
                                                                                                                            Throwable cause7 = th7.getCause();
                                                                                                                            if (cause7 != null) {
                                                                                                                                throw cause7;
                                                                                                                            }
                                                                                                                            throw th7;
                                                                                                                        }
                                                                                                                    } catch (Throwable th8) {
                                                                                                                        Throwable cause8 = th8.getCause();
                                                                                                                        if (cause8 != null) {
                                                                                                                            throw cause8;
                                                                                                                        }
                                                                                                                        throw th8;
                                                                                                                    }
                                                                                                                } catch (Throwable th9) {
                                                                                                                    Throwable cause9 = th9.getCause();
                                                                                                                    if (cause9 != null) {
                                                                                                                        throw cause9;
                                                                                                                    }
                                                                                                                    throw th9;
                                                                                                                }
                                                                                                            } catch (Throwable th10) {
                                                                                                                Throwable cause10 = th10.getCause();
                                                                                                                if (cause10 != null) {
                                                                                                                    throw cause10;
                                                                                                                }
                                                                                                                throw th10;
                                                                                                            }
                                                                                                        } catch (Throwable th11) {
                                                                                                            Throwable cause11 = th11.getCause();
                                                                                                            if (cause11 != null) {
                                                                                                                throw cause11;
                                                                                                            }
                                                                                                            throw th11;
                                                                                                        }
                                                                                                    } catch (Throwable th12) {
                                                                                                        Throwable cause12 = th12.getCause();
                                                                                                        if (cause12 != null) {
                                                                                                            throw cause12;
                                                                                                        }
                                                                                                        throw th12;
                                                                                                    }
                                                                                                } catch (Throwable th13) {
                                                                                                    Throwable cause13 = th13.getCause();
                                                                                                    if (cause13 != null) {
                                                                                                        throw cause13;
                                                                                                    }
                                                                                                    throw th13;
                                                                                                }
                                                                                            } catch (Throwable th14) {
                                                                                                Throwable cause14 = th14.getCause();
                                                                                                if (cause14 != null) {
                                                                                                    throw cause14;
                                                                                                }
                                                                                                throw th14;
                                                                                            }
                                                                                        } catch (Throwable th15) {
                                                                                            Throwable cause15 = th15.getCause();
                                                                                            if (cause15 != null) {
                                                                                                throw cause15;
                                                                                            }
                                                                                            throw th15;
                                                                                        }
                                                                                    } catch (Throwable th16) {
                                                                                        Throwable cause16 = th16.getCause();
                                                                                        if (cause16 != null) {
                                                                                            throw cause16;
                                                                                        }
                                                                                        throw th16;
                                                                                    }
                                                                                } catch (Throwable th17) {
                                                                                    Throwable cause17 = th17.getCause();
                                                                                    if (cause17 != null) {
                                                                                        throw cause17;
                                                                                    }
                                                                                    throw th17;
                                                                                }
                                                                            } catch (Throwable th18) {
                                                                                Throwable cause18 = th18.getCause();
                                                                                if (cause18 != null) {
                                                                                    throw cause18;
                                                                                }
                                                                                throw th18;
                                                                            }
                                                                        } catch (Throwable th19) {
                                                                            Throwable cause19 = th19.getCause();
                                                                            if (cause19 != null) {
                                                                                throw cause19;
                                                                            }
                                                                            throw th19;
                                                                        }
                                                                    } catch (Throwable th20) {
                                                                        Throwable cause20 = th20.getCause();
                                                                        if (cause20 != null) {
                                                                            throw cause20;
                                                                        }
                                                                        throw th20;
                                                                    }
                                                                } catch (Throwable th21) {
                                                                    Throwable cause21 = th21.getCause();
                                                                    if (cause21 != null) {
                                                                        throw cause21;
                                                                    }
                                                                    throw th21;
                                                                }
                                                            } catch (Throwable th22) {
                                                                Throwable cause22 = th22.getCause();
                                                                if (cause22 != null) {
                                                                    throw cause22;
                                                                }
                                                                throw th22;
                                                            }
                                                        } catch (Throwable th23) {
                                                            Throwable cause23 = th23.getCause();
                                                            if (cause23 != null) {
                                                                throw cause23;
                                                            }
                                                            throw th23;
                                                        }
                                                    } catch (Throwable th24) {
                                                        Throwable cause24 = th24.getCause();
                                                        if (cause24 != null) {
                                                            throw cause24;
                                                        }
                                                        throw th24;
                                                    }
                                                } catch (Throwable th25) {
                                                    Throwable cause25 = th25.getCause();
                                                    if (cause25 != null) {
                                                        throw cause25;
                                                    }
                                                    throw th25;
                                                }
                                            } catch (Throwable th26) {
                                                Throwable cause26 = th26.getCause();
                                                if (cause26 != null) {
                                                    throw cause26;
                                                }
                                                throw th26;
                                            }
                                        } catch (Throwable th27) {
                                            Throwable cause27 = th27.getCause();
                                            if (cause27 != null) {
                                                throw cause27;
                                            }
                                            throw th27;
                                        }
                                    } catch (Throwable th28) {
                                        Throwable cause28 = th28.getCause();
                                        if (cause28 != null) {
                                            throw cause28;
                                        }
                                        throw th28;
                                    }
                                } catch (Throwable th29) {
                                    Throwable cause29 = th29.getCause();
                                    if (cause29 != null) {
                                        throw cause29;
                                    }
                                    throw th29;
                                }
                            } catch (Throwable th30) {
                                Throwable cause30 = th30.getCause();
                                if (cause30 != null) {
                                    throw cause30;
                                }
                                throw th30;
                            }
                        } catch (Throwable th31) {
                            Throwable cause31 = th31.getCause();
                            if (cause31 != null) {
                                throw cause31;
                            }
                            throw th31;
                        }
                    } catch (Throwable th32) {
                        Throwable cause32 = th32.getCause();
                        if (cause32 != null) {
                            throw cause32;
                        }
                        throw th32;
                    }
                } catch (Throwable th33) {
                    Throwable cause33 = th33.getCause();
                    if (cause33 != null) {
                        throw cause33;
                    }
                    throw th33;
                }
            } catch (Throwable th34) {
                Throwable cause34 = th34.getCause();
                if (cause34 != null) {
                    throw cause34;
                }
                throw th34;
            }
        } catch (Throwable th35) {
            Throwable cause35 = th35.getCause();
            if (cause35 != null) {
                throw cause35;
            }
            throw th35;
        }
    }
}
