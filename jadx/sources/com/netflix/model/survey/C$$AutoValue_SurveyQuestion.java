package com.netflix.model.survey;

/* renamed from: com.netflix.model.survey.$$AutoValue_SurveyQuestion  reason: invalid class name */
/* loaded from: classes.dex */
abstract class C$$AutoValue_SurveyQuestion extends SurveyQuestion {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String l;

    @Override // com.netflix.model.survey.SurveyQuestion
    public String a() {
        return this.d;
    }

    @Override // com.netflix.model.survey.SurveyQuestion
    public String b() {
        return this.e;
    }

    @Override // com.netflix.model.survey.SurveyQuestion
    public String c() {
        return this.a;
    }

    @Override // com.netflix.model.survey.SurveyQuestion
    public String d() {
        return this.b;
    }

    @Override // com.netflix.model.survey.SurveyQuestion
    public String e() {
        return this.c;
    }

    @Override // com.netflix.model.survey.SurveyQuestion
    public String f() {
        return this.g;
    }

    @Override // com.netflix.model.survey.SurveyQuestion
    public String g() {
        return this.j;
    }

    @Override // com.netflix.model.survey.SurveyQuestion
    public String h() {
        return this.i;
    }

    @Override // com.netflix.model.survey.SurveyQuestion
    public String i() {
        return this.h;
    }

    @Override // com.netflix.model.survey.SurveyQuestion
    public String j() {
        return this.f;
    }

    @Override // com.netflix.model.survey.SurveyQuestion
    public String m() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C$$AutoValue_SurveyQuestion(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.f = str;
        if (str2 == null) {
            throw new NullPointerException("Null surveyType");
        }
        this.l = str2;
        if (str3 == null) {
            throw new NullPointerException("Null questionNumString");
        }
        this.i = str3;
        if (str4 == null) {
            throw new NullPointerException("Null questionHeader");
        }
        this.h = str4;
        if (str5 == null) {
            throw new NullPointerException("Null questionBody");
        }
        this.j = str5;
        if (str6 == null) {
            throw new NullPointerException("Null skipLabel");
        }
        this.g = str6;
        if (str7 == null) {
            throw new NullPointerException("Null choice1Label");
        }
        this.a = str7;
        this.e = str8;
        this.d = str9;
        this.c = str10;
        if (str11 == null) {
            throw new NullPointerException("Null choice5Label");
        }
        this.b = str11;
    }

    public String toString() {
        return "SurveyQuestion{id=" + this.f + ", surveyType=" + this.l + ", questionNumString=" + this.i + ", questionHeader=" + this.h + ", questionBody=" + this.j + ", skipLabel=" + this.g + ", choice1Label=" + this.a + ", choice2Label=" + this.e + ", choice3Label=" + this.d + ", choice4Label=" + this.c + ", choice5Label=" + this.b + "}";
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurveyQuestion) {
            SurveyQuestion surveyQuestion = (SurveyQuestion) obj;
            return this.f.equals(surveyQuestion.j()) && this.l.equals(surveyQuestion.m()) && this.i.equals(surveyQuestion.h()) && this.h.equals(surveyQuestion.i()) && this.j.equals(surveyQuestion.g()) && this.g.equals(surveyQuestion.f()) && this.a.equals(surveyQuestion.c()) && ((str = this.e) != null ? str.equals(surveyQuestion.b()) : surveyQuestion.b() == null) && ((str2 = this.d) != null ? str2.equals(surveyQuestion.a()) : surveyQuestion.a() == null) && ((str3 = this.c) != null ? str3.equals(surveyQuestion.e()) : surveyQuestion.e() == null) && this.b.equals(surveyQuestion.d());
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f.hashCode();
        int hashCode2 = this.l.hashCode();
        int hashCode3 = this.i.hashCode();
        int hashCode4 = this.h.hashCode();
        int hashCode5 = this.j.hashCode();
        int hashCode6 = this.g.hashCode();
        int hashCode7 = this.a.hashCode();
        String str = this.e;
        int hashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int hashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.c;
        return ((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ (str3 != null ? str3.hashCode() : 0)) * 1000003) ^ this.b.hashCode();
    }
}
