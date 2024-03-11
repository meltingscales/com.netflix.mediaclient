package com.netflix.cl.model;

@Deprecated
/* loaded from: classes2.dex */
public enum ThumbRating {
    UNRATED(0),
    DOWN(1),
    UP(2),
    DOUBLE_UP(3);
    
    private int val;

    public int getVal() {
        return this.val;
    }

    ThumbRating(int i) {
        this.val = i;
    }
}
