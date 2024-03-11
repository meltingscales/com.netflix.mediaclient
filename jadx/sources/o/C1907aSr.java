package o;

/* renamed from: o.aSr  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1907aSr {
    public Runnable a;
    public final String g;
    public final String h;
    public final String i;
    public final Runnable j;

    public C1907aSr(String str, String str2, String str3, Runnable runnable) {
        this.g = str;
        this.i = str2;
        this.h = str3;
        this.j = runnable;
    }

    public C1907aSr(String str, String str2, String str3, Runnable runnable, Runnable runnable2) {
        this(str, str2, str3, runnable);
        this.a = runnable2;
    }
}
