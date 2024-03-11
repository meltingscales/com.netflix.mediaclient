package o;

import com.netflix.mediaclient.service.player.subtitles.text.CharacterEdgeTypeMapping;

/* renamed from: o.bpC  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4927bpC {
    private static String d = "000000";
    private CharacterEdgeTypeMapping b;
    private String e;

    public void a(String str) {
        this.e = str;
    }

    public CharacterEdgeTypeMapping b() {
        return this.b;
    }

    public String e() {
        return this.e;
    }

    public void e(CharacterEdgeTypeMapping characterEdgeTypeMapping) {
        this.b = characterEdgeTypeMapping;
    }

    public C4927bpC(CharacterEdgeTypeMapping characterEdgeTypeMapping, String str) {
        this.b = characterEdgeTypeMapping;
        this.e = str;
    }

    public String toString() {
        return "Outline [mEdgeType=" + this.b + ", mEdgeColor=" + this.e + "]";
    }

    public static C4927bpC a() {
        return new C4927bpC(CharacterEdgeTypeMapping.UNIFORM, d);
    }
}
