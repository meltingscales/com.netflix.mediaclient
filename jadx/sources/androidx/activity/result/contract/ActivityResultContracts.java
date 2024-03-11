package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import o.C8563dqf;
import o.C8576dqs;
import o.C8627dsp;
import o.C8632dsu;
import o.C8657dts;
import o.dpD;
import o.dqD;
import o.dqE;

/* loaded from: classes.dex */
public final class ActivityResultContracts {

    /* loaded from: classes.dex */
    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {
        public static final Companion Companion = new Companion(null);

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, Intent intent) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) intent, "");
            return intent;
        }

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResult parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    /* loaded from: classes.dex */
    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {
        public static final Companion Companion = new Companion(null);

        /* loaded from: classes.dex */
        public static final class Companion {
            public /* synthetic */ Companion(C8627dsp c8627dsp) {
                this();
            }

            private Companion() {
            }

            public final Intent createIntent$activity_release(String[] strArr) {
                C8632dsu.c((Object) strArr, "");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                C8632dsu.a(putExtra, "");
                return putExtra;
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String[] strArr) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) strArr, "");
            return Companion.createIntent$activity_release(strArr);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
            int e;
            int b;
            Map d;
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) strArr, "");
            if (strArr.length == 0) {
                d = dqE.d();
                return new ActivityResultContract.SynchronousResult<>(d);
            }
            for (String str : strArr) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            e = dqD.e(strArr.length);
            b = C8657dts.b(e, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(b);
            for (String str2 : strArr) {
                Pair a = dpD.a(str2, Boolean.TRUE);
                linkedHashMap.put(a.d(), a.a());
            }
            return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public Map<String, Boolean> parseResult(int i, Intent intent) {
            Map<String, Boolean> d;
            List u;
            List h;
            Map<String, Boolean> d2;
            Map<String, Boolean> d3;
            Map<String, Boolean> d4;
            if (i != -1) {
                d4 = dqE.d();
                return d4;
            } else if (intent == null) {
                d3 = dqE.d();
                return d3;
            } else {
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    d = dqE.d();
                    return d;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                u = C8563dqf.u(stringArrayExtra);
                h = C8576dqs.h(u, arrayList);
                d2 = dqE.d(h);
                return d2;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Intent createIntent(Context context, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            return RequestMultiplePermissions.Companion.createIntent$activity_release(new String[]{str});
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.activity.result.contract.ActivityResultContract
        public Boolean parseResult(int i, Intent intent) {
            if (intent == null || i != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (intArrayExtra[i2] == 0) {
                        z = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, String str) {
            C8632dsu.c((Object) context, "");
            C8632dsu.c((Object) str, "");
            if (ContextCompat.checkSelfPermission(context, str) == 0) {
                return new ActivityResultContract.SynchronousResult<>(Boolean.TRUE);
            }
            return null;
        }
    }
}
