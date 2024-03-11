package o;

import com.netflix.mediaclient.service.player.subtitles.SizeMapping;
import com.netflix.mediaclient.service.player.subtitles.text.CharacterEdgeTypeMapping;
import com.netflix.mediaclient.service.player.subtitles.text.ColorMapping;
import com.netflix.mediaclient.service.player.subtitles.text.FontFamilyMapping;
import com.netflix.mediaclient.service.player.subtitles.text.OpacityMapping;

/* renamed from: o.bpy  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4975bpy {
    private Integer a;
    private String b;
    private FontFamilyMapping c;
    private Float d;
    private String e;
    private C4927bpC f;
    private Float h;
    private Float i;
    private String j;

    public String a() {
        return this.b;
    }

    public Integer b() {
        return this.a;
    }

    public FontFamilyMapping c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public Float e() {
        return this.d;
    }

    public Float f() {
        return this.i;
    }

    public String g() {
        return this.j;
    }

    public C4927bpC i() {
        return this.f;
    }

    public Float j() {
        return this.h;
    }

    public void b(C4975bpy c4975bpy) {
        Float f;
        Float f2;
        Float f3;
        FontFamilyMapping fontFamilyMapping;
        C4927bpC c4927bpC;
        Integer num;
        String str;
        String str2;
        String str3;
        if (c4975bpy == null) {
            return;
        }
        if (this.b == null && (str3 = c4975bpy.b) != null) {
            this.b = str3;
        }
        if (this.j == null && (str2 = c4975bpy.j) != null) {
            this.j = str2;
        }
        if (this.e == null && (str = c4975bpy.e) != null) {
            this.e = str;
        }
        if (this.a == null && (num = c4975bpy.a) != null) {
            this.a = num;
        }
        if (this.f == null && (c4927bpC = c4975bpy.f) != null) {
            this.f = c4927bpC;
        }
        if (this.c == null && (fontFamilyMapping = c4975bpy.c) != null) {
            this.c = fontFamilyMapping;
        }
        if (this.h == null && (f3 = c4975bpy.h) != null) {
            this.h = f3;
        }
        if (this.i == null && (f2 = c4975bpy.i) != null) {
            this.i = f2;
        }
        if (this.d != null || (f = c4975bpy.d) == null) {
            return;
        }
        this.d = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TextStyle [");
        if (this.b != null) {
            sb.append(", Color=");
            sb.append(this.b);
        }
        if (this.j != null) {
            sb.append(", WindowColor=");
            sb.append(this.j);
        }
        if (this.e != null) {
            sb.append(", BackgroundColor=");
            sb.append(this.e);
        }
        if (this.a != null) {
            sb.append(", FontSize=");
            sb.append(this.a);
        }
        if (this.c != null) {
            sb.append(", FontFamily=");
            sb.append(this.c);
        }
        if (this.f != null) {
            sb.append(", Outline=");
            sb.append(this.f);
        }
        if (this.h != null) {
            sb.append(", Opacity=");
            sb.append(this.h);
        }
        if (this.i != null) {
            sb.append(", WindowOpacity=");
            sb.append(this.i);
        }
        if (this.d != null) {
            sb.append(", BackgroundOpacity=");
            sb.append(this.d);
        }
        sb.append("]");
        return sb.toString();
    }

    public static C4975bpy b(InterfaceC5284bvp interfaceC5284bvp) {
        ColorMapping a;
        ColorMapping a2;
        ColorMapping a3;
        ColorMapping a4;
        if (interfaceC5284bvp == null) {
            return null;
        }
        if (interfaceC5284bvp.getCharEdgeAttrs() == null && interfaceC5284bvp.getCharEdgeColor() == null && interfaceC5284bvp.getCharColor() == null && interfaceC5284bvp.getWindowColor() == null && interfaceC5284bvp.getBackgroundColor() == null && interfaceC5284bvp.getCharStyle() == null && interfaceC5284bvp.getCharSize() == null && interfaceC5284bvp.getCharOpacity() == null && interfaceC5284bvp.getWindowOpacity() == null && interfaceC5284bvp.getBackgroundOpacity() == null) {
            return null;
        }
        C4975bpy c4975bpy = new C4975bpy();
        if (interfaceC5284bvp.getCharEdgeAttrs() != null || interfaceC5284bvp.getCharEdgeColor() != null) {
            C4927bpC a5 = C4927bpC.a();
            if (interfaceC5284bvp.getCharEdgeAttrs() != null) {
                a5.e(CharacterEdgeTypeMapping.valueOf(interfaceC5284bvp.getCharEdgeAttrs()));
            }
            if (interfaceC5284bvp.getCharEdgeColor() != null && (a = ColorMapping.a(interfaceC5284bvp.getCharEdgeColor())) != null) {
                a5.a(a.e());
            }
            c4975bpy.f = a5;
        }
        if (interfaceC5284bvp.getCharColor() != null && (a4 = ColorMapping.a(interfaceC5284bvp.getCharColor())) != null) {
            c4975bpy.b = a4.e();
        }
        if (interfaceC5284bvp.getWindowColor() != null && (a3 = ColorMapping.a(interfaceC5284bvp.getWindowColor())) != null) {
            c4975bpy.j = a3.e();
        }
        if (interfaceC5284bvp.getBackgroundColor() != null && (a2 = ColorMapping.a(interfaceC5284bvp.getBackgroundColor())) != null) {
            c4975bpy.e = a2.e();
        }
        if (interfaceC5284bvp.getCharStyle() != null) {
            c4975bpy.c = FontFamilyMapping.c(interfaceC5284bvp.getCharStyle());
        }
        if (interfaceC5284bvp.getCharSize() != null) {
            c4975bpy.a = Integer.valueOf(SizeMapping.c(interfaceC5284bvp.getCharSize()));
        }
        if (interfaceC5284bvp.getCharOpacity() != null) {
            c4975bpy.h = OpacityMapping.b(interfaceC5284bvp.getCharOpacity());
        }
        if (interfaceC5284bvp.getWindowOpacity() != null) {
            c4975bpy.i = OpacityMapping.b(interfaceC5284bvp.getWindowOpacity());
        }
        if (interfaceC5284bvp.getBackgroundOpacity() != null) {
            c4975bpy.d = OpacityMapping.b(interfaceC5284bvp.getBackgroundOpacity());
        }
        return c4975bpy;
    }
}
