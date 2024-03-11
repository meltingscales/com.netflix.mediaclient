package o;

import com.netflix.hawkins.consumer.component.textlink.HawkinsTextLinkType;
import com.netflix.hawkins.consumer.tokens.Token;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: o.Lj  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1016Lj {

    /* renamed from: o.Lj$e */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class e {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[HawkinsTextLinkType.values().length];
            try {
                iArr[HawkinsTextLinkType.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HawkinsTextLinkType.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final java.lang.String r61, final o.drO<o.dpR> r62, androidx.compose.ui.Modifier r63, com.netflix.hawkins.consumer.tokens.Theme r64, com.netflix.hawkins.consumer.component.textlink.HawkinsTextLinkType r65, boolean r66, androidx.compose.runtime.Composer r67, final int r68, final int r69) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1016Lj.e(java.lang.String, o.drO, androidx.compose.ui.Modifier, com.netflix.hawkins.consumer.tokens.Theme, com.netflix.hawkins.consumer.component.textlink.HawkinsTextLinkType, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Token.Color e(HawkinsTextLinkType hawkinsTextLinkType) {
        C8632dsu.c((Object) hawkinsTextLinkType, "");
        int i = e.b[hawkinsTextLinkType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return Token.Color.C0649iw.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        return Token.Color.C0648iv.d;
    }
}
