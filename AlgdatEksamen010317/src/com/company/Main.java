package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here


        int[] a = {4,5,6,7,8,9,8,7,6,5,4,3,2};
        int[] b = {0};
        snu(a);
        snu(b);
        System.out.println(Arrays.toString(a) + ", " + Arrays.toString(b));

    }

    public static void snu(int[] a){
        //Skal reversere innholdet i tabell a

        int[] b = a.clone();

        for(int i = b.length-1, j= 0; i >= 0; i--, j++){
            a[j] = b[i];
        }

    }

    public static int finn(int[] a, int verdi){

        //Begynner i hver sin ende av tabellen
        int venstre = 0;
        int høyre = a.length-1;

        //Fortsetter så lenge som tabellen ikke er tom
        while(venstre <= høyre){
            //  løsning https://www.cs.hioa.no/~ulfu/AlgDat/eksamen/v17/AlgDatV17Fasit.html
            // https://www.cs.hioa.no/~ulfu/AlgDat/eksamen/v17/AlgDatV17.html

        }





        return verdi;
    }



}
