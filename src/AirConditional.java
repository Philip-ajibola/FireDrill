public class AirConditional {
    private boolean on = false;
    private boolean off = false;
    public void OnAirCondition(){
        on = true;
    }
    public boolean isOn(){
        return on;
    }
    public boolean isTurnOff(){
        return off;
    }
    public void OffAirConditional(){
        off = true;
    }

}
