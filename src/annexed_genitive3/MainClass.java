/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annexed_genitive3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import phraser.Phrase;
import phraser.Phraser;
import utils.Miss;
import static utils.Miss.pl;
import utils.ReadFromFile;

/**
 *
 * @author bakee
 */
public class MainClass {

    Phraser phraser;
    AnnGenDetector detr;

    public void ini() throws FileNotFoundException, IOException {
        String[] pathFile = {"F:\\Master\\Thesis\\Implementations\\IP_Detector\\IP\\simple_corpus_NS.txt",
            "F:\\Master\\Thesis\\Implementations\\PronParsing\\Shom_lib\\simple_corpus.txt",
        "F:\\Master\\Thesis\\Implementations\\Annexed_Genitive\\Shom_lib\\simple_corpus.txt"};
        phraser = new Phraser();
        phraser.setCorpus(pathFile[2]);
        List<Phrase> sentence = null;

        System.out.print("Enter sentence ID:");
        String sent = new Scanner(System.in, "windows-1256").nextLine();

        if (sent.startsWith("q") || sent.isEmpty()) {
            return;
        }
        if (sent.startsWith("0")) {
            this.detectAll(Integer.parseInt(sent));
        } else {
            if (sent.matches("\\d+")) {
                sent = new ReadFromFile(pathFile[2]).sentence(Integer.parseInt(sent));
            }
            if (sent != null) {
                sentence = phraser.phrases1(sent);

            }
            if (sentence != null) {
                this.sentenceDetect(sentence);
            }

        }
        this.ini();
    }

    void sentenceDetect(List<Phrase> sentence) {
        Phrase phrase;
        List<AnnGen2> anngens = null;
        Iterator<Phrase> itr = sentence.iterator();
        while (itr.hasNext()) {
            phrase = itr.next();
//            pl(phrase);
            if (phrase.idafa()) {
                detr = new AnnGenDetector(phrase);
                anngens = detr.getAnnGen();
            }

        }
       
    }

    void detectAll(int count) throws IOException {

        List<List<Phrase>> sentences = phraser.phrasesAll(count);

        Iterator<List<Phrase>> sents = sentences.iterator();
        while (sents.hasNext()) {
            this.sentenceDetect(sents.next());
            new Miss().next();
        }
    }

    public static void main(String[] args) throws IOException {
        MainClass cls = new MainClass();
        cls.ini();
    }

}
