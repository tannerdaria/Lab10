class Cookie {
  public int numberCookies;
  public int bakeTemp;
  public int bakeTime;
  public boolean isReady;

  public Cookie(){
    numberCookies = 0;
    bakeTemp = 0;
    bakeTime = 0;
    isReady = false;
  }

  public Cookie(int aNumber, int aBakeTemp, int aBakeTime){
    numberCookies = aNumber;
    bakeTemp = aBakeTemp;
    bakeTime = aBakeTime;
    isReady = false;
  }

  boolean getReady(){
    return isReady;
  }

  void setNumberCookies(int theNumber){
    numberCookies = theNumber;
  }

  void bakeCookies(int aTemp, int aTime){
    System.out.println(numberCookies + " cookies were baked at " + aTemp + " degrees Farenheit for " + aTime + " minutes.");
    isReady = true;
  }
}