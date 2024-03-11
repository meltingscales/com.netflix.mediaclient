package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.netflixase;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Constructor;
import o.C4755bkv;

/* loaded from: classes6.dex */
public abstract class AudioSwitchConfig {
    @SerializedName("downSwitchFactor")
    public abstract double downSwitchFactor();

    @SerializedName("lockPeriodAfterDownswitch")
    public abstract int lockPeriodAfterDownswitch();

    @SerializedName("lowestBufForUpswitch")
    public abstract int lowestBufForUpswitch();

    @SerializedName("upSwitchFactor")
    public abstract double upSwitchFactor();

    public static TypeAdapter<AudioSwitchConfig> typeAdapter(Gson gson) {
        try {
            Object[] objArr = {gson};
            Object obj = C4755bkv.q.get(-265776184);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 8836, 114, 227)).getDeclaredConstructor(Gson.class);
                C4755bkv.q.put(-265776184, obj);
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
