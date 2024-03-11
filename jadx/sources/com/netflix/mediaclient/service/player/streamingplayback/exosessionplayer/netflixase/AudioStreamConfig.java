package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import o.C4755bkv;

@Keep
/* loaded from: classes6.dex */
public abstract class AudioStreamConfig {
    @SerializedName("audioStreamRange")
    public abstract AudioStreamRange audioStreamRange();

    @SerializedName("audioSwitchConfig")
    public abstract AudioSwitchConfig audioSwitchConfig();

    @SerializedName("bandwidthMarginAudioSigmoid")
    public abstract Sigmoid bandwidthMarginAudioSigmoid();

    public static TypeAdapter<AudioStreamConfig> typeAdapter(Gson gson) {
        try {
            Object[] objArr = {gson};
            Object obj = C4755bkv.q.get(1783086555);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 40426, 114, 0)).getDeclaredConstructor(Gson.class);
                C4755bkv.q.put(1783086555, obj);
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
