package com.netflix.model.leafs.originals.interactive.template;

import com.netflix.model.leafs.originals.interactive.Choice;
import com.netflix.model.leafs.originals.interactive.InteractiveMoments;
import com.netflix.model.leafs.originals.interactive.Moment;
import com.netflix.model.leafs.originals.interactive.condition.Condition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.C1045Mp;
import o.C8572dqo;
import o.C8627dsp;
import o.C8632dsu;

/* loaded from: classes5.dex */
public final class QuestionsHelper {
    public static final Companion Companion = new Companion(null);
    private Moment currentQuestion;
    private final InteractiveMoments interactiveMoments;
    private final Iterator<Moment> questionIterator;

    public final Moment getCurrentQuestion() {
        return this.currentQuestion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public QuestionsHelper(List<? extends Moment> list, InteractiveMoments interactiveMoments) {
        C8632dsu.c((Object) interactiveMoments, "");
        this.interactiveMoments = interactiveMoments;
        this.questionIterator = list != null ? list.iterator() : null;
        this.currentQuestion = getNextQuestion();
    }

    /* loaded from: classes5.dex */
    public static final class Companion extends C1045Mp {
        public /* synthetic */ Companion(C8627dsp c8627dsp) {
            this();
        }

        private Companion() {
            super("QuestionHelper");
        }
    }

    public final Moment getNextQuestion() {
        int d;
        Choice choice;
        Object obj;
        Condition condition;
        Iterator<Moment> it = this.questionIterator;
        ArrayList arrayList = null;
        if (it == null || !it.hasNext()) {
            this.currentQuestion = null;
        } else {
            Moment next = this.questionIterator.next();
            Moment.Builder builder = next.toBuilder();
            List<Choice> choices = next.choices();
            if (choices != null) {
                C8632dsu.d(choices);
                d = C8572dqo.d(choices, 10);
                ArrayList arrayList2 = new ArrayList(d);
                for (Choice choice2 : choices) {
                    List<Choice.ChoiceOverride> overrides = choice2.overrides();
                    if (overrides != null) {
                        Iterator<T> it2 = overrides.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String preconditionId = ((Choice.ChoiceOverride) obj).preconditionId();
                            boolean z = preconditionId == null || ((condition = this.interactiveMoments.preconditions().get(preconditionId)) != null && condition.meetsCondition(this.interactiveMoments));
                            Companion.getLogTag();
                            if (z) {
                                break;
                            }
                        }
                        Choice.ChoiceOverride choiceOverride = (Choice.ChoiceOverride) obj;
                        if (choiceOverride != null) {
                            choice = choiceOverride.data();
                            arrayList2.add(choice2.merge(choice).merge(choice2.defaultData()));
                        }
                    }
                    choice = null;
                    arrayList2.add(choice2.merge(choice).merge(choice2.defaultData()));
                }
                arrayList = arrayList2;
            }
            this.currentQuestion = builder.choices(arrayList).build();
        }
        return this.currentQuestion;
    }
}
