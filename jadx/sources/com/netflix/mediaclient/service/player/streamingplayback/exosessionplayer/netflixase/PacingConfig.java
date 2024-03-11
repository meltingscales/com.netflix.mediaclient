package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import o.C4755bkv;

/* loaded from: classes6.dex */
public abstract class PacingConfig {
    @SerializedName("algorithm")
    public abstract String algorithm();

    @SerializedName("minRequiredBuffer")
    public abstract long minRequiredBuffer();

    @SerializedName("rateDiscountFactors")
    public abstract int[] rateDiscountFactors();

    @SerializedName("shouldPaceOnWifi")
    public abstract boolean shouldPaceOnWifi();

    @SerializedName("staticPacingRateKbps")
    public abstract int staticPacingRateKbps();

    public long minRequiredBufferUs() {
        return minRequiredBuffer() * 1000;
    }

    public static TypeAdapter<PacingConfig> typeAdapter(Gson gson) {
        try {
            Object[] objArr = {gson};
            Object obj = C4755bkv.q.get(2042803845);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 31775, 109, 459)).getDeclaredConstructor(Gson.class);
                C4755bkv.q.put(2042803845, obj);
            }
            Object newInstance = ((Constructor) obj).newInstance(objArr);
            try {
                Object[] objArr2 = {0L};
                Object obj2 = C4755bkv.q.get(79556418);
                if (obj2 == null) {
                    obj2 = ((Class) C4755bkv.b((char) 31775, 109, 459)).getMethod("e", Long.TYPE);
                    C4755bkv.q.put(79556418, obj2);
                }
                Object invoke = ((Method) obj2).invoke(newInstance, objArr2);
                try {
                    Object[] objArr3 = {false};
                    Object obj3 = C4755bkv.q.get(79467541);
                    if (obj3 == null) {
                        obj3 = ((Class) C4755bkv.b((char) 31775, 109, 459)).getMethod("b", Boolean.TYPE);
                        C4755bkv.q.put(79467541, obj3);
                    }
                    Object invoke2 = ((Method) obj3).invoke(invoke, objArr3);
                    try {
                        Object[] objArr4 = {new int[]{2, 2, 3}};
                        Object obj4 = C4755bkv.q.get(-1831473091);
                        if (obj4 == null) {
                            obj4 = ((Class) C4755bkv.b((char) 31775, 109, 459)).getMethod("b", int[].class);
                            C4755bkv.q.put(-1831473091, obj4);
                        }
                        Object invoke3 = ((Method) obj4).invoke(invoke2, objArr4);
                        try {
                            Object[] objArr5 = {0};
                            Object obj5 = C4755bkv.q.get(79496805);
                            if (obj5 == null) {
                                obj5 = ((Class) C4755bkv.b((char) 31775, 109, 459)).getMethod("c", Integer.TYPE);
                                C4755bkv.q.put(79496805, obj5);
                            }
                            Object invoke4 = ((Method) obj5).invoke(invoke3, objArr5);
                            try {
                                Object[] objArr6 = {"maxStreamBitrate"};
                                Object obj6 = C4755bkv.q.get(859338368);
                                if (obj6 == null) {
                                    obj6 = ((Class) C4755bkv.b((char) 31775, 109, 459)).getMethod("a", String.class);
                                    C4755bkv.q.put(859338368, obj6);
                                }
                                return (TypeAdapter) ((Method) obj6).invoke(invoke4, objArr6);
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
    }
}
