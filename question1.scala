object question1 {
  def main(args:Array[String]){
    
    //we give the temperature 35 is celsius
    var value = tempConverter(35);
    print("Temperature in Farenhite= " + value);
    
  }
  
  
  def tempConverter(tempInCelsius:Double):Double={
    
    var tempInFarenhite = tempInCelsius * 1.8000 + 32.00;
    return tempInFarenhite;
  
  }
  
}