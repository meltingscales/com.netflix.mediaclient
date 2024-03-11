package com.netflix.mediaclient.ui.details;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class SupportedCapabilities {
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ SupportedCapabilities[] h;
    public static final SupportedCapabilities d = new SupportedCapabilities("HD", 0);
    public static final SupportedCapabilities g = new SupportedCapabilities("UHD", 1);
    public static final SupportedCapabilities i = new SupportedCapabilities("_5dot1", 2);
    public static final SupportedCapabilities e = new SupportedCapabilities("HDR10", 3);
    public static final SupportedCapabilities a = new SupportedCapabilities("DOLBY_VISION", 4);
    public static final SupportedCapabilities c = new SupportedCapabilities("SPATIAL_AUDIO", 5);
    public static final SupportedCapabilities b = new SupportedCapabilities("AUDIO_DESCRIPTION", 6);
    public static final SupportedCapabilities j = new SupportedCapabilities("SUBTITLES", 7);

    private static final /* synthetic */ SupportedCapabilities[] b() {
        return new SupportedCapabilities[]{d, g, i, e, a, c, b, j};
    }

    public static SupportedCapabilities valueOf(String str) {
        return (SupportedCapabilities) Enum.valueOf(SupportedCapabilities.class, str);
    }

    public static SupportedCapabilities[] values() {
        return (SupportedCapabilities[]) h.clone();
    }

    private SupportedCapabilities(String str, int i2) {
    }

    static {
        SupportedCapabilities[] b2 = b();
        h = b2;
        f = C8600drp.e(b2);
    }
}
