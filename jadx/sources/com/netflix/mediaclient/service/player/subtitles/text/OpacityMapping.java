package com.netflix.mediaclient.service.player.subtitles.text;

import o.C1044Mm;
import o.C8168dfL;

/* loaded from: classes4.dex */
public enum OpacityMapping {
    none(Float.valueOf(0.0f), "NONE"),
    semiTransparent(Float.valueOf(0.5f), "SEMI_TRANSPARENT"),
    opaque(Float.valueOf(1.0f), "OPAQUE");
    
    private String c;
    private Float f;

    public Float c() {
        return this.f;
    }

    OpacityMapping(Float f, String str) {
        this.f = f;
        this.c = str;
    }

    public static Float b(String str) {
        OpacityMapping[] values;
        if (C8168dfL.g(str)) {
            return null;
        }
        for (OpacityMapping opacityMapping : values()) {
            if (opacityMapping.c.equalsIgnoreCase(str)) {
                return opacityMapping.c();
            }
        }
        try {
            Float valueOf = Float.valueOf(str);
            float floatValue = valueOf.floatValue();
            OpacityMapping opacityMapping2 = opaque;
            if (floatValue >= opacityMapping2.c().floatValue()) {
                return opacityMapping2.c();
            }
            float floatValue2 = valueOf.floatValue();
            OpacityMapping opacityMapping3 = none;
            return floatValue2 < opacityMapping3.c().floatValue() ? opacityMapping3.c() : valueOf;
        } catch (Throwable th) {
            C1044Mm.e("nf_subtitles", "Failed to parse opacityt value " + str, th);
            return null;
        }
    }

    public static String d(Float f) {
        return f == null ? "FF" : f.floatValue() <= 0.0f ? "00" : f.floatValue() >= 1.0f ? "FF" : Integer.toHexString((int) (f.floatValue() * 255.0f));
    }
}
