package annexed_genitive3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import phraser.Phrase;
import phraser.Word;
import static utils.Miss.pl;

public class AnnGenDetector {

    Phrase phrase;
    List<AnnGen2> AGs;

    public AnnGenDetector(Phrase wrds) {
        phrase = wrds;
    }

    List<AnnGen2> getAnnGen() {
        AGs = new ArrayList();
        AnnGen2 ag;
        Word w1, w2;
        for (int i = 0; i < phrase.size(); i++) {
            w1 = phrase.get(i);
            if (w1.hasEnc()) {
                ag = new AnnGen2(w1);
                pl(ag);
                i++;
            }

            if (phrase.size() > i + 1) {
                w2 = phrase.get(i + 1);
                ag = new AnnGen2(w1, w2);
                pl(ag);
            }
        }
        return AGs;
    }

    AnnGen detector1(Word w1, Word w2) {
        AnnGen ag = null;

        return ag;
    }

//    AnnGen detector(Phrase ws, int index) {
//        AnnGen ag = null;
//        Word w1, w2;
//        int rm = ws.size();
//        if (rm > index) {
//            w1 = ws.get(index);
//            index++;
//            if (w1.isNoun() && w1.hasEnc()) {
//                ag = new AnnGen(w1.value(), w1.enc0());
//                AGs.add(ag);
////                index++;
//                ag = detector(ws, index);
//                if (ag != null) {
//                    AGs.add(ag);
//                }
//            } else {
//
//                if (rm > index) {
//                    w2 = ws.get(index);
//
//                    if (w1.isNoun() && w2.isNoun()) {
//                        ag = new AnnGen(w1.value(), w2.value());
//                        AGs.add(ag);
//                    }
//                }
//                ag = detector(ws, index);
//                if (ag != null) {
//                    AGs.add(ag);
//                }
//            }
//        }
//        return ag;
//    }
}
