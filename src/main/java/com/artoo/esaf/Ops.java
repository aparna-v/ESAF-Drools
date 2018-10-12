package com.artoo.esaf;

import com.artoo.esaf.Output;
import java.lang.Double;

public class Ops {
    
    public static int BORROWER_CHARC = 1;
    public static int FINANCIAL_CHARC = 2;
    public static int TRANSACTL_CHARC = 3;
    public static int PROPERTY_CHARC = 4;
    

    public static Output calc(Output out, Double score, Double weight, int charc){
        out.setOverall_score(out.getOverall_score() + (score * (weight/100)));
        if(charc == Ops.BORROWER_CHARC){
            out.setBorrower_charc(out.getBorrower_charc() + (score * (weight/100)));
        }else if(charc == Ops.FINANCIAL_CHARC){
            out.setFinancial_charc(out.getFinancial_charc() + (score * (weight/100)));
        }else if(charc == Ops.TRANSACTL_CHARC){
            out.setTransactional_charc(out.getTransactional_charc() + (score * (weight/100)));
        }else if(charc == Ops.PROPERTY_CHARC){
            out.setProperty_charac(out.getProperty_charac() + (score * (weight/100)));
        }
        System.out.println("\n------------------------\nOVERALL_SCR: "+out.getOverall_score()+"\nBORROWER_CHARC: "+out.getBorrower_charc()+"\nFINANCIAL_CHARC: "+out.getFinancial_charc()+"\nTRANSACTL_CHARC: "+out.getTransactional_charc()+"\nPROPERTY_CHARC: "+out.getProperty_charac()+"\n------------------------\n");
        return out;
    }
}