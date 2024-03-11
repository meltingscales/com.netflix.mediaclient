package o;

import org.json.JSONObject;

/* renamed from: o.aYk  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2061aYk {
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private boolean g;
    private String h;
    private String i;
    private String j;
    private String m;

    /* renamed from: o  reason: collision with root package name */
    private int f13458o;

    public String a() {
        return this.c;
    }

    public boolean b() {
        return this.g;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public int e() {
        return this.e;
    }

    public String f() {
        return this.i;
    }

    public String g() {
        return this.h;
    }

    public int h() {
        return this.f;
    }

    public int i() {
        return this.f13458o;
    }

    public String j() {
        return this.j;
    }

    public String l() {
        return this.m;
    }

    public C2061aYk(JSONObject jSONObject) {
        this.f = -1;
        this.f13458o = -1;
        this.e = -1;
        this.g = false;
        this.m = jSONObject.optString("xid");
        this.c = jSONObject.optString("catalogId");
        this.e = jSONObject.optInt("duration", -1);
        this.f = jSONObject.optInt("time", -1);
        this.f13458o = jSONObject.optInt("volume", -1);
        this.b = jSONObject.optString("currentState");
        this.d = jSONObject.optString("episodeId");
        this.a = C8123deT.a(jSONObject, "autoAdvanceIncrement", "0");
        this.h = jSONObject.optString("postplayState");
        this.g = jSONObject.optBoolean("isInSkipIntroWindow");
        this.j = jSONObject.optString("skipIntroText");
        this.i = jSONObject.optString("skipIntroType", "INTRO");
    }

    public String toString() {
        return "PlayerState{mCurrentState='" + this.b + "', mXid='" + this.m + "', mCatalogId='" + this.c + "', mEpisodeId='" + this.d + "', mAutoAdvanceIncrement='" + this.a + "', mTime=" + this.f + ", mVolume=" + this.f13458o + ", mDuration=" + this.e + ", mPostplayStateBlob='" + this.h + "', mIsInSkipIntroWindow=" + this.g + ", mSkipIntroText='" + this.j + "', mSkipIntroType='" + this.i + "'}";
    }
}
