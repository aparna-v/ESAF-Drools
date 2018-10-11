package com.artoo.esaf;

import com.artoo.esaf.Output;
import java.lang.Double;

public class Ops {
    
    public static int BORROWER_CHARC = 1;
    public static int FINANCIAL_CHARC = 1;
    public static int TRANSACTL_CHARC = 1;
    public static int PROPERTY_CHARC = 1;
    

    public static Output calc(Output out, Double score, Double weight, int charc){
        out.setOverall_score(out.getOverall_score() + (score * (weight/100)));
        
        switch(charc){
            case BORROWER_CHARC:
                out.setBorrower_charc(out.getBorrower_charc() + (score * (weight/100)));
                break;
            case FINANCIAL_CHARC:
                out.setFinancial_charc(out.getFinancial_charc() + (score * (weight/100)));
                break;
            case TRANSACTL_CHARC:
                out.setTransactional_charc(out.getTransactional_charc() + (score * (weight/100)));
                break;
            case PROPERTY_CHARC:
                out.setProperty_charac(out.getProperty_charac() + (score * (weight/100)));
                break;
            default:
                break;
        }
        return out;
    }
}