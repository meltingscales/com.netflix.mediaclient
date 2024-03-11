package o;

import android.content.Context;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import com.netflix.model.leafs.PostPlayItem;
import io.reactivex.subjects.Subject;
import java.nio.charset.StandardCharsets;
import o.cIE;

/* loaded from: classes4.dex */
public final class cHE extends cHC {
    private static int b = 0;
    private static int c = 1;
    private static byte e$ss2$41 = 24;

    @Override // o.cHC
    public void h() {
    }

    @Override // o.cHC
    public void j() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cHE(ViewGroup viewGroup, PostPlayItem postPlayItem, Subject<cBO> subject) {
        super(viewGroup, postPlayItem, subject);
        C8632dsu.c((Object) viewGroup, "");
        C8632dsu.c((Object) postPlayItem, "");
        C8632dsu.c((Object) subject, "");
        C1202Sp m = m();
        int i = cIE.a.f13664o;
        Context context = m.getContext();
        String string = context.getString(i);
        if (string.startsWith("'!#+")) {
            Object[] objArr = new Object[1];
            p(string.substring(4), objArr);
            string = ((String) objArr[0]).intern();
            CharSequence text = context.getText(i);
            if (text instanceof Spanned) {
                SpannableString spannableString = new SpannableString(string);
                TextUtils.copySpansFrom((SpannedString) text, 0, string.length(), Object.class, spannableString, 0);
                int i2 = c + 41;
                b = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 2;
                }
                string = spannableString;
            } else {
                int i4 = b + 43;
                c = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
            }
        }
        m.setText(string);
    }

    private static void p(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$41);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
