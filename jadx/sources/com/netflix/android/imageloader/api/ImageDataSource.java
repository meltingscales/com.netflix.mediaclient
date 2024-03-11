package com.netflix.android.imageloader.api;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ImageDataSource {
    private static final /* synthetic */ ImageDataSource[] c;
    private static final /* synthetic */ InterfaceC8598drn d;
    public static final ImageDataSource e = new ImageDataSource("NETWORK", 0);
    public static final ImageDataSource a = new ImageDataSource("DISK_CACHE", 1);
    public static final ImageDataSource b = new ImageDataSource("MEMORY_CACHE", 2);

    private static final /* synthetic */ ImageDataSource[] d() {
        return new ImageDataSource[]{e, a, b};
    }

    public static ImageDataSource valueOf(String str) {
        return (ImageDataSource) Enum.valueOf(ImageDataSource.class, str);
    }

    public static ImageDataSource[] values() {
        return (ImageDataSource[]) c.clone();
    }

    private ImageDataSource(String str, int i) {
    }

    static {
        ImageDataSource[] d2 = d();
        c = d2;
        d = C8600drp.e(d2);
    }
}
