package o;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import androidx.appcompat.app.AlertDialog;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.mdx.MdxErrorSubCode;
import java.nio.charset.StandardCharsets;
import o.C9834xU;

/* loaded from: classes4.dex */
public class bDB {
    private static int a = 0;
    private static byte e$ss2$115 = 24;
    private static int h = 1;
    private DialogInterface.OnClickListener b = new DialogInterface.OnClickListener() { // from class: o.bDB.5
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://help.netflix.com/en/node/12407"));
            if (bDB.this.d != null && data.resolveActivity(bDB.this.d.getPackageManager()) != null) {
                bDB.this.d.startActivity(data);
            } else {
                C1044Mm.d(bDB.this.e, "Unable to launchHelp");
            }
        }
    };
    private DialogInterface.OnClickListener c = new DialogInterface.OnClickListener() { // from class: o.bDB.1
        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("https://help.netflix.com/en/node/13590"));
            if (bDB.this.d != null && data.resolveActivity(bDB.this.d.getPackageManager()) != null) {
                bDB.this.d.startActivity(data);
            } else {
                C1044Mm.d(bDB.this.e, "Unable to launchHelp");
            }
        }
    };
    private final NetflixActivity d;
    private final String e;

    private void a(int i, String str) {
    }

    public bDB(String str, NetflixActivity netflixActivity) {
        this.e = str;
        this.d = netflixActivity;
    }

    public void b(int i, String str, String str2) {
        if (C8054ddD.l(this.d)) {
            return;
        }
        if (MdxErrorSubCode.a(i)) {
            C1044Mm.e(this.e, "Displaying error dialog");
            d(i, str, str2);
        } else if (c(i)) {
            C1044Mm.e(this.e, "Showing toast msg");
            a(i, str);
        } else {
            C1044Mm.e(this.e, "Not MDX related activity, do not show toast");
        }
    }

    private void d(int i, String str, String str2) {
        String d = d(i, str);
        if (C8168dfL.h(str2)) {
            d = String.format("%s\n\n%s", d, str2);
        }
        this.d.displayDialog(b(i, d));
        e(i, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.bDB$4  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[MdxErrorSubCode.values().length];
            e = iArr;
            try {
                iArr[MdxErrorSubCode.LaunchFailed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[MdxErrorSubCode.PairFailed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[MdxErrorSubCode.RegPairFailed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[MdxErrorSubCode.SessionTimeout.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[MdxErrorSubCode.SessionFailed.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[MdxErrorSubCode.SessionStartFailed.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[MdxErrorSubCode.SessionHandshakeFailed.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[MdxErrorSubCode.LaunchTimeout.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                e[MdxErrorSubCode.PingFail.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                e[MdxErrorSubCode.PingTimeout.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                e[MdxErrorSubCode.PairTimeout.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                e[MdxErrorSubCode.RemoteLoginOnlyFailed.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                e[MdxErrorSubCode.RemoteLoginAndPairFailed.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                e[MdxErrorSubCode.DeviceIsLost.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                e[MdxErrorSubCode.SessionAbruptlyEnded.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                e[MdxErrorSubCode.ShowToast.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    private void e(int i, String str) {
        switch (AnonymousClass4.e[MdxErrorSubCode.c(i).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                try {
                    this.d.getServiceManager().q().a(str);
                    return;
                } catch (Exception e) {
                    String str2 = this.e;
                    C1044Mm.d(str2, "Unable to log error" + e);
                    return;
                }
            default:
                return;
        }
    }

    private AlertDialog.Builder b(int i, String str) {
        int i2 = AnonymousClass4.e[MdxErrorSubCode.c(i).ordinal()];
        return new AlertDialog.Builder(this.d, C9834xU.o.c).setMessage(str).setPositiveButton(com.netflix.mediaclient.ui.R.o.f13253fi, (DialogInterface.OnClickListener) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0169 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String d(int r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.bDB.d(int, java.lang.String):java.lang.String");
    }

    private boolean c(int i) {
        return (this.d instanceof MO) && i != MdxErrorSubCode.RemoteLoginOnlyFailed.d();
    }

    private void f(String str, Object[] objArr) {
        byte[] decode = Base64.decode(str, 0);
        byte[] bArr = new byte[decode.length];
        for (int i = 0; i < decode.length; i++) {
            bArr[i] = (byte) (decode[(decode.length - i) - 1] ^ e$ss2$115);
        }
        objArr[0] = new String(bArr, StandardCharsets.UTF_8);
    }
}
