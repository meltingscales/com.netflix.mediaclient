package com.netflix.mediaclient.service.player.subtitles.text;

/* loaded from: classes4.dex */
public enum CharacterEdgeTypeMapping {
    NONE("NONE"),
    RAISED("RAISED"),
    DEPRESSED("DEPRESSED"),
    UNIFORM("UNIFORM"),
    DROP_SHADOW("DROP_SHADOW");
    
    private String i;

    @Override // java.lang.Enum
    public String toString() {
        return this.i;
    }

    CharacterEdgeTypeMapping(String str) {
        this.i = str;
    }
}
