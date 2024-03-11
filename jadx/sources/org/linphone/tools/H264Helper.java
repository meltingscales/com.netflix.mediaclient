package org.linphone.tools;

import org.linphone.core.LinphoneCore;
import org.linphone.mediastream.Log;

/* loaded from: classes6.dex */
public class H264Helper {
    private static String FILTER_NAME_MEDIA_CODEC_DEC = "MSMediaCodecH264Dec";
    private static String FILTER_NAME_MEDIA_CODEC_ENC = "MSMediaCodecH264Enc";
    private static String FILTER_NAME_OPENH264_DEC = "MSOpenH264Dec";
    private static String FILTER_NAME_OPENH264_ENC = "MSOpenH264Enc";
    public static String MODE_AUTO = "Auto";
    public static String MODE_MEDIA_CODEC = "MediaCodec";
    public static String MODE_OPENH264 = "OpenH264";

    public static void setH264Mode(String str, LinphoneCore linphoneCore) {
        if (str.equals(MODE_OPENH264)) {
            Log.i("H264Helper", " setH264Mode  MODE_OPENH264 - Mode = " + str);
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_MEDIA_CODEC_DEC, false);
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_MEDIA_CODEC_ENC, false);
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_OPENH264_DEC, true);
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_OPENH264_ENC, true);
        } else if (str.equals(MODE_MEDIA_CODEC)) {
            Log.i("H264Helper", " setH264Mode  MODE_MEDIA_CODEC - Mode = " + str);
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_OPENH264_DEC, false);
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_OPENH264_ENC, false);
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_MEDIA_CODEC_DEC, true);
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_MEDIA_CODEC_ENC, true);
        } else if (str.equals(MODE_AUTO)) {
            Log.i("H264Helper", " setH264Mode  MODE_AUTO - Mode = " + str);
            Log.i("H264Helper", " setH264Mode  MODE_AUTO 1 - Mode = " + str);
            Log.i("H264Helper", " Openh264 disabled on the project, now using MediaCodec");
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_OPENH264_DEC, false);
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_OPENH264_ENC, false);
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_MEDIA_CODEC_DEC, true);
            linphoneCore.getMSFactory().enableFilterFromName(FILTER_NAME_MEDIA_CODEC_ENC, true);
        } else {
            Log.i("H264Helper", " Error: Openh264 mode not reconized !");
        }
        Log.i("H264Helper", " setH264Mode - Mode = " + str);
    }
}
