package com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer;

import com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.aseinterface.IAsePlayerState;
import java.lang.reflect.Constructor;
import o.C1044Mm;
import o.C4666bin;
import o.C4755bkv;
import o.InterfaceC4657bie;
import o.InterfaceC4659big;
import o.InterfaceC4663bik;
import o.InterfaceC4665bim;
import o.InterfaceC4796bme;

/* loaded from: classes3.dex */
public final class AdaptiveStreamingEngineFactory {
    private static AseOption b = AseOption.NETFLIX_OPTIMIZED;

    /* loaded from: classes3.dex */
    enum AseOption {
        NETFLIX_EXAMPLE,
        NETFLIX_OPTIMIZED
    }

    /* renamed from: com.netflix.mediaclient.service.player.streamingplayback.exosessionplayer.AdaptiveStreamingEngineFactory$4  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[AseOption.values().length];
            b = iArr;
            try {
                iArr[AseOption.NETFLIX_OPTIMIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static InterfaceC4659big e(InterfaceC4663bik interfaceC4663bik, InterfaceC4665bim interfaceC4665bim, IAsePlayerState iAsePlayerState, C4666bin c4666bin, InterfaceC4657bie interfaceC4657bie, String str, InterfaceC4796bme interfaceC4796bme) {
        if (AnonymousClass4.b[b.ordinal()] == 1) {
            return a(interfaceC4663bik, interfaceC4665bim, iAsePlayerState, c4666bin, interfaceC4657bie, str, interfaceC4796bme);
        }
        C1044Mm.d("StreamingPlayback_AdaptiveStreamingEngineFactory", "Error in choosing ASE option");
        return null;
    }

    private static InterfaceC4659big a(InterfaceC4663bik interfaceC4663bik, InterfaceC4665bim interfaceC4665bim, IAsePlayerState iAsePlayerState, C4666bin c4666bin, InterfaceC4657bie interfaceC4657bie, String str, InterfaceC4796bme interfaceC4796bme) {
        try {
            Object[] objArr = {interfaceC4663bik, interfaceC4665bim, iAsePlayerState, c4666bin, interfaceC4657bie, str, interfaceC4796bme};
            Object obj = C4755bkv.q.get(1943142801);
            if (obj == null) {
                obj = ((Class) C4755bkv.b((char) 12193, 5, 807)).getDeclaredConstructor(InterfaceC4663bik.class, InterfaceC4665bim.class, IAsePlayerState.class, C4666bin.class, InterfaceC4657bie.class, String.class, InterfaceC4796bme.class);
                C4755bkv.q.put(1943142801, obj);
            }
            return (InterfaceC4659big) ((Constructor) obj).newInstance(objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
