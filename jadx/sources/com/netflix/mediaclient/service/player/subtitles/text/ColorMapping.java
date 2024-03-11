package com.netflix.mediaclient.service.player.subtitles.text;

import android.graphics.Color;
import o.C1044Mm;
import o.C8168dfL;

/* loaded from: classes4.dex */
public enum ColorMapping {
    black(0.0d, "black", "000000"),
    silver(1.2632256E7d, "silver", "c0c0c0"),
    gray(8421504.0d, "gray", "808080"),
    white(1.6777215E7d, "white", "ffffff"),
    maroon(8388608.0d, "maroon", "800000"),
    red(1.671168E7d, "red", "ff0000"),
    purple(8388736.0d, "purple", "800080"),
    fuchsia(1.6711935E7d, "fuchsia", "ff00ff"),
    magenta(1.6711935E7d, "magenta", "ff00ff"),
    green(65280.0d, "green", "00ff00"),
    lime(65280.0d, "lime", "00ff00"),
    olive(8421376.0d, "olive", "808000"),
    yellow(1.677696E7d, "yellow", "ffff00"),
    navy(128.0d, "navy", "000080"),
    blue(255.0d, "blue", "0000ff"),
    teal(32896.0d, "teal", "008080"),
    aqua(65535.0d, "aqua", "00ffff"),
    cyan(65535.0d, "cyan", "00ffff"),
    orange(1.675392E7d, "orange", "ffa500"),
    pink(1.6761035E7d, "pink", "ffc0cb"),
    transparent(-1.0d, "transparent", "");
    
    private double v;
    private String w;
    private String y;

    public String e() {
        return this.y;
    }

    ColorMapping(double d, String str, String str2) {
        this.v = d;
        this.w = str;
        this.y = str2;
    }

    public static ColorMapping a(String str) {
        ColorMapping[] values;
        if (C8168dfL.g(str)) {
            return null;
        }
        for (ColorMapping colorMapping : values()) {
            if (colorMapping.w.equalsIgnoreCase(str)) {
                return colorMapping;
            }
        }
        return null;
    }

    public static Integer d(Float f, String str) {
        if (str == null) {
            return null;
        }
        String str2 = "#" + OpacityMapping.d(f) + str;
        try {
            return Integer.valueOf(Color.parseColor(str2));
        } catch (Throwable unused) {
            C1044Mm.d("nf_subtitles", "Resolve color failed for " + str2);
            return null;
        }
    }
}
