package o;

import com.netflix.mediaclient.api.mdx.MdxNotificationIntentRetriever;
import com.netflix.mediaclient.service.mdx.logging.MdxTargetType;
import com.netflix.mediaclient.service.mdx.logging.intents.MdxIntentLogblob;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class aWV {
    private MdxIntentLogblob b;
    private InterfaceC5090bsG d;
    private aOV e;
    private int a = 0;
    private boolean c = false;

    public aWV(InterfaceC5090bsG interfaceC5090bsG, aOV aov) {
        this.d = interfaceC5090bsG;
        this.e = aov;
    }

    public void d(MdxNotificationIntentRetriever.SegmentType segmentType, MdxNotificationIntentRetriever.InvocSource invocSource, MdxTargetType mdxTargetType) {
        a(MdxIntentLogblob.IntentType.SkipSegment);
        String a = a();
        int i = this.a;
        this.a = i + 1;
        this.b = new aWX(a, i, segmentType, invocSource, mdxTargetType);
        this.c = true;
    }

    public void a(MdxNotificationIntentRetriever.InvocSource invocSource, MdxTargetType mdxTargetType) {
        a(MdxIntentLogblob.IntentType.Stop);
        String a = a();
        int i = this.a;
        this.a = i + 1;
        this.b = new aWZ(a, i, invocSource, mdxTargetType);
        if (!invocSource.equals(MdxNotificationIntentRetriever.InvocSource.Disconnect)) {
            this.c = true;
            return;
        }
        this.b.o();
        this.b.k();
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.aWV$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[MdxIntentLogblob.IntentType.values().length];
            e = iArr;
            try {
                iArr[MdxIntentLogblob.IntentType.SkipSegment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[MdxIntentLogblob.IntentType.Stop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public void a(C2061aYk c2061aYk) {
        MdxIntentLogblob mdxIntentLogblob = this.b;
        if (mdxIntentLogblob == null || !this.c) {
            return;
        }
        int i = AnonymousClass1.e[mdxIntentLogblob.g().ordinal()];
        if (i == 1) {
            e(c2061aYk, aWX.a);
        } else if (i == 2) {
            e(c2061aYk, aWZ.a);
        } else {
            C1044Mm.j("MdxIntentLogger", "stateChanged - unknown intent type - type: %s", this.b.g());
        }
    }

    private void a(MdxIntentLogblob.IntentType intentType) {
        MdxIntentLogblob mdxIntentLogblob = this.b;
        if (mdxIntentLogblob == null || !this.c) {
            return;
        }
        mdxIntentLogblob.b(intentType);
        this.d.a(this.b);
    }

    private void e(C2061aYk c2061aYk, String[] strArr) {
        this.b.d(c2061aYk.l());
        this.b.o();
        if (Arrays.asList(strArr).contains(c2061aYk.d())) {
            this.b.k();
            b();
        }
    }

    private void b() {
        this.d.a(this.b);
        this.c = false;
    }

    private String a() {
        aOV aov = this.e;
        if (aov != null) {
            return aWL.d(aov.a());
        }
        return null;
    }
}
