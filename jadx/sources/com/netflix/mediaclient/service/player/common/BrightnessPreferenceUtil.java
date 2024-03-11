package com.netflix.mediaclient.service.player.common;

import android.content.Context;
import com.netflix.android.org.json.zip.JSONzip;
import o.C8157dfA;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.InterfaceC8598drn;

/* loaded from: classes3.dex */
public final class BrightnessPreferenceUtil {
    public static final c b = new c(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Format {
        private static final /* synthetic */ InterfaceC8598drn d;
        private static final /* synthetic */ Format[] e;
        private final String b;
        public static final Format c = new Format("SDR", 0, "SDR");
        public static final Format a = new Format("HDR", 1, "HDR");

        private static final /* synthetic */ Format[] c() {
            return new Format[]{c, a};
        }

        public static Format valueOf(String str) {
            return (Format) Enum.valueOf(Format.class, str);
        }

        public static Format[] values() {
            return (Format[]) e.clone();
        }

        private Format(String str, int i, String str2) {
            this.b = str2;
        }

        static {
            Format[] c2 = c();
            e = c2;
            d = C8600drp.e(c2);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        private final String c(Format format) {
            return format != Format.c ? "playback_brightness_preference_hdr" : "playback_brightness_preference_sdr";
        }

        public final float d(Format format, Context context) {
            C8632dsu.c((Object) format, "");
            return C8157dfA.d(context, c(format), -1.0f);
        }

        public final int c(Format format, Context context) {
            C8632dsu.c((Object) format, "");
            float d = d(format, context);
            if (d >= 0.0f) {
                return (int) (d * ((float) JSONzip.end));
            }
            return -1;
        }

        public final void b(float f, Format format, Context context) {
            C8632dsu.c((Object) format, "");
            C8632dsu.c((Object) context, "");
            C8157dfA.b(context, c(format), f);
        }
    }
}
