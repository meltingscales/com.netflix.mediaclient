package o;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.netflix.mediaclient.acquisition.lib.SignupConstants;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.app.Status;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import com.netflix.mediaclient.api.res.AssetType;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.servicemgr.interface_.VideoType;
import com.netflix.model.leafs.VideoInfo;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import o.C1140Qf;
import o.C1596aHd;
import o.C5087bsD;
import o.C8608drx;
import o.C8632dsu;
import o.InterfaceC1597aHe;
import o.InterfaceC1601aHi;
import o.InterfaceC5125bsp;
import o.InterfaceC5198buI;
import o.JZ;
import o.dpD;
import o.dpR;
import o.dqD;
import o.dqE;

/* renamed from: o.Qf  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1140Qf {
    private final String e;
    public static final c d = new c(null);
    private static final Object b = new Object();

    public C1140Qf() {
        String d2 = d.d((Context) C1332Xp.b(Context.class));
        this.e = d2;
        File file = new File(d2);
        if (file.exists()) {
            return;
        }
        file.mkdir();
    }

    /* renamed from: o.Qf$c */
    /* loaded from: classes3.dex */
    public static final class c extends C1045Mp {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
            super("ShareUtils");
        }

        public final Object a() {
            return C1140Qf.b;
        }

        public final String d(Context context) {
            C8632dsu.c((Object) context, "");
            String path = context.getCacheDir().getPath();
            return path + "/shares";
        }
    }

    public static /* synthetic */ File b(C1140Qf c1140Qf, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return c1140Qf.b(str, str2, str3);
    }

    public final File b(String str, String str2, String str3) {
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) str2, "");
        File file = new File(this.e, d(str, str2, str3));
        file.createNewFile();
        return file;
    }

    private final String d(String str, String str2, String str3) {
        int c2;
        String a;
        String g;
        String str4;
        int c3;
        c2 = duD.c((CharSequence) str, '/', 0, false, 6, (Object) null);
        String substring = str.substring(c2 + 1);
        C8632dsu.a(substring, "");
        a = duD.a(substring, "?", (String) null, 2, (Object) null);
        g = duD.g(a, "#", (String) null, 2, (Object) null);
        if (g.length() + str2.length() > 50) {
            String substring2 = g.substring((g.length() - 40) + str2.length());
            C8632dsu.a(substring2, "");
            str4 = str2 + substring2;
        } else {
            str4 = str2 + g;
        }
        if (str3 != null) {
            c3 = duD.c((CharSequence) str4, '.', 0, false, 6, (Object) null);
            if (c3 != -1) {
                str4 = str4.substring(0, c3);
                C8632dsu.a(str4, "");
            }
            return str4 + "." + str3;
        }
        return str4;
    }

    public final Single<File> e(final String str) {
        C8632dsu.c((Object) str, "");
        final long currentTimeMillis = System.currentTimeMillis();
        d.getLogTag();
        Single<byte[]> observeOn = ((InterfaceC4942bpR) C1332Xp.b(InterfaceC4942bpR.class)).b(str, AssetType.verticalBillboard).observeOn(Schedulers.io());
        final drM<byte[], File> drm = new drM<byte[], File>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareUtils$downloadFileToCache$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            /* renamed from: d */
            public final File invoke(byte[] bArr) {
                C8632dsu.c((Object) bArr, "");
                File b2 = C1140Qf.b(C1140Qf.this, str, null, null, 6, null);
                FileOutputStream fileOutputStream = new FileOutputStream(b2);
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.flush();
                    dpR dpr = dpR.c;
                    C8608drx.a(fileOutputStream, null);
                    C1140Qf.d.getLogTag();
                    return b2;
                } finally {
                }
            }
        };
        Single map = observeOn.map(new Function() { // from class: o.Qh
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                File a;
                a = C1140Qf.a(drM.this, obj);
                return a;
            }
        });
        C8632dsu.a(map, "");
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final File a(drM drm, Object obj) {
        C8632dsu.c((Object) drm, "");
        C8632dsu.c(obj, "");
        return (File) drm.invoke(obj);
    }

    public final Uri a(Context context, File file) {
        boolean d2;
        C8632dsu.c((Object) context, "");
        C8632dsu.c((Object) file, "");
        String parent = file.getParent();
        C8632dsu.a(parent, "");
        d2 = duD.d((CharSequence) parent, (CharSequence) this.e, false, 2, (Object) null);
        if (!d2) {
            String str = this.e;
            throw new IllegalStateException("File must be in: " + str + " to share");
        }
        String e = TO.c.a(context).e();
        C1332Xp c1332Xp = C1332Xp.b;
        Uri uriForFile = FileProvider.getUriForFile((Context) C1332Xp.b(Context.class), e, file);
        C8632dsu.a(uriForFile, "");
        return uriForFile;
    }

    public final Single<VideoInfo.Sharing> a(FragmentActivity fragmentActivity, final VideoType videoType, final String str) {
        C8632dsu.c((Object) fragmentActivity, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) str, "");
        final NetflixActivity netflixActivity = (NetflixActivity) fragmentActivity;
        Single<VideoInfo.Sharing> create = Single.create(new SingleOnSubscribe() { // from class: o.Qi
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C1140Qf.a(NetflixActivity.this, videoType, str, singleEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(NetflixActivity netflixActivity, final VideoType videoType, final String str, final SingleEmitter singleEmitter) {
        C8632dsu.c((Object) netflixActivity, "");
        C8632dsu.c((Object) videoType, "");
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) singleEmitter, "");
        C1645aIz.a(netflixActivity, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.android.sharing.impl.ShareUtils$getShareInfo$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                a(serviceManager);
                return dpR.c;
            }

            public final void a(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                InterfaceC5125bsp j = serviceManager.j();
                JZ jz = new JZ(VideoType.this, str);
                String logTag = C1140Qf.d.getLogTag();
                final SingleEmitter<VideoInfo.Sharing> singleEmitter2 = singleEmitter;
                final String str2 = str;
                j.b(jz, new C5087bsD(logTag) { // from class: com.netflix.mediaclient.android.sharing.impl.ShareUtils$getShareInfo$1$1.5
                    @Override // o.C5087bsD, o.InterfaceC5094bsK
                    public void d(InterfaceC5198buI interfaceC5198buI, Status status) {
                        Map b2;
                        Map k;
                        Throwable th;
                        C8632dsu.c((Object) status, "");
                        super.d(interfaceC5198buI, status);
                        if (status.i()) {
                            singleEmitter2.onError(new Exception(status.l(), status.e()));
                        } else if (interfaceC5198buI == null) {
                            singleEmitter2.onError(new Exception("VideoDetails null"));
                        } else if (interfaceC5198buI.X() == null) {
                            singleEmitter2.onError(new Exception("Sharing info null"));
                        } else if (interfaceC5198buI.X().getVerticalBillboardUrl() == null && interfaceC5198buI.X().getBoxArtUrl() == null) {
                            InterfaceC1597aHe.d dVar = InterfaceC1597aHe.b;
                            b2 = dqD.b(dpD.a(SignupConstants.Field.VIDEO_ID, str2));
                            k = dqE.k(b2);
                            C1596aHd c1596aHd = new C1596aHd("Sharing - billboard and boxart urls are null", null, null, true, k, false, false, 96, null);
                            ErrorType errorType = c1596aHd.a;
                            if (errorType != null) {
                                c1596aHd.e.put("errorType", errorType.c());
                                String b3 = c1596aHd.b();
                                if (b3 != null) {
                                    String c2 = errorType.c();
                                    c1596aHd.a(c2 + " " + b3);
                                }
                            }
                            if (c1596aHd.b() != null && c1596aHd.i != null) {
                                th = new Throwable(c1596aHd.b(), c1596aHd.i);
                            } else if (c1596aHd.b() != null) {
                                th = new Throwable(c1596aHd.b());
                            } else {
                                th = c1596aHd.i;
                                if (th == null) {
                                    th = new Throwable("Handled exception with no message");
                                } else if (th == null) {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                            InterfaceC1601aHi.d dVar2 = InterfaceC1601aHi.c;
                            InterfaceC1597aHe c3 = dVar2.c();
                            if (c3 != null) {
                                c3.d(c1596aHd, th);
                            } else {
                                dVar2.e().b(c1596aHd, th);
                            }
                            singleEmitter2.onError(new Exception("No images to share"));
                        } else {
                            singleEmitter2.onSuccess(interfaceC5198buI.X());
                        }
                    }
                });
            }
        });
    }
}
