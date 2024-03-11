package org.slf4j.event;

import com.netflix.mediaclient.service.pushnotification.Payload;

/* loaded from: classes5.dex */
public enum Level {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, Payload.DEFAULT_INFO_ACTION),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");
    
    private final int levelInt;
    private final String levelStr;

    public int toInt() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.levelStr;
    }

    Level(int i, String str) {
        this.levelInt = i;
        this.levelStr = str;
    }
}
