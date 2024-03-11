package com.netflix.mediaclient.service.player.streamingplayback.playbackreporter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* loaded from: classes4.dex */
public class LogAudioSinkType {

    /* loaded from: classes4.dex */
    enum AudioSinkType {
        AUDIOSINK_BT("bluetooth"),
        AUDIOSINK_BUILTIN("builtin"),
        AUDIOSINK_HEADPHONE("headphone"),
        AUDIOSINK_DOCK("dock"),
        AUDIOSINK_USB("usb"),
        AUDIOSINK_OTHERS("others"),
        AUDIOSINK_DEAULT("default");
        
        private String i;

        String a() {
            return this.i;
        }

        AudioSinkType(String str) {
            this.i = str;
        }
    }

    @SuppressLint({"NewApi"})
    public static String c(Context context) {
        if (context != null) {
            AudioDeviceInfo[] devices = ((AudioManager) context.getSystemService("audio")).getDevices(2);
            if (devices == null || devices.length == 0) {
                return AudioSinkType.AUDIOSINK_DEAULT.a();
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (audioDeviceInfo.isSink()) {
                    switch (audioDeviceInfo.getType()) {
                        case 1:
                        case 2:
                            z5 = true;
                            continue;
                        case 3:
                        case 4:
                            z2 = true;
                            continue;
                        case 7:
                        case 8:
                            z = true;
                            continue;
                        case 11:
                        case 12:
                            z4 = true;
                            continue;
                        case 13:
                            z3 = true;
                            continue;
                    }
                }
            }
            if (z) {
                return AudioSinkType.AUDIOSINK_BT.a();
            }
            if (z2) {
                return AudioSinkType.AUDIOSINK_HEADPHONE.a();
            }
            if (z3) {
                return AudioSinkType.AUDIOSINK_DOCK.a();
            }
            if (z4) {
                return AudioSinkType.AUDIOSINK_USB.a();
            }
            if (z5) {
                return AudioSinkType.AUDIOSINK_BUILTIN.a();
            }
            return AudioSinkType.AUDIOSINK_OTHERS.a();
        }
        return AudioSinkType.AUDIOSINK_DEAULT.a();
    }
}
