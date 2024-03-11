package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Environment;
import com.bugsnag.android.RootDetector;
import java.io.File;
import o.C9151kF;
import o.C9159kN;
import o.C9160kO;
import o.C9184km;
import o.C9258mG;
import o.C9301mx;
import o.InterfaceC9147kB;
import o.InterfaceC9200lB;

/* renamed from: o.kF  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9151kF extends AbstractC9267mP {
    private final Context a;
    private final InterfaceC8554dpx b;
    private final C9159kN c;
    private final C9258mG d;
    private final File e;
    private final InterfaceC9200lB g;
    private final InterfaceC8554dpx h;
    private final InterfaceC8554dpx i;

    public C9151kF(C9268mQ c9268mQ, C9266mO c9266mO, final C9270mS c9270mS, final C9291mn c9291mn, final C9301mx c9301mx, final InterfaceC9147kB interfaceC9147kB, final String str, final String str2, final C9205lG c9205lG) {
        this.a = c9268mQ.a();
        C9258mG a = c9266mO.a();
        this.d = a;
        this.g = a.m();
        this.c = C9159kN.a.d();
        this.e = Environment.getDataDirectory();
        this.b = e(new drO<C9184km>() { // from class: com.bugsnag.android.DataCollectionModule$appDataCollector$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: e */
            public final C9184km invoke() {
                Context context;
                Context context2;
                C9258mG c9258mG;
                context = C9151kF.this.a;
                context2 = C9151kF.this.a;
                PackageManager packageManager = context2.getPackageManager();
                c9258mG = C9151kF.this.d;
                return new C9184km(context, packageManager, c9258mG, c9291mn.c(), c9270mS.c(), c9291mn.a(), c9205lG);
            }
        });
        this.i = e(new drO<RootDetector>() { // from class: com.bugsnag.android.DataCollectionModule$rootDetector$2
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final RootDetector invoke() {
                InterfaceC9200lB interfaceC9200lB;
                C9159kN c9159kN;
                interfaceC9200lB = C9151kF.this.g;
                c9159kN = C9151kF.this.c;
                return new RootDetector(c9159kN, null, null, interfaceC9200lB, 6, null);
            }
        });
        this.h = e(new drO<C9160kO>() { // from class: com.bugsnag.android.DataCollectionModule$deviceDataCollector$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // o.drO
            /* renamed from: c */
            public final C9160kO invoke() {
                Context context;
                Context context2;
                C9159kN c9159kN;
                File file;
                RootDetector d;
                InterfaceC9200lB interfaceC9200lB;
                InterfaceC9147kB interfaceC9147kB2 = InterfaceC9147kB.this;
                context = this.a;
                context2 = this.a;
                Resources resources = context2.getResources();
                String str3 = str;
                String str4 = str2;
                c9159kN = this.c;
                file = this.e;
                d = this.d();
                C9301mx c9301mx2 = c9301mx;
                interfaceC9200lB = this.g;
                return new C9160kO(interfaceC9147kB2, context, resources, str3, str4, c9159kN, file, d, c9301mx2, interfaceC9200lB);
            }
        });
    }

    public final C9184km c() {
        return (C9184km) this.b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RootDetector d() {
        return (RootDetector) this.i.getValue();
    }

    public final C9160kO a() {
        return (C9160kO) this.h.getValue();
    }
}
