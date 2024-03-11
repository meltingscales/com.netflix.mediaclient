package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.C4755bkv;

/* loaded from: classes3.dex */
public abstract class ChunkAggregatorConfig {
    @SerializedName("defaultResponseTimeMs")
    public abstract int defaultResponseTimeMs();

    @SerializedName("defaultTpKbps")
    public abstract int defaultTpKbps();

    @SerializedName("maxDurationMsSigmoid")
    public abstract Sigmoid maxDurationMsSigmoid();

    @SerializedName("maxSize")
    public abstract int maxSize();

    @SerializedName("minDurationMsSigmoid")
    public abstract Sigmoid minDurationMsSigmoid();

    @SerializedName("minLoadingRatio")
    public abstract double minLoadingRatio();

    @SerializedName("minSize")
    public abstract int minSize();

    public int minDurationMs() {
        return (int) minDurationMsSigmoid().start();
    }

    public static TypeAdapter<ChunkAggregatorConfig> typeAdapter(Gson gson) {
        try {
            Object[] objArr = {gson};
            Object obj = C4755bkv.q.get(-1197456420);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 0, 118, 341)).getDeclaredConstructor(Gson.class);
                C4755bkv.q.put(-1197456420, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            try {
                Object[] objArr2 = {0};
                Object obj2 = C4755bkv.q.get(2005412286);
                if (obj2 == null) {
                    obj2 = ((Class) C4755bkv.b((char) 0, 118, 341)).getMethod("a", Integer.TYPE);
                    C4755bkv.q.put(2005412286, obj2);
                }
                Object invoke = ((Method) obj2).invoke(newInstance, objArr2);
                try {
                    Object[] objArr3 = {10000000};
                    Object obj3 = C4755bkv.q.get(2005501659);
                    if (obj3 == null) {
                        obj3 = ((Class) C4755bkv.b((char) 0, 118, 341)).getMethod("d", Integer.TYPE);
                        C4755bkv.q.put(2005501659, obj3);
                    }
                    Object invoke2 = ((Method) obj3).invoke(invoke, objArr3);
                    try {
                        Object[] objArr4 = {Double.valueOf(0.0d)};
                        Object obj4 = C4755bkv.q.get(2005441922);
                        if (obj4 == null) {
                            obj4 = ((Class) C4755bkv.b((char) 0, 118, 341)).getMethod("b", Double.TYPE);
                            C4755bkv.q.put(2005441922, obj4);
                        }
                        Object invoke3 = ((Method) obj4).invoke(invoke2, objArr4);
                        try {
                            Object[] objArr5 = {100};
                            Object obj5 = C4755bkv.q.get(2005471868);
                            if (obj5 == null) {
                                obj5 = ((Class) C4755bkv.b((char) 0, 118, 341)).getMethod("c", Integer.TYPE);
                                C4755bkv.q.put(2005471868, obj5);
                            }
                            Object invoke4 = ((Method) obj5).invoke(invoke3, objArr5);
                            try {
                                Object[] objArr6 = {0};
                                Object obj6 = C4755bkv.q.get(2005442077);
                                if (obj6 == null) {
                                    obj6 = ((Class) C4755bkv.b((char) 0, 118, 341)).getMethod("b", Integer.TYPE);
                                    C4755bkv.q.put(2005442077, obj6);
                                }
                                Object invoke5 = ((Method) obj6).invoke(invoke4, objArr6);
                                try {
                                    Object[] objArr7 = {new AutoValue_Sigmoid(0.0d, 0.0d, 0.0d, 1000.0d, 1.0d)};
                                    Object obj7 = C4755bkv.q.get(46076255);
                                    if (obj7 == null) {
                                        obj7 = ((Class) C4755bkv.b((char) 0, 118, 341)).getMethod("c", Sigmoid.class);
                                        C4755bkv.q.put(46076255, obj7);
                                    }
                                    Object invoke6 = ((Method) obj7).invoke(invoke5, objArr7);
                                    try {
                                        Object[] objArr8 = {new AutoValue_Sigmoid(16000.0d, 16000.0d, 0.0d, 1000.0d, 1.0d)};
                                        Object obj8 = C4755bkv.q.get(-1554994851);
                                        if (obj8 == null) {
                                            obj8 = ((Class) C4755bkv.b((char) 0, 118, 341)).getMethod("a", Sigmoid.class);
                                            C4755bkv.q.put(-1554994851, obj8);
                                        }
                                        return (TypeAdapter) ((Method) obj8).invoke(invoke6, objArr8);
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
    }
}
