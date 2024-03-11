package com.netflix.mediaclient.ui.experience;

import com.netflix.mediaclient.util.gfx.ImageLoader;
import o.C5398bxx;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum d uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class StaticImgConfig implements ImageLoader.c {
    public static final StaticImgConfig b;
    public static final StaticImgConfig c;
    public static final StaticImgConfig d;
    private static final /* synthetic */ StaticImgConfig[] i;
    private final int h;
    private final int j;
    public static final StaticImgConfig a = new StaticImgConfig("DARK_NO_PLACEHOLDER", 0, 0, C5398bxx.e.a);
    public static final StaticImgConfig e = new StaticImgConfig("LIGHT_NO_PLACEHOLDER", 1, 0, C5398bxx.e.c);

    private static /* synthetic */ StaticImgConfig[] a() {
        return new StaticImgConfig[]{a, e, d, c, b};
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.c
    public int b() {
        return this.j;
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.c
    public int d() {
        return this.h;
    }

    @Override // com.netflix.mediaclient.util.gfx.ImageLoader.c
    public boolean e() {
        return this.h != 0;
    }

    public static StaticImgConfig valueOf(String str) {
        return (StaticImgConfig) Enum.valueOf(StaticImgConfig.class, str);
    }

    public static StaticImgConfig[] values() {
        return (StaticImgConfig[]) i.clone();
    }

    static {
        int i2 = C5398bxx.e.a;
        d = new StaticImgConfig("DARK", 2, i2, i2);
        int i3 = C5398bxx.e.c;
        c = new StaticImgConfig("LIGHT", 3, i3, i3);
        b = new StaticImgConfig("NO_PLACEHOLDER_NO_ERROR", 4, 0, 0);
        i = a();
    }

    private StaticImgConfig(String str, int i2, int i3, int i4) {
        this.h = i3;
        this.j = i4;
    }
}
