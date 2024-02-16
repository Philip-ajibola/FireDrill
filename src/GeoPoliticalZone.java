public enum GeoPoliticalZone {
    NORTH_CENTRAL("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    NORTH_EAST("Adamawa","Bauchi","Borno","Gombe","Taraba","YObe"),
    NORTH_WEST("kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTH_EAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTH_SOUTH("Akwa-Ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SOUTH_WEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");

    private String[] namesOfState;
    GeoPoliticalZone(String... namesOfState){
        this.namesOfState = namesOfState;
    }


    public boolean IsItStatePoliticalZone() {
        return true;
    }

    public String[] getStates() {
        return namesOfState;
    }

    public static GeoPoliticalZone getStateInPoliticalZone(String state) {
        GeoPoliticalZone[] zones = GeoPoliticalZone.values();
        GeoPoliticalZone expectedResult = null;
        for(GeoPoliticalZone zone: zones){
           if( zone.contain(state)){
               expectedResult = zone;
           }
        }
        return expectedResult;
    }
    public  boolean contain(String state){
        boolean condition = false;
        for(String politicalZoneState : namesOfState) {
            if(politicalZoneState.equals(state)){
                condition = true;
                break;
            }
        }
        return condition;
    }
}
