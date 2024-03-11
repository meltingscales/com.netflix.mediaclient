package com.yuyakaido.android.cardstackview;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public enum Direction {
    Left,
    Right,
    Top,
    Bottom;
    
    public static final List<Direction> a;
    public static final List<Direction> b;
    public static final List<Direction> h;

    static {
        Direction direction = Left;
        Direction direction2 = Right;
        Direction direction3 = Top;
        Direction direction4 = Bottom;
        b = Arrays.asList(direction, direction2);
        h = Arrays.asList(direction3, direction4);
        a = Arrays.asList(values());
    }
}
