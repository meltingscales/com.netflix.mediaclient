package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.netflix.model.leafs.advisory.AdvisoryBoard;
import com.netflix.model.leafs.advisory.ContentAdvisory;
import com.netflix.model.leafs.advisory.RatingDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: o.bxb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5376bxb {
    private final Map<AdvisoryBoard, InterfaceC5378bxd> b = new LinkedHashMap();
    private final C5388bxn a = new C5388bxn();

    /* renamed from: o.bxb$c */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class c {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[AdvisoryBoard.values().length];
            try {
                iArr[AdvisoryBoard.ES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvisoryBoard.KMRB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvisoryBoard.KFCB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdvisoryBoard.NICAM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdvisoryBoard.BRAZIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdvisoryBoard.BBFC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdvisoryBoard.ZA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AdvisoryBoard.PEGI.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AdvisoryBoard.GRAC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AdvisoryBoard.GRAC_18.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AdvisoryBoard.BR_PLAY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AdvisoryBoard.ESRB.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AdvisoryBoard.IARC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AdvisoryBoard.USK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AdvisoryBoard.ACB.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AdvisoryBoard.NZ.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            b = iArr;
        }
    }

    private final InterfaceC5378bxd b(AdvisoryBoard advisoryBoard) {
        if (advisoryBoard == null) {
            return this.a;
        }
        InterfaceC5378bxd interfaceC5378bxd = this.b.get(advisoryBoard);
        if (interfaceC5378bxd != null) {
            return interfaceC5378bxd;
        }
        d(advisoryBoard);
        InterfaceC5378bxd interfaceC5378bxd2 = this.b.get(advisoryBoard);
        return interfaceC5378bxd2 == null ? this.a : interfaceC5378bxd2;
    }

    private final void d(AdvisoryBoard advisoryBoard) {
        InterfaceC5378bxd c5382bxh;
        Map<AdvisoryBoard, InterfaceC5378bxd> map = this.b;
        switch (c.b[advisoryBoard.ordinal()]) {
            case 1:
                c5382bxh = new C5382bxh();
                break;
            case 2:
                c5382bxh = new C5385bxk();
                break;
            case 3:
                c5382bxh = new C5383bxi();
                break;
            case 4:
                c5382bxh = new C5387bxm();
                break;
            case 5:
                c5382bxh = new C5321bwZ();
                break;
            case 6:
                c5382bxh = new C5390bxp();
                break;
            case 7:
                c5382bxh = new C5389bxo();
                break;
            case 8:
                c5382bxh = new C5391bxq();
                break;
            case 9:
                c5382bxh = new C5381bxg();
                break;
            case 10:
                c5382bxh = new C5381bxg();
                break;
            case 11:
                c5382bxh = new C5380bxf();
                break;
            case 12:
                c5382bxh = new C5379bxe();
                break;
            case 13:
                c5382bxh = new C5384bxj();
                break;
            case 14:
                c5382bxh = new C5392bxr();
                break;
            case 15:
                c5382bxh = new C5377bxc();
                break;
            case 16:
                c5382bxh = new C5386bxl();
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        map.put(advisoryBoard, c5382bxh);
    }

    public final Drawable d(RatingDetails ratingDetails, boolean z) {
        C8632dsu.c((Object) ratingDetails, "");
        InterfaceC5378bxd b = b(ratingDetails.getAdvisoryBoard());
        C1332Xp c1332Xp = C1332Xp.b;
        return b.a((Context) C1332Xp.b(Context.class), ratingDetails, z);
    }

    public final View e(Context context, ContentAdvisory contentAdvisory, boolean z) {
        View a;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) contentAdvisory, "");
        InterfaceC5396bxv d = b(contentAdvisory.getBoard()).d(context, contentAdvisory, z);
        if (d == null || (a = d.a()) == null) {
            InterfaceC5396bxv d2 = this.a.d(context, contentAdvisory, z);
            if (d2 != null) {
                return d2.a();
            }
            return null;
        }
        return a;
    }

    public final View b(Context context, CharSequence charSequence, CharSequence charSequence2) {
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) charSequence, "");
        InterfaceC5396bxv c2 = this.a.c(context, charSequence, charSequence2);
        if (c2 != null) {
            return c2.a();
        }
        return null;
    }
}
