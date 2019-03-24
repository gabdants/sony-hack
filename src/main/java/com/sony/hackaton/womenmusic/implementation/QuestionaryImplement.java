package com.sony.hackaton.womenmusic.implementation;

import com.sony.hackaton.womenmusic.dao.Questionary;
import com.sony.hackaton.womenmusic.dao.Types;
import org.apache.commons.lang3.Range;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class QuestionaryImplement {

    public String generateVoc(Questionary quest){

        int artist = 1;
        int composer = 2;
        int eventProducer = 3;
        int soundOperator = 4;
        int headhunter = 5;
        int publishingCompany = 6;
        int audioVisual = 7;
        int business = 8;


        List<Integer> finalNumber = new ArrayList<>();

        int aux = 1;

        Random randomGenerator = new Random();

//        AGE STEP

        int age = Integer.parseInt(quest.getAgeQuest());

        Range<Integer> child = Range.between(0, 13);
        Range<Integer> teenager = Range.between(14, 19);
        Range<Integer> coolAdult = Range.between(20, 28);
        Range<Integer> adult = Range.between(29, 45);
        Range<Integer> neverLate = Range.between(46, 99);
        if (child.contains(age)){

            while (aux != 0){
                int randomInt = randomGenerator.nextInt(8) + 1;
                if(randomInt != 6 && randomInt != 8){
                    finalNumber.add(randomInt);
                    aux = 0;
                    System.out.println("Random number generated is : " + randomInt);
                }
            }
        }
        else if(teenager.contains(age)){
            while (aux != 0){
                int randomInt = randomGenerator.nextInt(8) + 1;
                if(randomInt != 6 && randomInt != 8){
                    finalNumber.add(randomInt);
                    aux = 0;
                    System.out.println("Random number generated is : " + randomInt);
                }
            }
        }

        else if(coolAdult.contains(age)){
            int randomInt = randomGenerator.nextInt(8) + 1;
            finalNumber.add(randomInt);
        }

        else if(adult.contains(age)){
            int randomInt = randomGenerator.nextInt(8) + 1;
            finalNumber.add(randomInt);
        }

        else if(neverLate.contains(age)){
            int randomInt = randomGenerator.nextInt(8) + 1;
            finalNumber.add(randomInt);
        }

//        Since when STEP

        if (quest.getSinceWhenQuest().equalsIgnoreCase("a")){
//            Random rd = new Random();
//            int[] arr = new int[];
            Random sinc = new Random();
            int nm = sinc.nextInt(8) + 1;
            finalNumber.add(nm);
        }
        else if (quest.getSinceWhenQuest().equalsIgnoreCase("b")){
            Random sinc = new Random();
            int nm = sinc.nextInt(8) + 1;
            finalNumber.add(nm);
        }
        else if (quest.getSinceWhenQuest().equalsIgnoreCase("c")){
            Random sinc = new Random();
            int nm = sinc.nextInt(8) + 1;
            finalNumber.add(nm);
        }

//        talent STEP

        String talent = quest.getWhatsTalentQuest();
        if (talent.equalsIgnoreCase("Toco algum instrumento")){
            Random rd = new Random();
            int[] arr = {1,4};
            finalNumber.add(rd.nextInt(arr.length));
        }
        else if (talent.equalsIgnoreCase("Gosto de ajudar meus colegas que tocam algo")){
            Random rd = new Random();
            int[] arr = {2,3,5,8,4};
            finalNumber.add(rd.nextInt(arr.length));
        }
        else if (talent.equalsIgnoreCase("Gosto de anunciar o trabalho dos meus amigos")){
            Random rd = new Random();
            int[] arr = {3,5,6,7,8};
            finalNumber.add(rd.nextInt(arr.length));
        }
        else if (talent.equalsIgnoreCase("Gosto de manter uma")){
            Random rd = new Random();
            int[] arr = {2,3,5,8};
            finalNumber.add(rd.nextInt(arr.length));
        }

//        Personal project STEP

        String pp = quest.getDidSomethingQuest();

        if(pp.equalsIgnoreCase("sim")){
            Random rd = new Random();
            int[] arr = {1,2,3,7,8};
            finalNumber.add(rd.nextInt(arr.length));
        }
        else if(pp.equalsIgnoreCase("nao")){
            Random rd = new Random();
            int[] arr = {4,5,6};
            finalNumber.add(rd.nextInt(arr.length));
        }

//        help world STEP

        String fit = quest.getWhereFitQuest();

        if (fit.equalsIgnoreCase("Nao, faco ideia...")){
            Random rd = new Random();
            int[] arr = {4,6,7};
            finalNumber.add(rd.nextInt(arr.length));
        }
        else if (fit.equalsIgnoreCase("Sou extrovertido e gosto ajudar as pessoas")){
            Random rd = new Random();
            int[] arr = {1,2,3,5,7,8};
            finalNumber.add(rd.nextInt(arr.length));
        }
        else if (fit.equalsIgnoreCase("Sou mais na minha, mas gosto de estar em ambientes barulhentos")){
            Random rd = new Random();
            int[] arr = {3,4,7};
            finalNumber.add(rd.nextInt(arr.length));
        }

//        course STEP

        String course = quest.getCourseQuest();

        if(course.equalsIgnoreCase("sim")){
            Random rd = new Random();
            int[] arr = {1,2,3,7,8};
            finalNumber.add(rd.nextInt(arr.length));
        }
        else if(course.equalsIgnoreCase("nao")){
            Random rd = new Random();
            int[] arr = {4,5,6};
            finalNumber.add(rd.nextInt(arr.length));
        }

//        perfect STEP

        String perf = quest.getPerfectionQuest();

        if(course.equalsIgnoreCase("sim")){
            Random rd = new Random();
            int[] arr = {1,2,3,7,8};
            finalNumber.add(rd.nextInt(arr.length));
        }
        else if(course.equalsIgnoreCase("nao")){
            Random rd = new Random();
            int[] arr = {4,5,6};
            finalNumber.add(rd.nextInt(arr.length));
        }

        int num = mode(finalNumber);

        if(num == artist){
            return "A SUA VOCAÇAO É ARTISTA ";
        }
        else if(num == composer){
            return "A SUA VOCAÇAO É COMPOSITOR";
        }
        else if(num == eventProducer){
            return "A SUA VOCAÇAO É PRODUTOR DE EVENTOS ";
        }else if(num == soundOperator){
            return "A SUA VOCAÇAO É OPERADOR DE SOM ";
        }else if(num == headhunter){
            return "A SUA VOCAÇAO É A & R (Caça Talentos) ";
        }else if(num == publishingCompany){
            return "A SUA VOCAÇAO É EDITORA";
        }else if(num == audioVisual){
            return "A SUA VOCAÇAO É PRODUÇÃO AUDIOVISUAL";
        }else if(num == business){
            return "A SUA VOCAÇAO É EMPRESARIx";
        }




        return "nao consegui";






    }

    public static int mode(List<Integer> a) {
        int maxValue = 0, maxCount= 0;

        for (int i = 0; i < a.size(); ++i) {
            int count = 0;
            for (int j = 0; j < a.size(); ++j) {
                if (a.get(j) == a.get(i)) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = a.get(i);
            }
        }

        return maxValue;
    }

}
