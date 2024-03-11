package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import o.C4755bkv;

/* loaded from: classes6.dex */
public abstract class AudioStreamRange {
    @SerializedName("maxBitrate")
    public abstract int maxBitrate();

    @SerializedName("maxInitBitrate")
    public abstract int maxInitBitrate();

    @SerializedName("minBitrate")
    public abstract int minBitrate();

    @SerializedName("minInitBitrate")
    public abstract int minInitBitrate();

    public static TypeAdapter<AudioStreamRange> typeAdapter(Gson gson) {
        try {
            Object[] objArr = {gson};
            Object obj = C4755bkv.q.get(-1465823857);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 49297, 113, 114)).getDeclaredConstructor(Gson.class);
                C4755bkv.q.put(-1465823857, obj);
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
}
