package o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AutoValue_ChunkAggregatorConfig;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.AutoValue_Sigmoid;
import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase.ChunkAggregatorConfig;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: o.bkx  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4756bkx {
    @SerializedName("audioChunkCellular")
    public abstract ChunkAggregatorConfig a();

    @SerializedName("backoffDelayIncrementMs")
    public abstract long b();

    @SerializedName("criticalBufferThresholdMs")
    public abstract int c();

    @SerializedName("backoffDelayMaxMs")
    public abstract long d();

    @SerializedName("audioChunk")
    public abstract ChunkAggregatorConfig e();

    @SerializedName("initialRequestSize")
    public abstract int f();

    @SerializedName("failedDownloadMinBufferTimeBeforeError")
    public abstract int g();

    @SerializedName("failedDownloadMinRetriesBeforeError")
    public abstract int h();

    @SerializedName("failedDownloadMaxRetriesBeforeCancel")
    public abstract int i();

    @SerializedName("failedDownloadMaxRetriesBeforeError")
    public abstract int j();

    @SerializedName("maxBufferSkewThresholdMs")
    public abstract int k();

    @SerializedName("maxStreamingSkew")
    public abstract int l();

    @SerializedName("videoChunkCellular")
    public abstract ChunkAggregatorConfig m();

    @SerializedName("videoChunk")
    public abstract ChunkAggregatorConfig o();

    public static TypeAdapter<AbstractC4756bkx> b(Gson gson) {
        try {
            Object[] objArr = {gson};
            Object obj = C1043Ml.p.get(1512323869);
            if (obj == null) {
                obj = ((Class) C1043Ml.c((char) 0, 7, 69)).getDeclaredConstructor(Gson.class);
                C1043Ml.p.put(1512323869, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            try {
                Object[] objArr2 = {5000};
                Object obj2 = C1043Ml.p.get(1548657822);
                if (obj2 == null) {
                    obj2 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("b", Integer.TYPE);
                    C1043Ml.p.put(1548657822, obj2);
                }
                Object invoke = ((Method) obj2).invoke(newInstance, objArr2);
                try {
                    Object[] objArr3 = {3};
                    Object obj3 = C1043Ml.p.get(1548687613);
                    if (obj3 == null) {
                        obj3 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("c", Integer.TYPE);
                        C1043Ml.p.put(1548687613, obj3);
                    }
                    Object invoke2 = ((Method) obj3).invoke(invoke, objArr3);
                    try {
                        Object[] objArr4 = {3};
                        Object obj4 = C1043Ml.p.get(1548687613);
                        if (obj4 == null) {
                            obj4 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("c", Integer.TYPE);
                            C1043Ml.p.put(1548687613, obj4);
                        }
                        Object invoke3 = ((Method) obj4).invoke(invoke2, objArr4);
                        try {
                            Object[] objArr5 = {48422};
                            Object obj5 = C1043Ml.p.get(1548747195);
                            if (obj5 == null) {
                                obj5 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("e", Integer.TYPE);
                                C1043Ml.p.put(1548747195, obj5);
                            }
                            Object invoke4 = ((Method) obj5).invoke(invoke3, objArr5);
                            try {
                                Object[] objArr6 = {Integer.MAX_VALUE};
                                Object obj6 = C1043Ml.p.get(1548628031);
                                if (obj6 == null) {
                                    obj6 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("a", Integer.TYPE);
                                    C1043Ml.p.put(1548628031, obj6);
                                }
                                Object invoke5 = ((Method) obj6).invoke(invoke4, objArr6);
                                try {
                                    Object[] objArr7 = {200L};
                                    Object obj7 = C1043Ml.p.get(1548657853);
                                    if (obj7 == null) {
                                        obj7 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("b", Long.TYPE);
                                        C1043Ml.p.put(1548657853, obj7);
                                    }
                                    Object invoke6 = ((Method) obj7).invoke(invoke5, objArr7);
                                    try {
                                        Object[] objArr8 = {2000L};
                                        Object obj8 = C1043Ml.p.get(1548628062);
                                        if (obj8 == null) {
                                            obj8 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("a", Long.TYPE);
                                            C1043Ml.p.put(1548628062, obj8);
                                        }
                                        Object invoke7 = ((Method) obj8).invoke(invoke6, objArr8);
                                        try {
                                            Object[] objArr9 = {5722};
                                            Object obj9 = C1043Ml.p.get(1548717404);
                                            if (obj9 == null) {
                                                obj9 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("d", Integer.TYPE);
                                                C1043Ml.p.put(1548717404, obj9);
                                            }
                                            Object invoke8 = ((Method) obj9).invoke(invoke7, objArr9);
                                            try {
                                                Object[] objArr10 = {2000};
                                                Object obj10 = C1043Ml.p.get(1548896150);
                                                if (obj10 == null) {
                                                    obj10 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("j", Integer.TYPE);
                                                    C1043Ml.p.put(1548896150, obj10);
                                                }
                                                Object invoke9 = ((Method) obj10).invoke(invoke8, objArr10);
                                                try {
                                                    Object[] objArr11 = {new AutoValue_ChunkAggregatorConfig(0, 1169685, 0.62d, 100, 0, new AutoValue_Sigmoid(16000.0d, 16000.0d, 0.0d, 1000.0d, 1.0d), new AutoValue_Sigmoid(16000.0d, 16000.0d, 0.0d, 1000.0d, 1.0d))};
                                                    Object obj11 = C1043Ml.p.get(921253929);
                                                    if (obj11 == null) {
                                                        obj11 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("d", ChunkAggregatorConfig.class);
                                                        C1043Ml.p.put(921253929, obj11);
                                                    }
                                                    Object invoke10 = ((Method) obj11).invoke(invoke9, objArr11);
                                                    try {
                                                        Object[] objArr12 = {new AutoValue_ChunkAggregatorConfig(0, 1169685, 0.62d, 100, 0, new AutoValue_Sigmoid(0.0d, 0.0d, 0.0d, 1000.0d, 1.0d), new AutoValue_Sigmoid(25401.0d, 25401.0d, 0.0d, 1000.0d, 1.0d))};
                                                        Object obj12 = C1043Ml.p.get(97572458);
                                                        if (obj12 == null) {
                                                            obj12 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("e", ChunkAggregatorConfig.class);
                                                            C1043Ml.p.put(97572458, obj12);
                                                        }
                                                        Object invoke11 = ((Method) obj12).invoke(invoke10, objArr12);
                                                        try {
                                                            Object[] objArr13 = {new AutoValue_ChunkAggregatorConfig(0, 1169685, 0.62d, 100, 0, new AutoValue_Sigmoid(16000.0d, 16000.0d, 0.0d, 1000.0d, 1.0d), new AutoValue_Sigmoid(16000.0d, 16000.0d, 0.0d, 1000.0d, 1.0d))};
                                                            Object obj13 = C1043Ml.p.get(-1726350425);
                                                            if (obj13 == null) {
                                                                obj13 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("b", ChunkAggregatorConfig.class);
                                                                C1043Ml.p.put(-1726350425, obj13);
                                                            }
                                                            Object invoke12 = ((Method) obj13).invoke(invoke11, objArr13);
                                                            try {
                                                                Object[] objArr14 = {new AutoValue_ChunkAggregatorConfig(0, 462853, 0.62d, 100, 0, new AutoValue_Sigmoid(8203.0d, 0.0d, 7242.0d, 26961.0d, 1.0d), new AutoValue_Sigmoid(45995.0d, 10398.0d, 7242.0d, 26961.0d, 1.0d))};
                                                                Object obj14 = C1043Ml.p.get(1744935400);
                                                                if (obj14 == null) {
                                                                    obj14 = ((Class) C1043Ml.c((char) 0, 7, 69)).getMethod("c", ChunkAggregatorConfig.class);
                                                                    C1043Ml.p.put(1744935400, obj14);
                                                                }
                                                                return (TypeAdapter) ((Method) obj14).invoke(invoke12, objArr14);
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
    }
}
