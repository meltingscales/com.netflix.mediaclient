package o;

import android.content.Context;
import android.util.Base64;
import com.netflix.mediaclient.service.configuration.persistent.fastproperty.ConfigFastPropertyFeatureControlConfig;
import com.netflix.mediaclient.servicemgr.interface_.genre.DefaultGenreItem;
import com.netflix.mediaclient.servicemgr.interface_.genre.GenreItem;
import java.nio.charset.StandardCharsets;

/* renamed from: o.cda  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6452cda extends C1045Mp {
    public static final C6452cda a;
    public static final int b;
    private static DefaultGenreItem c = null;
    private static DefaultGenreItem d = null;
    private static DefaultGenreItem e = null;
    private static byte e$ss2$147 = 0;
    private static int g = 0;
    private static int i = 1;
    private static DefaultGenreItem j;

    static void e() {
        e$ss2$147 = (byte) 24;
    }

    public final DefaultGenreItem a() {
        return c;
    }

    public final DefaultGenreItem b() {
        return j;
    }

    public final DefaultGenreItem c() {
        return d;
    }

    public final DefaultGenreItem d() {
        return e;
    }

    private C6452cda() {
        super("GenregeddonHelper");
    }

    static {
        e();
        a = new C6452cda();
        GenreItem.GenreType genreType = GenreItem.GenreType.LOLOMO;
        d = new DefaultGenreItem("", "lolomo", genreType, "Collection:lolomo", null);
        C8074ddX c8074ddX = C8074ddX.a;
        j = new DefaultGenreItem("", c8074ddX.a(), genreType, c8074ddX.c(), null);
        e = new DefaultGenreItem("", c8074ddX.a(), genreType, c8074ddX.c(), null);
        c = new DefaultGenreItem("", c8074ddX.e(), genreType, c8074ddX.d(), null);
        b = 8;
    }

    public final void e(Context context) {
        String string;
        String string2;
        int i2 = 2 % 2;
        C8632dsu.c((Object) context, "");
        getLogTag();
        ConfigFastPropertyFeatureControlConfig.b bVar = ConfigFastPropertyFeatureControlConfig.Companion;
        if (bVar.t()) {
            int i3 = g + 117;
            i = i3 % 128;
            int i4 = i3 % 2;
            string = context.getString(com.netflix.mediaclient.ui.R.o.hm);
            if (string.startsWith("'!#+")) {
                int i5 = g + 49;
                i = i5 % 128;
                if (i5 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    h(string.substring(4), objArr);
                    string = ((String) objArr[0]).intern();
                    int i6 = 75 / 0;
                } else {
                    Object[] objArr2 = new Object[1];
                    h(string.substring(4), objArr2);
                    string = ((String) objArr2[0]).intern();
                }
            }
        } else {
            string = context.getString(com.netflix.mediaclient.ui.R.o.hl);
            if (!(!string.startsWith("'!#+"))) {
                Object[] objArr3 = new Object[1];
                h(string.substring(4), objArr3);
                string = ((String) objArr3[0]).intern();
            }
        }
        C8632dsu.d((Object) string);
        C8074ddX c8074ddX = C8074ddX.a;
        String b2 = c8074ddX.b();
        GenreItem.GenreType genreType = GenreItem.GenreType.LOLOMO;
        String str = string;
        j = new DefaultGenreItem(str, b2, genreType, c8074ddX.j(), null);
        e = new DefaultGenreItem(str, c8074ddX.a(), genreType, c8074ddX.c(), null);
        if (bVar.t()) {
            string2 = context.getString(com.netflix.mediaclient.ui.R.o.dP);
            if (string2.startsWith("'!#+")) {
                Object[] objArr4 = new Object[1];
                h(string2.substring(4), objArr4);
                string2 = ((String) objArr4[0]).intern();
            }
        } else {
            string2 = context.getString(com.netflix.mediaclient.ui.R.o.hj);
            if (string2.startsWith("'!#+")) {
                int i7 = i + 9;
                g = i7 % 128;
                int i8 = i7 % 2;
                Object[] objArr5 = new Object[1];
                h(string2.substring(4), objArr5);
                string2 = ((String) objArr5[0]).intern();
            }
            int i9 = g + 13;
            i = i9 % 128;
            int i10 = i9 % 2;
        }
        C8632dsu.d((Object) string2);
        String str2 = string2;
        c = new DefaultGenreItem(str2, c8074ddX.e(), genreType, c8074ddX.d(), null);
        d = new DefaultGenreItem(str2, "lolomo", genreType, "Collection:lolomo", null);
    }

    public final DefaultGenreItem j(String str) {
        C8632dsu.c((Object) str, "");
        return f(str) ? j : e;
    }

    public static final boolean e(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) "lolomo");
    }

    public static final boolean f(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) C8074ddX.a.b());
    }

    public static final boolean c(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) C8074ddX.a.a());
    }

    public static final boolean d(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) "queue");
    }

    public static final boolean b(String str) {
        C8632dsu.c((Object) str, "");
        return C8632dsu.c((Object) str, (Object) C8074ddX.a.e());
    }

    private void h(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i2 = 0; i2 < decode.length; i2++) {
            bArr[i2] = (byte) (decode[(decode.length - i2) - 1] ^ e$ss2$147);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
