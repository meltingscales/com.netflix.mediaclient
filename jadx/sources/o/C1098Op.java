package o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.os.SystemClock;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.netflix.mediaclient.api.logging.error.ErrorType;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.rxkotlin.SubscribersKt;
import io.reactivex.schedulers.Schedulers;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import o.C1097Oo;
import o.C1098Op;
import o.C3658bG;
import o.C8632dsu;
import o.InterfaceC1598aHf;
import o.InterfaceC1601aHi;
import o.dpR;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"RestrictedApi"})
/* renamed from: o.Op  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1098Op extends C1045Mp {
    public static final C1098Op a = new C1098Op();
    private static int b = 0;
    private static int d = 1;

    private C1098Op() {
        super("NetflixLottieHelperV2");
    }

    public final Single<C1097Oo> b(final String str, final boolean z) {
        C8632dsu.c((Object) str, "");
        Single<C1097Oo> subscribeOn = Single.create(new SingleOnSubscribe() { // from class: o.On
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C1098Op.c(str, z, singleEmitter);
            }
        }).subscribeOn(Schedulers.io());
        C8632dsu.a(subscribeOn, "");
        return subscribeOn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, boolean z, final SingleEmitter singleEmitter) {
        Triple<List<C1099Oq>, Integer, Integer> a2;
        List i;
        int i2 = 2 % 2;
        C8632dsu.c((Object) str, "");
        C8632dsu.c((Object) singleEmitter, "");
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", "LOTTIE_COMPOSITION_LOAD");
        jSONObject.put("fileName", str);
        jSONObject.put("startTime", SystemClock.elapsedRealtime());
        try {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            C1332Xp c1332Xp = C1332Xp.b;
            Object[] objArr = {((Context) C1332Xp.b(Context.class)).getAssets(), str};
            Object obj = C9571sB.s.get(-59237389);
            if (obj == null) {
                obj = ((Class) C9571sB.a(4, 0, (char) 0)).getMethod("a", AssetManager.class, String.class);
                C9571sB.s.put(-59237389, obj);
            }
            InputStream inputStream = (InputStream) ((Method) obj).invoke(null, objArr);
            C8632dsu.a(inputStream, "");
            C6796ck<C3658bG> a3 = C3743bJ.a(JsonReader.a(dIw.e(dIw.a(inputStream))), str);
            if (!z) {
                i = C8569dql.i();
                a2 = new Triple<>(i, 0, 0);
            } else {
                int i3 = d + 121;
                b = i3 % 128;
                int i4 = i3 % 2;
                Object[] objArr2 = {((Context) C1332Xp.b(Context.class)).getAssets(), str};
                Object obj2 = C9571sB.s.get(-59237389);
                if (obj2 == null) {
                    obj2 = ((Class) C9571sB.a(4, 0, (char) 0)).getMethod("a", AssetManager.class, String.class);
                    C9571sB.s.put(-59237389, obj2);
                }
                InputStream inputStream2 = (InputStream) ((Method) obj2).invoke(null, objArr2);
                C1098Op c1098Op = a;
                C8632dsu.d(inputStream2);
                a2 = c1098Op.a(inputStream2, jSONObject);
                C8608drx.a(inputStream2, null);
            }
            final List<C1099Oq> e2 = a2.e();
            final int intValue = a2.d().intValue();
            final int intValue2 = a2.a().intValue();
            C1098Op c1098Op2 = a;
            C8632dsu.d(a3);
            SubscribersKt.subscribeBy(c1098Op2.e(a3), new drM<Throwable, dpR>() { // from class: com.netflix.mediaclient.android.lottie.NetflixLottieHelperV2$loadCompositionFromAssetFile$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(Throwable th) {
                    e(th);
                    return dpR.c;
                }

                public final void e(Throwable th) {
                    C8632dsu.c((Object) th, "");
                    C1098Op c1098Op3 = C1098Op.a;
                    singleEmitter.onError(th);
                }
            }, new drM<C3658bG, dpR>() { // from class: com.netflix.mediaclient.android.lottie.NetflixLottieHelperV2$loadCompositionFromAssetFile$1$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // o.drM
                public /* synthetic */ dpR invoke(C3658bG c3658bG) {
                    a(c3658bG);
                    return dpR.c;
                }

                public final void a(C3658bG c3658bG) {
                    C8632dsu.c((Object) c3658bG, "");
                    JSONObject.this.put("totalTime", SystemClock.elapsedRealtime() - elapsedRealtime);
                    JSONObject.this.put("isCompleted", true);
                    C1098Op.a.getLogTag();
                    singleEmitter.onSuccess(new C1097Oo(c3658bG, e2, intValue, intValue2));
                }
            });
            int i5 = d + 115;
            b = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            singleEmitter.onError(th);
        }
    }

    private final Triple<List<C1099Oq>, Integer, Integer> a(InputStream inputStream, JSONObject jSONObject) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        byte[] b2 = C8607drw.b(inputStream);
        Charset forName = Charset.forName("UTF-8");
        C8632dsu.a(forName, "");
        JSONObject jSONObject2 = new JSONObject(new String(b2, forName));
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        jSONObject.put("jsonObject", elapsedRealtime2 - elapsedRealtime);
        Triple<List<C1099Oq>, Integer, Integer> b3 = b(jSONObject2);
        jSONObject.put("tagListCreation", SystemClock.elapsedRealtime() - elapsedRealtime2);
        return b3;
    }

    private final Triple<List<C1099Oq>, Integer, Integer> b(JSONObject jSONObject) {
        Map d2;
        Map k;
        Throwable th;
        JSONArray optJSONArray;
        boolean i;
        ArrayList arrayList = new ArrayList();
        try {
            optJSONArray = jSONObject.optJSONArray("layers");
        } catch (JSONException e2) {
            InterfaceC1598aHf.c cVar = InterfaceC1598aHf.a;
            d2 = dqE.d();
            k = dqE.k(d2);
            C1596aHd c1596aHd = new C1596aHd("field parsing for nflx-* failed on the lottie json while creating tap list", e2, null, true, k, false, false, 96, null);
            ErrorType errorType = c1596aHd.a;
            if (errorType != null) {
                c1596aHd.e.put("errorType", errorType.c());
                String b2 = c1596aHd.b();
                if (b2 != null) {
                    c1596aHd.a(errorType.c() + " " + b2);
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
            InterfaceC1601aHi.d dVar = InterfaceC1601aHi.c;
            InterfaceC1598aHf a2 = dVar.a();
            if (a2 != null) {
                a2.e(c1596aHd, th);
            } else {
                dVar.e().b(c1596aHd, th);
            }
            arrayList.clear();
        }
        if (optJSONArray == null) {
            return new Triple<>(arrayList, Integer.valueOf(jSONObject.optInt("w")), Integer.valueOf(jSONObject.optInt("h")));
        }
        int length = optJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            if (optJSONObject.has("nm")) {
                String string = optJSONObject.getString("nm");
                C8632dsu.d((Object) string);
                i = C8691duz.i(string, "nflx", false, 2, null);
                if (i) {
                    C8632dsu.d(optJSONObject);
                    arrayList.add(a(optJSONObject));
                }
            }
        }
        return new Triple<>(arrayList, Integer.valueOf(jSONObject.optInt("w")), Integer.valueOf(jSONObject.optInt("h")));
    }

    private final C1099Oq a(JSONObject jSONObject) {
        List d2;
        List<String> d3;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONArray optJSONArray;
        JSONObject optJSONObject4;
        JSONObject optJSONObject5;
        ArrayList arrayList = new ArrayList();
        String string = jSONObject.getString("nm");
        C8632dsu.a(string, "");
        d2 = duD.d((CharSequence) string, new String[]{"-"}, false, 0, 6, (Object) null);
        d3 = duD.d((CharSequence) d2.get(d2.size() - 1), new String[]{"*"}, false, 0, 6, (Object) null);
        for (String str : d3) {
            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
        }
        Rect rect = new Rect();
        if (jSONObject.has("shapes")) {
            JSONArray optJSONArray2 = jSONObject.optJSONArray("shapes");
            JSONArray jSONArray = null;
            JSONArray jSONArray2 = (optJSONArray2 == null || (optJSONObject3 = optJSONArray2.optJSONObject(0)) == null || (optJSONArray = optJSONObject3.optJSONArray("it")) == null || (optJSONObject4 = optJSONArray.optJSONObject(0)) == null || (optJSONObject5 = optJSONObject4.optJSONObject("s")) == null) ? null : optJSONObject5.getJSONArray("k");
            if (jSONArray2 != null && jSONArray2.length() >= 2) {
                JSONObject optJSONObject6 = jSONObject.optJSONObject("ks");
                JSONArray jSONArray3 = (optJSONObject6 == null || (optJSONObject2 = optJSONObject6.optJSONObject("p")) == null) ? null : optJSONObject2.getJSONArray("k");
                JSONObject optJSONObject7 = jSONObject.optJSONObject("ks");
                if (optJSONObject7 != null && (optJSONObject = optJSONObject7.optJSONObject("a")) != null) {
                    jSONArray = optJSONObject.getJSONArray("k");
                }
                if (jSONArray3 != null) {
                    double d4 = 1.0d;
                    double optDouble = (jSONArray == null || jSONArray.length() < 2 || jSONArray.optDouble(0) == 0.0d) ? 1.0d : jSONArray.optDouble(0) / 100.0d;
                    if (jSONArray != null && jSONArray.length() >= 2 && jSONArray.optDouble(1) != 0.0d) {
                        d4 = jSONArray.optDouble(1) / 100.0d;
                    }
                    int i = (int) (jSONArray2.getDouble(0) * optDouble);
                    int i2 = (int) (jSONArray2.getDouble(1) * d4);
                    int i3 = (int) (jSONArray3.getDouble(0) - (i / 2));
                    int i4 = (int) (jSONArray3.getDouble(1) - (i2 / 2));
                    rect.set(i3, i4, i + i3, i2 + i4);
                }
            }
        }
        String str2 = (String) d2.get(0);
        int size = d2.size();
        for (int i5 = 1; i5 < size - 1; i5++) {
            str2 = str2 + "-" + d2.get(i5);
        }
        return new C1099Oq(str2, ((Number) arrayList.get(0)).intValue(), ((Number) arrayList.get(1)).intValue(), ((Number) arrayList.get(2)).intValue(), arrayList.size() < 4 ? -1 : ((Number) arrayList.get(3)).intValue(), rect);
    }

    /* renamed from: o.Op$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC6690ci<C3658bG> {
        final /* synthetic */ SingleEmitter<C3658bG> c;
        final /* synthetic */ C6796ck<C3658bG> d;

        e(C6796ck<C3658bG> c6796ck, SingleEmitter<C3658bG> singleEmitter) {
            this.d = c6796ck;
            this.c = singleEmitter;
        }

        @Override // o.InterfaceC6690ci
        /* renamed from: e */
        public void a(C3658bG c3658bG) {
            C8632dsu.c((Object) c3658bG, "");
            this.d.e(this);
            this.c.onSuccess(c3658bG);
        }
    }

    private final Single<C3658bG> e(final C6796ck<C3658bG> c6796ck) {
        Single<C3658bG> create = Single.create(new SingleOnSubscribe() { // from class: o.Or
            @Override // io.reactivex.SingleOnSubscribe
            public final void subscribe(SingleEmitter singleEmitter) {
                C1098Op.b(C6796ck.this, singleEmitter);
            }
        });
        C8632dsu.a(create, "");
        return create;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C6796ck c6796ck, SingleEmitter singleEmitter) {
        C8632dsu.c((Object) c6796ck, "");
        C8632dsu.c((Object) singleEmitter, "");
        c6796ck.c(new e(c6796ck, singleEmitter));
        c6796ck.d((InterfaceC6690ci<Throwable>) new c(c6796ck, singleEmitter));
    }

    /* renamed from: o.Op$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC6690ci<Throwable> {
        final /* synthetic */ SingleEmitter<C3658bG> b;
        final /* synthetic */ C6796ck<C3658bG> d;

        c(C6796ck<C3658bG> c6796ck, SingleEmitter<C3658bG> singleEmitter) {
            this.d = c6796ck;
            this.b = singleEmitter;
        }

        @Override // o.InterfaceC6690ci
        /* renamed from: c */
        public void a(Throwable th) {
            C8632dsu.c((Object) th, "");
            this.d.b(this);
            this.b.onError(th);
        }
    }
}
