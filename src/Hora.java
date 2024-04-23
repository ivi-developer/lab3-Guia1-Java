import java.util.Locale;

public class Hora {
    private int hr;
    private int min;
    private int sec;
    public Hora(int hr,int min,int sec) {
        if (hr < 24) this.hr = hr;
        if (min < 60) this.min = min;
        if (sec < 60) this.sec = sec;
    }
    public int getHr() {
        return hr;
    }
    public int getMin() {
        return min;
    }
    public int getSec() {
        return sec;
    }
    public void setHr(int hr) {
       if(hr<24)this.hr = hr;
    }
    public void setMin(int min) {
       if(min<60)this.min = min;
    }
    public void setSec(int sec) {
       if(sec<60)this.sec = sec;
    }
    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "%02d:%02d:%02d", hr, min, sec);
    }
    public int aumentarSec(){
        if(sec<59)sec++;
        else{
            sec=0;
            aumentarMin();
        }
        return sec;
    }
    public int aumentarMin(){
        if(min<59)min++;
        else{
            min=0;
            aumentarHora();
        }
        return min;
    }
    public int aumentarHora(){
        if(hr<24)hr++;
        return hr;
    }
    public int decrementarSec(){
        if(sec>1)sec--;
        else{
            sec=59;
            decrementarMin();
        }
        return sec;
    }
    public int decrementarMin(){
        if(min>1)min--;
        else{
            min=59;
            decrementarHora();
        }
        return min;
    }
    public int decrementarHora(){
        if(hr>0)hr--;
        return hr;
    }

}
