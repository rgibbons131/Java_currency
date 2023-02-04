

public class Currency {

    // each is a ratio to the us dollar
    float usd = 1;
    float eur =  0.91352f;
    float cad = 1.33074f;
    float mxn = 18.6073f;

    //String input to return one of the ratios. If it is a not valid code it will return 1 and the currency will just print as input
    public float getRate(String type){
        if (type.equals("usd")){
            return usd;
        }
        else if(type.equals("eur")){
            return eur;
        }
        else if(type.equals("mxn")){
            return mxn;
        }
        else if(type.equals("cad")){
            return cad;
        }
        else{
            return 1;
        }
            
        }
    }
