package com.netflix.mediaclient.servicemgr;

/* loaded from: classes4.dex */
public final class LogArguments {

    /* loaded from: classes4.dex */
    public enum LogLevel {
        CONSOLE(-1),
        TRACE(10),
        DEBUG(20),
        INFO(30),
        WARN(40),
        ERROR(50),
        FATAL(60);
        
        private int i;

        public int d() {
            return this.i;
        }

        LogLevel(int i) {
            this.i = i;
        }
    }
}
