package com.netflix.mediaclient.service.configuration;

/* loaded from: classes.dex */
public enum EdgeStack {
    PROD(0),
    STAGING(1),
    INT(2),
    TEST(3);
    
    private final int i;

    public int e() {
        return this.i;
    }

    EdgeStack(int i) {
        this.i = i;
    }

    public boolean a() {
        return this.i == INT.e() || this.i == TEST.e();
    }
}
