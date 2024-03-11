package com.netflix.mediaclient.android.widget;

import android.os.Trace;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C8556dpz;
import o.C8586drb;
import o.C8738dws;
import o.GF;
import o.InterfaceC8585dra;
import o.dpR;
import o.drM;
import o.drX;
import o.dwQ;
import o.dwU;
import o.dwY;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NetflixTagsTextView$getMeasuredTagsSpannable$2 extends SuspendLambda implements drM<InterfaceC8585dra<? super SpannableStringBuilder>, Object> {
    final /* synthetic */ int a;
    final /* synthetic */ NetflixTagsTextView d;
    int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetflixTagsTextView$getMeasuredTagsSpannable$2(NetflixTagsTextView netflixTagsTextView, int i, InterfaceC8585dra<? super NetflixTagsTextView$getMeasuredTagsSpannable$2> interfaceC8585dra) {
        super(1, interfaceC8585dra);
        this.d = netflixTagsTextView;
        this.a = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC8585dra<dpR> create(InterfaceC8585dra<?> interfaceC8585dra) {
        return new NetflixTagsTextView$getMeasuredTagsSpannable$2(this.d, this.a, interfaceC8585dra);
    }

    @Override // o.drM
    /* renamed from: d */
    public final Object invoke(InterfaceC8585dra<? super SpannableStringBuilder> interfaceC8585dra) {
        return ((NetflixTagsTextView$getMeasuredTagsSpannable$2) create(interfaceC8585dra)).invokeSuspend(dpR.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.netflix.mediaclient.android.widget.NetflixTagsTextView$getMeasuredTagsSpannable$2$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements drX<dwU, InterfaceC8585dra<? super SpannableStringBuilder>, Object> {
        private /* synthetic */ Object a;
        final /* synthetic */ NetflixTagsTextView b;
        int d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NetflixTagsTextView netflixTagsTextView, int i, InterfaceC8585dra<? super AnonymousClass1> interfaceC8585dra) {
            super(2, interfaceC8585dra);
            this.b = netflixTagsTextView;
            this.e = i;
        }

        @Override // o.drX
        /* renamed from: c */
        public final Object invoke(dwU dwu, InterfaceC8585dra<? super SpannableStringBuilder> interfaceC8585dra) {
            return ((AnonymousClass1) create(dwu, interfaceC8585dra)).invokeSuspend(dpR.c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC8585dra<dpR> create(Object obj, InterfaceC8585dra<?> interfaceC8585dra) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.e, interfaceC8585dra);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list;
            C8586drb.e();
            if (this.d == 0) {
                C8556dpz.d(obj);
                dwU dwu = (dwU) this.a;
                Trace.beginSection("NetflixTagsTextView.getMeasuredTagsSpannable");
                list = this.b.j;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i = 0;
                for (int i2 = 0; dwY.b(dwu) && i2 < list.size(); i2++) {
                    spannableStringBuilder.append((CharSequence) list.get(i2));
                    if (i2 > 2 && this.b.getPaint().measureText(spannableStringBuilder, 0, spannableStringBuilder.length()) >= this.e) {
                        if (((String) list.get(i2)).length() < spannableStringBuilder.length()) {
                            spannableStringBuilder.delete(spannableStringBuilder.length() - ((String) list.get(i2)).length(), spannableStringBuilder.length());
                        }
                        i++;
                        if (i >= 10 || i2 == list.size() - 1) {
                            if (5 < spannableStringBuilder.length()) {
                                spannableStringBuilder.delete(spannableStringBuilder.length() - 5, spannableStringBuilder.length());
                            }
                        }
                    } else if (i2 != list.size() - 1) {
                        spannableStringBuilder.append("  •  ", new ForegroundColorSpan(this.b.a()), 33);
                    }
                }
                Trace.endSection();
                return spannableStringBuilder;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        e = C8586drb.e();
        int i = this.e;
        if (i == 0) {
            C8556dpz.d(obj);
            dwQ c = GF.c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.d, this.a, null);
            this.e = 1;
            obj = C8738dws.c(c, anonymousClass1, this);
            if (obj == e) {
                return e;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            C8556dpz.d(obj);
        }
        return obj;
    }
}
