package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.netflix.model.leafs.originals.interactive.animations.InteractiveAnimation;
import java.lang.reflect.Constructor;
import o.C4755bkv;

/* loaded from: classes3.dex */
public abstract class Sigmoid {
    @SerializedName("center")
    public abstract double center();

    @SerializedName("end")
    public abstract double end();

    @SerializedName("gamma")
    public abstract double gamma();

    @SerializedName(InteractiveAnimation.ANIMATION_TYPE.SCALE)
    public abstract double scale();

    @SerializedName("start")
    public abstract double start();

    public static TypeAdapter<Sigmoid> typeAdapter(Gson gson) {
        try {
            Object[] objArr = {gson};
            Object obj = C4755bkv.q.get(1755410789);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 12250, 104, 568)).getDeclaredConstructor(Gson.class);
                C4755bkv.q.put(1755410789, obj);
            }
            return (TypeAdapter) ((Constructor) obj).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static double sigmoid(double d) {
        return 1.0d / (Math.exp(-d) + 1.0d);
    }

    public double evaluate(double d) {
        return end() + ((start() - end()) * (1.0d - Math.pow(sigmoid(((d - center()) * 6.0d) / scale()), gamma())));
    }
}
