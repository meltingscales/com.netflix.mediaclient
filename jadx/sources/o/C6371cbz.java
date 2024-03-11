package o;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import com.netflix.android.imageloader.api.ShowImageRequest;
import com.netflix.mediaclient.android.widget.NetflixImageView;
import java.nio.charset.StandardCharsets;
import o.C6361cbp;

/* renamed from: o.cbz  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6371cbz extends LinearLayout {
    private static int a = 0;
    private static int c = 1;
    private static byte e$ss2$83 = 24;
    private final C6368cbw b;
    private final NetflixImageView d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6371cbz(Context context) {
        this(context, null, 0, 0, 14, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6371cbz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        C8632dsu.c((Object) context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6371cbz(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        C8632dsu.c((Object) context, "");
    }

    public /* synthetic */ C6371cbz(Context context, AttributeSet attributeSet, int i, int i2, int i3, C8627dsp c8627dsp) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6371cbz(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C8632dsu.c((Object) context, "");
        C6368cbw d = C6368cbw.d(LayoutInflater.from(context), this);
        C8632dsu.a(d, "");
        this.b = d;
        NetflixImageView netflixImageView = d.d;
        C8632dsu.a(netflixImageView, "");
        this.d = netflixImageView;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        String string = context.getString(C6361cbp.b.d);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            e(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            int i3 = c + 1;
            a = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 2 % 2;
        }
        setContentDescription(string);
        int i6 = a + 51;
        c = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void b(String str) {
        C8632dsu.c((Object) str, "");
        this.d.showImage(new ShowImageRequest().a(C6325cbF.a.b(str)).a(true));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        String name = Button.class.getName();
        C8632dsu.a(name, "");
        return name;
    }

    private static void e(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$83);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
