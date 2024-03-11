package o;

import java.util.HashMap;

/* renamed from: o.blF  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4758blF {
    public int a;
    public float b;
    public HashMap<String, String> c;
    public float d;
    public int e;
    public int f;
    public int g;
    public int h;
    public double i;
    public String j;
    public int m;

    public C4758blF(HashMap<String, String> hashMap, float f, float f2, int i, int i2, int i3, double d, int i4, String str, int i5, int i6) {
        this.c = hashMap;
        this.b = f;
        this.d = f2;
        this.h = i;
        this.g = i2;
        this.m = i3;
        this.i = d;
        this.e = i4;
        this.a = i5;
        this.j = str;
        this.f = i6;
    }

    public String toString() {
        return "ThroughputHistoryFeatures{histmatch=" + this.c + ", histniqr=" + this.b + ", histbw=" + this.d + ", p25=" + this.h + ", p50=" + this.g + ", p75=" + this.m + ", niqr=" + this.i + ", age=" + this.e + ", agemax=" + this.a + ", locationId='" + this.j + "'}";
    }
}
