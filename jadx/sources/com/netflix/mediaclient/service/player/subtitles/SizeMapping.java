package com.netflix.mediaclient.service.player.subtitles;

import o.C8168dfL;

/* loaded from: classes4.dex */
public enum SizeMapping {
    small(75, "SMALL"),
    medium(100, "MEDIUM"),
    large(200, "LARGE");
    
    private String d;
    private int f;

    public int b() {
        return this.f;
    }

    public String d() {
        return this.d;
    }

    SizeMapping(int i, String str) {
        this.f = i;
        this.d = str;
    }

    public static int c(String str) {
        SizeMapping[] values;
        if (C8168dfL.g(str)) {
            return medium.b();
        }
        for (SizeMapping sizeMapping : values()) {
            if (sizeMapping.d.equalsIgnoreCase(str)) {
                return sizeMapping.f;
            }
        }
        return medium.b();
    }
}
