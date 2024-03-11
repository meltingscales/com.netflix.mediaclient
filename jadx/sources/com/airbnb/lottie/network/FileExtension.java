package com.airbnb.lottie.network;

/* loaded from: classes5.dex */
public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");
    
    public final String c;

    @Override // java.lang.Enum
    public String toString() {
        return this.c;
    }

    FileExtension(String str) {
        this.c = str;
    }

    public String c() {
        return ".temp" + this.c;
    }
}
