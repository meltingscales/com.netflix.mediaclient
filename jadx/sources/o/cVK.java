package o;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.transition.Slide;
import androidx.transition.TransitionManager;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.model.survey.Survey;
import com.netflix.model.survey.SurveyQuestion;
import java.util.concurrent.TimeUnit;
import o.C8632dsu;
import o.dpR;

/* loaded from: classes4.dex */
public final class cVK extends NetflixFrag {
    public static final d b = new d(null);
    public static final int e = 8;
    private static final long j = TimeUnit.SECONDS.toMillis(1);
    private Survey k;
    private bEP m;

    /* renamed from: o  reason: collision with root package name */
    private SurveyQuestion f13703o;

    @Override // o.InterfaceC1077Nv
    public boolean isLoadingData() {
        return false;
    }

    private final bEP e() {
        bEP bep = this.m;
        if (bep != null) {
            return bep;
        }
        throw new IllegalArgumentException("Invalid lifecycle access, binding is null".toString());
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Survey survey = arguments != null ? (Survey) arguments.getParcelable("extra_survey") : null;
        SurveyQuestion c = survey != null ? survey.c() : null;
        if (survey != null && !survey.d() && c != null) {
            this.k = survey;
            this.f13703o = c;
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C8632dsu.c((Object) layoutInflater, "");
        this.m = bEP.d(layoutInflater, viewGroup, false);
        ConstraintLayout b2 = e().b();
        C8632dsu.a(b2, "");
        return b2;
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        C8632dsu.c((Object) view, "");
        super.onViewCreated(view, bundle);
        bEP e2 = e();
        SurveyQuestion surveyQuestion = this.f13703o;
        SurveyQuestion surveyQuestion2 = null;
        if (surveyQuestion == null) {
            C8632dsu.d("");
            surveyQuestion = null;
        }
        String h = surveyQuestion.h();
        if (h == null || h.length() == 0) {
            e2.a.setVisibility(8);
        } else {
            C1204Sr c1204Sr = e2.a;
            SurveyQuestion surveyQuestion3 = this.f13703o;
            if (surveyQuestion3 == null) {
                C8632dsu.d("");
                surveyQuestion3 = null;
            }
            c1204Sr.setText(surveyQuestion3.h());
        }
        SurveyQuestion surveyQuestion4 = this.f13703o;
        if (surveyQuestion4 == null) {
            C8632dsu.d("");
            surveyQuestion4 = null;
        }
        String i = surveyQuestion4.i();
        if (i == null || i.length() == 0) {
            e2.d.setVisibility(8);
        } else {
            C1204Sr c1204Sr2 = e2.d;
            SurveyQuestion surveyQuestion5 = this.f13703o;
            if (surveyQuestion5 == null) {
                C8632dsu.d("");
                surveyQuestion5 = null;
            }
            c1204Sr2.setText(surveyQuestion5.i());
        }
        C1204Sr c1204Sr3 = e2.c;
        SurveyQuestion surveyQuestion6 = this.f13703o;
        if (surveyQuestion6 == null) {
            C8632dsu.d("");
            surveyQuestion6 = null;
        }
        c1204Sr3.setText(surveyQuestion6.g());
        RadioButton radioButton = e2.f;
        SurveyQuestion surveyQuestion7 = this.f13703o;
        if (surveyQuestion7 == null) {
            C8632dsu.d("");
            surveyQuestion7 = null;
        }
        radioButton.setText(surveyQuestion7.c());
        RadioButton radioButton2 = e2.j;
        SurveyQuestion surveyQuestion8 = this.f13703o;
        if (surveyQuestion8 == null) {
            C8632dsu.d("");
            surveyQuestion8 = null;
        }
        radioButton2.setText(surveyQuestion8.b());
        RadioButton radioButton3 = e2.i;
        SurveyQuestion surveyQuestion9 = this.f13703o;
        if (surveyQuestion9 == null) {
            C8632dsu.d("");
            surveyQuestion9 = null;
        }
        radioButton3.setText(surveyQuestion9.a());
        RadioButton radioButton4 = e2.h;
        SurveyQuestion surveyQuestion10 = this.f13703o;
        if (surveyQuestion10 == null) {
            C8632dsu.d("");
            surveyQuestion10 = null;
        }
        radioButton4.setText(surveyQuestion10.e());
        RadioButton radioButton5 = e2.g;
        SurveyQuestion surveyQuestion11 = this.f13703o;
        if (surveyQuestion11 == null) {
            C8632dsu.d("");
            surveyQuestion11 = null;
        }
        radioButton5.setText(surveyQuestion11.d());
        C1203Sq c1203Sq = e2.f13498o;
        SurveyQuestion surveyQuestion12 = this.f13703o;
        if (surveyQuestion12 == null) {
            C8632dsu.d("");
        } else {
            surveyQuestion2 = surveyQuestion12;
        }
        c1203Sq.setText(surveyQuestion2.f());
        e2.f13498o.setOnClickListener(new View.OnClickListener() { // from class: o.cVJ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cVK.b(cVK.this, view2);
            }
        });
        e2.l.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.cVM
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
                cVK.b(cVK.this, radioGroup, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(cVK cvk, View view) {
        C8632dsu.c((Object) cvk, "");
        cvk.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(cVK cvk, RadioGroup radioGroup, int i) {
        C8632dsu.c((Object) cvk, "");
        cvk.b(i);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C1645aIz.a(this, new drM<ServiceManager, dpR>() { // from class: com.netflix.mediaclient.ui.survey.SurveyFragment$onResume$1
            @Override // o.drM
            public /* synthetic */ dpR invoke(ServiceManager serviceManager) {
                d(serviceManager);
                return dpR.c;
            }

            public final void d(ServiceManager serviceManager) {
                C8632dsu.c((Object) serviceManager, "");
                serviceManager.G();
            }
        });
        cVN cvn = cVN.e;
        Survey survey = this.k;
        if (survey == null) {
            C8632dsu.d("");
            survey = null;
        }
        cvn.d(survey);
    }

    @Override // com.netflix.mediaclient.android.fragment.NetflixFrag, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.m = null;
        cVN.e.c();
    }

    private final void b(int i) {
        if (i == com.netflix.mediaclient.ui.R.g.fA) {
            e(1);
        } else if (i == com.netflix.mediaclient.ui.R.g.fz) {
            e(2);
        } else if (i == com.netflix.mediaclient.ui.R.g.fG) {
            e(3);
        } else if (i == com.netflix.mediaclient.ui.R.g.fF) {
            e(4);
        } else if (i == com.netflix.mediaclient.ui.R.g.fC) {
            e(5);
        } else {
            a();
        }
    }

    private final void G() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null || !fragmentManager.isStateSaved()) {
            TransitionManager.beginDelayedTransition(e().e, new Slide());
            bEP bep = this.m;
            if (bep != null) {
                ConstraintLayout constraintLayout = bep.e;
                C8632dsu.a(constraintLayout, "");
                int childCount = constraintLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = constraintLayout.getChildAt(i);
                    if (childAt.getId() != com.netflix.mediaclient.ui.R.g.ab) {
                        childAt.setVisibility(childAt.getId() == bep.m.getId() ? 0 : 8);
                    }
                }
            }
            new Handler().postDelayed(new Runnable() { // from class: o.cVL
                @Override // java.lang.Runnable
                public final void run() {
                    cVK.d(cVK.this);
                }
            }, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(cVK cvk) {
        C8632dsu.c((Object) cvk, "");
        e(cvk, 0, 1, null);
    }

    static /* synthetic */ void e(cVK cvk, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        cvk.c(i);
    }

    private final void c(int i) {
        if (C9737vz.a(getActivity())) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(i);
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends C1045Mp {
        public /* synthetic */ d(C8627dsp c8627dsp) {
            this();
        }

        private d() {
            super("SurveyFragment");
        }

        public final cVK b(Survey survey) {
            cVK cvk = new cVK();
            Bundle bundle = new Bundle();
            if (survey != null) {
                bundle.putParcelable("extra_survey", survey);
            }
            cvk.setArguments(bundle);
            return cvk;
        }
    }

    private final void a() {
        b.getLogTag();
        cVN.e.d();
        c(0);
    }

    private final void e(int i) {
        b.getLogTag();
        cVN.e.b(i);
        G();
    }
}
