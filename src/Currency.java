

public class Currency {
    float usd = 1;
    float eur =  0.91352f;
    float cad = 1.33074f;
    float mxn = 18.6073f;

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
