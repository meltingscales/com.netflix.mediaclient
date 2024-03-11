package org.linphone.mediastream;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import com.netflix.android.org.json.zip.JSONzip;

/* loaded from: classes6.dex */
public class MediastreamerAndroidContext {
    private static final int DEVICE_CHOICE = 0;
    public static final int DEVICE_HAS_BUILTIN_AEC = 1;
    public static final int DEVICE_HAS_BUILTIN_AEC_CRAPPY = 2;
    public static final int DEVICE_HAS_BUILTIN_OPENSLES_AEC = 8;
    public static final int DEVICE_USE_ANDROID_MIC = 4;
    private static MediastreamerAndroidContext instance;
    private static Context mContext;

    private native int enableFilterFromNameImpl(String str, boolean z);

    private native boolean filterFromNameEnabledImpl(String str);

    public static Context getContext() {
        return mContext;
    }

    private native void setDeviceFavoriteBufferSize(int i);

    private native void setDeviceFavoriteSampleRate(int i);

    private MediastreamerAndroidContext() {
    }

    private static MediastreamerAndroidContext getInstance() {
        if (instance == null) {
            instance = new MediastreamerAndroidContext();
        }
        return instance;
    }

    @TargetApi(19)
    public static void setContext(Object obj) {
        if (obj == null) {
            return;
        }
        Context context = (Context) obj;
        mContext = context;
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
        boolean hasSystemFeature2 = mContext.getPackageManager().hasSystemFeature("android.hardware.audio.pro");
        Log.i("[Device] hasLowLatencyFeature: " + hasSystemFeature + ", hasProFeature: " + hasSystemFeature2);
        MediastreamerAndroidContext mediastreamerAndroidContext = getInstance();
        AudioManager audioManager = (AudioManager) mContext.getSystemService("audio");
        int parseInt = parseInt(audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER"), JSONzip.end);
        int parseInt2 = parseInt(audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE"), 44100);
        Log.i("[Device] Output frames per buffer: " + parseInt + ", output sample rates: " + parseInt2 + " for OpenSLES MS sound card.");
        mediastreamerAndroidContext.setDeviceFavoriteSampleRate(parseInt2);
        mediastreamerAndroidContext.setDeviceFavoriteBufferSize(parseInt);
    }

    private static int parseInt(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            Log.e("Can't parse " + str + " to integer ; using default value " + i);
            return i;
        }
    }

    public static void enableFilterFromName(String str, boolean z) {
        if (getInstance().enableFilterFromNameImpl(str, z) != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot ");
            sb.append(z ? "enable" : "disable");
            sb.append(" filter  name [");
            sb.append(str);
            sb.append("]");
            throw new MediastreamException(sb.toString());
        }
    }

    public static boolean filterFromNameEnabled(String str) {
        return getInstance().filterFromNameEnabledImpl(str);
    }
}
